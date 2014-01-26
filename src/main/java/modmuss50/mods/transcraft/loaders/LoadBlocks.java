package modmuss50.mods.transcraft.loaders;

import modmuss50.mods.transcraft.Transcraft;
import modmuss50.mods.transcraft.Blocks.ThinCrystalGlass;
import modmuss50.mods.transcraft.Blocks.TranscraftBlocks;
import modmuss50.mods.transcraft.Blocks.TranscraftOre;
import modmuss50.mods.transcraft.Blocks.Quartz.CutEnderQuartz;
import modmuss50.mods.transcraft.Blocks.Quartz.EnderQuartz;
import modmuss50.mods.transcraft.Blocks.Quartz.EnderQuartzBigBrick;
import modmuss50.mods.transcraft.Blocks.Quartz.EnderQuartzBrick;
import modmuss50.mods.transcraft.helpers.Config;
import net.minecraft.block.Block;

public class LoadBlocks {

	public static void LoadBlocks() {

		TranscraftBlocks.TranscraftOre = new TranscraftOre(
				Config.TranscraftOreID)
				.setUnlocalizedName("Transcraft:TranscraftOre")
				.setHardness(1.5F).setCreativeTab(Transcraft.Transtab)
				.setTextureName("Transcraft:TranscraftOre");

		TranscraftBlocks.OilOre = new modmuss50.mods.transcraft.Blocks.OilOre(
				Config.OilOreID).setUnlocalizedName("Transcraft:OilOre")
				.setHardness(1.5F).setTextureName("Transcraft:OilOre")
				.setCreativeTab(Transcraft.Transtab);

		TranscraftBlocks.BlueLight = new modmuss50.mods.transcraft.Blocks.Lights.BlueLight(
				Config.BlueLightID).setUnlocalizedName("Transcraft:BlueLight")
				.setHardness(1.0F).setCreativeTab(Transcraft.Transtab)
				.setLightValue(1.0F).setLightOpacity(0)
				.setTextureName("Transcraft:BlueLight");

		TranscraftBlocks.GreenLight = new modmuss50.mods.transcraft.Blocks.Lights.GreenLight(
				Config.GreenLightID)
				.setUnlocalizedName("Transcraft:GreenLight").setHardness(1.0F)
				.setCreativeTab(Transcraft.Transtab).setLightValue(1.0F)
				.setLightOpacity(0).setTextureName("Transcraft:GreenLight");

		TranscraftBlocks.OrangeLight = new modmuss50.mods.transcraft.Blocks.Lights.OrangeLight(
				Config.OrangeLightID)
				.setUnlocalizedName("Transcraft:OrangeLight").setHardness(1.0F)
				.setCreativeTab(Transcraft.Transtab).setLightValue(1.0F)
				.setLightOpacity(0).setTextureName("Transcraft:OrangeLight");

		TranscraftBlocks.DarkLight = new modmuss50.mods.transcraft.Blocks.Lights.DarkLight(
				Config.DarkLightID).setUnlocalizedName("Transcraft:DarkLight")
				.setHardness(1.0F).setCreativeTab(Transcraft.Transtab)
				.setLightValue(1.0F).setLightOpacity(0)
				.setTextureName("Transcraft:DarkLight");

		TranscraftBlocks.IronTorch = new modmuss50.mods.transcraft.Blocks.IronTorch(
				Config.IronTorchID).setUnlocalizedName("Transcraft:IronTorch")
				.setHardness(1.0F).setCreativeTab(Transcraft.Transtab)
				.setLightValue(1.0F).setLightOpacity(0)
				.setTextureName("Transcraft:IronTorch");

		TranscraftBlocks.ClearGlass = new modmuss50.mods.transcraft.Blocks.CrystalGlass(
				Config.ClearGlassID).setStepSound(Block.soundGlassFootstep)
				.setUnlocalizedName("Transcraft:ClearGlass").setHardness(1.5F)
				.setCreativeTab(Transcraft.TranstabDecBlocks)
				.setLightValue(0.0F).setLightOpacity(0)
				.setTextureName("Transcraft:ClearGlass");

		TranscraftBlocks.FancyCrystalGlass = new modmuss50.mods.transcraft.Blocks.FancyCrystalGlass.FancyCrystalGlass(
				Config.FancyCrystalGlassID, "clear", false)
				.setStepSound(Block.soundGlassFootstep)
				.setUnlocalizedName("Transcraft:FancyCrystalGlass")
				.setHardness(1.5F).setCreativeTab(Transcraft.TranstabDecBlocks)
				.setLightValue(0.0F).setLightOpacity(0)
				.setTextureName("Transcraft:FancyCrystalGlass");

		TranscraftBlocks.ThinClearGlass = new ThinCrystalGlass(
				Config.ThinClearGlassID).setStepSound(Block.soundGlassFootstep)
				.setUnlocalizedName("Transcraft:ThinClearGlass")
				.setHardness(1.5F).setCreativeTab(Transcraft.TranstabDecBlocks)
				.setLightValue(0.0F).setLightOpacity(0)
				.setTextureName("Transcraft:ClearGlass");

		TranscraftBlocks.BunkerBlock = new modmuss50.mods.transcraft.Blocks.BunkerBlock(
				Config.BunkerBlockID)
				.setUnlocalizedName("Transcraft:BunkerBlock")
				.setHardness(10.0F).setResistance(999999999999999999999.0F)
				.setCreativeTab(Transcraft.Transtab).setLightValue(0.0F)
				.setLightOpacity(0).setTextureName("Transcraft:BunkerBlock");

		TranscraftBlocks.BunkerStair = (new modmuss50.mods.transcraft.Blocks.BunkerStair(
				Config.BunkerStairID, TranscraftBlocks.BunkerBlock, 0))
				.setUnlocalizedName("Transcraft:BunkerStair")
				.setCreativeTab(Transcraft.Transtab).setHardness(10.0F)
				.setResistance(999999999999.0F)
				.setTextureName("Transcraft:BunkerStair");

		TranscraftBlocks.ObsidianLever = new modmuss50.mods.transcraft.Blocks.ObsidianLever(
				Config.ObsidianLeverID)
				.setUnlocalizedName("Transcraft:ObsidianLever")
				.setHardness(50.0F).setResistance(999999999999999999999.0F)
				.setCreativeTab(Transcraft.Transtab)
				.setTextureName("Transcraft:ObsidianLever");

		TranscraftBlocks.SmoothBunkerBlock = new modmuss50.mods.transcraft.Blocks.SmoothBunkerBlock(
				Config.SmoothBunkerBlockID)
				.setUnlocalizedName("Transcraft:SmoothBunkerBlock")
				.setHardness(10.0F).setResistance(999999999999999999999.0F)
				.setCreativeTab(Transcraft.Transtab).setLightValue(0.0F)
				.setLightOpacity(0)
				.setTextureName("Transcraft:SmoothBunkerBlock");

		TranscraftBlocks.SmoothBunkerStair = (new modmuss50.mods.transcraft.Blocks.SmoothBunkerStair(
				Config.SmoothBunkerStairID, TranscraftBlocks.SmoothBunkerBlock,
				0)).setUnlocalizedName("Transcraft:SmoothBunkerStair")
				.setCreativeTab(Transcraft.Transtab).setHardness(10.0F)
				.setResistance(999999999999999999999.0F)
				.setTextureName("Transcraft:SmoothBunkerStair");

		TranscraftBlocks.DriedTransmutter = (new modmuss50.mods.transcraft.Blocks.DriedTransmutter(
				Config.DriedTransmutterID)
				.setUnlocalizedName("Transcraft:DriedTransmutter")
				.setCreativeTab(Transcraft.Transtab).setHardness(3.0F)
				.setResistance(9.0F).setLightValue(1.0F)
				.setTextureName("Transcraft:DriedTransmutter"));

		TranscraftBlocks.ComIronOre = new modmuss50.mods.transcraft.Blocks.ComOres.ComIronOre(
				Config.ComIronOreID)
				.setUnlocalizedName("Transcraft:ComIronOre").setHardness(1.5F)
				.setCreativeTab(Transcraft.Transtab)
				.setTextureName("Transcraft:ComIronOre");

		TranscraftBlocks.ComGoldOre = new modmuss50.mods.transcraft.Blocks.ComOres.ComGoldOre(
				Config.ComGoldOreID)
				.setUnlocalizedName("Transcraft:ComGoldOre").setHardness(1.5F)
				.setCreativeTab(Transcraft.Transtab)
				.setTextureName("Transcraft:ComGoldOre");

		TranscraftBlocks.ComTransmutterOre = new modmuss50.mods.transcraft.Blocks.ComOres.ComTransmutterOre(
				Config.ComTransmutterOreID)
				.setUnlocalizedName("Transcraft:ComTransmutterOre")
				.setHardness(1.5F).setCreativeTab(Transcraft.Transtab)
				.setTextureName("Transcraft:ComTransmutterOre");

		TranscraftBlocks.ComOilOre = new modmuss50.mods.transcraft.Blocks.ComOres.ComOilOre(
				Config.ComOilOreID).setUnlocalizedName("Transcraft:ComOilOre")
				.setHardness(1.5F).setCreativeTab(Transcraft.Transtab)
				.setTextureName("Transcraft:ComOilOre");

		TranscraftBlocks.Transcrafter = new modmuss50.mods.transcraft.TileEntitys.Transcrafter.Transcrafter(
				Config.TranscrafterID).setCreativeTab(Transcraft.Transtab)
				.setHardness(1.0F)
				.setUnlocalizedName("Transcraft:Transcrafter");

		TranscraftBlocks.enderQuartzBlock = new EnderQuartz(
				Config.BlockEnderQuartzID)
				.setUnlocalizedName("Transcraft:enderquartz")
				.setTextureName("Transcraft:enderquartz").setHardness(1.0F)
				.setCreativeTab(Transcraft.TranstabDecBlocks);

		TranscraftBlocks.CutenderQuartz = new CutEnderQuartz(
				Config.BlockCutEnderQuartzID)
				.setUnlocalizedName("Transcraft:CutEnderQuartz")
				.setTextureName("Transcraft:CutEnderQuartz").setHardness(1.0F)
				.setCreativeTab(Transcraft.TranstabDecBlocks);

		TranscraftBlocks.EnderQuartzBrick = new EnderQuartzBrick(
				Config.BlockEnderQuartzBrickID)
				.setUnlocalizedName("Transcraft:EnderQuartzBrick")
				.setTextureName("Transcraft:EnderQuartzBrick")
				.setHardness(1.0F).setCreativeTab(Transcraft.TranstabDecBlocks);

		TranscraftBlocks.EnderQuartzBigBrick = new EnderQuartzBigBrick(
				Config.BlockEnderQuartzBigBrickID)
				.setUnlocalizedName("Transcraft:EnderQuartzBigBricks")
				.setTextureName("Transcraft:EnderQuartzBrick2")
				.setHardness(1.0F).setCreativeTab(Transcraft.TranstabDecBlocks);

//		TranscraftBlocks.ixpGrinder = new IXPGrinderMk2(Config.ixpGrinderID, 0)
//				.setUnlocalizedName("Transcraft:ixpGrinder").setHardness(1.0F)
//				.setTextureName("Transcraft:ixpGrinder")
//				.setCreativeTab(Transcraft.Transtab);

	}
}
