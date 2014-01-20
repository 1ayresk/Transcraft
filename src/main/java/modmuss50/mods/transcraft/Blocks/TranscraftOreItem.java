package modmuss50.mods.transcraft.Blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class TranscraftOreItem extends ItemBlock {

	
	public TranscraftOreItem(int id)
	{
		super(id);
		setHasSubtypes(true);
	}
	
	@Override
	public int getMetadata (int damageValue) {
		return damageValue;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return getUnlocalizedName() + "." + TranscraftOre.types[itemstack.getItemDamage()].replace(" ", "").toLowerCase();
	}

}
