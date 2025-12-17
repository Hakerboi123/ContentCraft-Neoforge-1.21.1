package xyz.hakerboi.contentcraft.init;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import xyz.hakerboi.contentcraft.ContentCraft;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ContentCraft.MOD_ID);

    public static final DeferredItem<Item> XAENON_INGOT = ITEMS.register("xaenon_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_XAENON = ITEMS.register("raw_xaenon",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<SwordItem> XAENON_SWORD = ITEMS.register("xaenon_sword",
            () -> new SwordItem(ModToolTiers.XAENON, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.XAENON, 5, -2.3f))));

    public static final DeferredItem<PickaxeItem> XAENON_PICKAXE = ITEMS.register("xaenon_pickaxe",
            () -> new PickaxeItem(ModToolTiers.XAENON, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.XAENON, 3.0F, -2.7f))));

    public static final DeferredItem<ShovelItem> XAENON_SHOVEL = ITEMS.register("xaenon_shovel",
            () -> new ShovelItem(ModToolTiers.XAENON, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.XAENON, 3.0F, -2.9f))));

    public static final DeferredItem<AxeItem> XAENON_AXE = ITEMS.register("xaenon_axe",
            () -> new AxeItem(ModToolTiers.XAENON, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.XAENON, 7.0F, -2.9f))));

    public static final DeferredItem<HoeItem> XAENON_HOE = ITEMS.register("xaenon_hoe",
            () -> new HoeItem(ModToolTiers.XAENON, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.XAENON, 0.0F, 0.0f))));


    public static final DeferredItem<ArmorItem> XAENON_HELMET = ITEMS.register("xaenon_helmet",
            () -> new ArmorItem(ModArmorMaterials.XAENON_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));
    public static final DeferredItem<ArmorItem> XAENON_CHESTPLATE = ITEMS.register("xaenon_chestplate",
            () -> new ArmorItem(ModArmorMaterials.XAENON_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));
    public static final DeferredItem<ArmorItem> XAENON_LEGGINGS = ITEMS.register("xaenon_leggings",
            () -> new ArmorItem(ModArmorMaterials.XAENON_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));
    public static final DeferredItem<ArmorItem> XAENON_BOOTS = ITEMS.register("xaenon_boots",
            () -> new ArmorItem(ModArmorMaterials.XAENON_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
