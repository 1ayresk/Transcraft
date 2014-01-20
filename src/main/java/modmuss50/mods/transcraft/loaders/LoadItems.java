package modmuss50.mods.transcraft.loaders;

import modmuss50.mods.transcraft.Transcraft;
import modmuss50.mods.transcraft.Items.BasicTransmuter;
import modmuss50.mods.transcraft.Items.TranscraftItems;
import modmuss50.mods.transcraft.Items.Transpeadia;
import modmuss50.mods.transcraft.armor.ArmorEnderBoots;
import modmuss50.mods.transcraft.armor.ArmorEnderChest;
import modmuss50.mods.transcraft.armor.ArmorEnderHelmet;
import modmuss50.mods.transcraft.armor.ArmorEnderLegs;
import modmuss50.mods.transcraft.armor.ArmorPlasticBoots;
import modmuss50.mods.transcraft.armor.ArmorPlasticChestplate;
import modmuss50.mods.transcraft.armor.ArmorPlasticHelmet;
import modmuss50.mods.transcraft.armor.ArmorPlasticLegs;
import modmuss50.mods.transcraft.helpers.Config;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraftforge.common.EnumHelper;

public class LoadItems {

	public static void LoadItems() {
		TranscraftItems.BasicTransmuter = new BasicTransmuter(
				Config.BasicTransmuterID)
				.setUnlocalizedName("transcraft:BasicTransmuter")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:BasicTransmuter");

		TranscraftItems.QuadTransmuter = new modmuss50.mods.transcraft.Items.QuadTransmuter(
				Config.QuadTransmuterID)
				.setUnlocalizedName("Transcraft:QuadTransmuter")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:QuadTransmuter");

		TranscraftItems.NanoTransmuter = new modmuss50.mods.transcraft.Items.NanoTransmuter(
				Config.NanoTransmuterID)
				.setUnlocalizedName("Transcraft:NanoTransmuter")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:NanoTransmuter");

		TranscraftItems.Oil = new modmuss50.mods.transcraft.Items.Oil(Config.OilID)
				.setUnlocalizedName("Transcraft:Oil")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:Oil");
		TranscraftItems.Plastic = new modmuss50.mods.transcraft.Items.Plastic(
				Config.PlasticID).setUnlocalizedName("Transcraft:Plastic")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:Plastic");

		TranscraftItems.IronStick = new modmuss50.mods.transcraft.Items.IronStick(
				Config.IronStickID).setUnlocalizedName("Transcraft:IronStick")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:BasicTransmuter");
		TranscraftItems.HardendPlastic = new modmuss50.mods.transcraft.Items.HardendPlastic(
				Config.HardendPlasticID)
				.setUnlocalizedName("Transcraft:HardendPlastic")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:IronStick");

		TranscraftItems.EnderGem = new modmuss50.mods.transcraft.Items.EnderGem(
				Config.EnderGemID).setUnlocalizedName("Transcraft:EnderGem")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:EnderGem");

		TranscraftItems.EnderQuartz = new modmuss50.mods.transcraft.Items.EnderQuartz(
				Config.EnderQuartzID)
				.setUnlocalizedName("Transcraft:EnderQuartz")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:EnderQuartz");

		TranscraftItems.DarkEndershard = new modmuss50.mods.transcraft.Items.DarkEndershard(
				Config.DarkEndershardID)
				.setUnlocalizedName("Transcraft:DarkEndershard")
				.setCreativeTab(Transcraft.TranstabItems)
				.setTextureName("transcraft:DarkEndershard");

		TranscraftItems.HotDog = new modmuss50.mods.transcraft.Items.Food.HotDog(
				Config.HotdogID).setUnlocalizedName("Transcraft:HotDog")
				.setCreativeTab(Transcraft.TranstabItems);

		TranscraftItems.PlasticAxe = new modmuss50.mods.transcraft.Tools.PlasticAxe(
				Config.PlasticAxeID, Transcraft.PlasticTool)
				.setUnlocalizedName("Transcraft:PlasticAxe").setCreativeTab(
						Transcraft.TranstabItems);

		TranscraftItems.PlasticHoe = new modmuss50.mods.transcraft.Tools.PlasticHoe(
				Config.PlasticHoeID, Transcraft.PlasticTool)
				.setUnlocalizedName("Transcraft:PlasticHoe").setCreativeTab(
						Transcraft.TranstabItems);

		TranscraftItems.PlasticPickaxe = new modmuss50.mods.transcraft.Tools.PlasticPickaxe(
				Config.PlasticPickaxeID, Transcraft.PlasticTool)
				.setUnlocalizedName("Transcraft:PlasticPickaxe")
				.setCreativeTab(Transcraft.TranstabItems);

		TranscraftItems.PlasticShovel = new modmuss50.mods.transcraft.Tools.PlasticShovel(
				Config.PlasticShovelID, Transcraft.PlasticTool)
				.setUnlocalizedName("Transcraft:PlasticShovel").setCreativeTab(
						Transcraft.TranstabItems);

		TranscraftItems.PlasticSword = new modmuss50.mods.transcraft.Tools.PlasticSword(
				Config.PlasticSwordID, Transcraft.PlasticTool)
				.setUnlocalizedName("Transcraft:PlasticSword").setCreativeTab(
						Transcraft.TranstabItems);

		TranscraftItems.BunkerPick = new modmuss50.mods.transcraft.Tools.BunkerPick(
				Config.BunkerPickID, Transcraft.BunkerToolEnum)
				.setUnlocalizedName("Transcraft:EnderPick").setCreativeTab(
						Transcraft.TranstabItems);

		TranscraftItems.EnderSword = new modmuss50.mods.transcraft.Tools.EnderSword(
				Config.EnderSwordID, Transcraft.EnderToolEnum)
				.setUnlocalizedName("Transcraft:EnderSword")
				.setCreativeTab(Transcraft.TranstabItems).setFull3D();

		EnumArmorMaterial PlasticEnum = EnumHelper.addArmorMaterial("Plastic",
				15, new int[] { 3, 5, 5, 2 }, 5);
		EnumArmorMaterial EnderEnum = EnumHelper.addArmorMaterial("Ender",
				9850, new int[] { 10000, 10000, 10000, 10000 }, 100);

		TranscraftItems.PlasticHelmet = (new ArmorPlasticHelmet(
				Config.PlasticHelmetID, PlasticEnum, 0, 0)).setUnlocalizedName(
				"Transcraft:PlasticHelmet").setCreativeTab(
				Transcraft.TranstabItems);

		TranscraftItems.PlasticChest = (new ArmorPlasticChestplate(
				Config.PlasticChestID, PlasticEnum, 0, 1)).setUnlocalizedName(
				"Transcraft:PlasticChest").setCreativeTab(
				Transcraft.TranstabItems);

		TranscraftItems.PlasticLegs = (new ArmorPlasticLegs(Config.PlasticLegsID,
				PlasticEnum, 0, 2))
				.setUnlocalizedName("Transcraft:PlasticLegs").setCreativeTab(
						Transcraft.TranstabItems);

		TranscraftItems.PlasticBoots = (new ArmorPlasticBoots(Config.PlasticBootsID,
				PlasticEnum, 0, 3)).setUnlocalizedName(
				"Transcraft:PlasticBoots").setCreativeTab(
				Transcraft.TranstabItems);

		TranscraftItems.EnderHelmet = (new ArmorEnderHelmet(Config.EnderHelmetID,
				EnderEnum, 0, 0)).setUnlocalizedName("Transcraft:EnderHelmet")
				.setCreativeTab(Transcraft.TranstabItems);

		TranscraftItems.EnderChest = (new ArmorEnderChest(Config.EnderChestID,
				EnderEnum, 0, 1)).setUnlocalizedName("Transcraft:EnderChest")
				.setCreativeTab(Transcraft.TranstabItems);

		TranscraftItems.EnderLegs = (new ArmorEnderLegs(Config.EnderLegsID,
				EnderEnum, 0, 2)).setUnlocalizedName("Transcraft:EnderLegs")
				.setCreativeTab(Transcraft.TranstabItems);

		TranscraftItems.EnderBoots = (new ArmorEnderBoots(Config.EnderBootsID,
				EnderEnum, 0, 3)).setUnlocalizedName("Transcraft:EnderBoots")
				.setCreativeTab(Transcraft.TranstabItems);

	
		TranscraftItems.Transpedia = new Transpeadia(Config.TranspeadiaID).setUnlocalizedName("Transcraft:Transpedia").setCreativeTab(Transcraft.TranstabItems).setTextureName("transcraft:Transpedia");
		
	
	}

}
