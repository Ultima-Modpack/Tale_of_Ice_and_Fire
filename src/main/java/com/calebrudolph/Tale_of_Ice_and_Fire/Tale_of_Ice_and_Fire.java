package com.calebrudolph.Tale_of_Ice_and_Fire;

import com.calebrudolph.Tale_of_Ice_and_Fire.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID,name=Reference.NAME, version=Reference.VERSION, acceptedMinecraftVersions=Reference.ACCEPTED_VERSIONS)


public class Tale_of_Ice_and_Fire {

	@Instance
	public static Tale_of_Ice_and_Fire Instance;
		
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		
	}
}
