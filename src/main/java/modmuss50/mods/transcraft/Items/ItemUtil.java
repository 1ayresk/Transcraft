package modmuss50.mods.transcraft.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import modmuss50.mods.transcraft.Transcraft;
import modmuss50.mods.transcraft.Items.simpleItems.ItemTest;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemUtil
	{

		public static void addSimpleItem(Item item , String name, CreativeTabs creativetab)
			{
				
				item = new ItemTest().setUnlocalizedName("transcraft:" + name).setCreativeTab(creativetab).setTextureName("transcraft:"+ name);
				GameRegistry.registerItem(item,item.getUnlocalizedName().replace("item.", ""));
			}
		
	}
