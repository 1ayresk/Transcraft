package modmuss50.mods.transcraft.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorEnderBoots extends ItemArmor // implements
// IArmorTextureProvider
{

	private String LocationFile;
	private String textureFile;
	public String IconName;
	private int repairItemID = 0;

	public ArmorEnderBoots(int id, ArmorMaterial enumarmormaterial,
			int renderIndex, int armorType) {
		super(enumarmormaterial, renderIndex, armorType);

	}

}
