package modmuss50.mods.transcraft.Items;

import javax.swing.Icon;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class EnderGem extends Item {

	public EnderGem(int id) {
		super();
		// Constructor Configuration
		maxStackSize = 16;
		// setCreativeTab(Transcraft.Transtab);
		setUnlocalizedName("EnderGem");
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:EnderGem");
	}

}
