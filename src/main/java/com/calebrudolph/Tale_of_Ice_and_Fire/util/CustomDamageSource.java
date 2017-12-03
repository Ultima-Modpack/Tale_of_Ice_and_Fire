package com.calebrudolph.Tale_of_Ice_and_Fire.util;

import javax.annotation.Nullable;

import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.projectiles.EntityFireArrow;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;

public class CustomDamageSource extends DamageSource{

	public CustomDamageSource(String damageTypeIn) {
		super(damageTypeIn);
	}
	
    public static DamageSource causeFireArrowDamage(EntityFireArrow arrow, @Nullable Entity indirectEntityIn)
    {
        return (new EntityDamageSourceIndirect("arrow", arrow, indirectEntityIn)).setProjectile();
    }
	

	
}
