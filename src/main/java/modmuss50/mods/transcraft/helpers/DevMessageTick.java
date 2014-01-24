package modmuss50.mods.transcraft.helpers;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class DevMessageTick implements ITickHandler {

	private int render = 0;

	private final Minecraft mc;

	public DevMessageTick() {
		mc = Minecraft.getMinecraft();
	}

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {

	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {

		FontRenderer fontRender = mc.fontRenderer;
		mc.entityRenderer.setupOverlayRendering();

		// draw
		String text = "This is a dev version of Transcraft!";
		String text2 = "If anyting breaks or crashes please report it on the Github!";
		int x = 1;
		int y = 1;
		int color = 0xFFFFFF;

		Minecraft minecraft = FMLClientHandler.instance().getClient();

		ScaledResolution res = new ScaledResolution(this.mc.gameSettings,
				this.mc.displayWidth, this.mc.displayHeight);
		int width = res.getScaledWidth();
		int height = res.getScaledHeight();

		if(Minecraft.getMinecraft().isIntegratedServerRunning() == true)
		{
			if (type.contains(TickType.RENDER)) 
			{
				minecraft.fontRenderer.drawString("\u00a74This is a dev version of Transcraft!", 0, 30, 10);
				minecraft.fontRenderer.drawString(
								"\u00a74If anyting breaks or crashes please report it on the Github!",
								0, 40, 10);

			}
		}
		

	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.RENDER);
	}

	@Override
	public String getLabel() {
		return "Transcraft_DEV_Handler";
	}

}
