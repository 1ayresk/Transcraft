package modmuss50.mods.transcraft.loaders;

import modmuss50.mods.transcraft.Transcraft;
import modmuss50.mods.transcraft.Blocks.ThinCrystalGlass;
import modmuss50.mods.transcraft.Blocks.TranscraftBlocks;
import modmuss50.mods.transcraft.Blocks.TranscraftOre;
import modmuss50.mods.transcraft.Blocks.Quartz.CutEnderQuartz;
import modmuss50.mods.transcraft.Blocks.Quartz.EnderQuartz;
import modmuss50.mods.transcraft.Blocks.Quartz.EnderQuartzBigBrick;
import modmuss50.mods.transcraft.Blocks.Quartz.EnderQuartzBrick;
import modmuss50.mods.transcraft.TileEntitys.ItemGrinder.ItemGrinder;

public class LoadBlocks {

	public static void LoadBlocks() {

		TranscraftBlocks.TranscraftOre = new TranscraftOre()
				.func_149663_c("Transcraft:TranscraftOre").func_149711_c(1.5F)
				.func_149647_a(Transcraft.Transtab)
				.func_149658_d("Transcraft:TranscraftOre");

		TranscraftBlocks.OilOre = new modmuss50.mods.transcraft.Blocks.OilOre()
				.func_149663_c("Transcraft:OilOre").func_149711_c(1.5F)
				.func_149658_d("Transcraft:OilOre")
				.func_149647_a(Transcraft.Transtab);

		TranscraftBlocks.BlueLight = new modmuss50.mods.transcraft.Blocks.Lights.BlueLight()
				.func_149663_c("Transcraft:BlueLight").func_149711_c(1.0F)
				.func_149647_a(Transcraft.Transtab).func_149715_a(1.0F)
				.func_149713_g(0).func_149658_d("Transcraft:BlueLight");

		TranscraftBlocks.GreenLight = new modmuss50.mods.transcraft.Blocks.Lights.GreenLight()
				.func_149663_c("Transcraft:GreenLight").func_149711_c(1.0F)
				.func_149647_a(Transcraft.Transtab).func_149715_a(1.0F)
				.func_149713_g(0).func_149658_d("Transcraft:GreenLight");

		TranscraftBlocks.OrangeLight = new modmuss50.mods.transcraft.Blocks.Lights.OrangeLight()
				.func_149663_c("Transcraft:OrangeLight").func_149711_c(1.0F)
				.func_149647_a(Transcraft.Transtab).func_149715_a(1.0F)
				.func_149713_g(0).func_149658_d("Transcraft:OrangeLight");

		TranscraftBlocks.DarkLight = new modmuss50.mods.transcraft.Blocks.Lights.DarkLight()
				.func_149663_c("Transcraft:DarkLight").func_149711_c(1.0F)
				.func_149647_a(Transcraft.Transtab).func_149715_a(1.0F)
				.func_149713_g(0).func_149658_d("Transcraft:DarkLight");

		TranscraftBlocks.IronTorch = new modmuss50.mods.transcraft.Blocks.IronTorch()
				.func_149663_c("Transcraft:IronTorch").func_149711_c(1.0F)
				.func_149647_a(Transcraft.Transtab).func_149715_a(1.0F)
				.func_149713_g(0).func_149658_d("Transcraft:IronTorch");

		TranscraftBlocks.ClearGlass = new modmuss50.mods.transcraft.Blocks.CrystalGlass()
				.func_149663_c("Transcraft:ClearGlass").func_149711_c(1.5F)
				.func_149647_a(Transcraft.TranstabDecBlocks)
				.func_149715_a(0.0F).func_149713_g(0)
				.func_149658_d("Transcraft:ClearGlass");

		TranscraftBlocks.FancyCrystalGlass = new modmuss50.mods.transcraft.Blocks.FancyCrystalGlass.FancyCrystalGlass(
				"clear", false).func_149663_c("Transcraft:FancyCrystalGlass")
				.func_149711_c(1.5F)
				.func_149647_a(Transcraft.TranstabDecBlocks)
				.func_149715_a(0.0F).func_149713_g(0)
				.func_149658_d("Transcraft:FancyCrystalGlass");

		TranscraftBlocks.ThinClearGlass = new ThinCrystalGlass()
				.func_149663_c("Transcraft:ThinClearGlass").func_149711_c(1.5F)
				.func_149647_a(Transcraft.TranstabDecBlocks)
				.func_149715_a(0.0F).func_149713_g(0)
				.func_149658_d("Transcraft:ClearGlass");

		TranscraftBlocks.BunkerBlock = new modmuss50.mods.transcraft.Blocks.BunkerBlock()
				.func_149663_c("Transcraft:BunkerBlock").func_149711_c(10.0F)
				.func_149752_b(999999999999999999999.0F)
				.func_149647_a(Transcraft.Transtab).func_149715_a(0.0F)
				.func_149713_g(0).func_149658_d("Transcraft:BunkerBlock");

		TranscraftBlocks.BunkerStair = (new modmuss50.mods.transcraft.Blocks.BunkerStair(
				TranscraftBlocks.BunkerBlock, 0))
				.func_149663_c("Transcraft:BunkerStair")
				.func_149647_a(Transcraft.Transtab).func_149711_c(10.0F)
				.func_149752_b(999999999999.0F)
				.func_149658_d("Transcraft:BunkerStair");

		TranscraftBlocks.ObsidianLever = new modmuss50.mods.transcraft.Blocks.ObsidianLever()
				.func_149663_c("Transcraft:ObsidianLever").func_149711_c(50.0F)
				.func_149752_b(999999999999999999999.0F)
				.func_149647_a(Transcraft.Transtab)
				.func_149658_d("Transcraft:ObsidianLever");

		TranscraftBlocks.SmoothBunkerBlock = new modmuss50.mods.transcraft.Blocks.SmoothBunkerBlock()
				.func_149663_c("Transcraft:SmoothBunkerBlock")
				.func_149711_c(10.0F).func_149752_b(999999999999999999999.0F)
				.func_149647_a(Transcraft.Transtab).func_149715_a(0.0F)
				.func_149713_g(0).func_149658_d("Transcraft:SmoothBunkerBlock");

		TranscraftBlocks.SmoothBunkerStair = (new modmuss50.mods.transcraft.Blocks.SmoothBunkerStair(
				TranscraftBlocks.SmoothBunkerBlock, 0))
				.func_149663_c("Transcraft:SmoothBunkerStair")
				.func_149647_a(Transcraft.Transtab).func_149711_c(10.0F)
				.func_149752_b(999999999999999999999.0F)
				.func_149658_d("Transcraft:SmoothBunkerStair");

		TranscraftBlocks.DriedTransmutter = (new modmuss50.mods.transcraft.Blocks.DriedTransmutter()
				.func_149663_c("Transcraft:DriedTransmutter")
				.func_149647_a(Transcraft.Transtab).func_149711_c(3.0F)
				.func_149752_b(9.0F).func_149715_a(1.0F)
				.func_149658_d("Transcraft:DriedTransmutter"));

		TranscraftBlocks.ComIronOre = new modmuss50.mods.transcraft.Blocks.ComOres.ComIronOre()
				.func_149663_c("Transcraft:ComIronOre").func_149711_c(1.5F)
				.func_149647_a(Transcraft.Transtab)
				.func_149658_d("Transcraft:ComIronOre");

		TranscraftBlocks.ComGoldOre = new modmuss50.mods.transcraft.Blocks.ComOres.ComGoldOre()
				.func_149663_c("Transcraft:ComGoldOre").func_149711_c(1.5F)
				.func_149647_a(Transcraft.Transtab)
				.func_149658_d("Transcraft:ComGoldOre");

		TranscraftBlocks.ComTransmutterOre = new modmuss50.mods.transcraft.Blocks.ComOres.ComTransmutterOre()
				.func_149663_c("Transcraft:ComTransmutterOre")
				.func_149711_c(1.5F).func_149647_a(Transcraft.Transtab)
				.func_149658_d("Transcraft:ComTransmutterOre");

		TranscraftBlocks.ComOilOre = new modmuss50.mods.transcraft.Blocks.ComOres.ComOilOre()
				.func_149663_c("Transcraft:ComOilOre").func_149711_c(1.5F)
				.func_149647_a(Transcraft.Transtab)
				.func_149658_d("Transcraft:ComOilOre");

		TranscraftBlocks.Transcrafter = new modmuss50.mods.transcraft.TileEntitys.Transcrafter.Transcrafter()
				.func_149647_a(Transcraft.Transtab).func_149711_c(1.0F)
				.func_149663_c("Transcraft:Transcrafter");

		TranscraftBlocks.enderQuartzBlock = new EnderQuartz()
				.func_149663_c("Transcraft:enderquartz")
				.func_149658_d("Transcraft:enderquartz").func_149711_c(1.0F)
				.func_149647_a(Transcraft.TranstabDecBlocks);

		TranscraftBlocks.CutenderQuartz = new CutEnderQuartz()
				.func_149663_c("Transcraft:CutEnderQuartz")
				.func_149658_d("Transcraft:CutEnderQuartz").func_149711_c(1.0F)
				.func_149647_a(Transcraft.TranstabDecBlocks);

		TranscraftBlocks.EnderQuartzBrick = new EnderQuartzBrick()
				.func_149663_c("Transcraft:EnderQuartzBrick")
				.func_149658_d("Transcraft:EnderQuartzBrick")
				.func_149711_c(1.0F)
				.func_149647_a(Transcraft.TranstabDecBlocks);

		TranscraftBlocks.EnderQuartzBigBrick = new EnderQuartzBigBrick()
				.func_149663_c("Transcraft:EnderQuartzBigBricks")
				.func_149658_d("Transcraft:EnderQuartzBrick2")
				.func_149711_c(1.0F)
				.func_149647_a(Transcraft.TranstabDecBlocks);

		TranscraftBlocks.ixpGrinder = new ItemGrinder(0)
				.func_149663_c("Transcraft:ixpGrinder").func_149711_c(1.0F)
				.func_149658_d("Transcraft:ixpGrinder")
				.func_149647_a(Transcraft.Transtab);

	}
}
