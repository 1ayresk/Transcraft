package modmuss50.mods.transcraft;

import modmuss50.mods.transcraft.Client.TranscraftClientProxy;
import modmuss50.mods.transcraft.Items.TranscraftItems;
import modmuss50.mods.transcraft.Utils.TranscraftUtil;
import modmuss50.mods.transcraft.loaders.LoadMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = "transcraft", name = "Transcraft", version = TranscraftUtil.VERSION
		+ TranscraftUtil.STATE, useMetadata = false)
public class Transcraft {

	@Instance("transcraft")
	public static Transcraft instance;

	@SidedProxy(clientSide = "modmuss50.mods.transcraft.Client.TranscraftClientProxy", serverSide = "modmuss50.mods.transcraft.TranscraftCommonProxy")
	public static TranscraftCommonProxy Coproxy;
	public static TranscraftClientProxy Clproxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LoadMod.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		LoadMod.init(event);
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
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return TranscraftItems.EnderSword;
		}

	};

	public static CreativeTabs TranstabDecBlocks = new CreativeTabs(
			"TranstabDecBlocks") {
		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return TranscraftItems.EnderQuartz;
		}

	};

}