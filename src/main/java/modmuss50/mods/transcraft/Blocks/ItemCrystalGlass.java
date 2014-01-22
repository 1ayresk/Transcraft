package modmuss50.mods.transcraft.Blocks;

import java.util.List;

import modmuss50.mods.transcraft.helpers.Config;
import modmuss50.zaetApi.api.IColoredItemBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCrystalGlass extends IColoredItemBlock {

	public ItemCrystalGlass(int par1) {
		super(par1);

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list,
			boolean par4) {
		if (Config.enderswordpearl == true) {
			if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)
					|| Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				list.add("\u00a72This glass has a clean look to it.");
				list.add("\u00a72It can be broken with any Pickaxe");
			} else {
				list.add("\u00a72[\u00a74SHIFT\u00a72]");
			}
		}
	}

}
