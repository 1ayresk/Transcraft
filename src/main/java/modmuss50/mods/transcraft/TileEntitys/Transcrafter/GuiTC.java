package modmuss50.mods.transcraft.TileEntitys.Transcrafter;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

public class GuiTC extends GuiContainer {
	private static final ResourceLocation field_110422_t = new ResourceLocation(
			"transcraft", "textures/gui/Transcrafter.png");

	public GuiTC(InventoryPlayer par1InventoryPlayer, World par2World,
			int par3, int par4, int par5) {
		super(new ContainerTC(par1InventoryPlayer, par2World, par3, par4, par5));
	}

	/**
	 * Draw the foreground layer for the GuiContainer (everything in front of
	 * the items)
	 */
	protected void func_146979_b(int p_146979_1_, int p_146979_2_) {
		this.field_146289_q.drawString(I18n.getStringParams("Transcrafter"),
				28, 6, 1210752);
		this.field_146289_q.drawString(
				I18n.getStringParams("container.inventory"), 8,
				this.field_147000_g - 96 + 2, 1210752);
	}

	/**
	 * Draw the background layer for the GuiContainer (everything behind the
	 * items)
	 */

	@Override
	protected void func_146976_a(float p_146976_1_, int p_146976_2_,
			int p_146976_3_) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.field_146297_k.getTextureManager().bindTexture(field_110422_t);
		int k = (this.field_146294_l - this.field_146999_f) / 2;
		int l = (this.field_146295_m - this.field_147000_g) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, this.field_146999_f,
				this.field_147000_g);
	}

}
