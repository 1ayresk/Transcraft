package mark123mark.mods.transcraft.Listener;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class ListenerRegisterSound
{
	@ForgeSubscribe
	public void soundLoad(SoundLoadEvent e)
	{
		e.manager.soundPoolSounds.addSound("transcraft:swordHit.ogg");
		e.manager.soundPoolSounds.addSound("transcraft:bassDrop.ogg");
		e.manager.soundPoolSounds.addSound("transcraft:paper.ogg");
		e.manager.soundPoolSounds.addSound("transcraft:itemGrinderOpen.ogg");
	}
}
