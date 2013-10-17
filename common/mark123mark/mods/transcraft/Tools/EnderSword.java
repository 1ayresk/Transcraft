package mark123mark.mods.transcraft.Tools;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mark123mark.mods.transcraft.Transcraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;


public class EnderSword extends ItemSword 
{
	public EnderSword(int par1, EnumToolMaterial par2EnumToolMaterial) 
	{
		super(par1, par2EnumToolMaterial);
	}
    
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		 itemIcon = par1IconRegister.registerIcon("Transcraft:EnderSword");
	}
	
    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.block;
    }
    
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer , int x, int y, int z, int side)
    {
		
			if (par3EntityPlayer.ridingEntity != null)
	        {
	            return par1ItemStack;
	        }
	         
	         if (par3EntityPlayer.isSneaking())
	         {
	        	 par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
	             
	        	 return par1ItemStack;
	         }
	         par2World.playSoundAtEntity(par3EntityPlayer, "mob.endermen.portal", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	                 
	                 if (!par2World.isRemote)
	                 {
	                	 par2World.spawnEntityInWorld(new EntityEnderPearl(par2World, par3EntityPlayer));
	                     
	                     return par1ItemStack;
	            }
	                 
	                 
			return par1ItemStack;
		
    }
	

	
	
	
    @Override
	@SideOnly(Side.CLIENT)
	public void addInformation (ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		list.add("Try right clicking!");
	}
	

}
