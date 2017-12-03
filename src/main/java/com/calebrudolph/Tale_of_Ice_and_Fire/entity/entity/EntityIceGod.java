package com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity;

import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.projectiles.EntityFireArrow;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.projectiles.EntityIceArrow;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.monster.AbstractSkeleton;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntitySpectralArrow;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.PotionTypes;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import scala.reflect.internal.Types.RecoverableCyclicReference;

import javax.annotation.Nullable;

import com.calebrudolph.Tale_of_Ice_and_Fire.Reference;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.projectiles.EntityFireArrow;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.projectiles.EntityFireMagic;
import com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.projectiles.EntityIceMagic;

import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;

public class EntityIceGod extends AbstractGod{


	public EntityIceGod(World worldIn) {
		super(worldIn);
	}
	@Override 
    protected ResourceLocation getLootTable()
    {
        return null;
    }
	@Override
	protected SoundEvent getStepSound() {
		return null;
	}
	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor)
    {
        EntityIceArrow entityarrow = this.getArrow(distanceFactor);
        double d0 = target.posX - this.posX;
        double d1 = target.getEntityBoundingBox().minY + (double)(target.height / 3.0F) - entityarrow.posY;
        double d2 = target.posZ - this.posZ;
        double d3 = (double)MathHelper.sqrt(d0 * d0 + d2 * d2);
        entityarrow.setThrowableHeading(d0, d1 + d3 * 0.20000000298023224D, d2, 1.6F, (float)(14 - this.world.getDifficulty().getDifficultyId() * 4));
        this.playSound(SoundEvents.ENTITY_SKELETON_SHOOT, 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.world.spawnEntity(entityarrow);
    }
	@Override
    protected EntityIceArrow getArrow(float p_190726_1_)
    {
        EntityIceArrow entitytippedarrow = new EntityIceArrow(this.world, this);
        //entitytippedarrow.setEnchantmentEffectsFromEntity(this, p_190726_1_);
        return entitytippedarrow;
    }
   
}