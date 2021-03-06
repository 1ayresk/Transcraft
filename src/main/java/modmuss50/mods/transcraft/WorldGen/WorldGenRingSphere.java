package modmuss50.mods.transcraft.WorldGen;

import java.util.Random;

import modmuss50.mods.transcraft.Items.TranscraftItems;
import modmuss50.mods.transcraft.helpers.Config;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLLog;

public class WorldGenRingSphere extends WorldGenHelper {

	public WorldGenRingSphere(World worldObj, Random rand) {
		super(worldObj, rand);
	}

	@Override
	public void generate(int i, int j, int k) {

		FMLLog.info("[TRANSCRAFT]	GENERATING RingSphere!");
		// MinecraftServer.getServer().getConfigurationManager().sendChatMsg(ChatMessageComponent.func_111082_b("Someone has found a mystical secret!"));

		int height = +rand.nextInt(30) + 10;

		j = getTerrainHeightAt(i, k);
		if (rand.nextInt(6) != 0) {
			j += height;
		}

		int ringSize = height / 3 + rand.nextInt(6);

		genCircle(i, j, k, Config.DriedTransmutterID, 0, ringSize,
				ringSize - 1.5F, 0, true);
		genCircle(i, j, k, Config.DriedTransmutterID, 0, ringSize,
				ringSize - 1.5F, 1, true);
		genCircle(i, j, k, Config.DriedTransmutterID, 0, ringSize,
				ringSize - 1.5F, 2, true);

		int halfRingSize = ringSize / 2;
		placeBlockWithNotify(i - halfRingSize, j, k - halfRingSize,
				Config.LiquidTransmutterFluidStillID, 0);
		placeBlockWithNotify(i - halfRingSize, j, k + halfRingSize,
				Config.LiquidTransmutterFluidStillID, 0);
		placeBlockWithNotify(i + halfRingSize, j, k + halfRingSize,
				Config.LiquidTransmutterFluidStillID, 0);
		placeBlockWithNotify(i + halfRingSize, j, k - halfRingSize,
				Config.LiquidTransmutterFluidStillID, 0);

		j += ringSize;

		placeBlock(i, j, k, Block.chest.blockID, 0);

		TileEntityChest chest = (TileEntityChest) worldObj.getBlockTileEntity(
				i, j, k);
		if (chest != null) {
			int amountOfItem = 3 + rand.nextInt(4);
			for (int a = 0; a < amountOfItem; a++) {
				chest.setInventorySlotContents(
						rand.nextInt(chest.getSizeInventory()), getItem());
			}
		}
	}

	private ItemStack getItem() {
		switch (rand.nextInt(10)) {
		case 0:
			return new ItemStack(Item.appleRed, rand.nextInt(5) + 2, 0);
		case 1:
			return new ItemStack(Item.appleGold, 1, 0);
		case 2:
			return new ItemStack(Item.arrow, rand.nextInt(30) + 25, 0);
		case 3:
			return new ItemStack(Item.saddle, 1, 0);
		case 4:
			return new ItemStack(Item.pocketSundial, 1, 0);
		case 5:
			return new ItemStack(Item.bootsChain, 1, 0);
		case 6:
			return new ItemStack(Item.plateChain, 1, 0);
		case 7:
			return new ItemStack(Item.eyeOfEnder, rand.nextInt(5) + 2, 0);
		case 8:
			return new ItemStack(TranscraftItems.QuadTransmuter,
					rand.nextInt(2) + 2, 0);
		case 9:
			return new ItemStack(TranscraftItems.BasicTransmuter,
					rand.nextInt(6) + 2, 0);
		case 10:
			return new ItemStack(TranscraftItems.NanoTransmuter,
					rand.nextInt(1) + 1, 0);
		default:
			return new ItemStack(Item.porkCooked, rand.nextInt(5) + 2, 0);
		}
	}

}
