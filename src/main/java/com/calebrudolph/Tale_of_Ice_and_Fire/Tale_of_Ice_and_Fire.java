package com.calebrudolph.Tale_of_Ice_and_Fire;

import com.calebrudolph.Tale_of_Ice_and_Fire.proxy.CommonProxy;
import com.leviathanstudio.craftstudio.client.json.CSReadedModel;

import init.ModBlocks;
import init.ModItems;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.common.registry;

@Mod(modid=Reference.MOD_ID,name=Reference.NAME, version=Reference.VERSION, acceptedMinecraftVersions=Reference.ACCEPTED_VERSIONS)


public class Tale_of_Ice_and_Fire {

	@Instance
	public static Tale_of_Ice_and_Fire Instance;
	

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ModItems.init();
		ModItems.register();
		ModBlocks.init();
		ModBlocks.register();
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		
	}
	
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(RegistryEvent.Register<CSReadedModel> e) {
    	Tale_of_Ice_and_Fire.proxy.registerModels();
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerAnims(RegistryEvent.Register<CSReadedAnim> e) {
    	Tale_of_Ice_and_Fire.proxy.registerAnims();
    }
}
