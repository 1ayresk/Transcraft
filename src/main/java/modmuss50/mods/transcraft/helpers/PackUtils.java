package modmuss50.mods.transcraft.helpers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.tileentity.TileEntity;

public class PackUtils {

	 public static Packet packetFromTileEntity(TileEntity te) {
	      NBTTagCompound tag = new NBTTagCompound();
	      te.writeToNBT(tag);
	      return packetFromNBT(0, tag);
	   }
	   
	   public static Packet packetFromNBT(int type, NBTTagCompound tag) {
	      ByteArrayOutputStream bytes = new ByteArrayOutputStream();
	      DataOutputStream stream = new DataOutputStream(bytes);
	      try {
	         stream.write(type);
	         NBTBase.writeNamedTag(tag, stream);
	      }
	      catch (IOException e) {
	         throw new RuntimeException(e.toString());
	      }
	      byte[] data = bytes.toByteArray();
	      Packet250CustomPayload packet = new Packet250CustomPayload();
	      packet.channel = "transcraft";
	      packet.length = data.length;
	      packet.data = data;
	      return packet;
	   }
	   
	   public static NBTTagCompound nbtFromPacket(Packet250CustomPayload pkt) {
	      DataInput stream = new DataInputStream(new ByteArrayInputStream(pkt.data, 1, pkt.length - 1));  
	         NBTBase tag = NBTBase.readNamedTag(stream);
	         return (NBTTagCompound)tag;
	   }
	
	
}
