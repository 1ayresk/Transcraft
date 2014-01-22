package modmuss50.mods.transcraft.Blocks;

import java.util.List;

import modmuss50.mods.transcraft.helpers.Config;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TranscraftOreItem extends ItemBlock {

	public TranscraftOreItem(int id) {
		super(id);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int damageValue) {
		return damageValue;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return getUnlocalizedName()
				+ "."
				+ TranscraftOre.types[itemstack.getItemDamage()].replace(" ",
						"").toLowerCase();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list,
			boolean par4) {
		if (Config.enderswordpearl == true) {
			if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)
					|| Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				list.add("\u00a72This ore is part of transcraft");
				list.add("\u00a72You can randomly find it in the ground");
			} else {
				list.add("\u00a72[\u00a74SHIFT\u00a72]");
			}
		}
	}

}
