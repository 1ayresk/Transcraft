package mark123mark.mods.transcraft.addons;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;

public class Addon {
	
	public String modid;
	
	public Addon(String modid) {
		this.modid = modid;
	}

	
	public void load() {
		
	}
	
	/**
	 * Do not override me or call me unless neccessary. I am here to check for addon construction issues
	 */
	public void preLoad() {
		FMLLog.info("[Transcraft] Attempting to load the " + modid + " addon");
		if(Loader.isModLoaded(modid)) {
			load();
			FMLLog.info("[Transcraft] Successfully loaded the " + modid + " addon");
		}
	}
}
