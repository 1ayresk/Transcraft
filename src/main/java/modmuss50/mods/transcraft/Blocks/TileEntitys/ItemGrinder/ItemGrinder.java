package modmuss50.mods.transcraft.Blocks.TileEntitys.ItemGrinder;

import java.util.Iterator;
import java.util.Random;

import modmuss50.mods.transcraft.Transcraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGrinder extends BlockContainer {

	private final Random field_149955_b = new Random();

	/** Determines whether of not the chest is trapped. */

	public final int isTrapped;

	public ItemGrinder(int par2) {
		super(Material.anvil);
		this.isTrapped = par2;
		this.setCreativeTab(Transcraft.Transtab);
	}

	/**
	 * Called when the block is placed in the world.
	 */

	public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_,
			int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_,
			ItemStack p_149689_6_) {
		Block block = p_149689_1_.getBlock(p_149689_2_, p_149689_3_,
				p_149689_4_ - 1);
		Block block1 = p_149689_1_.getBlock(p_149689_2_, p_149689_3_,
				p_149689_4_ + 1);
		Block block2 = p_149689_1_.getBlock(p_149689_2_ - 1, p_149689_3_,
				p_149689_4_);
		Block block3 = p_149689_1_.getBlock(p_149689_2_ + 1, p_149689_3_,
				p_149689_4_);
		byte b0 = 0;
		int l = MathHelper
				.floor_double((double) (p_149689_5_.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

		if (l == 0) {
			b0 = 2;
		}

		if (l == 1) {
			b0 = 5;
		}

		if (l == 2) {
			b0 = 3;
		}

		if (l == 3) {
			b0 = 4;
		}

		if (block != this && block1 != this && block2 != this && block3 != this) {
			p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_,
					p_149689_4_, b0, 3);
		} else {
			if ((block == this || block1 == this) && (b0 == 4 || b0 == 5)) {
				if (block == this) {
					p_149689_1_.setBlockMetadataWithNotify(p_149689_2_,
							p_149689_3_, p_149689_4_ - 1, b0, 3);
				} else {
					p_149689_1_.setBlockMetadataWithNotify(p_149689_2_,
							p_149689_3_, p_149689_4_ + 1, b0, 3);
				}

				p_149689_1_.setBlockMetadataWithNotify(p_149689_2_,
						p_149689_3_, p_149689_4_, b0, 3);
			}

			if ((block2 == this || block3 == this) && (b0 == 2 || b0 == 3)) {
				if (block2 == this) {
					p_149689_1_.setBlockMetadataWithNotify(p_149689_2_ - 1,
							p_149689_3_, p_149689_4_, b0, 3);
				} else {
					p_149689_1_.setBlockMetadataWithNotify(p_149689_2_ + 1,
							p_149689_3_, p_149689_4_, b0, 3);
				}

				p_149689_1_.setBlockMetadataWithNotify(p_149689_2_,
						p_149689_3_, p_149689_4_, b0, 3);
			}
		}

		if (p_149689_6_.hasDisplayName()) {
			((TileEntityChest) p_149689_1_.getTileEntity(p_149689_2_,
					p_149689_3_, p_149689_4_)).func_145976_a(p_149689_6_
					.getDisplayName());
		}
	}

	/**
	 * ejects contained items into the world, and notifies neighbours of an
	 * update, as appropriate
	 */

	public void func_149749_a(World p_149749_1_, int p_149749_2_,
			int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
		ItemGrinderTile tileentitychest = (ItemGrinderTile) p_149749_1_.getTileEntity(
				p_149749_2_, p_149749_3_, p_149749_4_);

		if (tileentitychest != null) {
			for (int i1 = 0; i1 < tileentitychest.getSizeInventory(); ++i1) {
				ItemStack itemstack = tileentitychest.getStackInSlot(i1);

				if (itemstack != null) {
					float f = this.field_149955_b.nextFloat() * 0.8F + 0.1F;
					float f1 = this.field_149955_b.nextFloat() * 0.8F + 0.1F;
					EntityItem entityitem;

					for (float f2 = this.field_149955_b.nextFloat() * 0.8F + 0.1F; itemstack.stackSize > 0; p_149749_1_
							.spawnEntityInWorld(entityitem)) {
						int j1 = this.field_149955_b.nextInt(21) + 10;

						if (j1 > itemstack.stackSize) {
							j1 = itemstack.stackSize;
						}

						itemstack.stackSize -= j1;
						entityitem = new EntityItem(p_149749_1_,
								(double) ((float) p_149749_2_ + f),
								(double) ((float) p_149749_3_ + f1),
								(double) ((float) p_149749_4_ + f2),
								new ItemStack(itemstack.getItem(), j1,
										itemstack.getItemDamage()));
						float f3 = 0.05F;
						entityitem.motionX = (double) ((float) this.field_149955_b
								.nextGaussian() * f3);
						entityitem.motionY = (double) ((float) this.field_149955_b
								.nextGaussian() * f3 + 0.2F);
						entityitem.motionZ = (double) ((float) this.field_149955_b
								.nextGaussian() * f3);

						if (itemstack.hasTagCompound()) {
							entityitem.getEntityItem().setTagCompound(
									(NBTTagCompound) itemstack.getTagCompound()
											.copy());
						}
					}
				}
			}

			p_149749_1_.func_147453_f(p_149749_2_, p_149749_3_, p_149749_4_,
					p_149749_5_);
		}
	}

	/**
	 * Called upon block activation (right click on the block.)
	 */
	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4,
			EntityPlayer par5EntityPlayer, int par6, float par7, float par8,
			float par9) {

		ItemGrinderTile tile = (ItemGrinderTile) par1World.getTileEntity(par2, par3, par4);

		par1World.markTileEntityChunkModified(par2, par3, par4, tile);

		if (par1World.isRemote) {
			return true;
		} else {
			IInventory iinventory = this.func_149951_m(par1World, par2, par3,
					par4);

			System.out.println(iinventory);

			if (iinventory != null) {
				if (!par5EntityPlayer.isSneaking()) {
					par5EntityPlayer.openGui(Transcraft.instance, 2, par1World,
							par2, par3, par4);
				}

			}

			return true;
		}

	}

	/**
	 * Gets the inventory of the chest at the specified coords, accounting for
	 * blocks or ocelots on top of the chest, and double chests.
	 */

	public IInventory func_149951_m(World p_149951_1_, int p_149951_2_,
			int p_149951_3_, int p_149951_4_) {
		Object object = (ItemGrinderTile) p_149951_1_.getTileEntity(p_149951_2_,
				p_149951_3_, p_149951_4_);

		return (IInventory) object;
	}

	/**
	 * Returns a new instance of a block's tile entity class. Called on placing
	 * the block.
	 */
	public TileEntity createNewTileEntity(World par1World) {
		return new ItemGrinderTile();
	}

	/**
	 * If this returns true, then comparators facing away from this block will
	 * use the value from getComparatorInputOverride instead of the actual
	 * redstone signal strength.
	 */
	public boolean hasComparatorInputOverride() {
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		// TODO Auto-generated method stub
		return new ItemGrinderTile();
	}

	/**
	 * When this method is called, your block should register all the icons it
	 * needs with the given IconRegister. This is the only chance you get to
	 * register icons.
	 */
	
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon("trancraft:ItemGrinder");
    }

	private static boolean func_149953_o(World p_149953_0_, int p_149953_1_,
			int p_149953_2_, int p_149953_3_) {
		Iterator iterator = p_149953_0_.getEntitiesWithinAABB(
				EntityOcelot.class,
				AxisAlignedBB.getAABBPool().getAABB((double) p_149953_1_,
						(double) (p_149953_2_ + 1), (double) p_149953_3_,
						(double) (p_149953_1_ + 1), (double) (p_149953_2_ + 2),
						(double) (p_149953_3_ + 1))).iterator();
		EntityOcelot entityocelot1;

		do {
			if (!iterator.hasNext()) {
				return false;
			}

			EntityOcelot entityocelot = (EntityOcelot) iterator.next();
			entityocelot1 = (EntityOcelot) entityocelot;
		} while (!entityocelot1.isSitting());

		return true;
	}

}
