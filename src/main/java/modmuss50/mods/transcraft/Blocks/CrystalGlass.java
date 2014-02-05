package modmuss50.mods.transcraft.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CrystalGlass extends org.zaet.api.IColoredBlock {

	public static String texName;

	public CrystalGlass() {
		super();
	}

	@Override
	@SideOnly(Side.CLIENT)
	/**
	 * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
	 */
	public int func_149701_w() {
		return 0;
	}

	/**
	 * Is this block (a) opaque and (b) a full 1m cube? This determines whether
	 * or not to render the shared face of two adjacent blocks and also whether
	 * the player can attach torches, redstone wire, etc to this block.
	 */
	@Override
	public boolean func_149662_c() {
		return false;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False
	 * (examples: signs, buttons, stairs, etc)
	 */
	@Override
	public boolean func_149686_d() {
		return false;
	}

	/*
	 * 
	 * 
	 * @Override public boolean shouldSideBeRendered(IBlockAccess
	 * par1IBlockAccess, int par2, int par3, int par4, int par5) // Renders //
	 * blocks { int i = par1IBlockAccess.getBlockId(par2, par3, par4);
	 * 
	 * return i == blockID ? false : true; }
	 */

}
