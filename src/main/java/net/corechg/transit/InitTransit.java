package net.corechg.transit;

import net.fabricmc.api.ModInitializer;
import net.corechg.transit.type.group.simple.SimpleGroups;

public class InitTransit implements ModInitializer {
	
	@Override
	public void onInitialize() {
		SimpleGroups.init();
	}

}