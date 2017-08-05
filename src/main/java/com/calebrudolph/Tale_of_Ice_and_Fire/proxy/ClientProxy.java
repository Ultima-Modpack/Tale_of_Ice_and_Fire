package com.calebrudolph.Tale_of_Ice_and_Fire.proxy;

import com.calebrudolph.Tale_of_Ice_and_Fire.manager.ModelManager;

public class ClientProxy  extends CommonProxy{


	public void preInit() {
		ModelManager.init();
	}

}