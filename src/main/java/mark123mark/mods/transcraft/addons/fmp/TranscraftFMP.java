package mark123mark.mods.transcraft.addons.fmp;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.Blocks.TranscraftOre;

public class TranscraftFMP implements IPartFactory {

	public static void registerBlocks() {
		for(int i = 0; i < TranscraftOre.types.length; i++) {
			BlockMicroMaterial.createAndRegister(Transcraft.TranscraftOre, i);
		}
		
		BlockMicroMaterial.createAndRegister(Transcraft.OilOre);
		BlockMicroMaterial.createAndRegister(Transcraft.BunkerBlock);

		BlockMicroMaterial.createAndRegister(Transcraft.SmoothBunkerBlock);
		BlockMicroMaterial.createAndRegister(Transcraft.DriedTransmutter);
		BlockMicroMaterial.createAndRegister(Transcraft.FancyCrystalGlass);

		BlockMicroMaterial.createAndRegister(Transcraft.BlueLight);
		BlockMicroMaterial.createAndRegister(Transcraft.GreenLight);
		BlockMicroMaterial.createAndRegister(Transcraft.OrangeLight);
		BlockMicroMaterial.createAndRegister(Transcraft.DarkLight);

		BlockMicroMaterial.createAndRegister(Transcraft.ComIronOre);
		BlockMicroMaterial.createAndRegister(Transcraft.ComGoldOre);
		BlockMicroMaterial.createAndRegister(Transcraft.ComTransmutterOre);
		BlockMicroMaterial.createAndRegister(Transcraft.ComOilOre);

		/*for(int i = 0; i < 16; i++) {
			BlockMicroMaterial.createAndRegister(Transcraft.ClearGlass, i);
		}
		
		for(int i = 0; i < 16; i++) {
			BlockMicroMaterial.createAndRegister(Transcraft.FancyCrystalGlass, i);
		}

		for(int i = 0; i < 16; i++) {
			BlockMicroMaterial.createAndRegister(Transcraft.enderQuartzBlock, i);
		}

		for (int i = 15; i >= 0; i--) {
			BlockMicroMaterial.createAndRegister(Transcraft.CutenderQuartz, i);
		}

		for(int i = 0; i < 16; i++) {
			BlockMicroMaterial.createAndRegister(Transcraft.EnderQuartzBrick, i);
		}

		for(int i = 0; i < 16; i++) {
			BlockMicroMaterial.createAndRegister(Transcraft.EnderQuartzBigBrick, i);
		}*/

	}

	@Override
	public TMultiPart createPart(String arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
