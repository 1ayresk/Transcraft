package modmuss50.mods.transcraft.Items.Tools;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;

public class PlasticSword extends ItemSword {

	public PlasticSword(ToolMaterial par2EnumToolMaterial) {
		super(par2EnumToolMaterial);
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:PlasticSword");
	}
}
