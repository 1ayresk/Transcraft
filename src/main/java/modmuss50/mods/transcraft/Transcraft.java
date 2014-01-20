package modmuss50.mods.transcraft;

import java.util.Arrays;
import java.util.List;

import modmuss50.mods.transcraft.Items.TranscraftItems;
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
import modmuss50.mods.transcraft.helpers.PacketHandlerTranscraft;
import modmuss50.mods.transcraft.helpers.PlayerEditor;
import modmuss50.mods.transcraft.loaders.LoadBlockSettings;
import modmuss50.mods.transcraft.loaders.LoadBlocks;
import modmuss50.mods.transcraft.loaders.LoadChestGen;
import modmuss50.mods.transcraft.loaders.LoadEntity;
import modmuss50.mods.transcraft.loaders.LoadItems;
import modmuss50.mods.transcraft.loaders.LoadLang;
import modmuss50.mods.transcraft.loaders.LoadOreDics;
import modmuss50.mods.transcraft.loaders.RecipeLoader;
import modmuss50.mods.transcraft.loaders.RegisterBlocks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "transcraft", name = "Transcraft", version = Transcraft.VERSION+ Transcraft.STATE, useMetadata = false)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = "transcraft", packetHandler = PacketHandlerTranscraft.class)
public class Transcraft {
	public static final String VERSION = "1.6.4_V2.0.0_";
	public static final String STATE = "BROKEN";
	public static boolean DEVSTATUS = true;

	// Listblocks here
	public static Block TranscraftOre;
	public static Block OilOre;
	public static Block BlueLight;
	public static Block GreenLight;
	public static Block OrangeLight;
	public static Block DarkLight;
	public static Block IronTorch;
	public static Block ClearGlass;
	public static Block ThinClearGlass;
	public static Block FancyCrystalGlass;
	public static Block BunkerBlock;
	public static Block BunkerStair;
	public static Block SmoothBunkerBlock;
	public static Block SmoothBunkerStair;
	public static Block ObsidianLever;
	public static Block ComIronOre;
	public static Block ComGoldOre;
	public static Block ComTransmutterOre;
	public static Block ComOilOre;
	public static Block DriedTransmutter;

	public static Block Transcrafter;

	public static Block enderQuartzBlock;
	public static Block CutenderQuartz;
	public static Block EnderQuartzBrick;
	public static Block EnderQuartzBigBrick;

	 public static Block ixpGrinder;

	public static final BiomeGenBase TransmutterBiome = (new modmuss50.mods.transcraft.biomes.TransmutterBiome(
			190)).setBiomeName("TransmutterBiome").setTemperatureRainfall(0.8F,
			0.4F);

	public static EnumToolMaterial PlasticTool = EnumHelper.addToolMaterial(
			"PlasticTool", 2, 750, 5.0F, 2, 0);
	public static EnumToolMaterial BunkerToolEnum = EnumHelper.addToolMaterial(
			"BunkerToolEnum", 4, 1000, 20.0F, 4, 0);
	public static EnumToolMaterial EnderToolEnum = EnumHelper.addToolMaterial(
			"EnderToolEnum", 400, 10000, 80.0F, 46, 100);

	@Instance("transcraft")
	public static Transcraft instance;

	@SidedProxy(clientSide = "modmuss50.mods.transcraft.TranscraftClientProxy", serverSide = "modmuss50.mods.transcraft.TranscraftCommonProxy")
	public static TranscraftCommonProxy Coproxy;
	public static TranscraftClientProxy Clproxy;

	List<String> authorList = Arrays.asList("mark123mark", "tattyseal", "shifu_", "klmDF14J");

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		event.getModMetadata().version = (Transcraft.VERSION+ Transcraft.STATE);
		event.getModMetadata().modId = ("transcraft");
		event.getModMetadata().name = ("Transcraft");
		event.getModMetadata().description = ("Transraft is a mod about transmuting items and blocks!");
		event.getModMetadata().logoFile = ("/assets/transcraft/textures/logo/logo.png");
		event.getModMetadata().credits = ("By mark123mark, tattyseal, shifu_, klmDF14J");
		event.getModMetadata().authorList = authorList;

		
		FMLLog.info("[TRANSCRAFT]	Starting Transcraft verison "
				+ Transcraft.VERSION);

		FMLLog.info("[TRANSCRAFT]	Loading Handlers");
		Coproxy.registerHandlers();
		Coproxy.registerTickHandlers();
		
		
		if(DEVSTATUS = true)
		{
			if(FMLCommonHandler.instance().getSide().isClient()) 
			{
				FMLLog.info("[TRANSCRAFT]	Adding Dev Message");

				TickRegistry.registerTickHandler(new DevMessageTick(), Side.CLIENT);
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
		BiomeDictionary.registerBiomeType(TransmutterBiome, Type.PLAINS, Type.WATER);
		GameRegistry.addBiome(TransmutterBiome);
		BiomeManager.addSpawnBiome(TransmutterBiome);
		BiomeManager.addStrongholdBiome(TransmutterBiome);


		FMLLog.info("[TRANSCRAFT]	Loading Helper");
		MinecraftForge.EVENT_BUS.register(new ItemToolTipHelper());
		
		 if (event.getSide() == Side.CLIENT) {
			 MinecraftForge.EVENT_BUS.register(new ListenerRegisterSound());		
		  }
		
		
		
		FMLLog.info("[TRANSCRAFT]	Loading Addons");
		
		Addons.addAddons();
		Addons.loadAddons(0);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

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

		Coproxy.renderThings();

		MinecraftForge.EVENT_BUS.register(new EventMobDeath());

		FMLLog.info("[TRANSCRAFT]	Adding gui hander");
		NetworkRegistry.instance().registerGuiHandler(instance, new GuiHand());
		
		Addons.loadAddons(1);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		Addons.loadAddons(2);
		//Clproxy.postrenderThings();
	}

	public static void oreRegistration() {

		FMLLog.info("[TRANSCRAFT]	Adding Ore dic support");
		LoadOreDics.oredic();

	}

	@EventHandler
	public void onServerStarting(FMLServerStartingEvent event)
	{
		FMLLog.info("[TRANSCRAFT]	Adding new commands");
		event.registerServerCommand(new CommandTranscraftVersion());
		event.registerServerCommand(new CommandReloadConfig());
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		
	}

	public static CreativeTabs TranstabItems = new CreativeTabs("TranstabItems") {
		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(TranscraftItems.EnderSword, 1, 0);
		}

	};

	public static CreativeTabs TranstabBlocks = new CreativeTabs("TranstabBlocks") 
	{
		@Override
		public ItemStack getIconItemStack() 
		{
			return new ItemStack(TranscraftOre, 1, 0);
		}

	};

	public static CreativeTabs TranstabDecBlocks = new CreativeTabs("TranstabDecBlocks") {
		@Override
		public ItemStack getIconItemStack() 
		{
			return new ItemStack(EnderQuartzBigBrick, 1, 11);
		}

	};

}