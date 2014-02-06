package modmuss50.mods.transcraft.TileEntitys.ItemGrinder;

import modmuss50.mods.transcraft.Items.TranscraftItems;
import modmuss50.mods.transcraft.helpers.Config;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileIXP extends TileEntity implements IInventory, ISidedInventory {

	public int field_145987_o;

	private ItemStack[] chestContents = new ItemStack[36];
	private static final int[] slots_top = new int[] { 0 };
	private static final int[] slots_bottom = new int[] { 2, 1 };
	private static final int[] slots_sides = new int[] { 1 };

	/** The current angle of the lid (between 0 and 1) */
	public float lidAngle;

	public double CurrentIXPValue = 0;
	public double CurrnetMaxValue = 0;
	public int CurrentintIXPValue = 0;
	public int CurrnetintMaxValue = 0;

	/** The angle of the lid last tick */
	public float prevLidAngle;

	/** The number of players currently using this chest */
	public int numUsingPlayers;

	/** Server sync counter (once per 20 ticks) */
	private int ticksSinceSync;
	private int field_94046_i;
	private String field_94045_s;

	public TileIXP() {
		this.field_94046_i = -1;
	}

	@SideOnly(Side.CLIENT)
	public TileIXP(int par1) {
		this.field_94046_i = par1;
	}

	/**
	 * Returns the number of slots in the inventory.
	 */
	public int getSizeInventory() {
		return chestContents.length;
	}

	/**
	 * 
	 * @param i
	 *            How much to increase the IXP Value by
	 */
	public void incIXP() {
		CurrentIXPValue = CurrentIXPValue + 0.125;

	}

	/**
	 * 
	 * @param i
	 *            How much to increase the IXP Value by
	 */
	public void incIXP(int am) {
		CurrentIXPValue = CurrentIXPValue + am;
	}

	/**
	 * Returns the stack in slot i
	 */
	public ItemStack getStackInSlot(int par1) {
		return par1 >= this.chestContents.length ? null
				: this.chestContents[par1];
	}

	/**
	 * Removes from an inventory slot (first arg) up to a specified number
	 * (second arg) of items and returns them in a new stack.
	 */
	public ItemStack decrStackSize(int par1, int par2) {
		if (this.chestContents[par1] != null) {
			ItemStack itemstack;

			if (this.chestContents[par1].stackSize <= par2) {
				itemstack = this.chestContents[par1];
				this.chestContents[par1] = null;
				this.onInventoryChanged();
				return itemstack;
			} else {
				itemstack = this.chestContents[par1].splitStack(par2);

				if (this.chestContents[par1].stackSize == 0) {
					this.chestContents[par1] = null;
				}

				this.onInventoryChanged();
				return itemstack;
			}
		} else {
			return null;
		}
	}

	/**
	 * Removes from an inventory slot (first arg) up to a specified number
	 * (second arg) of items and returns them in a new stack.
	 */
	public ItemStack incrStackSize(int par1, int par2) {
		if (this.chestContents[par1] != null) {
			if (this.chestContents[par1].stackSize < 64) {
				ItemStack i;
				ItemStack newI;

				i = chestContents[par1];
				newI = i;

				newI.stackSize = i.stackSize + 1;

				return newI;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * When some containers are closed they call this on each slot, then drop
	 * whatever it returns as an EntityItem - like when you close a workbench
	 * GUI.
	 */
	public ItemStack getStackInSlotOnClosing(int par1) {
		if (this.chestContents[par1] != null) {
			ItemStack itemstack = this.chestContents[par1];
			this.chestContents[par1] = null;
			return itemstack;
		} else {
			return null;
		}
	}

	public void setInventorySlotContents(int par1, ItemStack par2ItemStack) {
		if (par1 < this.chestContents.length) {
			this.chestContents[par1] = par2ItemStack;

			if (par2ItemStack != null
					&& par2ItemStack.stackSize > this.getInventoryStackLimit()) {
				par2ItemStack.stackSize = this.getInventoryStackLimit();
			}

			this.onInventoryChanged();
		}
	}

	/**
	 * Returns the name of the inventory.
	 */
	public String getInvName() {
		return this.isInvNameLocalized() ? this.field_94045_s
				: "container.chest";
	}

	/**
	 * If this returns false, the inventory name will be used as an unlocalized
	 * name, and translated into the player's language. Otherwise it will be
	 * used directly.
	 */
	public boolean isInvNameLocalized() {
		return this.field_94045_s != null && this.field_94045_s.length() > 0;
	}

	/**
	 * Sets the custom display name to use when opening a GUI for this specific
	 * TileEntityChest.
	 */
	public void setChestGuiName(String par1Str) {
		this.field_94045_s = par1Str;
	}

	@Override
	/**
	 * Reads a tile entity from NBT.
	 */
	public void func_145839_a(NBTTagCompound par1NBTTagCompound) {
		super.func_145839_a(par1NBTTagCompound);
		NBTTagList nbttaglist = par1NBTTagCompound.func_150295_c("Items", 10);
		this.chestContents = new ItemStack[this.getSizeInventory()];

		System.out.println("READING TILE");

		if (par1NBTTagCompound.hasKey("CustomName")) {
			this.field_94045_s = par1NBTTagCompound.getString("CustomName");
		}

		for (int i = 0; i < nbttaglist.tagCount(); ++i) {
			NBTTagCompound nbttagcompound1 = (NBTTagCompound) nbttaglist
					.func_150305_b(i);
			int j = nbttagcompound1.getByte("Slot") & 255;

			if (j >= 0 && j < this.chestContents.length) {
				this.chestContents[j] = ItemStack
						.loadItemStackFromNBT(nbttagcompound1);
			}
		}

		this.CurrentIXPValue = par1NBTTagCompound.getDouble("ItemEssence");
		System.out.println(par1NBTTagCompound.getDouble("ItemEssence"));

		System.out.println(par1NBTTagCompound.getDouble("ItemEssence"));

	}

	public double getIXPValue() {
		return this.CurrentIXPValue;
	}

	public double getCurrnetMaxValue() {
		return this.CurrnetMaxValue;
	}

	@Override
	/**
	 * Writes a tile entity to NBT.
	 */
	public void func_145841_b(NBTTagCompound par1NBTTagCompound) {
		super.func_145841_b(par1NBTTagCompound);
		NBTTagList nbttaglist = new NBTTagList();

		System.out.println("SAVING TILE");

		par1NBTTagCompound.setDouble("ItemEssence", this.CurrentIXPValue);
		System.out.println(par1NBTTagCompound.getDouble("ItemEssence"));

		for (int i = 0; i < this.chestContents.length; ++i) {
			if (this.chestContents[i] != null) {
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				this.chestContents[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}

		par1NBTTagCompound.setTag("Items", nbttaglist);

		if (this.isInvNameLocalized()) {
			par1NBTTagCompound.setString("CustomName", this.field_94045_s);
		}
	}

	/**
	 * Returns the maximum stack size for a inventory slot. Seems to always be
	 * 64, possibly will be extended. *Isn't this more of a set than a get?*
	 */
	public int getInventoryStackLimit() {
		return 64;
	}

	/**
	 * Do not make give this method the name canInteractWith because it clashes
	 * with Container
	 */

	public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer) {
		return this.field_145850_b.func_147438_o(this.field_145851_c,
				this.field_145848_d, this.field_145849_e) != this ? false
				: par1EntityPlayer.getDistanceSq(
						(double) this.field_145851_c + 0.5D,
						(double) this.field_145848_d + 0.5D,
						(double) this.field_145849_e + 0.5D) <= 64.0D;
	}

	/**
	 * Causes the TileEntity to reset all it's cached values for it's container
	 * block, blockID, metaData and in the case of chests, the adjcacent chest
	 * check
	 */

	public void func_145836_u() {
		super.func_145836_u();
	}

	private void handleEnergy() {
		int slot = 1;

		for (int j = 0; slot < 28; slot++) {
			if (getStackInSlot(slot) != null) {
				int IXP = 1;
				CurrentIXPValue = CurrentIXPValue + IXP;
				decrStackSize(slot, 1);
			}
		}
	}

	private void makeItems() {
		int slot = 0;
		int mainSlot = 1;

		int BASIC = Config.BasicItemEssence;
		int QUAD = Config.QuadItemEssence;
		int NANO = Config.NanoItemEssence;

		if (BASIC == 0) {
			BASIC = BASIC + 1;
		}

		if (QUAD == 0) {
			QUAD = QUAD + 1;
		}

		if (NANO == 0) {
			NANO = NANO + 1;
		}

		if (getStackInSlot(0) != null) {
			if (getStackInSlot(0).getItem() == TranscraftItems.BasicTransmuter) {
				CurrnetMaxValue = BASIC;
				CurrnetintMaxValue = BASIC;

				if (BASIC != 0 && getStackInSlot(0).stackSize <= 64) {
					if (CurrentIXPValue >= BASIC) {
						CurrentIXPValue -= BASIC;
						incrStackSize(0, 1);

					}
				}
			}

			if (getStackInSlot(0).getItem() == TranscraftItems.QuadTransmuter) {
				CurrnetMaxValue = QUAD;
				CurrnetintMaxValue = QUAD;

				if (QUAD != 0 && getStackInSlot(0).stackSize <= 64) {
					if (CurrentIXPValue >= QUAD) {
						CurrentIXPValue -= QUAD;
						incrStackSize(0, 1);

					}
				}
			}

			if (getStackInSlot(0).getItem() == TranscraftItems.NanoTransmuter) {
				CurrnetMaxValue = NANO;
				CurrnetintMaxValue = QUAD;

				if (NANO != 0 && getStackInSlot(0).stackSize <= 64) {
					if (CurrentIXPValue >= NANO) {
						CurrentIXPValue -= NANO;
						incrStackSize(0, 1);

					}
				}
			}
		} else {
			CurrnetMaxValue = 0;
		}
	}

	/**
	 * Allows the entity to update its state. Overridden in most subclasses,
	 * e.g. the mob spawner uses this to count ticks and creates a new spawn
	 * inside its implementation.
	 */

	public void func_145845_h() {
		super.func_145845_h();

		handleEnergy();

		makeItems();
		++this.ticksSinceSync;

	}

	/**
	 * Called when a client event is received with the event number and
	 * argument, see World.sendClientEvent
	 */
	public boolean receiveClientEvent(int par1, int par2) {
		if (par1 == 1) {
			this.numUsingPlayers = par2;
			return true;
		} else {
			return super.func_145842_c(par1, par2);
		}
	}

	public void openChest() {
		if (this.numUsingPlayers < 0) {
			this.numUsingPlayers = 0;
		}

		++this.numUsingPlayers;
		this.field_145850_b.func_147452_c(this.field_145851_c,
				this.field_145848_d, this.field_145849_e, this.func_145838_q(),
				1, this.field_145987_o);
		this.field_145850_b.func_147459_d(this.field_145851_c,
				this.field_145848_d, this.field_145849_e, this.func_145838_q());
		this.field_145850_b.func_147459_d(this.field_145851_c,
				this.field_145848_d - 1, this.field_145849_e,
				this.func_145838_q());

	}

	public void closeChest() {
		if (this.func_145838_q() instanceof IXPGrinderMk2) {
			--this.numUsingPlayers;
			this.field_145850_b.func_147452_c(this.field_145851_c,
					this.field_145848_d, this.field_145849_e,
					this.func_145838_q(), 1, this.field_145987_o);
			this.field_145850_b.func_147459_d(this.field_145851_c,
					this.field_145848_d, this.field_145849_e,
					this.func_145838_q());
			this.field_145850_b.func_147459_d(this.field_145851_c,
					this.field_145848_d - 1, this.field_145849_e,
					this.func_145838_q());
		}

	}

	/**
	 * Returns true if automation is allowed to insert the given stack (ignoring
	 * stack size) into the given slot.
	 */
	public boolean isItemValidForSlot(int par1, ItemStack par2ItemStack) {
		return true;
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int var1) {
		return var1 == 0 ? slots_bottom : (var1 == 1 ? slots_top : slots_sides);
	}

	@Override
	public boolean canInsertItem(int var1, ItemStack var2, int var3) {
		if (var1 == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean canExtractItem(int var1, ItemStack var2, int var3) {
		if (var1 == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String func_145825_b() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean func_145818_k_() {
		// TODO Auto-generated method stub
		return true;
	}

	

}
