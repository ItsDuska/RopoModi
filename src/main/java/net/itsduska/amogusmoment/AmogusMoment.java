package net.itsduska.amogusmoment;

import net.fabricmc.api.ModInitializer;
import net.itsduska.amogusmoment.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmogusMoment implements ModInitializer {
	public static final String MOD_ID = "amogusmoment";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
	}
}
