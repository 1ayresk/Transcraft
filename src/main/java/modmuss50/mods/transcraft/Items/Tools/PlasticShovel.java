package modmuss50.mods.transcraft.Items.Tools;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSpade;

public class PlasticShovel extends ItemSpade {

	public PlasticShovel(ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:PlasticShovel");
	}
}
