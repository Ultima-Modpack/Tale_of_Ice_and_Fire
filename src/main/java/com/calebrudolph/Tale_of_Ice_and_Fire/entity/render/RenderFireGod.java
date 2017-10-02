package com.calebrudolph.Tale_of_Ice_and_Fire.entity.render;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

import com.calebrudolph.Tale_of_Ice_and_Fire.bossmodels.ModelFireGod;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.EntityFireGod;

public class RenderFireGod extends RenderLiving<EntityFireGod> {

    private ResourceLocation mobTexture = new ResourceLocation("ctoiafm:textures/entity/128x128.png");

    public static final Factory FACTORY = new Factory();

    public RenderFireGod(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelFireGod(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityFireGod entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityFireGod> {

        @Override
        public Render<? super EntityFireGod> createRenderFor(RenderManager manager) {
            return new RenderFireGod(manager);
        }

    }

}
