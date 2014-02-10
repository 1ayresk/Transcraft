package modmuss50.mods.transcraft.Client;

import java.util.Random;

import modmuss50.mods.transcraft.TranscraftCommonProxy;
import modmuss50.mods.transcraft.Blocks.TileEntitys.ItemGrinder.ItemGrinderTile;
import modmuss50.mods.transcraft.Blocks.TileEntitys.ItemGrinder.TileIGRender;
import modmuss50.mods.transcraft.Blocks.TileEntitys.Transcrafter.RenderTC;
import modmuss50.mods.transcraft.Blocks.TileEntitys.Transcrafter.TileTC;
import modmuss50.mods.transcraft.Client.Renders.RenderEnderSword;
import modmuss50.mods.transcraft.Client.Renders.particles.FXSparkle;
import modmuss50.mods.transcraft.Entitys.mob.EnderBatRender;
import modmuss50.mods.transcraft.Entitys.mob.Enderbat;
import modmuss50.mods.transcraft.Entitys.mob.NukeCreeper;
import modmuss50.mods.transcraft.Entitys.mob.NukeCreeperRender;
import modmuss50.mods.transcraft.Items.TranscraftItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class TranscraftClientProxy extends TranscraftCommonProxy {

	public static Minecraft mc = Minecraft.getMinecraft();

	@Override
	public void registerHandlers() {

	}

	@Override
	public void registerTickHandlers() {

		RenderingRegistry.registerEntityRenderingHandler(NukeCreeper.class,
				new NukeCreeperRender());
		RenderingRegistry.registerEntityRenderingHandler(Enderbat.class,
				new EnderBatRender());

	}

	public void sparkleFX(World world, double x, double y, double z,
			float size, int m) {
		FXSparkle sparkle = new FXSparkle(world, x, y, z, size, m);
		Minecraft.getMinecraft().effectRenderer.addEffect(sparkle);
	}

	public void renderThings() {
		 ClientRegistry.bindTileEntitySpecialRenderer(ItemGrinderTile.class,new
				 TileIGRender());

		// MinecraftForgeClient.registerItemRenderer(TranscraftBlocks.ixpGrinder,new
		// ItemTileIxpRender());

		ClientRegistry.bindTileEntitySpecialRenderer(TileTC.class,
				new RenderTC());

		// MinecraftForgeClient.registerItemRenderer(TranscraftBlocks.Transcrafter
		// ,new RenderHandTC());

		MinecraftForgeClient.registerItemRenderer(TranscraftItems.EnderSword,
				new RenderEnderSword());
	}

	public void postrenderThings() {

	}

	@Override
	public void spawnParticle(String string, double x, double y, double z) {
		EntityFX entityfx = null;

		Random rand = new Random();

		if (string == "glass") {
			// entityfx = new GlassFX(mc.theWorld, x, y, z, 0.0D, 0.0D, 0.0D);
		}

		mc.effectRenderer.addEffect(entityfx);
	}

}
