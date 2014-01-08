package mark123mark.mods.transcraft.addons;

import java.util.ArrayList;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLInterModComms;

public class Addons {
	
	public static ArrayList<Addon> addons;
	
	public static void loadAddons() {
		addons = new ArrayList<Addon>();
		
		addons.add(new Addon("Waila") {
			@Override
			public void load() {
				FMLInterModComms.sendMessage("Waila", "register", "mark123mark.mods.transcraft.addons.waila.TranscraftProvider.callbackRegister");
			}
		});
		
		FMLLog.info("[Transcraft] Loading Transcraft Addons");
		for(Addon addon : addons) {
			addon.preLoad();
		}
	}
}
