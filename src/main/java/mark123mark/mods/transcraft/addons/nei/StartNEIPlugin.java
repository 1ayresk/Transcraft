package mark123mark.mods.transcraft.addons.nei;

import codechicken.nei.api.API;

public class StartNEIPlugin {

	public static void START()
	{
		API.registerRecipeHandler(new TranscraftNEI());
	}
	
	
}
