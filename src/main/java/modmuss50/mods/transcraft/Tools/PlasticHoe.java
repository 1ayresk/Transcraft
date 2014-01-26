package modmuss50.mods.transcraft.Tools;

import modmuss50.mods.transcraft.helpers.Config;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class PlasticHoe extends ItemHoe {

	public PlasticHoe(int par1, ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
	}



	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:PlasticHoe");
	}
}
