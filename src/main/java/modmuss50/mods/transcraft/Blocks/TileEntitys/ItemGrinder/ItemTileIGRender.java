package modmuss50.mods.transcraft.Blocks.TileEntitys.ItemGrinder;

import net.minecraft.client.model.ModelChest;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemTileIGRender implements IItemRenderer {

	private ModelChest chest;

	public ItemTileIGRender() {
		chest = new ModelChest();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		// TileEntityRenderer.instance.renderTileEntityAt(new TileIXP(), 0.0,
		// 0.0,0.0, 0.0F);
	}

}