package mark123mark.mods.transcraft.Items;

import mark123mark.mods.transcraft.api.IItemTransmutter;
import net.minecraft.client.renderer.texture.IconRegister;

public class QuadTransmuter extends IItemTransmutter {

	public QuadTransmuter(int id) {
		super(id);
		// Constructor Configuration
		maxStackSize = 64;
		// setCreativeTab(Transcraft.Transtab);
		setUnlocalizedName("QuadTransmuter");
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:QuadTransmuter");
	}

}
