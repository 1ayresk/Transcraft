package mark123mark.zaetApi.api;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ChestHookZaet
{
	public static ArrayList<ItemStack> chestHook = new ArrayList<ItemStack>();
	
	public static boolean addItemToHook(ItemStack i)
	{
		if(!chestHook.contains(i))
		{
			chestHook.add(i);
			System.out.println("Added " + LanguageRegistry.instance().getStringLocalization(i.getUnlocalizedName() + " to Floating Islands"));
			return true;
		}
		else
		{
			return false;
		}
	}
}
