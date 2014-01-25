package modmuss50.mods.transcraft.helpers;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler 
{
	@Override
	public int getBurnTime(ItemStack fuel) {

		if (fuel.itemID == Config.OilID) {
			return 300;
		} else {
			return 0;
		}
	}

}
