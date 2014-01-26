package modmuss50.mods.transcraft.addons.fmp;

import modmuss50.mods.transcraft.Blocks.TranscraftBlocks;
import modmuss50.mods.transcraft.Blocks.TranscraftOre;

public class TranscraftFMP implements IPartFactory {

	public static void registerBlocks() {
		for (int i = 0; i < TranscraftOre.types.length; i++) {
			BlockMicroMaterial.createAndRegister(
					TranscraftBlocks.TranscraftOre, i);
		}

		BlockMicroMaterial.createAndRegister(TranscraftBlocks.OilOre);
		BlockMicroMaterial.createAndRegister(TranscraftBlocks.BunkerBlock);

		BlockMicroMaterial
				.createAndRegister(TranscraftBlocks.SmoothBunkerBlock);
		BlockMicroMaterial.createAndRegister(TranscraftBlocks.DriedTransmutter);
		BlockMicroMaterial
				.createAndRegister(TranscraftBlocks.FancyCrystalGlass);

		BlockMicroMaterial.createAndRegister(TranscraftBlocks.BlueLight);
		BlockMicroMaterial.createAndRegister(TranscraftBlocks.GreenLight);
		BlockMicroMaterial.createAndRegister(TranscraftBlocks.OrangeLight);
		BlockMicroMaterial.createAndRegister(TranscraftBlocks.DarkLight);

		BlockMicroMaterial.createAndRegister(TranscraftBlocks.ComIronOre);
		BlockMicroMaterial.createAndRegister(TranscraftBlocks.ComGoldOre);
		BlockMicroMaterial
				.createAndRegister(TranscraftBlocks.ComTransmutterOre);
		BlockMicroMaterial.createAndRegister(TranscraftBlocks.ComOilOre);

		/*
		 * for(int i = 0; i < 16; i++) {
		 * BlockMicroMaterial.createAndRegister(Transcraft.ClearGlass, i); }
		 * 
		 * for(int i = 0; i < 16; i++) {
		 * BlockMicroMaterial.createAndRegister(Transcraft.FancyCrystalGlass,
		 * i); }
		 * 
		 * for(int i = 0; i < 16; i++) {
		 * BlockMicroMaterial.createAndRegister(Transcraft.enderQuartzBlock, i);
		 * }
		 * 
		 * for (int i = 15; i >= 0; i--) {
		 * BlockMicroMaterial.createAndRegister(Transcraft.CutenderQuartz, i); }
		 * 
		 * for(int i = 0; i < 16; i++) {
		 * BlockMicroMaterial.createAndRegister(Transcraft.EnderQuartzBrick, i);
		 * }
		 * 
		 * for(int i = 0; i < 16; i++) {
		 * BlockMicroMaterial.createAndRegister(Transcraft.EnderQuartzBigBrick,
		 * i); }
		 */

	}

	@Override
	public TMultiPart createPart(String arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
