package com.calebrudolph.Tale_of_Ice_and_Fire.bossmodels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

/**
 * ModelIceGod
 * Created using Tabula 6.0.0
 */
public class ModelFireGod extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LeftArm;
    public ModelRenderer LeftLeg;
    public ModelRenderer Head;
    public ModelRenderer RightLeg;
    public ModelRenderer RightArm;
    public ModelRenderer CrownBase;
    public ModelRenderer CrownForntCenter;
    public ModelRenderer CrownBackCenter;
    public ModelRenderer CrownLeft;
    public ModelRenderer CrownRight;
    public ModelRenderer CrownRightFront1;
    public ModelRenderer CrownRightFront1_1;
    public ModelRenderer CrownBackLeft1;
    public ModelRenderer CrownBackRight1;
    public ModelRenderer CrownFrontLeft2;
    public ModelRenderer CrownBackLeft2;
    public ModelRenderer CrownRightFront2;
    public ModelRenderer CrownRightBack2;
    public ModelRenderer Staff;
    public ModelRenderer Base1;
    public ModelRenderer Base2;
    public ModelRenderer Orb;
    public ModelRenderer OrbTop;

    public ModelFireGod() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.LeftLeg = new ModelRenderer(this, 38, 0);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.LeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.CrownLeft = new ModelRenderer(this, 0, 0);
        this.CrownLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownLeft.addBox(4.0F, -9.0F, -1.0F, 1, 2, 2, 0.0F);
        this.OrbTop = new ModelRenderer(this, 20, 0);
        this.OrbTop.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.OrbTop.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 1, 0.0F);
        this.RightArm = new ModelRenderer(this, 48, 16);
        this.RightArm.setRotationPoint(-5.0F, 2.5F, 0.0F);
        this.RightArm.addBox(-2.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.setRotation(RightArm, -1.4660765716752369F, 0.0F, 0.0F);
        this.CrownBackRight1 = new ModelRenderer(this, 0, 0);
        this.CrownBackRight1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownBackRight1.addBox(-5.0F, -9.0F, 4.0F, 2, 2, 1, 0.0F);
        this.CrownRightBack2 = new ModelRenderer(this, 0, 0);
        this.CrownRightBack2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownRightBack2.addBox(-5.0F, -9.0F, 3.0F, 1, 2, 2, 0.0F);
        this.CrownForntCenter = new ModelRenderer(this, 0, 0);
        this.CrownForntCenter.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownForntCenter.addBox(-1.0F, -9.0F, -5.0F, 2, 2, 1, 0.0F);
        this.CrownBackLeft2 = new ModelRenderer(this, 0, 0);
        this.CrownBackLeft2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownBackLeft2.addBox(4.0F, -9.0F, 3.0F, 1, 2, 2, 0.0F);
        this.LeftArm = new ModelRenderer(this, 24, 0);
        this.LeftArm.mirror = true;
        this.LeftArm.setRotationPoint(5.0F, 2.5F, 0.0F);
        this.LeftArm.addBox(-1.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.Staff = new ModelRenderer(this, 0, 32);
        this.Staff.setRotationPoint(-0.5F, 8.4F, 0.0F);
        this.Staff.addBox(-1.0F, -1.0F, -4.5F, 2, 2, 25, 0.0F);
        this.CrownRightFront2 = new ModelRenderer(this, 0, 0);
        this.CrownRightFront2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownRightFront2.addBox(-5.0F, -9.0F, -5.0F, 1, 2, 2, 0.0F);
        this.CrownBackLeft1 = new ModelRenderer(this, 0, 0);
        this.CrownBackLeft1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownBackLeft1.addBox(3.0F, -9.0F, 4.0F, 2, 2, 1, 0.0F);
        this.CrownFrontLeft2 = new ModelRenderer(this, 0, 0);
        this.CrownFrontLeft2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownFrontLeft2.addBox(4.0F, -9.0F, -5.0F, 1, 2, 2, 0.0F);
        this.CrownRightFront1_1 = new ModelRenderer(this, 0, 0);
        this.CrownRightFront1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownRightFront1_1.addBox(3.0F, -9.0F, -5.0F, 2, 2, 1, 0.0F);
        this.Base1 = new ModelRenderer(this, 54, 0);
        this.Base1.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Base1.addBox(-1.0F, -2.0F, 0.0F, 2, 4, 1, 0.0F);
        this.CrownRightFront1 = new ModelRenderer(this, 0, 0);
        this.CrownRightFront1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownRightFront1.addBox(-5.0F, -9.0F, -5.0F, 2, 2, 1, 0.0F);
        this.CrownRight = new ModelRenderer(this, 0, 0);
        this.CrownRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownRight.addBox(-5.0F, -9.0F, -1.0F, 1, 2, 2, 0.0F);
        this.Head = new ModelRenderer(this, 0, 16);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.CrownBase = new ModelRenderer(this, 0, 0);
        this.CrownBase.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownBase.addBox(-5.0F, -7.5F, -5.0F, 10, 2, 10, 0.0F);
        this.CrownBackCenter = new ModelRenderer(this, 0, 0);
        this.CrownBackCenter.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CrownBackCenter.addBox(-1.0F, -9.0F, 4.0F, 2, 2, 1, 0.0F);
        this.Base2 = new ModelRenderer(this, 24, 16);
        this.Base2.setRotationPoint(0.0F, 0.0F, -5.5F);
        this.Base2.addBox(-2.0F, -1.0F, 0.0F, 4, 2, 1, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.RightLeg = new ModelRenderer(this, 32, 16);
        this.RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.RightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Orb = new ModelRenderer(this, 0, 32);
        this.Orb.setRotationPoint(0.0F, 0.0F, -6.5F);
        this.Orb.addBox(-2.0F, -2.0F, -1.0F, 4, 4, 2, 0.0F);
        this.Body.addChild(this.LeftLeg);
        this.CrownBase.addChild(this.CrownLeft);
        this.Orb.addChild(this.OrbTop);
        this.Body.addChild(this.RightArm);
        this.CrownBase.addChild(this.CrownBackRight1);
        this.CrownBase.addChild(this.CrownRightBack2);
        this.CrownBase.addChild(this.CrownForntCenter);
        this.CrownBase.addChild(this.CrownBackLeft2);
        this.Body.addChild(this.LeftArm);
        this.RightArm.addChild(this.Staff);
        this.CrownBase.addChild(this.CrownRightFront2);
        this.CrownBase.addChild(this.CrownBackLeft1);
        this.CrownBase.addChild(this.CrownFrontLeft2);
        this.CrownBase.addChild(this.CrownRightFront1_1);
        this.Staff.addChild(this.Base1);
        this.CrownBase.addChild(this.CrownRightFront1);
        this.CrownBase.addChild(this.CrownRight);
        this.Body.addChild(this.Head);
        this.Head.addChild(this.CrownBase);
        this.CrownBase.addChild(this.CrownBackCenter);
        this.Staff.addChild(this.Base2);
        this.Body.addChild(this.RightLeg);
        this.Staff.addChild(this.Orb);
    }




    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) { 
    	GlStateManager.pushMatrix();
    	float speed = (float)Math.min(0.25f, ((new Vec3d(entity.motionX,0,entity.motionZ)).lengthVector() * 4.0f));
        super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        RightLeg.rotateAngleX = (float)Math.toRadians(speed*180f*(float) Math.sin(Math.toRadians(ageInTicks/2 % 360)*24F));
        LeftLeg.rotateAngleX = -(float)Math.toRadians(speed*180f*(float) Math.sin(Math.toRadians(ageInTicks/2 % 360)*24F));
        LeftArm.rotateAngleX = (float)Math.toRadians(speed*180f*(float) Math.sin(Math.toRadians(ageInTicks/2 % 360)*24F));
        RightArm.rotateAngleX = -(float)Math.toRadians(speed*180f*(float) Math.sin(Math.toRadians(ageInTicks/2 % 360)*20F) + 84F);
        LeftLeg.render(scale);
        RightLeg.render(scale);
        LeftArm.render(scale);
        RightArm.render(scale);
        Body.render(scale);
        Head.render(scale);
        GlStateManager.popMatrix();
    }


    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
      super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    }

    public void setRotation(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
