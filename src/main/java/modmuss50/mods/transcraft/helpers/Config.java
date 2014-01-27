package modmuss50.mods.transcraft.helpers;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config {

	public static int PlasticHelmetID = 5041;
	public static int PlasticChestID = 5042;
	public static int PlasticLegsID = 5043;
	public static int PlasticBootsID = 5044;
	public static int EnderHelmetID = 5045;
	public static int EnderChestID = 5046;
	public static int EnderLegsID = 5047;
	public static int EnderBootsID = 5048;

	public static int DimID = 234;

	public static boolean WorldGen = true;

	public static boolean enderswordpearl;
	public static boolean EnderArmorBuffs;

//	public static int BasicItemEssence = 1024;
//	public static int QuadItemEssence = 5512;
//	public static int NanoItemEssence = 25256;

	public static File getMinecraftDir() {
		return new File(".");
	}

	public static void init(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(
				event.getSuggestedConfigurationFile());
	}

	// config.load();

	public static void initConfig() {

		// File fileDir = new File(proxy.getMinecraftDir() +
		// "/Transcraft/config/");
		// fileDir.mkdir();
		File cfgFile = new File(
				modmuss50.mods.transcraft.TranscraftCommonProxy
						.getMinecraftDir() + "/config/Transcraft.cfg");

		try {
			cfgFile.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}

		Configuration config = new Configuration(cfgFile);
		config.load();

		
		enderswordpearl = config.get("Settings",
				"Endersword ender pearl right click", true).getBoolean(true);
		EnderArmorBuffs = config.get("Settings", "Ender Armor Buffs", true)
				.getBoolean(true);

//		BasicItemEssence = config.get("Item Essence Value",
//				"Basic Transmutter", 1024).getInt(1024);
//		QuadItemEssence = config.get("Item Essence Value", "Quad Transmutter",
//				5512).getInt(5512);
//		NanoItemEssence = config.get("Item Essence Value", "Nano Transmutter",
//				25256).getInt(25256);

		config.save();
	}
}
