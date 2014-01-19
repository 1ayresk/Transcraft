// Date: 19/01/2014 19:45:07
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package mark123mark.mods.transcraft.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class EnderSwordModel_new extends ModelBase
{
  //fields
    public ModelRenderer Main;
    public ModelRenderer handle;
    public ModelRenderer base;
    public ModelRenderer eye;
  
  public EnderSwordModel_new()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Main = new ModelRenderer(this, 0, 0);
      Main.addBox(-0.5F, 0F, -1.5F, 1, 13, 3);
      Main.setRotationPoint(0F, 9F, 0F);
      Main.setTextureSize(64, 32);
      Main.mirror = true;
      setRotation(Main, -2.361978F, 0F, 0F);
      handle = new ModelRenderer(this, 22, 0);
      handle.addBox(-0.5F, -5F, -0.5F, 1, 6, 1);
      handle.setRotationPoint(0F, 9F, 0F);
      handle.setTextureSize(64, 32);
      handle.mirror = true;
      setRotation(handle, -2.361978F, 0F, 0F);
      base = new ModelRenderer(this, 9, 0);
      base.addBox(0F, 0F, -2.5F, 0, 15, 5);
      base.setRotationPoint(0F, 9F, 0F);
      base.setTextureSize(64, 32);
      base.mirror = true;
      setRotation(base, -2.361978F, 0F, 0F);
      eye = new ModelRenderer(this, 27, 0);
      eye.addBox(-1F, -2F, -2F, 2, 2, 2);
      eye.setRotationPoint(0F, 9F, 0F);
      eye.setTextureSize(64, 32);
      eye.mirror = true;
      setRotation(eye, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, Entity e)
  {
 //   super.render(entity, f, f1, f2, f3, f4, f5);
 //   setRotationAngles(f, f1, f2, f3, f4, f5);
    Main.render(f5);
    handle.render(f5);
    base.render(f5);
    eye.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5 ,e);
  }

}
