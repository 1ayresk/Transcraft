/**
 * This class is part of the mod Transcraft. 
 * 
 * Transcraft is Open Source but you cant use any code without permission!
 * 
 */

package modmuss50.mods.transcraft.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ICloulouredGlassPane extends BlockPane {

	public static String[] types = { "Transmutter", "Chromite", "Vanadium",
			"Zirconium" };

	/***
	 * 
	 * @param id
	 *            Block ID
	 * 
	 */
	public ICloulouredGlassPane(int id) {
		super(id, "transcraft:ClearGlass", "transcraft:ClearGlass",
				Material.glass, true);
		setHardness(3.0F);
		setResistance(4.0F);
	}

	/***
	 * 
	 * @param id
	 *            Block ID
	 * @param m
	 *            Material
	 * 
	 */
	public ICloulouredGlassPane(int id, Material m) {
		super(id, "transcraft:ClearGlass", "transcraft:ClearGlass",
				Material.glass, true);
		setHardness(3.0F);
		setResistance(4.0F);
	}

	@Override
	public boolean shouldSideBeRendered(IBlockAccess access, int par0,
			int par1, int par2, int par3) {
		return true;

	}

	public void addInformation(int i, int j, List l) {

	}

	/***
	 * Get's the color from the metadata.
	 */
	public int colorMultiplier(IBlockAccess i, int x, int y, int z) {
		switch (i.getBlockMetadata(x, y, z)) {
		case 15:
			return 0xFFFFFF;
		case 14:
			return 0xFF9900;
		case 13:
			return 0xCC00CC;
		case 12:
			return 0x6699FF;
		case 11:
			return 0xFFFF00;
		case 10:
			return 0x99CC00;
		case 9:
			return 0xFF66FF;
		case 8:
			return 0x585858;
		case 7:
			return 0xA8A8A8;
		case 6:
			return 0x00CC99;
		case 5:
			return 0x990066;
		case 4:
			return 0x3333CC;
		case 3:
			return 0x663300;
		case 2:
			return 0x336600;
		case 1:
			return 0xCC0000;
		case 0:
			return 0x383838;
		default:
			return 0xFFFFFF;
		}
	}

	/***
	 * Get's the color from the metadata.
	 */
	public int getRenderColor(int i) {
		switch (i) {
		case 15:
			return 0xFFFFFF;
		case 14:
			return 0xFF9900;
		case 13:
			return 0xCC00CC;
		case 12:
			return 0x6699FF;
		case 11:
			return 0xFFFF00;
		case 10:
			return 0x99CC00;
		case 9:
			return 0xFF66FF;
		case 8:
			return 0x585858;
		case 7:
			return 0xA8A8A8;
		case 6:
			return 0x00CC99;
		case 5:
			return 0x990066;
		case 4:
			return 0x3333CC;
		case 3:
			return 0x663300;
		case 2:
			return 0x336600;
		case 1:
			return 0xCC0000;
		case 0:
			return 0x383838;
		default:
			return 0xFFFFFF;
		}
	}

	/***
	 * Get's block dropped from metadata.
	 */
	public int damageDropped(int metadata) {
		return metadata;
	}

	/***
	 * Get's the block dropped from ID.
	 */
	public int idDropped(int i, Random r, int j) {
		return blockID;
	}

	/***
	 * Get's the color from the metadata and ID.
	 */
	public ArrayList<ItemStack> getBlockDropped(World w, int x, int y, int z,
			int metadata, int fortune) {
		ArrayList<ItemStack> list = new ArrayList<ItemStack>();

		list.add(new ItemStack(blockID, 1, metadata));

		return list;
	}

	/***
	 * Adds the blocks to the creative tab.
	 */
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int unknown, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 16; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}

	public boolean onBlockActivated(World w, int x, int y, int z,
			EntityPlayer p, int i, float f, float f1, float f2) {
		if (p.getHeldItem() != null
				&& p.getHeldItem().getItem() == Item.dyePowder) {
			w.setBlockMetadataWithNotify(x, y, z, p.getHeldItem()
					.getItemDamage(), 3);
			w.markBlockForUpdate(x, y, z);
			w.markBlockForRenderUpdate(x, y, z);
			return true;
		} else {
			return false;
		}
	}

}
