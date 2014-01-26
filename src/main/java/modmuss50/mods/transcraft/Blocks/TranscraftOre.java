package modmuss50.mods.transcraft.Blocks;

import java.util.List;
import java.util.Random;

import javax.swing.Icon;

import modmuss50.mods.transcraft.Renders.particles.FXSparkleRun;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TranscraftOre extends Block {

	public static String[] types = { "Transmutter", "Chromite", "Vanadium",
			"Zirconium", "Ultimatium", "Cosmonite" };

	private static Icon[] icons = new Icon[types.length];

	public TranscraftOre(int par1) {
		super(Material.field_151574_g);
	}

	private int nextNum;

	@Override
	public String func_149739_a() {
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
		for (int i = 0; i < types.length; i++) {
			String type = types[i].toLowerCase();
			icons[i] = icon.registerIcon("transcraft:ores/ore_" + type);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int id, CreativeTabs tab, List list) {
		for (int i = 0; i < types.length; i++) {
			list.add(new ItemStack(id, 1, i));
		}
	}

	@Override
	public int damageDropped(int dmg) {
		return dmg;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(World par1World, int par2, int par3,int par4, Random par5Random) {
		FXSparkleRun.randomDisplayTick(par1World, par2, par3, par4, par5Random);
	}

}
