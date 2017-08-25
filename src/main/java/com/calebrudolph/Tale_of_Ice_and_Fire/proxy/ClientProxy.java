package com.calebrudolph.Tale_of_Ice_and_Fire.proxy;

import com.calebrudolph.Tale_of_Ice_and_Fire.entity.ModEntities;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class ClientProxy  extends CommonProxy{

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		ModEntities.initModels();
	}

}