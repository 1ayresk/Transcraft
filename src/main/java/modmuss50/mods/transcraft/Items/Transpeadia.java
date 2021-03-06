package modmuss50.mods.transcraft.Items;

import modmuss50.mods.transcraft.Transcraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class Transpeadia extends Item {

	public void updateIcons(IconRegister iconRegister) {
		Icon iconIndex = iconRegister.registerIcon("Transcraft:Transpeadia");
	}

	public Transpeadia(int id) {
		super(id);
		maxStackSize = 1;
		setCreativeTab(Transcraft.Transtab);
		setUnlocalizedName("Transpeadia");
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:Transpeadia");
	}

	public ItemStack onItemRightClick(ItemStack i, World w, EntityPlayer p) {
		p.openGui(Transcraft.instance, 3, w, (int) p.posX, (int) p.posY,(int) p.posZ);
		p.playSound("transcraft:paper", 10F, 0.7F);
		return i;
	}

}
