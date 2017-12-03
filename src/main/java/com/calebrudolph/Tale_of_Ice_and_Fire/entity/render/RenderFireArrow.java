package com.calebrudolph.Tale_of_Ice_and_Fire.entity.render;

import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.EntityFireGod;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.projectiles.EntityFireArrow;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.projectiles.EntityIceArrow;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.render.RenderIceGod.Factory;

import models.bossmodels.ModelFireGod;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderFireArrow extends RenderArrow<EntityFireArrow>{

	private ResourceLocation mobTexture = new ResourceLocation("ctoiafm:textures/entity/fg_texture.png");
	
	public static final Factory FACTORY = new Factory();
	
    public RenderFireArrow(RenderManager rendermanagerIn) {
        super(rendermanagerIn);
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityFireArrow entity) {
		return mobTexture;
	}
	public static class Factory implements IRenderFactory<EntityFireArrow> {

        @Override
        public Render<? super EntityFireArrow> createRenderFor(RenderManager manager) {
            return new RenderFireArrow(manager);
        }

    }

}