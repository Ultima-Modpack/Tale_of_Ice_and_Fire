package com.calebrudolph.Tale_of_Ice_and_Fire.entity.render;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.EntityFireGod;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.EntityIceGod;

import models.bossmodels.ModelFireGod;
import models.bossmodels.ModelIceGod;

public class RenderIceGod extends RenderLiving<EntityIceGod> {

    private ResourceLocation mobTexture = new ResourceLocation("ctoiafm:textures/entity/ig_texture.png");

    public static final Factory FACTORY = new Factory();

    public RenderIceGod(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelIceGod(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityIceGod entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityIceGod> {

        @Override
        public Render<? super EntityIceGod> createRenderFor(RenderManager manager) {
            return new RenderIceGod(manager);
        }

    }

}
