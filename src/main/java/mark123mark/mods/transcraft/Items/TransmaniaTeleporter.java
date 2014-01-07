package mark123mark.mods.transcraft.Items;

import mark123mark.mods.transcraft.TransDim.DimTp;
import mark123mark.mods.transcraft.helpers.Config;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
 
public class TransmaniaTeleporter extends Item{

	public TransmaniaTeleporter(int id)
	{
		super(id);
		maxStackSize = 1;
		setUnlocalizedName("TransmaniaTeleporter");
	}
	
	@Override
	public void registerIcons(IconRegister par1IconRegister) 
	{
		itemIcon = par1IconRegister.registerIcon("Transcraft:TransmaniaTeleporter");
		
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2world, EntityPlayer par3EntityPlayer)
	{
		EntityPlayerMP thePlayer =(EntityPlayerMP) par3EntityPlayer;
	
		if(par3EntityPlayer.ridingEntity == null && par3EntityPlayer.riddenByEntity == null)
		{
			if(par3EntityPlayer.dimension != Config.DimID)
			{
				thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, Config.DimID, new DimTp(thePlayer.mcServer.worldServerForDimension(Config.DimID)));
			}
		}
		else
		{
			thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, Config.DimID, new DimTp(thePlayer.mcServer.worldServerForDimension(0)));
		}
		return par1ItemStack;
		
	}
}
