package modmuss50.mods.transcraft.loaders;

import modmuss50.mods.transcraft.Blocks.TranscraftBlocks;
import modmuss50.mods.transcraft.Items.TranscraftItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeLoader {

	public static void LoadRecipe() {
		ItemStack dirtStack = new ItemStack(Block.dirt);
		ItemStack gravelStack = new ItemStack(Block.gravel);
		ItemStack CStoneStack = new ItemStack(Block.cobblestone);
		ItemStack CoalStack = new ItemStack(Item.coal);
		ItemStack GoldIStack = new ItemStack(Item.ingotGold);
		ItemStack IronIStack = new ItemStack(Item.ingotIron);
		ItemStack neatherbrickStack = new ItemStack(Block.netherBrick);
		ItemStack ObsidianStack = new ItemStack(Block.obsidian);
		ItemStack Water = new ItemStack(Item.bucketWater);
		ItemStack sponge = new ItemStack(Block.sponge);
		ItemStack DiamondBlock = new ItemStack(Block.blockDiamond);
		ItemStack Owood = new ItemStack(Block.wood);
		ItemStack Swood = new ItemStack(Block.wood, 1, 1);
		ItemStack Bwood = new ItemStack(Block.wood, 1, 2);
		ItemStack Jwood = new ItemStack(Block.wood, 1, 3);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticHelmet, 1),
				"ppp", "p p", "   ", 'p', TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticChest, 1),
				"p p", "ppp", "ppp", 'p', TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticLegs, 1),
				"ppp", "p p", "p p", 'p', TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticBoots, 1),
				"   ", "p p", "p p", 'p', TranscraftItems.Plastic);

		GameRegistry.addRecipe(new ItemStack(TranscraftBlocks.ComIronOre, 1),
				"ii", "ii", 'i', Block.oreIron);
		GameRegistry.addRecipe(new ItemStack(TranscraftBlocks.ComGoldOre, 1),
				"ii", "ii", 'i', Block.oreGold);

		ItemStack ComTransmutterOre4 = new ItemStack(
				TranscraftBlocks.ComTransmutterOre, 4, 0);
		ItemStack TransmutterOre1 = new ItemStack(
				TranscraftBlocks.TranscraftOre, 1, 0);
		GameRegistry.addRecipe(ComTransmutterOre4, "ii", "ii", 'i',
				TransmutterOre1);

		GameRegistry.addRecipe(new ItemStack(TranscraftBlocks.ComOilOre, 1),
				"ii", "ii", 'i', TranscraftItems.Oil);
		GameRegistry.addRecipe(TransmutterOre1, "i", 'i',
				TranscraftBlocks.ComTransmutterOre);

		GameRegistry.addRecipe(new ItemStack(Block.oreIron, 4), "i", 'i',
				TranscraftBlocks.ComIronOre);
		GameRegistry.addRecipe(new ItemStack(Block.oreGold, 4), "i", 'i',
				TranscraftBlocks.ComGoldOre);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.Oil, 4), "i", 'i',
				TranscraftBlocks.ComOilOre);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.HotDog, 8), "bbb",
				"ppp", "bbb", 'b', Item.bread, 'p', Item.porkCooked);

		GameRegistry.addRecipe(
				new ItemStack(TranscraftBlocks.ObsidianLever, 2), "lb ", "   ",
				"  ", 'l', Block.lever, 'b', TranscraftBlocks.BunkerBlock);

		GameRegistry.addRecipe(new ItemStack(Block.sponge, 16), "yxy", "xdx",
				"yxy", 'x', Water, 'y', GoldIStack, 'd', Item.diamond);

		GameRegistry.addRecipe(new ItemStack(TranscraftBlocks.BunkerBlock, 8),
				"opo", "pdp", "opo", 'o', TranscraftItems.HardendPlastic, 'p',
				TranscraftItems.Plastic, 'd', Item.diamond);
		GameRegistry.addRecipe(
				new ItemStack(TranscraftBlocks.ThinClearGlass, 8), "   ",
				"ggg", "ggg", 'g', TranscraftBlocks.ClearGlass);
		GameRegistry.addRecipe(new ItemStack(TranscraftBlocks.BunkerStair, 4),
				"b  ", "bb ", "bbb", 'b', TranscraftBlocks.BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(TranscraftBlocks.BunkerStair, 4),
				"  b", " bb", "bbb", 'b', TranscraftBlocks.BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(
				TranscraftBlocks.SmoothBunkerBlock, 4), "bb", "bb", 'b',
				TranscraftBlocks.BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(
				TranscraftBlocks.SmoothBunkerStair, 4), "b  ", "bb ", "bbb",
				'b', TranscraftBlocks.SmoothBunkerBlock);
		GameRegistry.addRecipe(new ItemStack(
				TranscraftBlocks.SmoothBunkerStair, 4), "  b", " bb", "bbb",
				'b', TranscraftBlocks.SmoothBunkerBlock);

		GameRegistry.addRecipe(new ItemStack(TranscraftBlocks.Transcrafter),
				"ddd", "ece", "ooo", 'e', Item.emerald, 'd', Item.diamond, 'c',
				Block.chest, 'o', Block.obsidian);

		ItemStack BlueDye = new ItemStack(Item.dyePowder, 1, 12);
		ItemStack GreenDye = new ItemStack(Item.dyePowder, 1, 2);
		ItemStack OrangeDye = new ItemStack(Item.dyePowder, 1, 14);

		GameRegistry.addRecipe(new ItemStack(TranscraftBlocks.BlueLight, 8),
				"prp", "pbp", "prp", 'r', Item.redstone, 'p',
				TranscraftItems.Plastic, 'b', BlueDye);
		GameRegistry.addRecipe(new ItemStack(TranscraftBlocks.GreenLight, 8),
				"prp", "pbp", "prp", 'r', Item.redstone, 'p',
				TranscraftItems.Plastic, 'b', GreenDye);
		GameRegistry.addRecipe(new ItemStack(TranscraftBlocks.OrangeLight, 8),
				"prp", "pbp", "prp", 'r', Item.redstone, 'p',
				TranscraftItems.Plastic, 'b', OrangeDye);
		GameRegistry.addRecipe(new ItemStack(TranscraftBlocks.DarkLight, 8),
				"prp", "pbp", "prp", 'r', Item.redstone, 'p',
				TranscraftItems.Plastic, 'b', Block.obsidian);
		GameRegistry.addRecipe(
				new ItemStack(TranscraftItems.HardendPlastic, 8), "pop", "ooo",
				"pop", 'p', TranscraftItems.Plastic, 'o', Block.obsidian);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.IronStick, 4),
				" i ", " s ", " i ", 'i', Item.ingotIron, 's', Item.stick);
		GameRegistry.addRecipe(new ItemStack(TranscraftBlocks.IronTorch, 16),
				"o", "i", 'i', TranscraftItems.IronStick, 'o',
				TranscraftItems.Oil);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticSword),
				" p ", " p ", " i ", 'i', TranscraftItems.IronStick, 'p',
				TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticPickaxe),
				"ppp", " i ", " i ", 'i', TranscraftItems.IronStick, 'p',
				TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticAxe),
				" pp", " ip", " i ", 'i', TranscraftItems.IronStick, 'p',
				TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticAxe),
				"pp ", "pi ", " i ", 'i', TranscraftItems.IronStick, 'p',
				TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticHoe),
				"pp ", " i ", " i ", 'i', TranscraftItems.IronStick, 'p',
				TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticHoe),
				" pp", " i ", " i ", 'i', TranscraftItems.IronStick, 'p',
				TranscraftItems.Plastic);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.PlasticShovel),
				" p ", " i ", " i ", 'i', TranscraftItems.IronStick, 'p',
				TranscraftItems.Plastic);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.BunkerPick),
				"bbb", "dod", "qoq", 'b', TranscraftBlocks.BunkerBlock, 'd',
				Block.blockDiamond, 'o', TranscraftItems.HardendPlastic, 'q',
				TranscraftItems.DarkEndershard);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.EnderSword),
				"ebe", "ebe", "ndn", 'e', TranscraftItems.EnderGem, 'd',
				Block.blockDiamond, 'b', TranscraftBlocks.BunkerBlock, 'n',
				Item.swordDiamond);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.EnderQuartz, 6),
				"qeq", "qdq", "qeq", 'q', TranscraftItems.DarkEndershard, 'd',
				Block.whiteStone, 'e', Item.eyeOfEnder);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.EnderGem), "qdq",
				"qeq", "qdq", 'q', TranscraftItems.EnderQuartz, 'd',
				Item.diamond, 'e', Item.eyeOfEnder);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.EnderHelmet, 1),
				"ppp", "pgp", "   ", 'p', TranscraftItems.EnderGem, 'g',
				TranscraftBlocks.FancyCrystalGlass);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.EnderChest, 1),
				"pbp", "ppp", "ppp", 'p', TranscraftItems.EnderGem, 'b',
				TranscraftBlocks.BunkerBlock);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.EnderLegs, 1),
				"ppp", "p p", "pep", 'p', TranscraftItems.EnderGem, 'e',
				Item.eyeOfEnder);
		GameRegistry.addRecipe(new ItemStack(TranscraftItems.EnderBoots, 1),
				"   ", "pep", "pep", 'p', TranscraftItems.EnderGem, 'e',
				Item.enderPearl);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.QuadTransmuter),
				"sbs", "bsb", "sbs", 'b', TranscraftItems.BasicTransmuter, 's',
				Block.stone);

		GameRegistry.addRecipe(new ItemStack(TranscraftItems.NanoTransmuter),
				"qqr", "qqg", "qqr", 'q', TranscraftItems.QuadTransmuter, 'g',
				Item.glowstone, 'r', Item.redstone);

		// Smelting Recipes
		GameRegistry.addSmelting(TranscraftBlocks.TranscraftOre.blockID,
				new ItemStack(TranscraftItems.BasicTransmuter), 5.0f);
		GameRegistry.addSmelting(TranscraftItems.Oil.itemID, new ItemStack(
				TranscraftItems.Plastic), 1.3f);
		GameRegistry.addSmelting(TranscraftBlocks.OilOre.blockID,
				new ItemStack(TranscraftItems.Oil), 3.3f);

