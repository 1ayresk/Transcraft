package modmuss50.mods.transcraft.Items;

import modmuss50.mods.transcraft.api.IItemTransmutter;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class NanoTransmuter extends IItemTransmutter {

	public NanoTransmuter(int id) {
		super(id);
		// Constructor Configuration
		maxStackSize = 64;
		// setCreativeTab(Transcraft.Transtab);
		setUnlocalizedName("NanoTransmuter");
	}

	@Override
	public EnumRarity getRarity(ItemStack is) { // The colour of the item name
												// (eg. with golden apples)
		return EnumRarity.rare;
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:NanoTransmuter");
	}

}
