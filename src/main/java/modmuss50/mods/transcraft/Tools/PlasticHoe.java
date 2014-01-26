package modmuss50.mods.transcraft.Tools;

import modmuss50.mods.transcraft.helpers.Config;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class PlasticHoe extends ItemHoe {

	public PlasticHoe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}

	/**
	 * Return whether this item is repairable in an anvil.
	 */
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack,
			ItemStack par2ItemStack) {
		return par2ItemStack.itemID == Config.PlasticID;
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:PlasticHoe");
	}
}
