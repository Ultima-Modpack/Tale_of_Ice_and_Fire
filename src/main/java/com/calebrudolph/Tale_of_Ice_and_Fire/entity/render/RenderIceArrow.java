package com.calebrudolph.Tale_of_Ice_and_Fire.entity.render;

import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.EntityFireGod;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.projectiles.EntityIceArrow;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.render.RenderIceGod.Factory;

import models.bossmodels.ModelFireGod;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderIceArrow extends RenderArrow<EntityIceArrow>{

	private ResourceLocation mobTexture = new ResourceLocation("ctoiafm:textures/entity/fg_texture.png");
	
	public static final Factory FACTORY = new Factory();
	
    public RenderIceArrow(RenderManager rendermanagerIn) {
        super(rendermanagerIn);
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityIceArrow entity) {
		return mobTexture;
	}
	public static class Factory implements IRenderFactory<EntityIceArrow> {

        @Override
        public Render<? super EntityIceArrow> createRenderFor(RenderManager manager) {
            return new RenderIceArrow(manager);
        }

    }

}
