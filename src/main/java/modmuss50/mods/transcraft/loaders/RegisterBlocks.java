package modmuss50.mods.transcraft.loaders;

import modmuss50.mods.transcraft.Transcraft;
import modmuss50.mods.transcraft.Blocks.ItemCrystalGlass;
import modmuss50.mods.transcraft.Blocks.TranscraftOreItem;
import modmuss50.mods.transcraft.Blocks.FancyCrystalGlass.ItemFancyCryastalGlass;
import modmuss50.mods.transcraft.Blocks.Quartz.ItemCutEnderQuartzBlock;
import modmuss50.mods.transcraft.Blocks.Quartz.ItemEnderQuartzBigBrick;
import modmuss50.mods.transcraft.Blocks.Quartz.ItemEnderQuartzBlock;
import modmuss50.mods.transcraft.Blocks.Quartz.ItemEnderQuartzBrick;
import modmuss50.mods.transcraft.Items.TranscraftItems;
import modmuss50.mods.transcraft.TileEntitys.ItemGrinder.TileIXP;
import modmuss50.mods.transcraft.TileEntitys.Transcrafter.TileTC;
import modmuss50.zaetApi.api.IColoredItemBlock;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class RegisterBlocks {

	public static void RegisterBlocks() {
//		LanguageRegistry.addName(Transcraft.TranscraftOre, "Transmutter Ore");
		LanguageRegistry.addName(Transcraft.OilOre, "Oil Ore");
		LanguageRegistry.addName(Transcraft.BlueLight, "Blue Light");
		LanguageRegistry.addName(Transcraft.GreenLight, "Green Light");
		LanguageRegistry.addName(Transcraft.OrangeLight, "Orange Light");
		LanguageRegistry.addName(Transcraft.DarkLight, "Dark Light");
		LanguageRegistry.addName(Transcraft.IronTorch, "Iron Torch");
		LanguageRegistry.addName(Transcraft.ThinClearGlass,
				"Thin Crystal Glass");
		LanguageRegistry.addName(Transcraft.BunkerBlock, "Bunker Block");
		LanguageRegistry.addName(Transcraft.BunkerStair, "Bunker Stair");
		LanguageRegistry.addName(Transcraft.ClearGlass, "Clear Glass");
		LanguageRegistry.addName(Transcraft.SmoothBunkerStair,
				"Smooth Bunker Stair");
		LanguageRegistry.addName(Transcraft.ObsidianLever, "Obsidian Lever");
		LanguageRegistry.addName(Transcraft.SmoothBunkerBlock,
				"Smooth Bunker Block");
		LanguageRegistry.addName(Transcraft.DriedTransmutter,
				"Dried Transmuter");
		LanguageRegistry.addName(Transcraft.Transcrafter, "Transcrafter");
		LanguageRegistry.addName(Transcraft.ComIronOre, "Packed Iron Ore");
		LanguageRegistry.addName(Transcraft.ComGoldOre, "Packed Gold Ore");
		LanguageRegistry.addName(Transcraft.ComTransmutterOre,
				"Packed Transmuter Ore");
		LanguageRegistry.addName(Transcraft.ComOilOre, "Packed Oil Ore");
		LanguageRegistry.addName(Transcraft.enderQuartzBlock,
				"Ender Quartz Block");

		
		GameRegistry.registerBlock(Transcraft.OilOre, "Oil Ore");
		GameRegistry.registerBlock(Transcraft.BlueLight, "Blue Light");
		GameRegistry.registerBlock(Transcraft.GreenLight, "Green Light");
		GameRegistry.registerBlock(Transcraft.OrangeLight, "Orange Light");
		GameRegistry.registerBlock(Transcraft.DarkLight, "Dark Light");
		GameRegistry.registerBlock(Transcraft.IronTorch, "IronTorch");

		GameRegistry.registerBlock(Transcraft.ThinClearGlass,
				"Thin Clear Glass");
		GameRegistry.registerBlock(Transcraft.BunkerBlock, "Bunker Block");
		GameRegistry.registerBlock(Transcraft.SmoothBunkerStair,
				"Smooth Bunker Stair");
		GameRegistry.registerBlock(Transcraft.DriedTransmutter,
				"Dried Transmuter");
		GameRegistry.registerBlock(Transcraft.ComIronOre, "Packed Iron Ore");
		GameRegistry.registerBlock(Transcraft.ComGoldOre, "Packed Gold Ore");
		GameRegistry.registerBlock(Transcraft.ComTransmutterOre,
				"Packed Transmuter Ore");
		GameRegistry.registerBlock(Transcraft.ComOilOre, "Packed Oil Ore");
		GameRegistry.registerBlock(Transcraft.BunkerStair, "Bunker Stair");
		GameRegistry.registerBlock(Transcraft.ObsidianLever, "Obsidian Lever");
		GameRegistry.registerBlock(Transcraft.SmoothBunkerBlock,
				"Smooth Bunker Block");

		GameRegistry.registerBlock(Transcraft.enderQuartzBlock, "EnderQuartz");
		GameRegistry.registerBlock(Transcraft.enderQuartzBlock,ItemEnderQuartzBlock.class , "ItemEnderQuartzBlock");

		GameRegistry.registerBlock(Transcraft.CutenderQuartz, "CutEnderQuartz");
		GameRegistry.registerBlock(Transcraft.CutenderQuartz,ItemCutEnderQuartzBlock.class ,"ItemCutEnderQuartzBlock");

		GameRegistry.registerBlock(Transcraft.EnderQuartzBrick,
				"EnderQuartzBricks");
		GameRegistry.registerBlock(Transcraft.EnderQuartzBrick,ItemEnderQuartzBrick.class ,"ItemEnderQuartzBrick");

		GameRegistry.registerBlock(Transcraft.EnderQuartzBigBrick,
				"EnderQuartzBigBricks");
		GameRegistry.registerBlock(Transcraft.EnderQuartzBigBrick,ItemEnderQuartzBigBrick.class , "ItemEnderQuartzBigBrick");

		GameRegistry.registerBlock(Transcraft.FancyCrystalGlass,
				"Fancy Crystal Glass");
		GameRegistry.registerBlock(Transcraft.FancyCrystalGlass,ItemFancyCryastalGlass.class , "ItemFancyCryastalGlass");

		GameRegistry.registerBlock(Transcraft.TranscraftOre, "Transmuter Ore");
		GameRegistry.registerBlock(Transcraft.TranscraftOre,TranscraftOreItem.class , "ItemTranscraftOreItem");
		
		
		GameRegistry.registerBlock(Transcraft.ClearGlass, IColoredItemBlock.class, "Clear Glass");
		GameRegistry.registerBlock(Transcraft.FancyCrystalGlass,ItemCrystalGlass.class ,"ItemCrystalGlass");

		GameRegistry.registerBlock(Transcraft.Transcrafter, "Transcrafter");
		

		 GameRegistry.registerBlock(Transcraft.ixpGrinder, "ItemGrinder");

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
//		TileEntity.addMapping(TileIXP.class, "TileItemGrinder2");
		
		
	}

	public static void registerItem(Item item) {
		GameRegistry.registerItem(item,
				item.getUnlocalizedName().replace("item.", ""));
	}

}