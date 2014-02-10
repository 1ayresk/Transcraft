package modmuss50.mods.transcraft.loaders;

import modmuss50.mods.transcraft.Transcraft;
import modmuss50.mods.transcraft.Items.BasicTransmuter;
import modmuss50.mods.transcraft.Items.FireStaff;
import modmuss50.mods.transcraft.Items.TranscraftColorItems;
import modmuss50.mods.transcraft.Items.TranscraftItems;
import modmuss50.mods.transcraft.Items.Transpeadia;
import modmuss50.mods.transcraft.Items.armor.ArmorEnderBoots;
import modmuss50.mods.transcraft.Items.armor.ArmorEnderChest;
import modmuss50.mods.transcraft.Items.armor.ArmorEnderHelmet;
import modmuss50.mods.transcraft.Items.armor.ArmorEnderLegs;
import modmuss50.mods.transcraft.Items.armor.ArmorPlasticBoots;
import modmuss50.mods.transcraft.Items.armor.ArmorPlasticChestplate;
import modmuss50.mods.transcraft.Items.armor.ArmorPlasticHelmet;
import modmuss50.mods.transcraft.Items.armor.ArmorPlasticLegs;
import modmuss50.mods.transcraft.Utils.TranscraftUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class LoadItems {

	public static Item TestItem;

	public static void LoadItems() {

		TranscraftItems.BasicTransmuter = new BasicTransmuter()
				.setUnlocalizedName("transcraft:BasicTransmuter")
				.setCreativeTab(Transcraft.Transtab)
				.setTextureName("transcraft:BasicTransmuter");

		TranscraftItems.QuadTransmuter = new modmuss50.mods.transcraft.Items.QuadTransmuter()
				.setUnlocalizedName("Transcraft:QuadTransmuter")
				.setCreativeTab(Transcraft.Transtab)
				.setTextureName("transcraft:QuadTransmuter");

		TranscraftItems.NanoTransmuter = new modmuss50.mods.transcraft.Items.NanoTransmuter()
				.setUnlocalizedName("Transcraft:NanoTransmuter")
				.setCreativeTab(Transcraft.Transtab)
				.setTextureName("transcraft:NanoTransmuter");

		TranscraftItems.Oil = new modmuss50.mods.transcraft.Items.Oil()
				.setUnlocalizedName("Transcraft:Oil")
				.setCreativeTab(Transcraft.Transtab)
				.setTextureName("transcraft:Oil");

		TranscraftItems.Plastic = new modmuss50.mods.transcraft.Items.Plastic()
				.setUnlocalizedName("Transcraft:Plastic")
				.setCreativeTab(Transcraft.Transtab)
				.setTextureName("transcraft:Plastic");

		TranscraftItems.IronStick = new modmuss50.mods.transcraft.Items.IronStick()
				.setUnlocalizedName("Transcraft:IronStick")
				.setCreativeTab(Transcraft.Transtab)
				.setTextureName("transcraft:BasicTransmuter");
		TranscraftItems.HardendPlastic = new modmuss50.mods.transcraft.Items.HardendPlastic()
				.setUnlocalizedName("Transcraft:HardendPlastic")
				.setCreativeTab(Transcraft.Transtab)
				.setTextureName("transcraft:IronStick");

		TranscraftItems.EnderGem = new modmuss50.mods.transcraft.Items.EnderGem()
				.setUnlocalizedName("Transcraft:EnderGem")
				.setCreativeTab(Transcraft.Transtab)
				.setTextureName("transcraft:EnderGem");

		TranscraftItems.EnderQuartz = new modmuss50.mods.transcraft.Items.EnderQuartz()
				.setUnlocalizedName("Transcraft:EnderQuartz")
				.setCreativeTab(Transcraft.Transtab)
				.setTextureName("transcraft:EnderQuartz");

		TranscraftItems.DarkEndershard = new modmuss50.mods.transcraft.Items.DarkEndershard()
				.setUnlocalizedName("Transcraft:DarkEndershard")
				.setCreativeTab(Transcraft.Transtab)
				.setTextureName("transcraft:DarkEndershard");

		TranscraftItems.HotDog = new modmuss50.mods.transcraft.Items.Food.HotDog()
				.setUnlocalizedName("Transcraft:HotDog").setCreativeTab(
						Transcraft.Transtab);

		TranscraftItems.BunkerPick = new modmuss50.mods.transcraft.Items.Tools.BunkerPick(
				TranscraftUtil.BunkerToolEnum).setUnlocalizedName(
				"Transcraft:EnderPick").setCreativeTab(Transcraft.Transtab);

		TranscraftItems.EnderSword = new modmuss50.mods.transcraft.Items.Tools.EnderSword(
				TranscraftUtil.EnderToolEnum)
				.setUnlocalizedName("Transcraft:EnderSword")
				.setCreativeTab(Transcraft.Transtab).setFull3D();

		ArmorMaterial PlasticEnum = EnumHelper.addArmorMaterial("Plastic", 15,
				new int[] { 3, 5, 5, 2 }, 5);
		ArmorMaterial EnderEnum = EnumHelper.addArmorMaterial("Ender", 9850,
				new int[] { 10000, 10000, 10000, 10000 }, 100);

		TranscraftItems.PlasticHelmet = (new ArmorPlasticHelmet(PlasticEnum, 0,
				0)).setUnlocalizedName("Transcraft:PlasticHelmet")
				.setCreativeTab(Transcraft.Transtab);

		TranscraftItems.PlasticChest = (new ArmorPlasticChestplate(PlasticEnum,
				0, 1)).setUnlocalizedName("Transcraft:PlasticChest")
				.setCreativeTab(Transcraft.Transtab);

		TranscraftItems.PlasticLegs = (new ArmorPlasticLegs(PlasticEnum, 0, 2))
				.setUnlocalizedName("Transcraft:PlasticLegs").setCreativeTab(
						Transcraft.Transtab);

		TranscraftItems.PlasticBoots = (new ArmorPlasticBoots(PlasticEnum, 0, 3))
				.setUnlocalizedName("Transcraft:PlasticBoots").setCreativeTab(
						Transcraft.Transtab);

		TranscraftItems.EnderHelmet = (new ArmorEnderHelmet(EnderEnum, 0, 0))
				.setUnlocalizedName("Transcraft:EnderHelmet").setCreativeTab(
						Transcraft.Transtab);

		TranscraftItems.EnderChest = (new ArmorEnderChest(EnderEnum, 0, 1))
				.setUnlocalizedName("Transcraft:EnderChest").setCreativeTab(
						Transcraft.Transtab);

		TranscraftItems.EnderLegs = (new ArmorEnderLegs(EnderEnum, 0, 2))
				.setUnlocalizedName("Transcraft:EnderLegs").setCreativeTab(
						Transcraft.Transtab);

		TranscraftItems.EnderBoots = (new ArmorEnderBoots(EnderEnum, 0, 3))
				.setUnlocalizedName("Transcraft:EnderBoots").setCreativeTab(
						Transcraft.Transtab);

		TranscraftItems.Transpedia = new Transpeadia()
				.setUnlocalizedName("Transcraft:Transpedia")
				.setCreativeTab(Transcraft.Transtab)
				.setTextureName("transcraft:Transpedia");

		TranscraftItems.FireStaff = new FireStaff()
		.setUnlocalizedName("Transcraft:FireStaff")
		.setCreativeTab(Transcraft.Transtab)
		.setTextureName("transcraft:FireStaff");
		
		TranscraftColorItems.loadItems();

	}

}
