package modmuss50.mods.transcraft.command;

import modmuss50.mods.transcraft.helpers.TranscraftUtil;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentTranslation;

public class CommandTranscraftVersion extends Command {

	public CommandTranscraftVersion() {
		super("Tversion");
	}

	@Override
	public void processCommand(ICommandSender par1ICommandSender,
			String[] par2ArrayOfStr) {
		par1ICommandSender.func_145747_a(new ChatComponentTranslation("----------Transcraft!----------"));
		par1ICommandSender.func_145747_a(new ChatComponentTranslation("Transcraft Version "+ TranscraftUtil.VERSION + TranscraftUtil.STATE));
		par1ICommandSender.func_145747_a(new ChatComponentTranslation("Made by "+ TranscraftUtil.authorList));
		par1ICommandSender.func_145747_a(new ChatComponentTranslation("----------Transcraft!----------"));

	}

	@Override
	public String getCommandUsage(ICommandSender var1) {
		return "/Tversion Gets the version of transcraft";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
