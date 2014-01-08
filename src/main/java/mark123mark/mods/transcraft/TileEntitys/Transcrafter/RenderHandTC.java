package mark123mark.mods.transcraft.TileEntitys.Transcrafter;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

import org.lwjgl.opengl.GL11;

public class RenderHandTC implements IItemRenderer 
{

	private TranscrafterModel model;


	public RenderHandTC()
	{
		model = new TranscrafterModel();

	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) 
	{
		switch(type)
		{
		case ENTITY:
		case EQUIPPED_FIRST_PERSON:
		case EQUIPPED:
		case INVENTORY: return true;
		default: return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
	{
		switch(helper)
		{
//		case ENTITY_ROTATION:
		case ENTITY_BOBBING: return true;
		default: return false;
		}
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
	{
		int renderType = 0;
		
		switch(type)
		{
			case ENTITY:
			{
				
				GL11.glPushMatrix();
//				GL11.glEnable(GL11.GL_BLEND);
//	            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			
	            GL11.glRotatef(0F, 0.0F, 0.0F, 1.0F);
//				GL11.glTranslatef(0.0F, -0.1F, 0.0F);
				 GL11.glScalef(1F, 1F, 1F);
//				 GL11.glDisable(GL11.GL_BLEND);
					GL11.glPopMatrix();
            	
            /*
             * 	
         
				renderType = 2;
				GL11.glPushMatrix();
				GL11.glDisable(GL11.GL_CULL_FACE);
	            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
	            GL11.glScalef(1F, 1F, 1F);
	            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("transcraft", "textures/models/TranscrafterModel.png"));  
			    model.Middle.render(0.0625F);
			    model.Top_bit_1.render(0.0625F);
			    model.Top_bit_2.render(0.0625F);
			    model.Top_bit_3.render(0.0625F);
			    model.Top_bit_4.render(0.0625F);
			    model.Floaty_part.render(0.0625F);
			    GL11.glDisable(GL11.GL_BLEND);
			    GL11.glPopMatrix();
			    
			        */
			}
			case INVENTORY:
			{
				GL11.glDisable(GL11.GL_CULL_FACE);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				GL11.glPushMatrix();
	            GL11.glRotatef(0F, 1.0F, 1.0F, 1.0F);
	            GL11.glTranslatef((float) 7.0F, (float)-2.5f, (float) 0.4F);
	            GL11.glScalef(13F, 13F, 13F);
	            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("transcraft", "textures/models/TranscrafterModel.png"));
			            
			    model.Middle.render(0.0625F);
			    model.Top_bit_1.render(0.0625F);
			    model.Top_bit_2.render(0.0625F);
			    model.Top_bit_3.render(0.0625F);
			    model.Top_bit_4.render(0.0625F);
			    model.Floaty_part.render(0.0625F);
			    GL11.glDisable(GL11.GL_BLEND);
			    GL11.glPopMatrix();
			}
			case EQUIPPED_FIRST_PERSON:
			{
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				
				GL11.glPushMatrix();
				
	            GL11.glEnable(GL11.GL_BLEND);
	            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			
	            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
	            
	            GL11.glTranslatef((float) - 0.4F, (float)- 1.5f, (float) 0.4F);
	            
	            GL11.glScalef(1F, 1F, 1F);
	          
	            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("transcraft", "textures/models/TranscrafterModel.png"));
			            
			    model.Middle.render(0.0625F);
			    model.Top_bit_1.render(0.0625F);
			    model.Top_bit_2.render(0.0625F);
			    model.Top_bit_3.render(0.0625F);
			    model.Top_bit_4.render(0.0625F);
			    model.Floaty_part.render(0.0625F);
			    
			    GL11.glPopMatrix();
			}
			case EQUIPPED:
			{
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				
				GL11.glPushMatrix();
				
	            GL11.glEnable(GL11.GL_BLEND);
	            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			
	            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
	            
	            GL11.glTranslatef((float) - 0.4F, (float)- 1.5f, (float) 0.4F);
	            
	            GL11.glScalef(1F, 1F, 1F);
	          
	            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("transcraft", "textures/models/TranscrafterModel.png"));
			            
			    model.Middle.render(0.0625F);
			    model.Top_bit_1.render(0.0625F);
			    model.Top_bit_2.render(0.0625F);
			    model.Top_bit_3.render(0.0625F);
			    model.Top_bit_4.render(0.0625F);
			    model.Floaty_part.render(0.0625F);
			    
		        
	            GL11.glDisable(GL11.GL_BLEND);
				
				GL11.glPopMatrix();

			}
			
		}
				
		}
}
