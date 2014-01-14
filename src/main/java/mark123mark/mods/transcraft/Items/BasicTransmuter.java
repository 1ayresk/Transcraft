package mark123mark.mods.transcraft.Items;

import mark123mark.mods.transcraft.api.IItemTransmutter;
import net.minecraft.client.renderer.texture.IconRegister;

public class BasicTransmuter extends IItemTransmutter {

	public BasicTransmuter(int id) {
		super(id);
		// Constructor Configuration
		maxStackSize = 64;
		// setCreativeTab(Transcraft.Transtab);
		setUnlocalizedName("BasicTransmuter");
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:BasicTransmuter");
	}
	
}
