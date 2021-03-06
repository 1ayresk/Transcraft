package modmuss50.mods.transcraft.TileEntitys.ItemGrinder;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TileECRender extends TileEntitySpecialRenderer {
	private static final ResourceLocation field_110631_g = new ResourceLocation(
			"transcraft", "textures/models/ixp.png");

	/** The normal small chest model. */
	private ModelChest chestModel = new ModelChest();

	public TileECRender() {

	}

	/**
	 * Renders the TileEntity for the chest at a position.
	 */
	public void renderTileECAt(TileIXP par1TileEC, double par2, double par4,
			double par6, float par8) {
		int i;

		if (!par1TileEC.hasWorldObj()) {
			i = 0;
		} else {
			Block block = par1TileEC.getBlockType();
			i = par1TileEC.getBlockMetadata();

			if (block instanceof IXPGrinderMk2 && i == 0) {
				i = par1TileEC.getBlockMetadata();
			}

		}

		ModelChest modelchest;

		modelchest = this.chestModel;

		this.bindTexture(field_110631_g);

		GL11.glPushMatrix();
		GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glTranslatef((float) par2, (float) par4 + 1.0F,
				(float) par6 + 1.0F);
		GL11.glScalef(1.0F, -1.0F, -1.0F);
		GL11.glTranslatef(0.5F, 0.5F, 0.5F);
		short short1 = 0;

		if (i == 2) {
			short1 = 180;
		}

		if (i == 3) {
			short1 = 0;
		}

		if (i == 4) {
			short1 = 90;
		}

		if (i == 5) {
			short1 = -90;
		}

		GL11.glRotatef((float) short1, 0.0F, 1.0F, 0.0F);
		GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
		float f1 = par1TileEC.prevLidAngle
				+ (par1TileEC.lidAngle - par1TileEC.prevLidAngle) * par8;
		f1 = 1.0F - f1;
		f1 = 1.0F - f1 * f1 * f1;
		modelchest.chestLid.rotateAngleX = -(f1 * (float) Math.PI / 2.0F);
		modelchest.renderAll();
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glPopMatrix();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	}

	public void renderTileEntityAt(TileEntity par1TileEntity, double par2,
			double par4, double par6, float par8) {
		this.renderTileECAt((TileIXP) par1TileEntity, par2, par4, par6, par8);
	}
}
