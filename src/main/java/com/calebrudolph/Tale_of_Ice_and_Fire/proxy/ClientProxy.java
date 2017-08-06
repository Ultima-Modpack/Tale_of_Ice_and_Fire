package com.calebrudolph.Tale_of_Ice_and_Fire.proxy;

import com.calebrudolph.Tale_of_Ice_and_Fire.entity.ModEntities;


public class ClientProxy  extends CommonProxy{


	public void preInit() {
		ModEntities.initModels();
	}

}