package modmuss50.mods.transcraft.Blocks;

import java.util.Random;

import modmuss50.mods.transcraft.api.Fluids;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class DriedTransmutter extends Block {

	public DriedTransmutter() {
		super(Material.field_151576_e);
	}

	@Override
	public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Fluids.ItemBucketLiquidTrasnmutter.get();
    }
	

	@Override
	public boolean func_149700_E()
    {
        return true;
    }
}
