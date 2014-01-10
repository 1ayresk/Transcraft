package mark123mark.mods.transcraft.addons;

import java.util.ArrayList;


import mark123mark.mods.TranscraftAddons.AddonNEI;
import mark123mark.mods.TranscraftAddons.AddonNEILoad;
import mark123mark.mods.transcraft.addons.nei.TranscraftNEI;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Addons {
	
	public static ArrayList<Addon> addons;
	
	public static void loadAddons() {
		addons = new ArrayList<Addon>();
		
		//Waila addon is now done in Transcraft.class due to it being needed to be loaded at preInit
		
		addons.add(new Addon("IC2") {
			@Override
			public void load() {
				// ItemStack nuke = Items.getItem("nuke");
				// ItemStack nuke2 = Items.getItem("nuke").copy();
				// nuke2.stackSize = 2;
				// GameRegistry.addRecipe((nuke2), "   ", "ndn", "   ",'n',
				// Transcraft.NanoTransmuter, 'd', nuke);

				// Items.addRecipe(Transcraft.Oil, Transcraft.Plastic);
				// Items.

				// recipes.addMaceratorRecipe(tStack, tOutput);
			}
		});
		
		addons.add(new Addon("NotEnoughItems") {
			@Override
			public void load() {
				LanguageRegistry.instance().addStringLocalization("nei.Transcrafter", "Transcrafter");
				try {
					AddonNEILoad.StartNei();;

				} catch (Exception e) {
					
				}
			}
		});
		
		FMLLog.info("[Transcraft] Loading Transcraft Addons");
		for(Addon addon : addons) {
			addon.preLoad();
		}
	}
}
