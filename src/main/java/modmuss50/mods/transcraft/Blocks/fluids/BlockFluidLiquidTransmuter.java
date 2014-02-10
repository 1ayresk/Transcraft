package modmuss50.mods.transcraft.Blocks.fluids;

import java.util.Random;

import javax.swing.Icon;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFluidLiquidTransmuter extends BlockFluidClassic {

	public static IIcon StillIcon;
	public static IIcon FlowingIcon;

	public BlockFluidLiquidTransmuter(String fluidName) {
		super(new LiquidTransmutterFluid("LiquidTransmutterFluid"), Material.water);

	}


	@Override
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		StillIcon = iconRegister.registerIcon("transcraft:transmutter_liquid_still");
		FlowingIcon = iconRegister.registerIcon("transcraft:transmutter_liquid_flowing");
	}

	

	@Override
	public IIcon getIcon(int side, int meta)
	{
		return side != 0 && side != 1 ? FlowingIcon : StillIcon;
	}

}
