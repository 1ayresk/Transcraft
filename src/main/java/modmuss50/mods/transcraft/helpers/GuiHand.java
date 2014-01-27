package modmuss50.mods.transcraft.helpers;

import modmuss50.mods.transcraft.Items.gui.TranspediaGui;
import modmuss50.mods.transcraft.TileEntitys.ItemGrinder.ContainerIXP;
import modmuss50.mods.transcraft.TileEntitys.ItemGrinder.GuiIxp;
import modmuss50.mods.transcraft.TileEntitys.ItemGrinder.TileIXP;
import modmuss50.mods.transcraft.TileEntitys.Transcrafter.ContainerTC;
import modmuss50.mods.transcraft.TileEntitys.Transcrafter.GuiTC;
import modmuss50.mods.transcraft.TileEntitys.Transcrafter.TileTC;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHand implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {


		if (ID == 2) {
//			return new ContainerIXP(player.inventory, x, y, z);
			return null;
		} 
		else if (ID == 1) 
		{
			return new ContainerTC(player.inventory, world, x, y, z);
		} else {
			return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {


		switch (ID) {

		case 3:
			return new TranspediaGui();

		}

		if (ID == 2) {
			//return new GuiIxp(player.inventory, (TileIXP) te);
			return null;
		} else if (ID == 1) {
			return new GuiTC(player.inventory, world, x, y, z);
		} else {
			return null;
		}
	}

}
