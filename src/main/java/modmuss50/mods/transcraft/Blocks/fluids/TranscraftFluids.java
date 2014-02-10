package modmuss50.mods.transcraft.Blocks.fluids;

import modmuss50.mods.transcraft.Transcraft;
import modmuss50.mods.transcraft.Utils.Config;
import modmuss50.mods.transcraft.api.Fluids;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;

import com.google.common.base.Optional;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TranscraftFluids {

	public static void init() {
		registerFluids();
		initializeLiquids();
		initializeContainers();
		registerBlocks();
		registerItems();
	}

	private static void registerFluids() {

		Fluids.LiquidTransmutterFluid = Optional.of(new LiquidTransmutterFluid("transcraft:LiquidTransmutter"));
		FluidRegistry.registerFluid(Fluids.LiquidTransmutterFluid.get());
		FluidRegistry.registerFluid(new LiquidTransmutterFluid("LiquidTransmutterFluid"));
	}

	private static void initializeLiquids() {
		Fluids.LiquidTransmutter = Optional.of(new BlockFluidLiquidTransmuter("LiquidTransmuter").setBlockName("transcraft:LiquidTransmutter"));
	}

	private static void initializeContainers() {

		Fluids.ItemBucketLiquidTrasnmutter = Optional.of((new ItemBucketLiquidTrasnmutter().setMaxStackSize(1).setUnlocalizedName("transcraft.BucketLiquidTrasnmutter")).setCreativeTab(Transcraft.Transtab));

		FluidContainerRegistry.registerFluidContainer(Fluids.LiquidTransmutterFluid.get(), new ItemStack(Fluids.ItemBucketLiquidTrasnmutter.get(), 1, 1),new ItemStack(Fluids.ItemBucketLiquidTrasnmutter.get(), 1, 0));
	}

	private static void registerBlocks() {
		LanguageRegistry.addName(Fluids.LiquidTransmutter.get(),
				"LiquidTransmutter");
		GameRegistry.registerBlock(Fluids.LiquidTransmutter.get(),
				"LiquidTransmutter");
	}

	private static void registerItems() {
		GameRegistry.registerItem(Fluids.ItemBucketLiquidTrasnmutter.get(),"Transbucket"); // registerItem(Fluids.ItemBucketLiquidTrasnmutter.get());

		
	}

	public static void registerItem(Item item) {
		GameRegistry.registerItem(item,
				item.getUnlocalizedName().replace("item.", ""));
	}

}