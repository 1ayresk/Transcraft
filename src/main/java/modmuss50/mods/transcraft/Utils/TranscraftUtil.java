/**
 * This class is part of the mod Transcraft. 
 * 
 * Transcraft is Open Source but you cant use any code without permission!
 * 
 */

package modmuss50.mods.transcraft.helpers;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.EnumHelper;

public class TranscraftUtil {

	public static final String VERSION = "1.7.2_V2.0.0_";
	public static final String STATE = "Prerelease_1";
	public static boolean DEVSTATUS = false;
	public static final BiomeGenBase TransmutterBiome = (new modmuss50.mods.transcraft.biomes.TransmutterBiome(
			190)).setBiomeName("TransmutterBiome").setTemperatureRainfall(0.8F,
			0.4F);

	public static ToolMaterial PlasticTool = EnumHelper.addToolMaterial(
			"PlasticTool", 2, 750, 5.0F, 2, 0);
	public static ToolMaterial BunkerToolEnum = EnumHelper.addToolMaterial(
			"BunkerToolEnum", 4, 1000, 20.0F, 4, 0);
	public static ToolMaterial EnderToolEnum = EnumHelper.addToolMaterial(
			"EnderToolEnum", 400, 10000, 80.0F, 46, 100);

	public static List<String> authorList = Arrays.asList("mark123mark",
			"tattyseal", "shifu_", "klmDF14J");
}
