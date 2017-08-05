package com.calebrudolph.Tale_of_Ice_and_Fire.bossmodels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;


public class ModelIceGod extends ModelBase{
	
	//Parts List
	ModelRenderer body;
	ModelRenderer leftLeg;
	ModelRenderer rightLeg;
	ModelRenderer leftArm;
	ModelRenderer rightArm;
	ModelRenderer head;
	ModelRenderer staff;
	ModelRenderer staffBase1;
	ModelRenderer staffBase2;
	ModelRenderer staffOrb;
	ModelRenderer staffTop1;
	ModelRenderer staffTop2;
	ModelRenderer staffCap;
	
	public ModelIceGod(){
		
	    textureWidth = 64;
	    textureHeight = 64;
	    
		//Body
		body = new ModelRenderer(this,0,0);
		body.mirror = false;
		body.addBox(-2.0F, 0.0F, -4.0F, 4, 12, 8);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureSize(128, 64);
		setRotation(body, 0F, 0F, 0F);
		//leftLeg
		leftLeg = new ModelRenderer(this, 48, 0);
		leftLeg.mirror = false;
		leftLeg.addBox(-2.0F, -12.0F, -2.0F, 4, 12, 4);
		leftLeg.setRotationPoint(0.0F, 0.0F, 2.0F);
		leftLeg.setTextureSize(128, 64);
		//rightLeg
		rightLeg = new ModelRenderer(this, 48, 16);
		rightLeg.mirror = false;
		rightLeg.addBox(-2.0F, -12.0F, -2.0F, 4, 12, 4);
		rightLeg.setRotationPoint(0.0F, 0.0F, -2.0F);
		rightLeg.setTextureSize(128, 64);
		body.addChild(rightLeg);
		//leftArm
		leftArm = new ModelRenderer(this, 24, 0);
		leftArm.mirror = false;
		leftArm.addBox(-2.0F, -11.0F, 0.0F, 4, 12, 4);
		leftArm.setRotationPoint(0.0F, 11.0F, 4.0F);
		leftArm.setTextureSize(128, 64);
		body.addChild(leftArm);
		//rightArm
		rightArm = new ModelRenderer(this, 24, 16);
		rightArm.mirror = false;
		rightArm.addBox(-2.0F, -11.0F, -4.0F, 4, 12, 4);
		rightArm.setRotationPoint(0.0F, 11.0F, -4.0F);
		rightArm.setTextureSize(128, 64);
		body.addChild(rightArm);
		//head
		head = new ModelRenderer(this, 64, 0);
		head.mirror = false;
		head.addBox(-4.0F, 0.0F, -4.0F, 8, 8, 8);
		head.setRotationPoint(0.0F, 12.0F, 0.0F);
		head.setTextureSize(128, 64);
		body.addChild(head);
		//staff
		staff = new ModelRenderer(this, 40, 0);
		staff.mirror = false;
		staff.addBox(-1.0F, -7.0F, -1.0F, 2, 27, 2);
		staff.setRotationPoint(0.0F, -7.0F, -2.0F);
		staff.setTextureSize(128, 64);
		rightArm.addChild(staff);
		//staffBase1
		staffBase1 = new ModelRenderer(this, 0, 23);
		staffBase1.mirror = false;
		staffBase1.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 4);
		staffBase1.setRotationPoint(0.0F, -8.0F, 0.0F);
		staffBase1.setTextureSize(128, 64);
		staff.addChild(staffBase1);
		//staffBase2
		staffBase2 = new ModelRenderer(this, 0, 20);
		staffBase2.mirror = false;
		staffBase2.addBox(-2.0F, 0.0F, -1.0F, 4, 1, 2);
		staffBase2.setRotationPoint(0.0F, -8.0F, 0.0F);
		staffBase2.setTextureSize(128, 64);
		staff.addChild(staffBase2);
		//staffOrb
		staffOrb = new ModelRenderer(this, 0, 28);
		staffOrb.mirror = false;
		staffOrb.addBox(-2.0F, 0.0F, -2.0F, 4, 1, 4);
		staffOrb.setRotationPoint(0.0F, -9.0F, 0.0F);
		staffOrb.setTextureSize(128, 64);
		staff.addChild(staffOrb);
		//staffTop1
		staffTop1 = new ModelRenderer(this, 0, 33);
		staffTop1.mirror = false;
		staffTop1.addBox(-1.0F, 0.0F, -2.0F, 2, 1, 4);
		staffTop1.setRotationPoint(0.0F, -10.0F, 0.0F);
		staffTop1.setTextureSize(128, 64);
		staff.addChild(staffTop1);
		//staffTop2
		staffTop2 = new ModelRenderer(this, 24, 32);
		staffTop2.mirror = false;
		staffTop2.addBox(-2.0F, 0.0F, -1.0F, 4, 1, 2);
		staffTop2.setRotationPoint(0.0F, -10.0F, 0.0F);
		staffTop2.setTextureSize(128, 64);
		staff.addChild(staffTop2);
		//staffCap
		staffCap = new ModelRenderer(this, 12, 20);
		staffCap.mirror = false;
		staffCap.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2);
		staffCap.setRotationPoint(0.0F, -11.0F, 0.0F);
		staffCap.setTextureSize(128, 64);
		staff.addChild(staffCap);

	}
	
	//Render Entity
	  public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	  {
		GlStateManager.pushMatrix();
		float speed = (float)Math.min(0.25f, ((new Vec3d(entity.motionX,0,entity.motionZ)).lengthVector() * 4.0f));
	    super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	    setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	    rightLeg.rotateAngleX = (float)Math.toRadians(speed*180f*(float) Math.sin(Math.toRadians(ageInTicks/2 % 360)*24F));
	    leftLeg.rotateAngleX = -(float)Math.toRadians(speed*180f*(float) Math.sin(Math.toRadians(ageInTicks/2 % 360)*24F));
	    leftArm.rotateAngleX = (float)Math.toRadians(speed*180f*(float) Math.sin(Math.toRadians(ageInTicks/2 % 360)*24F));
	    rightArm.rotateAngleX = -(float)Math.toRadians(speed*180f*(float) Math.sin(Math.toRadians(ageInTicks/2 % 360)*24F));
	    leftLeg.render(scale);
	    rightLeg.render(scale);
	    leftArm.render(scale);
	    rightArm.render(scale);
	    body.render(scale);
	    staff.render(scale);
	    staffBase1.render(scale);
	    staffBase2.render(scale);
	    staffOrb.render(scale);
	    staffTop1.render(scale);
	    staffTop2.render(scale);
	    staffCap.render(scale);
	    GlStateManager.popMatrix();
	  }
	
	//Set Rotation
	private void setRotation(ModelRenderer model, float x, float y, float z)
		{
	    	model.rotateAngleX = x;
	    	model.rotateAngleY = y;
	    	model.rotateAngleZ = z;
		}
	
	//Set Rotation Angles
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
		{
	    	super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
		}
}
