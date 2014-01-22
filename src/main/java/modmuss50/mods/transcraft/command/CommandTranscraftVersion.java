package modmuss50.mods.transcraft.command;

import modmuss50.mods.transcraft.helpers.TranscraftUtil;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatMessageComponent;

public class CommandTranscraftVersion extends Command {

	public CommandTranscraftVersion() {
		super("Tversion");
	}

	@Override
	public void processCommand(ICommandSender par1ICommandSender,
			String[] par2ArrayOfStr) {
		par1ICommandSender
				.sendChatToPlayer(ChatMessageComponent
						.createFromTranslationWithSubstitutions("----------Transcraft!----------"));
		par1ICommandSender.sendChatToPlayer(ChatMessageComponent
				.createFromTranslationWithSubstitutions("Transcraft Version "
						+ TranscraftUtil.VERSION + TranscraftUtil.STATE));
		par1ICommandSender.sendChatToPlayer(ChatMessageComponent
				.createFromTranslationWithSubstitutions("Made by "
						+ TranscraftUtil.authorList));
		par1ICommandSender
				.sendChatToPlayer(ChatMessageComponent
						.createFromTranslationWithSubstitutions("----------Transcraft!----------"));

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
