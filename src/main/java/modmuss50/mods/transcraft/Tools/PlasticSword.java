package modmuss50.mods.transcraft.Tools;

import modmuss50.mods.transcraft.helpers.Config;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class PlasticSword extends ItemSword {

	public PlasticSword(int par1, ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
	}


	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:PlasticSword");
	}
}
