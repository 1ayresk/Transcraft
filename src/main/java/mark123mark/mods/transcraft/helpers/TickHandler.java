package mark123mark.mods.transcraft.helpers;

import java.util.EnumSet;

import mark123mark.mods.transcraft.Transcraft;
import mark123mark.mods.transcraft.Items.TranscraftItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandler implements ITickHandler {
	ItemStack currentItemStack = null;

	public static boolean adminfly = false;

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {

		
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		EntityPlayer player = (EntityPlayer) tickData[0];

		
		if(player.getCurrentEquippedItem() != null)
		{
			if (player.getCurrentEquippedItem().itemID == TranscraftItems.EnderSword.itemID) {
				player.addPotionEffect(new PotionEffect(4, 2, 3, true));
			}
		}
		
		if(Config.EnderArmorBuffs == true)
		{
			if (player.getCurrentArmor(3) != null) {
				if (player.getCurrentArmor(3).itemID == TranscraftItems.EnderHelmet.itemID) {
					player.addPotionEffect(new PotionEffect(16, 240, 0, true));
					player.addPotionEffect(new PotionEffect(13, 2, 3, true));

				}
			}

			if (player.getCurrentArmor(2) != null) {
				if (player.getCurrentArmor(2).itemID == TranscraftItems.EnderChest.itemID) {

				} else {

				}
			}

			if (player.getCurrentArmor(1) != null) {
				if (player.getCurrentArmor(1).itemID == TranscraftItems.EnderLegs.itemID) {
					if (player.isSprinting()) {
						player.addPotionEffect(new PotionEffect(1, 2, 8, true));
					}

				}

				if (player.getCurrentArmor(0) != null) {
					if (player.getCurrentArmor(0).itemID == TranscraftItems.EnderBoots.itemID) {
						player.addPotionEffect(new PotionEffect(8, 2, 7, true));
						player.fallDistance = 0;
					}
				}
		}
	
	}
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.PLAYER);
	}

	@Override
	public String getLabel() {
		return "Transcraft_Tick_Handler";
	}

}
