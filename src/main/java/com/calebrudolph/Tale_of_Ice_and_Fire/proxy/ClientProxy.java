package com.calebrudolph.Tale_of_Ice_and_Fire.proxy;

import init.ModBlocks;
import init.ModItems;

public class ClientProxy  implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
