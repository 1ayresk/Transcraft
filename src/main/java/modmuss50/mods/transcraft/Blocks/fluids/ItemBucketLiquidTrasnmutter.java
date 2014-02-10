package modmuss50.mods.transcraft.Blocks.fluids;

import java.awt.List;

import javax.swing.Icon;

import modmuss50.mods.transcraft.Transcraft;
import modmuss50.mods.transcraft.Blocks.TranscraftOre;
import modmuss50.mods.transcraft.api.Fluids;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBucketLiquidTrasnmutter extends Item {
	
	  
	  private static final String[] bucketTypes = new String[] { "empty",
	  "transmutter" };
	  
	  @SideOnly(Side.CLIENT) private IIcon[] textures;
	  
	  public ItemBucketLiquidTrasnmutter() 
	  { 
		  super(); // Constructor
		  int maxStackSize = 1; 
		  setCreativeTab(Transcraft.Transtab);
		  setUnlocalizedName("ItemBucketLiquidTrasnmutter");
		  this.setHasSubtypes(true);
		  setHasSubtypes(true);;
	  }

	  @Override
		public ItemStack onItemRightClick(ItemStack itemstack, World world,EntityPlayer player) 
	  {
		return null;
			
		}
	  
	  @Override
		public int getMetadata(int damageValue) {
			return damageValue;
		}

		
		@Override
		public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack) {
			if (par1ItemStack.getItemDamage() == 0
					|| par1ItemStack.getItemDamage() == 1) {
				return false;
			}

			return true;
		}
		
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		@SideOnly(Side.CLIENT)
		public void getSubItems(Item item, CreativeTabs tab, List list) {
			for(int i = 0; i < bucketTypes.length; i++) {
				 ItemStack stack = new ItemStack(item, 1, i);
//				 list.add(stack);
			}
		}
		
		
		
		
		@Override
		@SideOnly(Side.CLIENT)
		public void registerIcons(IIconRegister iconRegister) {
			textures = new IIcon[bucketTypes.length];

			for (int i = 0; i < bucketTypes.length; ++i) {
				textures[i] = iconRegister.registerIcon("transcraft:" + "bucket_"
						+ bucketTypes[i]);
			}
		}
		
		@Override
		public IIcon getIconFromDamage(int meta) {
			if (meta == 0) {
				return textures[0];
			} else if (meta == 1) {
				return textures[1];
			}
			return null;

		}
		
		
		@Override
		public String getUnlocalizedName(ItemStack itemstack) {
			int meta = itemstack.getItemDamage();

			if (meta == 0) {
				return "Empty";
			} else if (meta == 1) {
				return "Transmutter";
			}
			return null;
		}
}
