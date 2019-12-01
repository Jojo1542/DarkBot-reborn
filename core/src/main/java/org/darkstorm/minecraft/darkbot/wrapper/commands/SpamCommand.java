package org.darkstorm.minecraft.darkbot.wrapper.commands;

import org.apache.commons.lang3.StringUtils;
import org.darkstorm.minecraft.darkbot.wrapper.cli.CLISpamBotWrapper;

public class SpamCommand extends AbstractCommand {

	public SpamCommand(CLISpamBotWrapper bot) {
		super(bot, "spam", "Start all bots spamming a message", "<message>", ".*");
	}

	@Override
	public void execute(String[] args) {
		CLISpamBotWrapper.setSpamMessage(StringUtils.join(args, " "));
	}
}