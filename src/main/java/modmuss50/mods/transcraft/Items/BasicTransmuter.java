package modmuss50.mods.transcraft.Items;

import net.minecraft.client.renderer.texture.IIconRegister;
import modmuss50.mods.transcraft.api.IItemTransmutter;

public class BasicTransmuter extends IItemTransmutter {

	public BasicTransmuter(int id) {
		super(id);
		// Constructor Configuration
		maxStackSize = 64;
		// setCreativeTab(Transcraft.Transtab);
		setUnlocalizedName("BasicTransmuter");
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:BasicTransmuter");
	}

}
