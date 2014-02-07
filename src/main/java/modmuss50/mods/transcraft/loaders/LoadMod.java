/**
 * This class is part of the mod Transcraft. 
 * 
 * Transcraft is Open Source but you cant use any code without permission!
 * 
 */

package modmuss50.mods.transcraft.loaders;

import modmuss50.mods.transcraft.Transcraft;
import modmuss50.mods.transcraft.Utils.Config;
import modmuss50.mods.transcraft.Utils.EventMobDeath;
import modmuss50.mods.transcraft.Utils.FuelHandler;
import modmuss50.mods.transcraft.Utils.GuiHand;
import modmuss50.mods.transcraft.Utils.TickHelper;
import modmuss50.mods.transcraft.Utils.TranscraftUtil;
import modmuss50.mods.transcraft.Utils.Listener.ListenerRegisterSound;
import modmuss50.mods.transcraft.Utils.command.CommandReloadConfig;
import modmuss50.mods.transcraft.Utils.command.CommandTranscraftVersion;
import modmuss50.mods.transcraft.WorldGen.TranscraftGenerator;
import modmuss50.mods.transcraft.addons.Addons;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;

public class LoadMod {

	public static void preInit(FMLPreInitializationEvent event) {
		event.getModMetadata().version = (TranscraftUtil.VERSION + TranscraftUtil.STATE);

		FMLLog.info("[TRANSCRAFT]	Starting Transcraft verison "
				+ TranscraftUtil.VERSION);

		FMLLog.info("[TRANSCRAFT]	Loading Handlers");
		Transcraft.Coproxy.registerHandlers();
		Transcraft.Coproxy.registerTickHandlers();

		FMLLog.info("[TRANSCRAFT]	Loading Config");
		Config.initConfig();

		FMLLog.info("[TRANSCRAFT]	Loading Blocks");
		LoadBlocks.LoadBlocks();

		FMLLog.info("[TRANSCRAFT]	Loading Items");
		LoadItems.LoadItems();

		// FMLLog.info("[TRANSCRAFT]	Loading Fluids");
		// TranscraftFluids.init();

		FMLLog.info("[TRANSCRAFT]	Registering Blocks");
		RegisterBlocks.RegisterBlocks();

		FMLLog.info("[TRANSCRAFT]	Registering Items with the LanguageRegistry");
		// LoadLang.loadlang();

		FMLLog.info("[TRANSCRAFT]	Loading Block Settings");
		LoadBlockSettings.LoadSet();

		FMLLog.info("[TRANSCRAFT]	Adding Recipes");
		RecipeLoader.LoadRecipe();

		FMLLog.info("[TRANSCRAFT]	Loading entitys");
		LoadEntity.loadentity();

		/*
		 * 
		 * FMLLog.info("[TRANSCRAFT]	Loading Biomes");
		 * BiomeDictionary.registerBiomeType(TranscraftUtil.TransmutterBiome,
		 * Type.PLAINS, Type.WATER);
		 * GameRegistry.addBiome(TranscraftUtil.TransmutterBiome);
		 * BiomeManager.addSpawnBiome(TranscraftUtil.TransmutterBiome);
		 * BiomeManager.addStrongholdBiome(TranscraftUtil.TransmutterBiome);
		 */

		if (event.getSide() == Side.CLIENT) {
			MinecraftForge.EVENT_BUS.register(new ListenerRegisterSound());
		}

		FMLLog.info("[TRANSCRAFT]	Loading Addons");

		Addons.addAddons();
		Addons.loadAddons(0);

		NetworkRegistry.INSTANCE.registerGuiHandler(Transcraft.instance,
				new GuiHand());

		FMLCommonHandler.instance().bus().register(new TickHelper());
		MinecraftForge.EVENT_BUS.register(new TickHelper());
	}

	public static void init(FMLInitializationEvent event) {

		FMLLog.info("[TRANSCRAFT]	Registering  the Languages");
		LoadLang.loadlang();

		FMLLog.info("[TRANSCRAFT]	Adding Chest gen hooks");
		LoadChestGen.LoadChest();

		FMLLog.info("[TRANSCRAFT]	Registering world gen");
		GameRegistry.registerWorldGenerator(new TranscraftGenerator(), 0);

		FMLLog.info("[TRANSCRAFT]	Registering Fuel handler");
		GameRegistry.registerFuelHandler(new FuelHandler());

		Transcraft.Coproxy.renderThings();

		MinecraftForge.EVENT_BUS.register(new EventMobDeath());

		Addons.loadAddons(1);
	}

	public static void postInit(FMLPostInitializationEvent event) {
		Addons.loadAddons(2);
		// Clproxy.postrenderThings();
	}

	public static void onServerStarting(FMLServerStartingEvent event) {
		FMLLog.info("[TRANSCRAFT]	Adding new commands");
		event.registerServerCommand(new CommandTranscraftVersion());
		event.registerServerCommand(new CommandReloadConfig());
	}

	public static void load(FMLInitializationEvent event) {

	}

}
