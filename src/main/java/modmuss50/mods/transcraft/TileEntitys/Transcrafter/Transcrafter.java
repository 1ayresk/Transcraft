package modmuss50.mods.transcraft.TileEntitys.Transcrafter;

import modmuss50.mods.transcraft.Transcraft;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Transcrafter extends BlockContainer {
	public static IIcon[] icons = new IIcon[2];
	public int multiblock;

	public Transcrafter() {
		super(Material.field_151574_g);
		this.func_149711_c(2F);

	}

	@Override
	public IIcon func_149691_a(int side, int meta) {
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
	public void func_149651_a(IIconRegister i) {
		icons[0] = i.registerIcon("transcraft:TC_top");
		icons[1] = i.registerIcon("transcraft:TC_side");
	}

	@Override
	public boolean func_149727_a(World w, int x, int y, int z, EntityPlayer p,
			int par6, float par7, float par8, float par9) {
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
	public TileEntity func_149915_a(World world, int metadata) {
		return new TileTC();
	}

	@Override
	public int func_149645_b() {
		return -1;
	}

	@Override
	public boolean func_149662_c() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

}
