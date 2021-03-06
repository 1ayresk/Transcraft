package modmuss50.mods.transcraft.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class TransmutterBiome extends BiomeGenBase {
	private TranscraftBiomeDec customBiomeDecorator;

	public TransmutterBiome(int par1) {
		super(par1);
		theBiomeDecorator = new TranscraftBiomeDec(this);
		customBiomeDecorator = (TranscraftBiomeDec) theBiomeDecorator;
		customBiomeDecorator.TransmutterPerChunk = 15;
		this.theBiomeDecorator.treesPerChunk = -999;
		this.theBiomeDecorator.flowersPerChunk = 12;
		this.theBiomeDecorator.grassPerChunk = 10;
		topBlock = (byte) Block.stone.blockID;
		fillerBlock = (byte) Block.stone.blockID;
	}

	// @SideOnly(Side.CLIENT)
	// @Override
	// public int getBiomeGrassColor()
	// {
	// return 0x07D7FF;
	// }

	// @Override
	// @SideOnly(Side.CLIENT)
	// public int getBiomeFoliageColor()
	// {
	// return 0x07D7FF;
	// }

	// @Override
	// @SideOnly(Side.CLIENT)
	// public int getSkyColorByTemp(float par1)
	// {
	// return 0x07D7FF;
	// }

}
