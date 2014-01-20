package modmuss50.mods.transcraft.Blocks;

import java.util.Random;

import modmuss50.mods.transcraft.Items.TranscraftItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OilOre extends Block {

	public OilOre(int par1) {
		super(par1, Material.rock);
	}

	@Override
	public int idDropped(int par1, Random random, int zero) {
		return TranscraftItems.Oil.itemID;
	}

}
