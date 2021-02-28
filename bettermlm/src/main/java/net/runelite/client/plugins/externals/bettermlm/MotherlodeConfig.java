/*
 * Copyright (c) 2018, Seth <Sethtroll3@gmail.com>
 * Copyright (c) 2018, Lars <lars.oernlo@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.externals.bettermlm;

import net.runelite.client.config.*;

@ConfigGroup("bettermlm")
public interface MotherlodeConfig extends Config
{
	@ConfigSection(
		keyName = "sessionTitle",
		name = "Session",
		description = "",
		position = 0
	)
	String sessionTitle = "sessionTitle";

	@ConfigItem(
		keyName = "statTimeout",
		name = "Reset stats",
		description = "Configures the time until statistics are reset",
		section = "sessionTitle",
		position = 1
	)
	@Units(Units.MINUTES)
	default int statTimeout()
	{
		return 5;
	}

	@ConfigItem(
		keyName = "showMiningStats",
		name = "Show mining session stats",
		description = "Configures whether to display mining session stats",
		section = "sessionTitle",
		position = 2
	)
	default boolean showMiningStats()
	{
		return true;
	}

	@ConfigSection(
		keyName = "overlayTitle",
		name = "Overlay",
		description = "",
		position = 3
	)
	String overlayTitle = "overlayTitle";

	@ConfigItem(
		keyName = "showMiningState",
		name = "Show current mining state",
		description = "Shows current mining state. 'You are currently mining' / 'You are currently NOT mining'",
		section = "overlayTitle",
		position = 4
	)
	default boolean showMiningState()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showVeins",
		name = "Show pay-dirt mining spots",
		description = "Configures whether or not the pay-dirt mining spots are displayed.",
		section = "overlayTitle",
		position = 5
	)
	default boolean showVeins()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showRocks",
		name = "Show rocks obstacles",
		description = "Configures whether or not the fallen rocks obstacles are displayed.",
		section = "overlayTitle",
		position = 6
	)
	default boolean showRockFalls()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showSack",
		name = "Show pay-dirt sack",
		description = "Configures whether the pay-dirt sack is displayed or not.",
		section = "overlayTitle",
		position = 7
	)
	default boolean showSack()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showDepositsLeft",
		name = "Show deposits left",
		description = "Displays deposits left before sack is full",
		section = "overlayTitle",
		position = 8
	)
	default boolean showDepositsLeft()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showGemsFound",
		name = "Show gems found",
		description = "Shows gems found during current mining session",
		section = "overlayTitle",
		position = 9
	)
	default boolean showGemsFound()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showOresFound",
		name = "Show ores found",
		description = "Shows the ores found during current mining session",
		section = "overlayTitle",
		position = 10
	)
	default boolean showOresFound()
	{
		return true;
	}

	@ConfigItem(
		keyName = "showTargetVein",
		name = "Show vein currently being mined",
		description = "Highlights the vein currently being mined",
		section = "overlayTitle",
		position = 11
	)
	default boolean showTargetVein()
	{
		return false;
	}

	@ConfigTitle(
		keyName = "notificationTitle",
		name = "Notification",
		description = "",
		position = 12
	)
	String notificationTitle = "notificationTitle";

	@ConfigItem(
		keyName = "notifyOnIdle",
		name = "Idle notification",
		description = "Sends a notification when the player stops mining",
		section = "notificationTitle",
		position = 13
	)
	default boolean notifyOnIdle()
	{
		return false;
	}
}
