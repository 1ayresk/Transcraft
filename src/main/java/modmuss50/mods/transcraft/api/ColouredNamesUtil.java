/**
 * This class is part of the mod Transcraft. 
 * 
 * Transcraft is Open Source but you cant use any code without permission!
 * 
 */

package modmuss50.mods.transcraft.api;


import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import org.zaet.api.ColoredBlockUtil;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class ColouredNamesUtil {

	public static String Black = "\u00A77";
	public static String DarkRed = "\u00A74";
	public static String DarkGreen = "\u00A72";
	public static String Brown = "\u00A77";
	public static String Blue = "\u00A71";
	public static String Purple = "\u00A75";
	public static String Cyan = "\u00A73";
	public static String Sliver = "\u00A77";
	public static String Grey = "\u00A78";
	public static String Pink = "\u00A7d";
	public static String Lime = "\u00A7a";
	public static String Yellow = "\u00A7e";
	public static String LightBlue = "\u00A7b";
	public static String Magenta = "\u00A79";
	public static String Organge = "\u00A76";
	public static String White = "\u00A7f";

	
	public static void addColourLocalizationsForBlock(ItemBlock itemBlock,String suffix) 
	{
		int i = 0;
		
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", Black + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
			i = i + 1;
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", DarkRed + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
			i = i + 1;
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", DarkGreen  + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
			i = i + 1;
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", Brown  + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
			i = i + 1;
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", Blue  + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
			i = i + 1;
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", Purple  + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
			i = i + 1;
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", Cyan  + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
			i = i + 1;
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", Sliver  + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
			i = i + 1;
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", Grey  + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
			i = i + 1;
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", Pink  + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
			i = i + 1;
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", Lime  + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
			i = i + 1;
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", Yellow  + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
			i = i + 1;
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", LightBlue  + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
			i = i + 1;
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", Magenta  + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
			i = i + 1;
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", Organge  + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
			i = i + 1;
			LanguageRegistry.instance().addStringLocalization(itemBlock.getUnlocalizedName(new ItemStack(itemBlock, 1, i)) + ".name", White  + ColoredBlockUtil.getColorNameByMetadata(i) + " " + suffix);
	
	
	}
	
	
}
