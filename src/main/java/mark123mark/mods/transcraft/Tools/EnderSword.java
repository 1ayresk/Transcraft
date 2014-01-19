package mark123mark.mods.transcraft.Tools;

import java.util.List;

import mark123mark.mods.transcraft.helpers.Config;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EnderSword extends ItemSword {

	public EnderSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
	}

	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("Transcraft:EnderSword");
	}

	/**
	 * returns the action that specifies what animation to play when the items
	 * is being used
	 */
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.block;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,EntityPlayer par3EntityPlayer) {
		
		if(Config.enderswordpearl == true)
		{
			if (par3EntityPlayer.isSneaking()) 
			{
				par3EntityPlayer.setItemInUse(par1ItemStack,this.getMaxItemUseDuration(par1ItemStack));
				return par1ItemStack;
			} 
			
			else 
			{
				if(par3EntityPlayer.username.contains("mark123mark") || par3EntityPlayer.username.contains("tattyseal")|| par3EntityPlayer.username.contains("shifu_"))
				{
					par3EntityPlayer.playSound("transcraft:bassDrop", 10F, 1F);
				}
				else
				{
					par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F,0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
				}
		
				if (!par2World.isRemote) {
					par2World.spawnEntityInWorld(new EntityEnderPearl(par2World,par3EntityPlayer));
				}
			}
		}
		else
		{
			par3EntityPlayer.setItemInUse(par1ItemStack,this.getMaxItemUseDuration(par1ItemStack));
		}
		return par1ItemStack;

	}


	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list,
			boolean par4) {
		
		
		if(Config.enderswordpearl == true)
		{
			if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
	        {
				list.add("Right click to throw an ender peral");
	        }
			else
			{
				list.add("\u00a72[\u00a74SHIFT\u00a72]");
			}
		}
	}
	
	@Override
    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
		par3EntityLivingBase.playSound("transcraft:swordHit", 10F, 1F);
        par1ItemStack.damageItem(1, par3EntityLivingBase);
        return true;
    }

}
