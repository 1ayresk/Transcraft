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
	public static TranscrafterModel model;
	
	public RenderHandTC()
	{
		model = new TranscrafterModel();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type)
	{
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
	{
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("transcraft:textures/models/TranscrafterModel.png"));
		


		if(type.equals(type.EQUIPPED_FIRST_PERSON))
		{
			GL11.glTranslatef(1f, 1f, 0f);
			GL11.glScalef(-1f, -1f, -1f);
		}
		
		if(type.equals(type.INVENTORY))
		{
			GL11.glTranslatef(1f, 1f, 0f);
			GL11.glScalef(-1f, -1f, -1f);
		}
		
		model.render((Entity)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
	}



}
