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
public class TileIGRender extends TileEntitySpecialRenderer {
	private static final ResourceLocation field_110631_g = new ResourceLocation(
			"transcraft", "textures/models/ixp.png");

	/** The normal small chest model. */
	private ModelChest chestModel = new ModelChest();

	public TileIGRender() {

	}

	/**
	 * Renders the TileEntity for the chest at a position.
	 */

	@Override
	public void func_147500_a(TileEntity par1TileEC, double par2, double par4,
			double par6, float par8) {
		int i;

		if (!par1TileEC.func_145830_o()) {
			i = 0;
		} else {
			Block block = par1TileEC.func_145838_q();
			i = par1TileEC.func_145832_p();

			if (block instanceof ItemGrinder && i == 0) {
				i = par1TileEC.func_145832_p();
			}

		}

		ModelChest modelchest;

		modelchest = this.chestModel;

		this.func_147499_a(field_110631_g);

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

		modelchest.renderAll();
		GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		GL11.glPopMatrix();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	}

	public void renderTileEntityAt(TileEntity par1TileEntity, double par2,
			double par4, double par6, float par8) {
		this.func_147500_a((ItemGrinderTile) par1TileEntity, par2, par4, par6, par8);
	}

}
