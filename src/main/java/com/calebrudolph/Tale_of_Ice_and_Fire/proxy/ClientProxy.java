package com.calebrudolph.Tale_of_Ice_and_Fire.proxy;

import com.calebrudolph.Tale_of_Ice_and_Fire.Reference;
import com.leviathanstudio.craftstudio.client.registry.CSRegistryHelper;
import com.leviathanstudio.craftstudio.client.util.EnumRenderType;
import com.leviathanstudio.craftstudio.client.util.EnumResourceType;

import init.ModBlocks;
import init.ModItems;

public class ClientProxy  extends CommonProxy{

	@Override
	public void init() {
		super.init();
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		}
		
	
		
		   
	@Override
	public void registerModels() {
		CSRegistryHelper registry = new CSRegistryHelper(Reference.MOD_ID);
		super.registerModels();
		registry.register(EnumResourceType.MODEL, EnumRenderType.ENTITY, "IceGod");
	}

	@Override
	public void registerAnims() {
		CSRegistryHelper registry = new CSRegistryHelper(Reference.MOD_ID);
		super.registerAnims();
		registry.register(EnumResourceType.ANIM, EnumRenderType.ENTITY, "IceGodAttacking");
		registry.register(EnumResourceType.ANIM, EnumRenderType.ENTITY, "IceGodWalking");
	}

}
