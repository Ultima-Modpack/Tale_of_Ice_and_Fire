package default;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelPlayer - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelPlayer extends ModelBase {
    public ModelRenderer Staff;
    public ModelRenderer base1;
    public ModelRenderer orb;
    public ModelRenderer base2;
    public ModelRenderer cap;
    public ModelRenderer Chest;
    public ModelRenderer leftleg;
    public ModelRenderer leftarm;
    public ModelRenderer rightarm;
    public ModelRenderer Head;
    public ModelRenderer rightleg;

    public ModelPlayer() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.leftleg = new ModelRenderer(this, 8, 5);
        this.leftleg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.cap = new ModelRenderer(this, 16, 0);
        this.cap.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.cap.addBox(-1.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F);
        this.Chest = new ModelRenderer(this, 32, 3);
        this.Chest.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Chest.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F);
        this.orb = new ModelRenderer(this, 20, 0);
        this.orb.setRotationPoint(0.0F, -7.6F, 0.0F);
        this.orb.addBox(-2.0F, -2.0F, -2.0F, 4, 3, 4, 0.0F);
        this.leftarm = new ModelRenderer(this, 20, 17);
        this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(leftarm, -1.0927506446736497F, 0.0F, 0.0F);
        this.base1 = new ModelRenderer(this, 8, 0);
        this.base1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base1.addBox(-1.0F, -6.6F, -2.0F, 2, 1, 4, 0.0F);
        this.rightarm = new ModelRenderer(this, 36, 19);
        this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Head = new ModelRenderer(this, 0, 33);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.Staff = new ModelRenderer(this, 0, 0);
        this.Staff.setRotationPoint(5.9F, 5.6F, -7.4F);
        this.Staff.addBox(-1.0F, -5.6F, -1.0F, 2, 24, 2, 0.0F);
        this.base2 = new ModelRenderer(this, 32, 0);
        this.base2.setRotationPoint(0.0F, -6.6F, 0.0F);
        this.base2.addBox(-2.0F, 0.0F, -1.0F, 4, 1, 2, 0.0F);
        this.rightleg = new ModelRenderer(this, 32, 35);
        this.rightleg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Chest.addChild(this.leftleg);
        this.orb.addChild(this.cap);
        this.Staff.addChild(this.orb);
        this.Chest.addChild(this.leftarm);
        this.Staff.addChild(this.base1);
        this.Chest.addChild(this.rightarm);
        this.Chest.addChild(this.Head);
        this.base1.addChild(this.base2);
        this.Chest.addChild(this.rightleg);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Chest.render(f5);
        this.Staff.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
