package modmuss50.mods.transcraft.Blocks.ComOres;

import java.util.Random;

import modmuss50.mods.transcraft.Renders.particles.FXSparkleRun;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ComTransmutterOre extends Block {
	public ComTransmutterOre(int par1) {
		super(par1, Material.rock);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(World par1World, int par2, int par3,int par4, Random par5Random) {
		FXSparkleRun.randomDisplayTick(par1World, par2, par3, par4, par5Random);
	}
	
	
}
