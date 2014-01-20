package modmuss50.mods.transcraft.Blocks;

import java.util.List;

import modmuss50.mods.transcraft.TranscraftClientProxy;
import modmuss50.mods.transcraft.Renders.particles.FXSparkle;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

public class TranscraftOre extends Block {

	public static String[] types = {"Transmutter", "Chromite", "Vanadium", "Zirconium" , "Ultimatium", "Cosmonite"};
	
	
	private static Icon[] icons = new Icon[types.length];
	
	public TranscraftOre(int par1) {
		super(par1, Material.rock);
	}

	private int nextNum;
	
	@Override
	public String getUnlocalizedName() {
		return "ore_" + nextNum;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
			return icons[meta];
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		for(int i = 0; i < types.length; i++) {
			String type = types[i].toLowerCase();
			icons[i] = icon.registerIcon("transcraft:ores/ore_" + type);
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int id, CreativeTabs tab, List list) {
		for(int i = 0; i < types.length; i++) {
			list.add(new ItemStack(id, 1, i));
		}
	}
	
	@Override
	public int damageDropped(int dmg) {
		return dmg;
	}

	 @Override
     public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {        
            
		 FXSparkle sparkle = new FXSparkle(par1World, par2 + 0.3 + par5Random.nextFloat() * 0.5, par3 + 0.5 + par5Random.nextFloat() * 0.5, par4 + 0.3 + par5Random.nextFloat() * 0.5, par5Random.nextFloat(), 5);
         Minecraft.getMinecraft().effectRenderer.addEffect(sparkle);
		 
		 
		// TranscraftClientProxy.sparkleFX(par1World, par2 + 0.3 + par5Random.nextFloat() * 0.5, par3 + 0.5 + par5Random.nextFloat() * 0.5, par4 + 0.3 + par5Random.nextFloat() * 0.5, par5Random.nextFloat(), 5);
     }
	
	
}
