package modmuss50.mods.transcraft.loaders;

import modmuss50.mods.transcraft.Blocks.ItemCrystalGlass;
import modmuss50.mods.transcraft.Blocks.ItemThinCrystalGlass;
import modmuss50.mods.transcraft.Blocks.TranscraftBlocks;
import modmuss50.mods.transcraft.Blocks.TranscraftOreItem;
import modmuss50.mods.transcraft.Blocks.FancyCrystalGlass.ItemFancyCryastalGlass;
import modmuss50.mods.transcraft.Blocks.Quartz.ItemCutEnderQuartzBlock;
import modmuss50.mods.transcraft.Blocks.Quartz.ItemEnderQuartzBigBrick;
import modmuss50.mods.transcraft.Blocks.Quartz.ItemEnderQuartzBlock;
import modmuss50.mods.transcraft.Blocks.Quartz.ItemEnderQuartzBrick;
import modmuss50.mods.transcraft.Items.TranscraftItems;
import modmuss50.mods.transcraft.TileEntitys.ItemGrinder.TileIXP;
import modmuss50.mods.transcraft.TileEntitys.Transcrafter.TileTC;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;

import org.zaet.api.IColoredItemBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class RegisterBlocks {

	public static void RegisterBlocks() {
		// LanguageRegistry.addName(Transcraft.TranscraftOre,
		// "Transmutter Ore");
		
		
		LanguageRegistry.addName(TranscraftBlocks.OilOre, "Oil Ore");
		LanguageRegistry.addName(TranscraftBlocks.BlueLight, "Blue Light");
		LanguageRegistry.addName(TranscraftBlocks.GreenLight, "Green Light");
		LanguageRegistry.addName(TranscraftBlocks.OrangeLight, "Orange Light");
		LanguageRegistry.addName(TranscraftBlocks.DarkLight, "Dark Light");
		LanguageRegistry.addName(TranscraftBlocks.IronTorch, "Iron Torch");

		LanguageRegistry.addName(TranscraftBlocks.BunkerBlock, "Bunker Block");
		LanguageRegistry.addName(TranscraftBlocks.BunkerStair, "Bunker Stair");
		LanguageRegistry.addName(TranscraftBlocks.ClearGlass, "Clear Glass");
		LanguageRegistry.addName(TranscraftBlocks.SmoothBunkerStair,
				"Smooth Bunker Stair");
		LanguageRegistry.addName(TranscraftBlocks.ObsidianLever,
				"Obsidian Lever");
		LanguageRegistry.addName(TranscraftBlocks.SmoothBunkerBlock,
				"Smooth Bunker Block");
		LanguageRegistry.addName(TranscraftBlocks.DriedTransmutter,
				"Dried Transmuter");
		LanguageRegistry.addName(TranscraftBlocks.Transcrafter, "Transcrafter");
		LanguageRegistry
				.addName(TranscraftBlocks.ComIronOre, "Packed Iron Ore");
		LanguageRegistry
				.addName(TranscraftBlocks.ComGoldOre, "Packed Gold Ore");
		LanguageRegistry.addName(TranscraftBlocks.ComTransmutterOre,
				"Packed Transmuter Ore");
		LanguageRegistry.addName(TranscraftBlocks.ComOilOre, "Packed Oil Ore");
		LanguageRegistry.addName(TranscraftBlocks.enderQuartzBlock,
				"Ender Quartz Block");

		
		GameRegistry.registerBlock(TranscraftBlocks.OilOre, "Oil Ore");
		GameRegistry.registerBlock(TranscraftBlocks.BlueLight, "Blue Light");
		GameRegistry.registerBlock(TranscraftBlocks.GreenLight, "Green Light");
		GameRegistry
				.registerBlock(TranscraftBlocks.OrangeLight, "Orange Light");
		GameRegistry.registerBlock(TranscraftBlocks.DarkLight, "Dark Light");
		GameRegistry.registerBlock(TranscraftBlocks.IronTorch, "IronTorch");

		GameRegistry
				.registerBlock(TranscraftBlocks.BunkerBlock, "Bunker Block");
		GameRegistry.registerBlock(TranscraftBlocks.SmoothBunkerStair,
				"Smooth Bunker Stair");
		GameRegistry.registerBlock(TranscraftBlocks.DriedTransmutter,
				"Dried Transmuter");
		GameRegistry.registerBlock(TranscraftBlocks.ComIronOre,
				"Packed Iron Ore");
		GameRegistry.registerBlock(TranscraftBlocks.ComGoldOre,
				"Packed Gold Ore");
		GameRegistry.registerBlock(TranscraftBlocks.ComTransmutterOre,
				"Packed Transmuter Ore");
		GameRegistry
				.registerBlock(TranscraftBlocks.ComOilOre, "Packed Oil Ore");
		GameRegistry
				.registerBlock(TranscraftBlocks.BunkerStair, "Bunker Stair");
		GameRegistry.registerBlock(TranscraftBlocks.ObsidianLever,
				"Obsidian Lever");
		GameRegistry.registerBlock(TranscraftBlocks.SmoothBunkerBlock,
				"Smooth Bunker Block");

	//	GameRegistry.registerBlock(TranscraftBlocks.enderQuartzBlock,"EnderQuartz");
		GameRegistry.registerBlock(TranscraftBlocks.enderQuartzBlock,ItemEnderQuartzBlock.class, "ItemEnderQuartzBlock");

//		GameRegistry.registerBlock(TranscraftBlocks.CutenderQuartz,"CutEnderQuartz");
		GameRegistry.registerBlock(TranscraftBlocks.CutenderQuartz,ItemCutEnderQuartzBlock.class, "ItemCutEnderQuartzBlock");

//		GameRegistry.registerBlock(TranscraftBlocks.EnderQuartzBrick,"EnderQuartzBricks");
		GameRegistry.registerBlock(TranscraftBlocks.EnderQuartzBrick,ItemEnderQuartzBrick.class, "ItemEnderQuartzBrick");

//		GameRegistry.registerBlock(TranscraftBlocks.EnderQuartzBigBrick,"EnderQuartzBigBricks");
		GameRegistry.registerBlock(TranscraftBlocks.EnderQuartzBigBrick,ItemEnderQuartzBigBrick.class, "ItemEnderQuartzBigBrick");

//		GameRegistry.registerBlock(TranscraftBlocks.FancyCrystalGlass,"Fancy Crystal Glass");
		GameRegistry.registerBlock(TranscraftBlocks.FancyCrystalGlass,ItemFancyCryastalGlass.class, "ItemFancyCryastalGlass");

//		GameRegistry.registerBlock(TranscraftBlocks.TranscraftOre,"Transmuter Ore");
		GameRegistry.registerBlock(TranscraftBlocks.TranscraftOre,TranscraftOreItem.class, "ItemTranscraftOreItem");

		GameRegistry.registerBlock(TranscraftBlocks.ClearGlass,IColoredItemBlock.class, "Clear Glass");
	//	GameRegistry.registerBlock(TranscraftBlocks.FancyCrystalGlass,ItemCrystalGlass.class, "ItemCrystalGlass");

		// LanguageRegistry.addName(Transcraft.ThinClearGlass,"Thin Crystal Glass");
		GameRegistry.registerBlock(TranscraftBlocks.ThinClearGlass,ItemThinCrystalGlass.class, "ThinClearGlass");

		GameRegistry.registerBlock(TranscraftBlocks.Transcrafter,
				"Transcrafter");

		GameRegistry.registerBlock(TranscraftBlocks.ixpGrinder, "ItemGrinder");

		registerItem(TranscraftItems.BasicTransmuter);
		registerItem(TranscraftItems.QuadTransmuter);
		registerItem(TranscraftItems.NanoTransmuter);
		registerItem(TranscraftItems.HotDog);
		registerItem(TranscraftItems.Oil);
		registerItem(TranscraftItems.Plastic);
		registerItem(TranscraftItems.IronStick);
		registerItem(TranscraftItems.HardendPlastic);
		registerItem(TranscraftItems.EnderGem);
		registerItem(TranscraftItems.EnderQuartz);
		registerItem(TranscraftItems.DarkEndershard);
		registerItem(TranscraftItems.Transpedia);

		registerItem(TranscraftItems.PlasticAxe);
		registerItem(TranscraftItems.PlasticHoe);
		registerItem(TranscraftItems.PlasticPickaxe);
		registerItem(TranscraftItems.PlasticShovel);
		registerItem(TranscraftItems.PlasticSword);
		registerItem(TranscraftItems.BunkerPick);
		registerItem(TranscraftItems.EnderSword);

		registerItem(TranscraftItems.PlasticHelmet);
		registerItem(TranscraftItems.PlasticChest);
		registerItem(TranscraftItems.PlasticLegs);
		registerItem(TranscraftItems.PlasticBoots);
		registerItem(TranscraftItems.EnderHelmet);
		registerItem(TranscraftItems.EnderChest);
		registerItem(TranscraftItems.EnderLegs);
		registerItem(TranscraftItems.EnderBoots);

		GameRegistry.registerTileEntity(TileTC.class, "TileEntityTC");
		GameRegistry.registerTileEntity(TileIXP.class, "TileItemGrinder");
		TileEntity.func_145826_a(TileIXP.class, "TileItemGrinder2");

	}

	public static void registerItem(Item item) {
		GameRegistry.registerItem(item,
				item.getUnlocalizedName().replace("item.", ""));
	}

}
