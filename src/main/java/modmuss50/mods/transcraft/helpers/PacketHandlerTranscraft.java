package modmuss50.mods.transcraft.helpers;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import modmuss50.mods.transcraft.TileEntitys.ItemGrinder.TileIXP;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class PacketHandlerTranscraft implements IPacketHandler {

	@Override
	public void onPacketData(INetworkManager manager,
			Packet250CustomPayload packet, Player player) {
		if (packet.channel == "transcraft") {
			handlePacket(packet);
		}
		
		NBTTagCompound tag = PackUtils.nbtFromPacket(packet);
	      int x = tag.getInteger("x");
	      int y = tag.getInteger("y");
	      int z = tag.getInteger("z");
	      World world = Minecraft.getMinecraft().theWorld;
	      if (world.blockExists(x, y, z)) {
	         TileEntity te = world.getBlockTileEntity(x, y, z);
	         if (te != null) {
	            te.readFromNBT(tag);
	            te.onInventoryChanged();
	         }
	      }
		
	}

	public void handlePacket(Packet250CustomPayload p) {
		DataInputStream inputStream = new DataInputStream(
				new ByteArrayInputStream(p.data));

		int randomInt1;
		int randomInt2;

		try {
			randomInt1 = inputStream.readInt();
			randomInt2 = inputStream.readInt();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		
		
		//System.out.println("[Transcraft Gui's]" + randomInt1 + " " + randomInt2);
	}

}
