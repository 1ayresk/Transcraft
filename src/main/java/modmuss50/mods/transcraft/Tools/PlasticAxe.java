package modmuss50.mods.transcraft.Tools;

import modmuss50.mods.transcraft.Items.TranscraftItems;
import modmuss50.mods.transcraft.helpers.Config;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class PlasticAxe extends ItemAxe {

	public PlasticAxe(ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
	}



	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:PlasticAxe");
	}

}
