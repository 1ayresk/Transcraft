package modmuss50.mods.transcraft.Tools;

import java.util.List;

import modmuss50.mods.transcraft.helpers.Config;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BunkerPick extends ItemPickaxe {

	public BunkerPick(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:EnderPick");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list,
			boolean par4) {
		if (Config.enderswordpearl == true) {
			if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)
					|| Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
				list.add("\u00a72Just a pickaxe, Oh and it can mine bunker blocks!");
			} else {
				list.add("\u00a72[\u00a74SHIFT\u00a72]");
			}
		}
	}

}
