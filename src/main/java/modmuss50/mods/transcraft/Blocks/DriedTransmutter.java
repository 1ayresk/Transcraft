package modmuss50.mods.transcraft.Blocks;

import java.util.Random;

import modmuss50.mods.transcraft.helpers.Config;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DriedTransmutter extends Block {

	public DriedTransmutter(int par1) {
		super(par1, Material.rock);
	}

	@Override
	public int idDropped(int par1, Random random, int zero) {
		return Config.LiquidTransmutterFluidStillID;
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}
}
