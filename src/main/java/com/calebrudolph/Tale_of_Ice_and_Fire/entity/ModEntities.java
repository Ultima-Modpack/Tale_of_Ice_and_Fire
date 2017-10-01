package com.calebrudolph.Tale_of_Ice_and_Fire.entity;

import com.calebrudolph.Tale_of_Ice_and_Fire.Reference;
import com.calebrudolph.Tale_of_Ice_and_Fire.Tale_of_Ice_and_Fire;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.EntityIceGod;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.EntityIceMagic;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.EntityMagic;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.render.RenderIceGod;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

    public static void init() {
        // Every entity in our mod has an ID (local to this mod)
        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "IceGod"), EntityIceGod.class, "IceGod", id++, Tale_of_Ice_and_Fire.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "Magic"), EntityIceMagic.class, "IceMagic", id++, Tale_of_Ice_and_Fire.instance, 64, 10, true);
        // We want our mob to spawn in Plains and ice plains biomes. If you don't add this then it will not spawn automatically
        // but you can of course still make it spawn manually
        EntityRegistry.addSpawn(EntityIceGod.class, 100, 3, 5, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.ICE_PLAINS);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityIceGod.class, RenderIceGod.FACTORY);
    }
}
