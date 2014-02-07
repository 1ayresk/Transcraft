// Date: 20/01/2014 13:21:41
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package modmuss50.mods.transcraft.Client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class EnderPickaxeModel extends ModelBase {
	// fields
	ModelRenderer Base;
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;

	public EnderPickaxeModel() {
		textureWidth = 64;
		textureHeight = 32;

		Base = new ModelRenderer(this, 56, 9);
		Base.addBox(0F, 0F, 0F, 2, 21, 2);
		Base.setRotationPoint(0F, -8F, 0F);
		Base.setTextureSize(64, 32);
		Base.mirror = true;
		setRotation(Base, 0F, 0F, 0F);
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 2, 8, 2);
		Shape1.setRotationPoint(0F, 13F, 0F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 8, 0);
		Shape2.addBox(0.5F, 0F, 0.5F, 3, 1, 3);
		Shape2.setRotationPoint(-1F, 13F, -1F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 8, 0);
		Shape3.addBox(0.5F, 0F, 0.5F, 3, 1, 3);
		Shape3.setRotationPoint(-1F, 20F, -1F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 22);
		Shape4.addBox(0F, 0F, 0F, 4, 6, 4);
		Shape4.setRotationPoint(-1F, -7F, -1F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 16, 19);
		Shape5.addBox(0F, 0F, -0.5F, 8, 2, 3);
		Shape5.setRotationPoint(-8F, -5F, 0F);
		Shape5.setTextureSize(64, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, -0.1047198F);
		Shape6 = new ModelRenderer(this, 16, 24);
		Shape6.addBox(0F, 0.2F, 0F, 7, 1, 2);
		Shape6.setRotationPoint(9F, -5F, 0F);
		Shape6.setTextureSize(64, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0.1919862F);
		Shape7 = new ModelRenderer(this, 16, 27);
		Shape7.addBox(0F, -0.9F, -0.5F, 8, 2, 3);
		Shape7.setRotationPoint(2F, -5F, 0F);
		Shape7.setTextureSize(64, 32);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0.1047198F);
		Shape8 = new ModelRenderer(this, 16, 24);
		Shape8.addBox(0F, -0.2F, 0F, 7, 1, 2);
		Shape8.setRotationPoint(-14F, -3F, 0F);
		Shape8.setTextureSize(64, 32);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, -0.1919862F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5, Entity e) {
		// super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, e);
		Base.render(f5);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}

}
