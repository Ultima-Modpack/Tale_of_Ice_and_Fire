package com.calebrudolph.Tale_of_Ice_and_Fire.proxy;

import com.calebrudolph.Tale_of_Ice_and_Fire.Reference;
import com.leviathanstudio.craftstudio.client.registry.CSRegistryHelper;

import init.ModBlocks;
import init.ModItems;

public class ClientProxy  implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		}
		
	
		CSRegistryHelper registry = new CSRegistryHelper(Reference.MOD_ID);
		   
	@Override
	public void registerModels() {
		super.registerModels();
		registry.register(ResourceType.MODEL, RenderType.ENTITY, "your_model");
	}

	@Override
	public void registerAnims() {
		super.registerAnims();
		registry.register(ResourceType.ANIM, RenderType.ENTITY, "your_animation");
	}

}
