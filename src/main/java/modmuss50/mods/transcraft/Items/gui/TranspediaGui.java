package modmuss50.mods.transcraft.Items.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TranspediaGui extends GuiContainer {
	private ResourceLocation field_110421_t = new ResourceLocation(
			"transcraft", "textures/gui/Transpedia/Transpedia_0.png");

	private float xSize_lo;
	private float ySize_lo;

	private int pageNumber = 0;
	public int numberofpages = 3;

	public TranspediaGui() {
		super(new ContainerTranspedia());
		this.xSize_lo = 256;
		this.xSize_lo = 256;
	}

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of
	 * the items)
	 */
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
	//	  if(pageNumber != 0) { this.fontRenderer.drawString("Transpedia Page "
	//	  + pageNumber, ((width / 2) / 6), (height/2) + (height/5) - 4,
	//	  4210752); }

	}

	@SuppressWarnings("unchecked")
	@Override
	public void initGui() {
		super.initGui();

		 this.field_146292_n.add(new GuiButton(1, 123,field_147009_r / 2 +
		 100, 20, 20, "<"));
		 this.field_146292_n.add(new GuiButton(0, 48,field_147009_r / 2 + 100,
		 20, 20, ">"));

	}

	public void drawScreen(int par1, int par2, float par3) {
		super.drawScreen(par1, par2, par3);
		 this.xSize_lo = (float) par1;
		 this.ySize_lo = (float) par2;

	}

	/**
	 * Draw the background layer for the GuiContainer (everything behind the
	 * items)
	 */
	protected void func_146976_a(float par1, int par2, int par3) {
		 GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		 field_110421_t = new
		 ResourceLocation("transcraft","textures/gui/Transpedia/Transpedia_" +
		 pageNumber + ".png");
		 this.field_146297_k.getTextureManager().bindTexture(field_110421_t);
		 int k = (this.field_146294_l - this.field_146999_f) / 2;
		 int l = (this.field_146295_m - this.field_147000_g) / 2;
		 this.drawTexturedModalRect(k, l, 0, 0, this.field_146999_f,this.field_147000_g);
		
		 if (pageNumber != 0) {
		 drawPlayerModel(k + 162, l + 80, 30, (float) (k + 162)-
		 this.xSize_lo, (float) (l + 60 - 30) -
		 this.ySize_lo,this.field_146297_k.thePlayer);
		 }
	}

	/**
	 * This renders the player model in standard inventory position
	 */
	public static void drawPlayerModel(int par0, int par1, int par2,
			float par3, float par4, EntityLivingBase par5EntityLivingBase) {
		GL11.glEnable(GL11.GL_COLOR_MATERIAL);
		GL11.glPushMatrix();
		GL11.glTranslatef((float) par0, (float) par1, 50.0F);
		GL11.glScalef((float) (-par2), (float) par2, (float) par2);
		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
		float f2 = par5EntityLivingBase.renderYawOffset;
		float f3 = par5EntityLivingBase.rotationYaw;
		float f4 = par5EntityLivingBase.rotationPitch;
		float f5 = par5EntityLivingBase.prevRotationYawHead;
		float f6 = par5EntityLivingBase.rotationYawHead;
		GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
		RenderHelper.enableStandardItemLighting();
		GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(-((float) Math.atan((double) (par4 / 40.0F))) * 20.0F,
				1.0F, 0.0F, 0.0F);
		par5EntityLivingBase.renderYawOffset = (float) Math
				.atan((double) (par3 / 40.0F)) * 20.0F;
		par5EntityLivingBase.rotationYaw = (float) Math
				.atan((double) (par3 / 40.0F)) * 40.0F;
		par5EntityLivingBase.rotationPitch = -((float) Math
				.atan((double) (par4 / 40.0F))) * 20.0F;
		par5EntityLivingBase.rotationYawHead = par5EntityLivingBase.rotationYaw;
		par5EntityLivingBase.prevRotationYawHead = par5EntityLivingBase.rotationYaw;
		GL11.glTranslatef(0.0F, par5EntityLivingBase.yOffset, 0.0F);
		RenderManager.instance.playerViewY = 180.0F;
		RenderManager.instance.func_147940_a(par5EntityLivingBase, 0.0D, 0.0D,
				0.0D, 0.0F, 1.0F);
		par5EntityLivingBase.renderYawOffset = f2;
		par5EntityLivingBase.rotationYaw = f3;
		par5EntityLivingBase.rotationPitch = f4;
		par5EntityLivingBase.prevRotationYawHead = f5;
		par5EntityLivingBase.rotationYawHead = f6;
		GL11.glPopMatrix();
		RenderHelper.disableStandardItemLighting();
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
	}

	/**
	 * This renders the player model in standard inventory position
	 */
	public static void drawItemStackModel(int par0, int par1, int par2,
			float par3, float par4, EntityItem par5EntityLivingBase) {
		GL11.glEnable(GL11.GL_COLOR_MATERIAL);
		GL11.glPushMatrix();
		GL11.glTranslatef((float) par0, (float) par1, 50.0F);
		GL11.glScalef((float) (-par2), (float) par2, (float) par2);
		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
		float f3 = par5EntityLivingBase.rotationYaw;
		float f4 = par5EntityLivingBase.rotationPitch;
		GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
		RenderHelper.enableStandardItemLighting();
		GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(-((float) Math.atan((double) (par4 / 40.0F))) * 20.0F,
				1.0F, 0.0F, 0.0F);
		par5EntityLivingBase.rotationYaw = (float) Math
				.atan((double) (par3 / 40.0F)) * 40.0F;
		par5EntityLivingBase.rotationPitch = -((float) Math
				.atan((double) (par4 / 40.0F))) * 20.0F;
		GL11.glTranslatef(0.0F, par5EntityLivingBase.yOffset, 0.0F);
		RenderManager.instance.playerViewY = 180.0F;
		RenderManager.instance.func_147940_a(par5EntityLivingBase, 0.0D, 0.0D,
				0.0D, 0.0F, 1.0F);
		par5EntityLivingBase.rotationYaw = f3;
		par5EntityLivingBase.rotationPitch = f4;
		GL11.glPopMatrix();
		RenderHelper.disableStandardItemLighting();
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
	}

	public void actionPerformed(GuiButton par0Button) {
		/** Back **/
		if (par0Button.field_146127_k == 1) {
			if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
				pageNumber = 0;
			} else {

				if (pageNumber != 0) {
					pageNumber -= 1;
				}

			}

		}

		/** Next **/
		if (par0Button.field_146127_k == 0) {
			if (pageNumber != numberofpages) {
				pageNumber += 1;
			}
		}
	}

}
