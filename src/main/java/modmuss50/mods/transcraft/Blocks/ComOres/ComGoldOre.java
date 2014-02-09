package modmuss50.mods.transcraft.Blocks.ComOres;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ComGoldOre extends Block {
	public ComGoldOre() {
		super(Material.ground);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
		blockIcon = icon.registerIcon("Transcraft:ComGoldOre");
	}

}
