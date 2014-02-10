package modmuss50.mods.transcraft.Blocks.fluids;

import java.awt.List;

import javax.swing.Icon;

import modmuss50.mods.transcraft.Transcraft;
import modmuss50.mods.transcraft.api.Fluids;
import net.minecraft.block.Block;
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
	
	 
	  private int isFull;
	  
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
	  }

	  
	
	 //TODO needs fixing
}
