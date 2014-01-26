package modmuss50.mods.transcraft.Blocks;

import java.util.Random;

import modmuss50.mods.transcraft.Items.TranscraftItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class OilOre extends Block {

	public OilOre(int par1) {
		super(Material.field_151576_e);
	}

	
	@Override
	public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return TranscraftItems.Oil;
    }
	
	
	
}
