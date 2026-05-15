package net.pod.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.pod.tutorialmod.block.ModBlocks;
import net.pod.tutorialmod.item.ModItemGroups;
import net.pod.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}