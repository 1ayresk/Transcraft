package modmuss50.mods.transcraft.helpers;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class EventMobDeath {

	public static double rand;
	public Random random = new Random();

	@ForgeSubscribe
	public void onEntityDrop(LivingDropsEvent event) {

		if (event.source.getDamageType().equals("player")) {
			ItemHelper.droptransmutter(
					(EntityPlayer) event.source.getSourceOfDamage(),
					event.entityLiving);
		}
	}

}
