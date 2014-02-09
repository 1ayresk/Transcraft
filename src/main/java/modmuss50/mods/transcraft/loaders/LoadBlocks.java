package modmuss50.mods.transcraft.loaders;

import modmuss50.mods.transcraft.Transcraft;
import modmuss50.mods.transcraft.Blocks.ThinCrystalGlass;
import modmuss50.mods.transcraft.Blocks.TranscraftBlocks;
import modmuss50.mods.transcraft.Blocks.TranscraftOre;
import modmuss50.mods.transcraft.Blocks.TransmutterPlant;
import modmuss50.mods.transcraft.Blocks.Quartz.CutEnderQuartz;
import modmuss50.mods.transcraft.Blocks.Quartz.EnderQuartz;
import modmuss50.mods.transcraft.Blocks.Quartz.EnderQuartzBigBrick;
import modmuss50.mods.transcraft.Blocks.Quartz.EnderQuartzBrick;
import modmuss50.mods.transcraft.Blocks.TileEntitys.ItemGrinder.ItemGrinder;

public class LoadBlocks {

	public static void LoadBlocks() {

		TranscraftBlocks.TranscraftOre = new TranscraftOre().setHardness(1.5F).setCreativeTab(Transcraft.Transtab);

		TranscraftBlocks.OilOre = new modmuss50.mods.transcraft.Blocks.OilOre()
				.setHardness(1.5F)
				.setCreativeTab(Transcraft.Transtab);

		TranscraftBlocks.BlueLight = new modmuss50.mods.transcraft.Blocks.Lights.BlueLight()
				.setHardness(1.0F)
				.setCreativeTab(Transcraft.Transtab).setLightLevel(1.0F)
				.setLightOpacity(0);

		TranscraftBlocks.GreenLight = new modmuss50.mods.transcraft.Blocks.Lights.GreenLight()
				.setHardness(1.0F)
				.setCreativeTab(Transcraft.Transtab).setLightLevel(1.0F)
				.setLightOpacity(0);

		TranscraftBlocks.OrangeLight = new modmuss50.mods.transcraft.Blocks.Lights.OrangeLight()
				.setHardness(1.0F)
				.setCreativeTab(Transcraft.Transtab).setLightLevel(1.0F)
				.setLightOpacity(0);

		TranscraftBlocks.DarkLight = new modmuss50.mods.transcraft.Blocks.Lights.DarkLight()
				.setHardness(1.0F)
				.setCreativeTab(Transcraft.Transtab).setLightLevel(1.0F)
				.setLightOpacity(0);

		TranscraftBlocks.IronTorch = new modmuss50.mods.transcraft.Blocks.IronTorch()
				.setHardness(1.0F)
				.setCreativeTab(Transcraft.Transtab).setLightLevel(1.0F)
				.setLightOpacity(0);

		TranscraftBlocks.ClearGlass = new modmuss50.mods.transcraft.Blocks.CrystalGlass()
				.setHardness(1.5F)
				.setCreativeTab(Transcraft.TranstabDecBlocks)
				.setLightLevel(0.0F).setLightOpacity(0)
				;

		TranscraftBlocks.FancyCrystalGlass = new modmuss50.mods.transcraft.Blocks.FancyCrystalGlass.FancyCrystalGlass(
				"clear", false)
				.setHardness(1.5F)
				.setCreativeTab(Transcraft.TranstabDecBlocks)
				.setLightLevel(0.0F).setLightOpacity(0)
				;

		TranscraftBlocks.ThinClearGlass = new ThinCrystalGlass()
				.setHardness(1.5F)
				.setCreativeTab(Transcraft.TranstabDecBlocks)
				.setLightLevel(0.0F).setLightOpacity(0)
				;

		TranscraftBlocks.BunkerBlock = new modmuss50.mods.transcraft.Blocks.BunkerBlock()
				.setHardness(10.0F)
				.setResistance(999999999999999999999.0F)
				.setCreativeTab(Transcraft.Transtab).setLightLevel(0.0F)
				.setLightOpacity(0);

		TranscraftBlocks.BunkerStair = (new modmuss50.mods.transcraft.Blocks.BunkerStair(
				TranscraftBlocks.BunkerBlock, 0))
				.setCreativeTab(Transcraft.Transtab).setHardness(10.0F)
				.setResistance(999999999999.0F);

		TranscraftBlocks.ObsidianLever = new modmuss50.mods.transcraft.Blocks.ObsidianLever()
				.setHardness(50.0F)
				.setResistance(999999999999999999999.0F)
				.setCreativeTab(Transcraft.Transtab);

		TranscraftBlocks.SmoothBunkerBlock = new modmuss50.mods.transcraft.Blocks.SmoothBunkerBlock()
				
				.setHardness(10.0F).setResistance(999999999999999999999.0F)
				.setCreativeTab(Transcraft.Transtab).setLightLevel(0.0F)
				.setLightOpacity(0);

		TranscraftBlocks.SmoothBunkerStair = (new modmuss50.mods.transcraft.Blocks.SmoothBunkerStair(
				TranscraftBlocks.SmoothBunkerBlock, 0))
				.setCreativeTab(Transcraft.Transtab).setHardness(10.0F)
				.setResistance(999999999999999999999.0F);

		TranscraftBlocks.DriedTransmutter = (new modmuss50.mods.transcraft.Blocks.DriedTransmutter()	
				.setCreativeTab(Transcraft.Transtab).setHardness(3.0F)
				.setResistance(9.0F).setLightLevel(1.0F));

		TranscraftBlocks.ComIronOre = new modmuss50.mods.transcraft.Blocks.ComOres.ComIronOre()
				.setHardness(1.5F)
				.setCreativeTab(Transcraft.Transtab);

		TranscraftBlocks.ComGoldOre = new modmuss50.mods.transcraft.Blocks.ComOres.ComGoldOre()
				.setHardness(1.5F)
				.setCreativeTab(Transcraft.Transtab);

		TranscraftBlocks.ComTransmutterOre = new modmuss50.mods.transcraft.Blocks.ComOres.ComTransmutterOre()
				.setHardness(1.5F).setCreativeTab(Transcraft.Transtab);

		TranscraftBlocks.ComOilOre = new modmuss50.mods.transcraft.Blocks.ComOres.ComOilOre().setHardness(1.5F)
				.setCreativeTab(Transcraft.Transtab)
				;

		TranscraftBlocks.Transcrafter = new modmuss50.mods.transcraft.Blocks.TileEntitys.Transcrafter.Transcrafter()
				.setCreativeTab(Transcraft.Transtab).setHardness(1.0F);

		TranscraftBlocks.enderQuartzBlock = new EnderQuartz()
				.setHardness(1.0F)
				.setCreativeTab(Transcraft.TranstabDecBlocks);

		TranscraftBlocks.CutenderQuartz = new CutEnderQuartz()
				.setHardness(1.0F)
				.setCreativeTab(Transcraft.TranstabDecBlocks);

		TranscraftBlocks.EnderQuartzBrick = new EnderQuartzBrick()
				.setHardness(1.0F)
				.setCreativeTab(Transcraft.TranstabDecBlocks);

		TranscraftBlocks.EnderQuartzBigBrick = new EnderQuartzBigBrick()
				.setHardness(1.0F)
				.setCreativeTab(Transcraft.TranstabDecBlocks);

		TranscraftBlocks.ixpGrinder = new ItemGrinder(0)
				.setHardness(1.0F)
				.setCreativeTab(Transcraft.Transtab);

		TranscraftBlocks.TransmutterPlant = new TransmutterPlant()
		.setHardness(1.0F)
		.setCreativeTab(Transcraft.Transtab);
		
	}
}