//		GameRegistry.addRecipe(new ItemStack(TranscraftBlocks.ixpGrinder),
//				"qcq", "qdq", "qqq", 'q', TranscraftItems.NanoTransmuter, 'c',
//				Block.chest, 'd', Item.netherStar);

		for (int i = 15; i >= 0; i--) {
			GameRegistry.addShapelessRecipe(new ItemStack(
					TranscraftBlocks.enderQuartzBlock, 1, i), new ItemStack(
					Block.sandStone, 1, 2),
					new ItemStack(Item.dyePowder, 1, i), new ItemStack(
							Item.dyePowder, 1, i));
		}

		for (int i = 15; i >= 0; i--) {
			GameRegistry.addShapelessRecipe(new ItemStack(
					TranscraftBlocks.CutenderQuartz, 1, i), new ItemStack(
					Block.sandStone, 1, 1),
					new ItemStack(Item.dyePowder, 1, i), new ItemStack(
							Item.dyePowder, 1, i));
		}

		for (int i = 15; i >= 0; i--) {
			GameRegistry.addShapelessRecipe(new ItemStack(
					TranscraftBlocks.EnderQuartzBrick, 1, i), new ItemStack(
					Block.brick, 1, 0), new ItemStack(Item.dyePowder, 1, i),
					new ItemStack(Item.dyePowder, 1, i));
		}

		for (int i = 15; i >= 0; i--) {
			GameRegistry.addShapelessRecipe(new ItemStack(
					TranscraftBlocks.FancyCrystalGlass, 1, i), new ItemStack(
					TranscraftBlocks.ClearGlass, 1, i), new ItemStack(
					Item.goldNugget, 1, 0),
					new ItemStack(Item.goldNugget, 1, 0));
		}

		for (int i = 15; i >= 0; i--) {
			GameRegistry.addShapelessRecipe(new ItemStack(
					TranscraftBlocks.ClearGlass, 1, i), new ItemStack(
					Block.glass, 1, i), new ItemStack(Item.dyePowder, 1, i),
					new ItemStack(Item.dyePowder, 1, i));
		}

		for (int i = 15; i >= 0; i--) {
			GameRegistry.addRecipe(new ItemStack(TranscraftBlocks.ThinClearGlass, 1, i),"   ", "ggg", "ggg", 'g', new ItemStack(TranscraftBlocks.ClearGlass, 1, i));
		}
		
	}

}
