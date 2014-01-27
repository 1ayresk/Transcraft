package modmuss50.mods.transcraft.Blocks;

import java.util.List;
import java.util.Random;

import javax.swing.Icon;

import modmuss50.mods.transcraft.Renders.particles.FXSparkleRun;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TranscraftOre extends Block {

	public static String[] types = { "Transmutter", "Chromite", "Vanadium",
			"Zirconium", "Ultimatium", "Cosmonite" };

	private static IIcon[] icons = new IIcon[types.length];

	public TranscraftOre() {
		super(Material.field_151574_g);
	}

	private int nextNum;

	@Override
	public String func_149739_a() {
		return "ore_" + nextNum;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon func_149691_a(int side, int meta) {

		for(int i = 5; i >= 0; i--)
		{
			return icons[meta];
		}

		return null;
	}

	 
	
	@Override
	@SideOnly(Side.CLIENT)
	public void func_149651_a(IIconRegister icon) {
		for (int i = 0; i < types.length; i++) {
			String type = types[i].toLowerCase();
			icons[i] = icon.registerIcon("transcraft:ores/ore_" + type);
		}
	}
	
	

	@Override
	@SideOnly(Side.CLIENT)
    public void func_149666_a(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        for (int i = 0; i < 5; ++i)
        {
            p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));
        }
    }
	
	
	
	
	
	@Override
	public int func_149692_a(int metadata)
	{
		return metadata;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void func_149734_b(World par1World, int par2, int par3,int par4, Random par5Random) {
		FXSparkleRun.randomDisplayTick(par1World, par2, par3, par4, par5Random);
	}

}
