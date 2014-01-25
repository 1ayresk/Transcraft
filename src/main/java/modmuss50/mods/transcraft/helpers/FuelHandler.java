package modmuss50.mods.transcraft.helpers;

import modmuss50.mods.transcraft.Items.TranscraftItems;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler 
{
	@Override
	public int getBurnTime(ItemStack fuel) {

		if (fuel.itemID == TranscraftItems.Oil.itemID) {
			return 1000;
		} else {
			return 0;
		}
	}

}
