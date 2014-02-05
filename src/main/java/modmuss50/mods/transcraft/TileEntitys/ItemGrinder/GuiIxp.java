package modmuss50.mods.transcraft.TileEntitys.ItemGrinder;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiIxp extends GuiContainer {

	private static final ResourceLocation field_110421_t = new ResourceLocation(
			"transcraft", "textures/gui/IxpGrinder.png");
	private IInventory upperChestInventory;
	private IInventory lowerChestInventory;

	private float xSize_lo;
	private float ySize_lo;

	
	private int field_147018_x;
	
	/**
	 * window height is calculated with this values, the more rows, the heigher
	 */

	private int inventoryRows;
	private TileIXP te;

	public GuiIxp(InventoryPlayer player, TileIXP tileEntity) {
		super(new ContainerIXP(player, tileEntity));
		int xSize = 256;
		int ySize = 219;
		this.te = tileEntity;
		this.lowerChestInventory = player;
		this.upperChestInventory = te;
		this.field_147018_x = 3;
	}

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of
	 * the items)
	 */

	protected void func_146979_b(int par1, int par2) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.field_146289_q.drawString("Item Grinder", 8, 8, 4210752);
		this.field_146289_q.drawString("Inventory", 9,this.field_146999_f - 60, 4210752);
		this.field_146289_q.drawString("Current Essence: " + te.getIXPValue(),
				77, 10, 4210752);
		this.field_146297_k.getTextureManager().bindTexture(field_110421_t);

		if (te.getIXPValue() != 0) {
			if (te.CurrnetintMaxValue != 0) {
				te.CurrentintIXPValue = (int) te.getIXPValue();
				int perint1 = (te.CurrentintIXPValue * 100);
				int perint2 = (perint1 / te.CurrnetintMaxValue);
				this.drawTexturedModalRect(field_147000_g - 226,
						field_146999_f - 194, 0, 220, perint2, 14);
			}
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public void initGui() {
		super.initGui();

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
		this.field_146297_k.getTextureManager().bindTexture(field_110421_t);
		int k = (this.field_146294_l - this.field_146999_f) / 2;
        int l = (this.field_146295_m - this.field_147000_g) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.field_146999_f + 50, this.field_147018_x * 18 + 165);
   //     this.drawTexturedModalRect(k, l + this.inventoryRows * 18 + 127, 0,126, this.field_146999_f, 96);
   	 
		drawPlayerModel(k + 200, l + 80, 30, (float) (k + 200) - this.xSize_lo,
				(float) (l + 60 - 30) - this.ySize_lo,
				this.field_146297_k.thePlayer);

	
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

}
