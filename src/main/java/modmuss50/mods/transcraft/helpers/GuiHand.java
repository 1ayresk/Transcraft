package modmuss50.mods.transcraft.helpers;

import modmuss50.mods.transcraft.Items.gui.TranspediaGui;
import modmuss50.mods.transcraft.TileEntitys.ItemGrinder.ContainerIG;
import modmuss50.mods.transcraft.TileEntitys.ItemGrinder.GuiIG;
import modmuss50.mods.transcraft.TileEntitys.ItemGrinder.ItemGrinderTile;
import modmuss50.mods.transcraft.TileEntitys.Transcrafter.ContainerTC;
import modmuss50.mods.transcraft.TileEntitys.Transcrafter.GuiTC;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHand implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {

		TileEntity te = world.func_147438_o(x, y, z);

		if (ID == 2) {
			return new ContainerIG(player.inventory, (ItemGrinderTile) te);
		} else if (ID == 1) {
			return new ContainerTC(player.inventory, world, x, y, z);
		} else {
			return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {

		TileEntity te = world.func_147438_o(x, y, z);

		switch (ID) {

		case 3:
			return new TranspediaGui();

		}

		if (ID == 2) {
			return new GuiIG(player.inventory, (ItemGrinderTile) te);
		} else if (ID == 1) {
			return new GuiTC(player.inventory, world, x, y, z);
		} else {
			return null;
		}
	}

}
