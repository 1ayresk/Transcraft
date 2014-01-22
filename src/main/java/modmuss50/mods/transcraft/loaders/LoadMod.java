/**
 * This class is part of the mod Transcraft. 
 * 
 * Transcraft is Open Source but you cant use any code without permission!
 * 
 */

package modmuss50.mods.transcraft.loaders;

import modmuss50.mods.transcraft.Transcraft;
import modmuss50.mods.transcraft.Listener.ListenerRegisterSound;
import modmuss50.mods.transcraft.WorldGen.TranscraftGenerator;
import modmuss50.mods.transcraft.addons.Addons;
import modmuss50.mods.transcraft.command.CommandReloadConfig;
import modmuss50.mods.transcraft.command.CommandTranscraftVersion;
import modmuss50.mods.transcraft.fluids.TranscraftFluids;
import modmuss50.mods.transcraft.helpers.Config;
import modmuss50.mods.transcraft.helpers.DevMessageTick;
import modmuss50.mods.transcraft.helpers.EventMobDeath;
import modmuss50.mods.transcraft.helpers.FuelHandler;
import modmuss50.mods.transcraft.helpers.GuiHand;
import modmuss50.mods.transcraft.helpers.ItemToolTipHelper;
import modmuss50.mods.transcraft.helpers.PlayerEditor;
import modmuss50.mods.transcraft.helpers.TranscraftUtil;
import modmuss50.mods.transcraft.helpers.capes.DevCapesUtil;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class LoadMod {

	public static void preInit(FMLPreInitializationEvent event) {
		event.getModMetadata().version = (TranscraftUtil.VERSION + TranscraftUtil.STATE);
		event.getModMetadata().modId = ("transcraft");
		event.getModMetadata().name = ("Transcraft");
		event.getModMetadata().description = ("Transraft is a mod about transmuting items and blocks!");
		event.getModMetadata().logoFile = ("/assets/transcraft/textures/logo/logo.png");
		event.getModMetadata().credits = ("By mark123mark, tattyseal, shifu_, klmDF14J");
		event.getModMetadata().authorList = TranscraftUtil.authorList;

		FMLLog.info("[TRANSCRAFT]	Starting Transcraft verison "
				+ TranscraftUtil.VERSION);

		FMLLog.info("[TRANSCRAFT]	Loading Handlers");
		Transcraft.Coproxy.registerHandlers();
		Transcraft.Coproxy.registerTickHandlers();

		if (TranscraftUtil.DEVSTATUS = true) {
			if (FMLCommonHandler.instance().getSide().isClient()) {
				FMLLog.info("[TRANSCRAFT]	Adding Dev Message");

				TickRegistry.registerTickHandler(new DevMessageTick(),
						Side.CLIENT);
			}
		}

		FMLLog.info("[TRANSCRAFT]	Loading Config");
		Config.initConfig();

		FMLLog.info("[TRANSCRAFT]	Loading Blocks");
		LoadBlocks.LoadBlocks();

		FMLLog.info("[TRANSCRAFT]	Loading Items");
		LoadItems.LoadItems();

		FMLLog.info("[TRANSCRAFT]	Loading Fluids");
		TranscraftFluids.init();

		FMLLog.info("[TRANSCRAFT]	Registering Blocks");
		RegisterBlocks.RegisterBlocks();

		FMLLog.info("[TRANSCRAFT]	Registering Items with the LanguageRegistry");
		LoadLang.loadlang();

		FMLLog.info("[TRANSCRAFT]	Loading Block Settings");
		LoadBlockSettings.LoadSet();

		FMLLog.info("[TRANSCRAFT]	Adding Recipes");
		RecipeLoader.LoadRecipe();

		FMLLog.info("[TRANSCRAFT]	Loading entitys");
		LoadEntity.loadentity();

		FMLLog.info("[TRANSCRAFT]	Loading Biomes");
		BiomeDictionary.registerBiomeType(TranscraftUtil.TransmutterBiome,
				Type.PLAINS, Type.WATER);
		GameRegistry.addBiome(TranscraftUtil.TransmutterBiome);
		BiomeManager.addSpawnBiome(TranscraftUtil.TransmutterBiome);
		BiomeManager.addStrongholdBiome(TranscraftUtil.TransmutterBiome);

		FMLLog.info("[TRANSCRAFT]	Loading Helper");
		MinecraftForge.EVENT_BUS.register(new ItemToolTipHelper());

		if (event.getSide() == Side.CLIENT) {
			MinecraftForge.EVENT_BUS.register(new ListenerRegisterSound());
		}

		FMLLog.info("[TRANSCRAFT]	Loading Addons");

		Addons.addAddons();
		Addons.loadAddons(0);
	}

	public static void init(FMLInitializationEvent event) {

		FMLLog.info("[TRANSCRAFT]	Registering  the Languages");
		LoadLang.loadlang();

		FMLLog.info("[TRANSCRAFT]	Adding Chest gen hooks");
		LoadChestGen.LoadChest();

		FMLLog.info("[TRANSCRAFT]	Registering world gen");
		GameRegistry.registerWorldGenerator(new TranscraftGenerator());

		FMLLog.info("[TRANSCRAFT]	Registering Fuel handler");
		GameRegistry.registerFuelHandler(new FuelHandler());

		FMLLog.info("[TRANSCRAFT]	Registering Player Editor");
		NetworkRegistry.instance()
				.registerConnectionHandler(new PlayerEditor());

		Transcraft.Coproxy.renderThings();

		DevCapesUtil
				.addFileUrl("https://dl.dropboxusercontent.com/s/nd6xhvygxqu229c/capes.txt?dl=1&token_hash=AAG0Xu3F0ghpuIIG5KReyogHwGdhflG6u0TKFD-W8xf1mA");

		MinecraftForge.EVENT_BUS.register(new EventMobDeath());

		FMLLog.info("[TRANSCRAFT]	Adding gui hander");
		NetworkRegistry.instance().registerGuiHandler(Transcraft.instance,
				new GuiHand());

		// MinecraftForge.EVENT_BUS.register(new EventCloakRender());

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
