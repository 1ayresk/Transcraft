package modmuss50.mods.transcraft.Blocks.Quartz;

import java.util.List;

import modmuss50.mods.transcraft.helpers.Config;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEnderQuartzBrick extends org.zaet.api.IColoredItemBlock {

	public ItemEnderQuartzBrick(Block par1) {
		super(par1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list,
			boolean par4) {
		if (Config.enderswordpearl == true) {
			if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)
					|| Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				list.add("\u00a72This block is just to look good!");
				list.add("\u00a72It can be broken with any Pickaxe");
				list.add("\u00A75You can right click it with a dye to change the colour!");
			} else {
				list.add("\u00a72[\u00a74SHIFT\u00a72]");
			}
		}
	}

}
