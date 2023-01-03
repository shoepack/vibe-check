package com.vibecheck;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface VibecheckConfig extends Config
{
	@ConfigItem(
		keyName = "greeting",
		name = "Current Vibe",
		description = "The vibe displayed to the user when they log in"
	)
	default String greeting()
	{
		return "\"mid\"";
	}
}
