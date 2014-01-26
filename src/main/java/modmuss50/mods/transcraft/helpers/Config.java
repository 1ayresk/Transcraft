package modmuss50.mods.transcraft.helpers;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config {

	public static int TranscraftOreID = 2000;
	public static int OilOreID = 2001;

	public static int BlueLightID = 2011;
	public static int GreenLightID = 2012;
	public static int OrangeLightID = 2013;
	public static int DarkLightID = 2014;
	public static int IronTorchID = 2015;
	public static int BunkerBlockID = 2002;
	public static int ClearGlassID = 2003;
	public static int ObsidianLeverID = 2004;
	public static int BunkerStairID = 2005;
	public static int SmoothBunkerBlockID = 2006;
	public static int SmoothBunkerStairID = 2007;
	public static int DriedTransmutterID = 2008;
	public static int ThinClearGlassID = 2009;
	public static int FancyCrystalGlassID = 2010;
	public static int TransManiaOreID = 2011;

	public static int BlockEnderQuartzID = 2113;
	public static int BlockCutEnderQuartzID = 2114;
	public static int BlockEnderQuartzBrickID = 2115;
	public static int BlockEnderQuartzBigBrickID = 2116;

	public static int DimPortalBlockID = 2200;
	public static int DimPortalEscapeBlockID = 2201;

	public static int ComIronOreID = 2021;
	public static int ComGoldOreID = 2022;
	public static int ComTransmutterOreID = 2023;
	public static int ComOilOreID = 2024;

//	public static int ixpGrinderID = 2025;

	public static int LiquidTransmutterFluidStillID = 2101;

	public static int TranscrafterID = 2112;
	public static int LTranscrafterID = 2113;

	public static int BasicTransmuterID = 5000;
	public static int QuadTransmuterID = 5001;
	public static int NanoTransmuterID = 5002;
	public static int HotdogID = 5003;
	public static int OilID = 5011;
	public static int PlasticID = 5012;
	public static int IronStickID = 5013;
	public static int HardendPlasticID = 5014;
	public static int EnderGemID = 5015;
	public static int EnderQuartzID = 5016;
	public static int DarkEndershardID = 5017;
	public static int BucketLiquidTrasnmutterID = 5018;
	public static int TranspeadiaID = 5019;
	public static int TransmaniaTeleporterID = 5020;

	public static int PlasticAxeID = 5031;
	public static int PlasticHoeID = 5032;
	public static int PlasticPickaxeID = 5033;
	public static int PlasticShovelID = 5034;
	public static int PlasticSwordID = 5035;
	public static int BunkerPickID = 5036;
	public static int EnderSwordID = 5037;

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
