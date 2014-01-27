package modmuss50.mods.transcraft;

import java.io.File;

import cpw.mods.fml.common.FMLCommonHandler;
import modmuss50.mods.transcraft.helpers.TickHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class TranscraftCommonProxy {

	public static File getMinecraftDir() {
		return new File(".");
	}

	public void registerHandlers() {
//		TickRegistry.registerTickHandler(new TickHandler(), Side.SERVER);
//		TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
	}

	public void registerTickHandlers() {
		// TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
//		TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);

	}

	public void register() {
		// GameRegistry.registerTileEntity(TileEntityTF.class, "TileEntity");
	}

	public void spawnParticle(String string, double x, double y, double z) {
	}

	public void postrenderThings() {

	}

	public void sparkleFX(World world, double x, double y, double z,
			float size, int m) {
		// NO-OP
	}

	public void renderThings() {

	}

}