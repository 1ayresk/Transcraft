package mark123mark.mods.transcraft.Items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class EnderSword extends ItemSword
{
	public EnderSword(int id, EnumToolMaterial EnumToolMaterial)
	{
		super(id, EnumToolMaterial);
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
