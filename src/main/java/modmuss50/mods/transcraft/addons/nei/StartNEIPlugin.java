package modmuss50.mods.transcraft.addons.nei;

import cpw.mods.fml.common.API;
import cpw.mods.fml.common.FMLCommonHandler;

public class StartNEIPlugin {

	public static void START() {
		if (FMLCommonHandler.instance().getSide().isClient()) {
			API.registerRecipeHandler(new TranscraftNEI());
		}
	}

}
