/**
 * This class is part of the mod Transcraft. 
 * 
 * Transcraft is Open Source but you cant use any code without permission!
 * 
 */

package modmuss50.mods.transcraft.helpers;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

import modmuss50.mods.transcraft.TileEntitys.ItemGrinder.TileIXP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class ClientPacketHelper implements IPacketHandler {
	@Override
	public void onPacketData(INetworkManager manager,
			Packet250CustomPayload packet, Player player) {
		EntityPlayer sender = (EntityPlayer) player;
		DataInputStream data = new DataInputStream(new ByteArrayInputStream(
				packet.data));

		if (packet.channel.equals("transcraft")) {
			handlePacket(packet, sender);
		}
	}

	private void handlePacket(Packet250CustomPayload packet, EntityPlayer player) {
		DataInputStream dis = new DataInputStream(new ByteArrayInputStream(
				packet.data));
		try {
			byte energyBlockType = dis.readByte();
			switch (energyBlockType) {
			case 0:
				TileIXP tem = (TileIXP) player.worldObj
						.getBlockTileEntity(dis.readInt(), dis.readInt(),
								dis.readInt());
				if (tem != null) {
					tem.recieveSync(dis.readInt());
				}
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
