package com.calebrudolph.Tale_of_Ice_and_Fire.entity.entity.projectiles;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityFireArrow extends EntityArrow
{
    private PotionType potion = PotionTypes.EMPTY;
    private final Set<PotionEffect> customPotionEffects = Sets.<PotionEffect>newHashSet();
    private boolean fixedColor;

    public EntityFireArrow(World worldIn)
    {
        super(worldIn);
        this.setDamage(2);
    }

    public EntityFireArrow(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }

    public EntityFireArrow(World worldIn, EntityLivingBase shooter)
    {
        super(worldIn, shooter);
    }



    public static int getCustomColor(ItemStack p_191508_0_)
    {
        NBTTagCompound nbttagcompound = p_191508_0_.getTagCompound();
        return nbttagcompound != null && nbttagcompound.hasKey("CustomPotionColor", 99) ? nbttagcompound.getInteger("CustomPotionColor") : -1;
    }

    /**
     * Called to update the entity's position/logic.
     */




    public static void registerFixesTippedArrow(DataFixer fixer)
    {
        EntityArrow.registerFixesArrow(fixer, "TippedArrow");
    }


    protected ItemStack getArrowStack()
    {
        if (this.customPotionEffects.isEmpty() && this.potion == PotionTypes.EMPTY)
        {
            return new ItemStack(Items.ARROW);
        }
        else
        {
            ItemStack itemstack = new ItemStack(Items.TIPPED_ARROW);
            PotionUtils.addPotionToItemStack(itemstack, this.potion);
            PotionUtils.appendEffects(itemstack, this.customPotionEffects);

            if (this.fixedColor)
            {
                NBTTagCompound nbttagcompound = itemstack.getTagCompound();

                if (nbttagcompound == null)
                {
                    nbttagcompound = new NBTTagCompound();
                    itemstack.setTagCompound(nbttagcompound);
                }
            }

            return itemstack;
        }
    }
    @Override
    protected void arrowHit(EntityLivingBase living)
    {
    	living.setFire(3);
    }
}
 