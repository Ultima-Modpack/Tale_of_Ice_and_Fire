package com.calebrudolph.Tale_of_Ice_and_Fire.entity;

import com.calebrudolph.Tale_of_Ice_and_Fire.Reference;
import com.calebrudolph.Tale_of_Ice_and_Fire.Tale_of_Ice_and_Fire;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.EntityFireGod;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.EntityIceGod;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.projectiles.EntityFireArrow;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.projectiles.EntityIceArrow;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.render.RenderFireGod;
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
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "IceGod"), EntityIceGod.class, "IceGod", id++, Tale_of_Ice_and_Fire.instance, 64, 3, true, 0x3E9696, 0x417F7F);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "FireGod"), EntityFireGod.class, "FireGod", id++, Tale_of_Ice_and_Fire.instance, 64, 3, true, 0xaa8822, 0x551100);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "Arrow"), EntityFireArrow.class, "FireArrow", id++, Tale_of_Ice_and_Fire.instance, 64, 10, true);
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID, "Arrow"), EntityIceArrow.class, "FireArrow", id++, Tale_of_Ice_and_Fire.instance, 64, 10, true);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityIceGod.class, RenderIceGod.FACTORY);
        RenderingRegistry.registerEntityRenderingHandler(EntityFireGod.class, RenderFireGod.FACTORY);
    }
}
