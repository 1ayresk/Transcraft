package modmuss50.mods.transcraft;

import modmuss50.mods.transcraft.Blocks.TranscraftBlocks;
import modmuss50.mods.transcraft.Items.TranscraftItems;
import modmuss50.mods.transcraft.biomes.EndlessWater;
import modmuss50.mods.transcraft.helpers.PacketHandlerTranscraft;
import modmuss50.mods.transcraft.helpers.TranscraftUtil;
import modmuss50.mods.transcraft.loaders.LoadMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "transcraft", name = "Transcraft", version = TranscraftUtil.VERSION
		+ TranscraftUtil.STATE, useMetadata = false)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = "transcraft", packetHandler = PacketHandlerTranscraft.class)
public class Transcraft {

	@Instance("transcraft")
	public static Transcraft instance;

	public static WorldType tutorialWorld = new EndlessWater(15, "ENDLESSWATER");
	
	
	@SidedProxy(clientSide = "modmuss50.mods.transcraft.TranscraftClientProxy", serverSide = "modmuss50.mods.transcraft.TranscraftCommonProxy")
	public static TranscraftCommonProxy Coproxy;
	public static TranscraftClientProxy Clproxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LoadMod.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		LoadMod.init(event);
		
		LanguageRegistry.instance().addStringLocalization("generator.ENDLESSWATER", "en_US", "Transcraft TEST");
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		LoadMod.postInit(event);
	}

	@EventHandler
	public void onServerStarting(FMLServerStartingEvent event) {
		LoadMod.onServerStarting(event);
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		LoadMod.load(event);
	}

	public static CreativeTabs Transtab = new CreativeTabs("Transtab") {
		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(TranscraftItems.EnderSword, 1, 0);
		}

	};

	public static CreativeTabs TranstabDecBlocks = new CreativeTabs(
			"TranstabDecBlocks") {
		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(TranscraftBlocks.EnderQuartzBigBrick, 1, 11);
		}

	};

}