package modmuss50.mods.transcraft.Items.Tools;

import java.awt.Color;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PlasticAxe extends ItemAxe {

	public int clourid = 0;

	public PlasticAxe(ToolMaterial par2EnumToolMaterial, int clour) {
		super(par2EnumToolMaterial);
		clourid = clour;
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:PlasticAxe");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack itemStack, int renderPass) {
		float[] color = EntitySheep.fleeceColorTable[clourid];
		return new Color(color[0], color[1], color[2]).getRGB();
	}

}
