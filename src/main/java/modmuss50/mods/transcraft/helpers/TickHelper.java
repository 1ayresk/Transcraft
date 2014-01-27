package modmuss50.mods.transcraft.helpers;

import modmuss50.mods.transcraft.Items.TranscraftItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;

public class TickHelper {

	public static void init() {

    }
	
	
	@SubscribeEvent
    public void TranscraftTickEvent(TickEvent.PlayerTickEvent event)
	{
		if (Config.EnderArmorBuffs == true) {
			if (event.player.getCurrentArmor(3) != null) {
				if (event.player.getCurrentArmor(3).getItem() == TranscraftItems.EnderHelmet) {
					event.player.addPotionEffect(new PotionEffect(16, 240, 0, true));
					event.player.addPotionEffect(new PotionEffect(13, 2, 3, true));

				}
			}

			if (event.player.getCurrentArmor(2) != null) {
				if (event.player.getCurrentArmor(2).getItem() == TranscraftItems.EnderChest) {

				} else {

				}
			}

			if (event.player.getCurrentArmor(1) != null) {
				if (event.player.getCurrentArmor(1).getItem() == TranscraftItems.EnderLegs) {
					if (event.player.isSprinting()) {
						event.player.addPotionEffect(new PotionEffect(1, 2, 8, true));
					}

				}

				if (event.player.getCurrentArmor(0) != null) {
					if (event.player.getCurrentArmor(0).getItem() == TranscraftItems.EnderBoots) {
						event.player.addPotionEffect(new PotionEffect(8, 2, 7, true));
						event.player.fallDistance = 0;
					}
				}
			}

		}
	}
	
	
}
