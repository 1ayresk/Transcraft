package modmuss50.mods.transcraft.WorldGen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import cpw.mods.fml.common.FMLLog;

public class WorldGenRings extends WorldGenHelper {

	public WorldGenRings(World worldObj, Random rand) {
		super(worldObj, rand);
	}

	@Override
	public void generate(int i, int j, int k) {
		FMLLog.info("[TRANSCRAFT]	GENERATING Rings!");

		j = getTerrainHeightAt(i, k);

		if (rand.nextInt(4) == 0) {
			j += rand.nextInt(20) + 10;
		}

		int numberOfRings = rand.nextInt(4) + 4;

		int ringSize = numberOfRings + 2 + rand.nextInt(4);

		int displacement = rand.nextInt(2) + 3;

		int dir = rand.nextInt(3);

		int ringPosAmb = 0;
		for (int l = 0; l < numberOfRings; l++) {
			ringPosAmb += displacement;
			switch (dir) {
			case 0:
				genCircle(i + ringPosAmb, j + 1, k, Block.stone.blockID, 0,
						ringSize, ringSize - 1.5F, 2, true);
				break;
			case 1:
				genCircle(i, j + 1, k + ringPosAmb, Block.stone.blockID, 0,
						ringSize, ringSize - 1.5F, 1, true);
				break;
			case 2:
				genCircle(i, j + ringPosAmb, k, Block.stone.blockID, 0,
						ringSize, ringSize - 1.5F, 0, true);
				break;

			}
			ringSize--;
		}
	}

}
