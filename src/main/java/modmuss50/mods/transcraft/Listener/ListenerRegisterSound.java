package modmuss50.mods.transcraft.Listener;

import net.minecraftforge.client.event.sound.SoundLoadEvent;

import com.google.common.eventbus.Subscribe;

public class ListenerRegisterSound {
	
	@Subscribe
	public void soundLoad(SoundLoadEvent e) {
		e.manager.soundPoolSounds.addSound("transcraft:swordHit.ogg");
		e.manager.soundPoolSounds.addSound("transcraft:bassDrop.ogg");
		e.manager.soundPoolSounds.addSound("transcraft:paper.ogg");
		e.manager.soundPoolSounds.addSound("transcraft:itemGrinderOpen.ogg");
	}
}
