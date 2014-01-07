package mark123mark.mods.transcraft.TileEntitys.Transcrafter;

import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Transcrafter extends BlockContainer {
	public static Icon[] icons = new Icon[2];
	public int multiblock;

	public Transcrafter(int id) {
		super(id, Material.rock);
		this.setStepSound(Block.soundStoneFootstep);
		this.setHardness(2F);

	}

	@Override
	public Icon getIcon(int side, int meta) {
		if (side == 1 || side == 0) {
			return icons[0];
		} else {
			return icons[1];
		}
	}

	public int tickRate(World par1World) {
		return 2;
	}

	@Override
	public void registerIcons(IconRegister i) {
		icons[0] = i.registerIcon("transcraft:TC_top");
		icons[1] = i.registerIcon("transcraft:TC_side");
	}

	@Override
	public boolean onBlockActivated(World w, int x, int y, int z,
			EntityPlayer p, int par6, float par7, float par8, float par9) {
		int xs = 0;
		int ys = 0;
		int zs = 0;

		xs = x;
		ys = y;
		zs = z;

		if (p.isSneaking()) {
			return true;
		} else {
			p.openGui(Transcraft.instance, 1, w, x, y, z);
		}

		return true;

	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileTC();
	}

    //You don't want the normal render type, or it wont render properly.
    @Override
    public int getRenderType() {
            return 189;
    }
    
    //It's not an opaque cube, so you need this.
    @Override
    public boolean isOpaqueCube() {
            return false;
    }
    
    //It's not a normal block, so you need this too.
    public boolean renderAsNormalBlock() {
            return false;
    }
    
    @Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
				setBlockBounds(0.0F, 0.0F, 0.4F, 1.0F, 0.5F, 0.7F);

		}
    
}
