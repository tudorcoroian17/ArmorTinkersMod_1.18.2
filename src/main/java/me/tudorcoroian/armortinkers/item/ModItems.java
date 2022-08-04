package me.tudorcoroian.armortinkers.item;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.item.custom.*;
import me.tudorcoroian.armortinkers.util.ModColors;
import me.tudorcoroian.armortinkers.util.ModMaterial;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItems {
    // List of all the items added by the mod
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArmorTinkers.MOD_ID);


    public static final RegistryObject<Item> GUIDE_BOOK_TIER_1 = ITEMS.register("guide_book_t1",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));

    // New materials
    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> MAGNESIUM_INGOT = ITEMS.register("magnesium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> MAGNESIUM_NUGGET = ITEMS.register("magnesium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> BRASS_NUGGET = ITEMS.register("brass_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> VIBRANIUM_INGOT = ITEMS.register("vibranium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> VIBRANIUM_NUGGET = ITEMS.register("vibranium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> ADAMANTIUM_INGOT = ITEMS.register("adamantium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> RAW_MAGNESIUM = ITEMS.register("raw_magnesium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));


    public static final RegistryObject<Item> HIDE_CAP = ITEMS.register("hide_cap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(new TranslatableComponent("tooltip.armortinkers.hide_armour.tooltip"));
                }
            });
    public static final RegistryObject<Item> HIDE_VEST = ITEMS.register("hide_vest",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(new TranslatableComponent("tooltip.armortinkers.hide_armour.tooltip"));
                }
            });
    public static final RegistryObject<Item> HIDE_PANTS = ITEMS.register("hide_pants",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(new TranslatableComponent("tooltip.armortinkers.hide_armour.tooltip"));
                }
            });
    public static final RegistryObject<Item> HIDE_SOCKS = ITEMS.register("hide_socks",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)){
                @Override
                public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
                    pTooltipComponents.add(new TranslatableComponent("tooltip.armortinkers.hide_armour.tooltip"));
                }
            });

    public static final RegistryObject<Item> RESIN = ITEMS.register("resin",
            ()-> new ResinItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));

    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)
                    .setNoRepair()
                    .durability(16)));
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)
                    .setNoRepair()
                    .durability(16)));

    public static final RegistryObject<Item> BLANK_WOOD_PATTERN = ITEMS.register("blank_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> HEAD_PLATE_WOOD_PATTERN = ITEMS.register("head_plate_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(4)));
    public static final RegistryObject<Item> SHOULDER_PLATE_WOOD_PATTERN = ITEMS.register("shoulder_plate_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(4)));
    public static final RegistryObject<Item> FRONT_PLATE_WOOD_PATTERN = ITEMS.register("front_plate_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(4)));
    public static final RegistryObject<Item> BACK_PLATE_WOOD_PATTERN = ITEMS.register("back_plate_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(4)));
    public static final RegistryObject<Item> WRIST_BAND_WOOD_PATTERN = ITEMS.register("wrist_band_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(4)));
    public static final RegistryObject<Item> LEG_PLATE_WOOD_PATTERN = ITEMS.register("leg_plate_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(4)));
    public static final RegistryObject<Item> TAIL_PLATE_WOOD_PATTERN = ITEMS.register("tail_plate_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(4)));
    public static final RegistryObject<Item> BOOT_PLATE_WOOD_PATTERN = ITEMS.register("boot_plate_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(4)));
    public static final RegistryObject<Item> BLANK_GOLD_PATTERN = ITEMS.register("blank_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> HEAD_PLATE_GOLD_PATTERN = ITEMS.register("head_plate_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(8)));
    public static final RegistryObject<Item> SHOULDER_PLATE_GOLD_PATTERN = ITEMS.register("shoulder_plate_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(8)));
    public static final RegistryObject<Item> FRONT_PLATE_GOLD_PATTERN = ITEMS.register("front_plate_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(8)));
    public static final RegistryObject<Item> BACK_PLATE_GOLD_PATTERN = ITEMS.register("back_plate_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(8)));
    public static final RegistryObject<Item> WRIST_BAND_GOLD_PATTERN = ITEMS.register("wrist_band_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(8)));
    public static final RegistryObject<Item> LEG_PLATE_GOLD_PATTERN = ITEMS.register("leg_plate_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(8)));
    public static final RegistryObject<Item> TAIL_PLATE_GOLD_PATTERN = ITEMS.register("tail_plate_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(8)));
    public static final RegistryObject<Item> BOOT_PLATE_GOLD_PATTERN = ITEMS.register("boot_plate_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB).defaultDurability(8)));

    public static final RegistryObject<Item> WOOD_HEAD_PLATE = ITEMS.register("wood_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.WOOD, ModMaterial.WOOD));
    public static final RegistryObject<Item> WOOD_BACK_PLATE = ITEMS.register("wood_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.WOOD, ModMaterial.WOOD));
    public static final RegistryObject<Item> WOOD_FRONT_PLATE = ITEMS.register("wood_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.WOOD, ModMaterial.WOOD));
    public static final RegistryObject<Item> WOOD_SHOULDER_PLATE = ITEMS.register("wood_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.WOOD, ModMaterial.WOOD));
    public static final RegistryObject<Item> WOOD_WRIST_BAND = ITEMS.register("wood_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.WOOD, ModMaterial.WOOD));
    public static final RegistryObject<Item> WOOD_LEG_PLATE = ITEMS.register("wood_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.WOOD, ModMaterial.WOOD));
    public static final RegistryObject<Item> WOOD_TAIL_PLATE = ITEMS.register("wood_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.WOOD, ModMaterial.WOOD));
    public static final RegistryObject<Item> WOOD_BOOT_PLATE = ITEMS.register("wood_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.WOOD, ModMaterial.WOOD));

    public static final RegistryObject<Item> CACTUS_HEAD_PLATE = ITEMS.register("cactus_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.CACTUS, ModMaterial.CACTUS));
    public static final RegistryObject<Item> CACTUS_BACK_PLATE = ITEMS.register("cactus_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.CACTUS, ModMaterial.CACTUS));
    public static final RegistryObject<Item> CACTUS_FRONT_PLATE = ITEMS.register("cactus_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.CACTUS, ModMaterial.CACTUS));
    public static final RegistryObject<Item> CACTUS_SHOULDER_PLATE = ITEMS.register("cactus_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.CACTUS, ModMaterial.CACTUS));
    public static final RegistryObject<Item> CACTUS_WRIST_BAND = ITEMS.register("cactus_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.CACTUS, ModMaterial.CACTUS));
    public static final RegistryObject<Item> CACTUS_LEG_PLATE = ITEMS.register("cactus_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.CACTUS, ModMaterial.CACTUS));
    public static final RegistryObject<Item> CACTUS_TAIL_PLATE = ITEMS.register("cactus_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.CACTUS, ModMaterial.CACTUS));
    public static final RegistryObject<Item> CACTUS_BOOT_PLATE = ITEMS.register("cactus_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.CACTUS, ModMaterial.CACTUS));

    public static final RegistryObject<Item> STONE_HEAD_PLATE = ITEMS.register("stone_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.STONE, ModMaterial.STONE));
    public static final RegistryObject<Item> STONE_BACK_PLATE = ITEMS.register("stone_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.STONE, ModMaterial.STONE));
    public static final RegistryObject<Item> STONE_FRONT_PLATE = ITEMS.register("stone_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.STONE, ModMaterial.STONE));
    public static final RegistryObject<Item> STONE_SHOULDER_PLATE = ITEMS.register("stone_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.STONE, ModMaterial.STONE));
    public static final RegistryObject<Item> STONE_WRIST_BAND = ITEMS.register("stone_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.STONE, ModMaterial.STONE));
    public static final RegistryObject<Item> STONE_LEG_PLATE = ITEMS.register("stone_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.STONE, ModMaterial.STONE));
    public static final RegistryObject<Item> STONE_TAIL_PLATE = ITEMS.register("stone_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.STONE, ModMaterial.STONE));
    public static final RegistryObject<Item> STONE_BOOT_PLATE = ITEMS.register("stone_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.STONE, ModMaterial.STONE));

    public static final RegistryObject<Item> NETHERACK_HEAD_PLATE = ITEMS.register("netherack_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.NETHERACK, ModMaterial.NETHERACK));
    public static final RegistryObject<Item> NETHERACK_BACK_PLATE = ITEMS.register("netherack_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.NETHERACK, ModMaterial.NETHERACK));
    public static final RegistryObject<Item> NETHERACK_FRONT_PLATE = ITEMS.register("netherack_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.NETHERACK, ModMaterial.NETHERACK));
    public static final RegistryObject<Item> NETHERACK_SHOULDER_PLATE = ITEMS.register("netherack_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.NETHERACK, ModMaterial.NETHERACK));
    public static final RegistryObject<Item> NETHERACK_WRIST_BAND = ITEMS.register("netherack_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.NETHERACK, ModMaterial.NETHERACK));
    public static final RegistryObject<Item> NETHERACK_LEG_PLATE = ITEMS.register("netherack_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.NETHERACK, ModMaterial.NETHERACK));
    public static final RegistryObject<Item> NETHERACK_TAIL_PLATE = ITEMS.register("netherack_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.NETHERACK, ModMaterial.NETHERACK));
    public static final RegistryObject<Item> NETHERACK_BOOT_PLATE = ITEMS.register("netherack_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.NETHERACK, ModMaterial.NETHERACK));

    public static final RegistryObject<Item> END_STONE_HEAD_PLATE = ITEMS.register("end_stone_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.END_STONE, ModMaterial.END_STONE));
    public static final RegistryObject<Item> END_STONE_BACK_PLATE = ITEMS.register("end_stone_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.END_STONE, ModMaterial.END_STONE));
    public static final RegistryObject<Item> END_STONE_FRONT_PLATE = ITEMS.register("end_stone_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.END_STONE, ModMaterial.END_STONE));
    public static final RegistryObject<Item> END_STONE_SHOULDER_PLATE = ITEMS.register("end_stone_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.END_STONE, ModMaterial.END_STONE));
    public static final RegistryObject<Item> END_STONE_WRIST_BAND = ITEMS.register("end_stone_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.END_STONE, ModMaterial.END_STONE));
    public static final RegistryObject<Item> END_STONE_LEG_PLATE = ITEMS.register("end_stone_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.END_STONE, ModMaterial.END_STONE));
    public static final RegistryObject<Item> END_STONE_TAIL_PLATE = ITEMS.register("end_stone_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.END_STONE, ModMaterial.END_STONE));
    public static final RegistryObject<Item> END_STONE_BOOT_PLATE = ITEMS.register("end_stone_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.END_STONE, ModMaterial.END_STONE));

    public static final RegistryObject<Item> FLINT_HEAD_PLATE = ITEMS.register("flint_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.FLINT, ModMaterial.FLINT));
    public static final RegistryObject<Item> FLINT_BACK_PLATE = ITEMS.register("flint_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.FLINT, ModMaterial.FLINT));
    public static final RegistryObject<Item> FLINT_FRONT_PLATE = ITEMS.register("flint_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.FLINT, ModMaterial.FLINT));
    public static final RegistryObject<Item> FLINT_SHOULDER_PLATE = ITEMS.register("flint_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.FLINT, ModMaterial.FLINT));
    public static final RegistryObject<Item> FLINT_WRIST_BAND = ITEMS.register("flint_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.FLINT, ModMaterial.FLINT));
    public static final RegistryObject<Item> FLINT_LEG_PLATE = ITEMS.register("flint_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.FLINT, ModMaterial.FLINT));
    public static final RegistryObject<Item> FLINT_TAIL_PLATE = ITEMS.register("flint_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.FLINT, ModMaterial.FLINT));
    public static final RegistryObject<Item> FLINT_BOOT_PLATE = ITEMS.register("flint_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.FLINT, ModMaterial.FLINT));

    public static final RegistryObject<Item> COPPER_HEAD_PLATE = ITEMS.register("copper_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.COPPER, ModMaterial.COPPER));
    public static final RegistryObject<Item> COPPER_BACK_PLATE = ITEMS.register("copper_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.COPPER, ModMaterial.COPPER));
    public static final RegistryObject<Item> COPPER_FRONT_PLATE = ITEMS.register("copper_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.COPPER, ModMaterial.COPPER));
    public static final RegistryObject<Item> COPPER_SHOULDER_PLATE = ITEMS.register("copper_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.COPPER, ModMaterial.COPPER));
    public static final RegistryObject<Item> COPPER_WRIST_BAND = ITEMS.register("copper_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.COPPER, ModMaterial.COPPER));
    public static final RegistryObject<Item> COPPER_LEG_PLATE = ITEMS.register("copper_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.COPPER, ModMaterial.COPPER));
    public static final RegistryObject<Item> COPPER_TAIL_PLATE = ITEMS.register("copper_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.COPPER, ModMaterial.COPPER));
    public static final RegistryObject<Item> COPPER_BOOT_PLATE = ITEMS.register("copper_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.COPPER, ModMaterial.COPPER));

    public static final RegistryObject<Item> IRON_HEAD_PLATE = ITEMS.register("iron_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.IRON, ModMaterial.IRON));
    public static final RegistryObject<Item> IRON_BACK_PLATE = ITEMS.register("iron_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.IRON, ModMaterial.IRON));
    public static final RegistryObject<Item> IRON_FRONT_PLATE = ITEMS.register("iron_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.IRON, ModMaterial.IRON));
    public static final RegistryObject<Item> IRON_SHOULDER_PLATE = ITEMS.register("iron_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.IRON, ModMaterial.IRON));
    public static final RegistryObject<Item> IRON_WRIST_BAND = ITEMS.register("iron_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.IRON, ModMaterial.IRON));
    public static final RegistryObject<Item> IRON_LEG_PLATE = ITEMS.register("iron_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.IRON, ModMaterial.IRON));
    public static final RegistryObject<Item> IRON_TAIL_PLATE = ITEMS.register("iron_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.IRON, ModMaterial.IRON));
    public static final RegistryObject<Item> IRON_BOOT_PLATE = ITEMS.register("iron_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.IRON, ModMaterial.IRON));

    public static final RegistryObject<Item> GOLD_HEAD_PLATE = ITEMS.register("gold_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.GOLD, ModMaterial.GOLD));
    public static final RegistryObject<Item> GOLD_BACK_PLATE = ITEMS.register("gold_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.GOLD, ModMaterial.GOLD));
    public static final RegistryObject<Item> GOLD_FRONT_PLATE = ITEMS.register("gold_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.GOLD, ModMaterial.GOLD));
    public static final RegistryObject<Item> GOLD_SHOULDER_PLATE = ITEMS.register("gold_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.GOLD, ModMaterial.GOLD));
    public static final RegistryObject<Item> GOLD_WRIST_BAND = ITEMS.register("gold_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.GOLD, ModMaterial.GOLD));
    public static final RegistryObject<Item> GOLD_LEG_PLATE = ITEMS.register("gold_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.GOLD, ModMaterial.GOLD));
    public static final RegistryObject<Item> GOLD_TAIL_PLATE = ITEMS.register("gold_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.GOLD, ModMaterial.GOLD));
    public static final RegistryObject<Item> GOLD_BOOT_PLATE = ITEMS.register("gold_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.GOLD, ModMaterial.GOLD));

    public static final RegistryObject<Item> OBSIDIAN_HEAD_PLATE = ITEMS.register("obsidian_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.OBSIDIAN, ModMaterial.OBSIDIAN));
    public static final RegistryObject<Item> OBSIDIAN_BACK_PLATE = ITEMS.register("obsidian_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.OBSIDIAN, ModMaterial.OBSIDIAN));
    public static final RegistryObject<Item> OBSIDIAN_FRONT_PLATE = ITEMS.register("obsidian_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.OBSIDIAN, ModMaterial.OBSIDIAN));
    public static final RegistryObject<Item> OBSIDIAN_SHOULDER_PLATE = ITEMS.register("obsidian_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.OBSIDIAN, ModMaterial.OBSIDIAN));
    public static final RegistryObject<Item> OBSIDIAN_WRIST_BAND = ITEMS.register("obsidian_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.OBSIDIAN, ModMaterial.OBSIDIAN));
    public static final RegistryObject<Item> OBSIDIAN_LEG_PLATE = ITEMS.register("obsidian_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.OBSIDIAN, ModMaterial.OBSIDIAN));
    public static final RegistryObject<Item> OBSIDIAN_TAIL_PLATE = ITEMS.register("obsidian_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.OBSIDIAN, ModMaterial.OBSIDIAN));
    public static final RegistryObject<Item> OBSIDIAN_BOOT_PLATE = ITEMS.register("obsidian_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.OBSIDIAN, ModMaterial.OBSIDIAN));

    public static final RegistryObject<Item> ALUMINIUM_HEAD_PLATE = ITEMS.register("aluminium_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ALUMINIUM, ModMaterial.ALUMINIUM));
    public static final RegistryObject<Item> ALUMINIUM_BACK_PLATE = ITEMS.register("aluminium_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ALUMINIUM, ModMaterial.ALUMINIUM));
    public static final RegistryObject<Item> ALUMINIUM_FRONT_PLATE = ITEMS.register("aluminium_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ALUMINIUM, ModMaterial.ALUMINIUM));
    public static final RegistryObject<Item> ALUMINIUM_SHOULDER_PLATE = ITEMS.register("aluminium_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ALUMINIUM, ModMaterial.ALUMINIUM));
    public static final RegistryObject<Item> ALUMINIUM_WRIST_BAND = ITEMS.register("aluminium_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ALUMINIUM, ModMaterial.ALUMINIUM));
    public static final RegistryObject<Item> ALUMINIUM_LEG_PLATE = ITEMS.register("aluminium_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ALUMINIUM, ModMaterial.ALUMINIUM));
    public static final RegistryObject<Item> ALUMINIUM_TAIL_PLATE = ITEMS.register("aluminium_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ALUMINIUM, ModMaterial.ALUMINIUM));
    public static final RegistryObject<Item> ALUMINIUM_BOOT_PLATE = ITEMS.register("aluminium_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ALUMINIUM, ModMaterial.ALUMINIUM));

    public static final RegistryObject<Item> TIN_HEAD_PLATE = ITEMS.register("tin_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.TIN, ModMaterial.TIN));
    public static final RegistryObject<Item> TIN_BACK_PLATE = ITEMS.register("tin_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.TIN, ModMaterial.TIN));
    public static final RegistryObject<Item> TIN_FRONT_PLATE = ITEMS.register("tin_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.TIN, ModMaterial.TIN));
    public static final RegistryObject<Item> TIN_SHOULDER_PLATE = ITEMS.register("tin_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.TIN, ModMaterial.TIN));
    public static final RegistryObject<Item> TIN_WRIST_BAND = ITEMS.register("tin_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.TIN, ModMaterial.TIN));
    public static final RegistryObject<Item> TIN_LEG_PLATE = ITEMS.register("tin_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.TIN, ModMaterial.TIN));
    public static final RegistryObject<Item> TIN_TAIL_PLATE = ITEMS.register("tin_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.TIN, ModMaterial.TIN));
    public static final RegistryObject<Item> TIN_BOOT_PLATE = ITEMS.register("tin_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.TIN, ModMaterial.TIN));

    public static final RegistryObject<Item> ZINC_HEAD_PLATE = ITEMS.register("zinc_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ZINC, ModMaterial.ZINC));
    public static final RegistryObject<Item> ZINC_BACK_PLATE = ITEMS.register("zinc_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ZINC, ModMaterial.ZINC));
    public static final RegistryObject<Item> ZINC_FRONT_PLATE = ITEMS.register("zinc_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ZINC, ModMaterial.ZINC));
    public static final RegistryObject<Item> ZINC_SHOULDER_PLATE = ITEMS.register("zinc_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ZINC, ModMaterial.ZINC));
    public static final RegistryObject<Item> ZINC_WRIST_BAND = ITEMS.register("zinc_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ZINC, ModMaterial.ZINC));
    public static final RegistryObject<Item> ZINC_LEG_PLATE = ITEMS.register("zinc_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ZINC, ModMaterial.ZINC));
    public static final RegistryObject<Item> ZINC_TAIL_PLATE = ITEMS.register("zinc_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ZINC, ModMaterial.ZINC));
    public static final RegistryObject<Item> ZINC_BOOT_PLATE = ITEMS.register("zinc_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ZINC, ModMaterial.ZINC));

    public static final RegistryObject<Item> SILVER_HEAD_PLATE = ITEMS.register("silver_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.SILVER, ModMaterial.SILVER));
    public static final RegistryObject<Item> SILVER_BACK_PLATE = ITEMS.register("silver_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.SILVER, ModMaterial.SILVER));
    public static final RegistryObject<Item> SILVER_FRONT_PLATE = ITEMS.register("silver_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.SILVER, ModMaterial.SILVER));
    public static final RegistryObject<Item> SILVER_SHOULDER_PLATE = ITEMS.register("silver_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.SILVER, ModMaterial.SILVER));
    public static final RegistryObject<Item> SILVER_WRIST_BAND = ITEMS.register("silver_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.SILVER, ModMaterial.SILVER));
    public static final RegistryObject<Item> SILVER_LEG_PLATE = ITEMS.register("silver_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.SILVER, ModMaterial.SILVER));
    public static final RegistryObject<Item> SILVER_TAIL_PLATE = ITEMS.register("silver_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.SILVER, ModMaterial.SILVER));
    public static final RegistryObject<Item> SILVER_BOOT_PLATE = ITEMS.register("silver_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.SILVER, ModMaterial.SILVER));

    public static final RegistryObject<Item> LEAD_HEAD_PLATE = ITEMS.register("lead_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.LEAD, ModMaterial.LEAD));
    public static final RegistryObject<Item> LEAD_BACK_PLATE = ITEMS.register("lead_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.LEAD, ModMaterial.LEAD));
    public static final RegistryObject<Item> LEAD_FRONT_PLATE = ITEMS.register("lead_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.LEAD, ModMaterial.LEAD));
    public static final RegistryObject<Item> LEAD_SHOULDER_PLATE = ITEMS.register("lead_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.LEAD, ModMaterial.LEAD));
    public static final RegistryObject<Item> LEAD_WRIST_BAND = ITEMS.register("lead_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.LEAD, ModMaterial.LEAD));
    public static final RegistryObject<Item> LEAD_LEG_PLATE = ITEMS.register("lead_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.LEAD, ModMaterial.LEAD));
    public static final RegistryObject<Item> LEAD_TAIL_PLATE = ITEMS.register("lead_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.LEAD, ModMaterial.LEAD));
    public static final RegistryObject<Item> LEAD_BOOT_PLATE = ITEMS.register("lead_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.LEAD, ModMaterial.LEAD));

    public static final RegistryObject<Item> BRASS_HEAD_PLATE = ITEMS.register("brass_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRASS, ModMaterial.BRASS));
    public static final RegistryObject<Item> BRASS_BACK_PLATE = ITEMS.register("brass_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRASS, ModMaterial.BRASS));
    public static final RegistryObject<Item> BRASS_FRONT_PLATE = ITEMS.register("brass_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRASS, ModMaterial.BRASS));
    public static final RegistryObject<Item> BRASS_SHOULDER_PLATE = ITEMS.register("brass_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRASS, ModMaterial.BRASS));
    public static final RegistryObject<Item> BRASS_WRIST_BAND = ITEMS.register("brass_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRASS, ModMaterial.BRASS));
    public static final RegistryObject<Item> BRASS_LEG_PLATE = ITEMS.register("brass_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRASS, ModMaterial.BRASS));
    public static final RegistryObject<Item> BRASS_TAIL_PLATE = ITEMS.register("brass_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRASS, ModMaterial.BRASS));
    public static final RegistryObject<Item> BRASS_BOOT_PLATE = ITEMS.register("brass_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRASS, ModMaterial.BRASS));

    public static final RegistryObject<Item> BRONZE_HEAD_PLATE = ITEMS.register("bronze_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRONZE, ModMaterial.BRONZE));
    public static final RegistryObject<Item> BRONZE_BACK_PLATE = ITEMS.register("bronze_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRONZE, ModMaterial.BRONZE));
    public static final RegistryObject<Item> BRONZE_FRONT_PLATE = ITEMS.register("bronze_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRONZE, ModMaterial.BRONZE));
    public static final RegistryObject<Item> BRONZE_SHOULDER_PLATE = ITEMS.register("bronze_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRONZE, ModMaterial.BRONZE));
    public static final RegistryObject<Item> BRONZE_WRIST_BAND = ITEMS.register("bronze_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRONZE, ModMaterial.BRONZE));
    public static final RegistryObject<Item> BRONZE_LEG_PLATE = ITEMS.register("bronze_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRONZE, ModMaterial.BRONZE));
    public static final RegistryObject<Item> BRONZE_TAIL_PLATE = ITEMS.register("bronze_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRONZE, ModMaterial.BRONZE));
    public static final RegistryObject<Item> BRONZE_BOOT_PLATE = ITEMS.register("bronze_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.BRONZE, ModMaterial.BRONZE));

    public static final RegistryObject<Item> MAGNESIUM_HEAD_PLATE = ITEMS.register("magnesium_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.MAGNESIUM, ModMaterial.MAGNESIUM));
    public static final RegistryObject<Item> MAGNESIUM_BACK_PLATE = ITEMS.register("magnesium_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.MAGNESIUM, ModMaterial.MAGNESIUM));
    public static final RegistryObject<Item> MAGNESIUM_FRONT_PLATE = ITEMS.register("magnesium_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.MAGNESIUM, ModMaterial.MAGNESIUM));
    public static final RegistryObject<Item> MAGNESIUM_SHOULDER_PLATE = ITEMS.register("magnesium_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.MAGNESIUM, ModMaterial.MAGNESIUM));
    public static final RegistryObject<Item> MAGNESIUM_WRIST_BAND = ITEMS.register("magnesium_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.MAGNESIUM, ModMaterial.MAGNESIUM));
    public static final RegistryObject<Item> MAGNESIUM_LEG_PLATE = ITEMS.register("magnesium_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.MAGNESIUM, ModMaterial.MAGNESIUM));
    public static final RegistryObject<Item> MAGNESIUM_TAIL_PLATE = ITEMS.register("magnesium_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.MAGNESIUM, ModMaterial.MAGNESIUM));
    public static final RegistryObject<Item> MAGNESIUM_BOOT_PLATE = ITEMS.register("magnesium_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.MAGNESIUM, ModMaterial.MAGNESIUM));

    public static final RegistryObject<Item> VIBRANIUM_HEAD_PLATE = ITEMS.register("vibranium_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.VIBRANIUM, ModMaterial.VIBRANIUM));
    public static final RegistryObject<Item> VIBRANIUM_BACK_PLATE = ITEMS.register("vibranium_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.VIBRANIUM, ModMaterial.VIBRANIUM));
    public static final RegistryObject<Item> VIBRANIUM_FRONT_PLATE = ITEMS.register("vibranium_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.VIBRANIUM, ModMaterial.VIBRANIUM));
    public static final RegistryObject<Item> VIBRANIUM_SHOULDER_PLATE = ITEMS.register("vibranium_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.VIBRANIUM, ModMaterial.VIBRANIUM));
    public static final RegistryObject<Item> VIBRANIUM_WRIST_BAND = ITEMS.register("vibranium_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.VIBRANIUM, ModMaterial.VIBRANIUM));
    public static final RegistryObject<Item> VIBRANIUM_LEG_PLATE = ITEMS.register("vibranium_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.VIBRANIUM, ModMaterial.VIBRANIUM));
    public static final RegistryObject<Item> VIBRANIUM_TAIL_PLATE = ITEMS.register("vibranium_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.VIBRANIUM, ModMaterial.VIBRANIUM));
    public static final RegistryObject<Item> VIBRANIUM_BOOT_PLATE = ITEMS.register("vibranium_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.VIBRANIUM, ModMaterial.VIBRANIUM));

    public static final RegistryObject<Item> ADAMANTIUM_HEAD_PLATE = ITEMS.register("adamantium_head_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ADAMANTIUM, ModMaterial.ADAMANTIUM));
    public static final RegistryObject<Item> ADAMANTIUM_BACK_PLATE = ITEMS.register("adamantium_back_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ADAMANTIUM, ModMaterial.ADAMANTIUM));
    public static final RegistryObject<Item> ADAMANTIUM_FRONT_PLATE = ITEMS.register("adamantium_front_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ADAMANTIUM, ModMaterial.ADAMANTIUM));
    public static final RegistryObject<Item> ADAMANTIUM_SHOULDER_PLATE = ITEMS.register("adamantium_shoulder_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ADAMANTIUM, ModMaterial.ADAMANTIUM));
    public static final RegistryObject<Item> ADAMANTIUM_WRIST_BAND = ITEMS.register("adamantium_wrist_band",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ADAMANTIUM, ModMaterial.ADAMANTIUM));
    public static final RegistryObject<Item> ADAMANTIUM_LEG_PLATE = ITEMS.register("adamantium_leg_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ADAMANTIUM, ModMaterial.ADAMANTIUM));
    public static final RegistryObject<Item> ADAMANTIUM_TAIL_PLATE = ITEMS.register("adamantium_tail_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ADAMANTIUM, ModMaterial.ADAMANTIUM));
    public static final RegistryObject<Item> ADAMANTIUM_BOOT_PLATE = ITEMS.register("adamantium_boot_plate",
            () -> new ArmorPartItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_PART_TAB),
                    ModColors.ADAMANTIUM, ModMaterial.ADAMANTIUM));

    public static RegistryObject<Item> HELP_HELMET = ITEMS.register("help_helmet",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB),
            ModMaterial.WOOD, ModMaterial.WOOD));
    public static RegistryObject<Item> HELP_CHESTPLATE = ITEMS.register("help_chestplate",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD));
    public static RegistryObject<Item> HELP_LEGGINGS = ITEMS.register("help_leggings",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD));
    public static RegistryObject<Item> HELP_BOOTS = ITEMS.register("help_boots",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD));

    public static RegistryObject<Item> TINKERS_HELMET_1 = ITEMS.register("tinkers_helmet_1",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_HELMET_2 = ITEMS.register("tinkers_helmet_2",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.WOOD, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_HELMET_3 = ITEMS.register("tinkers_helmet_3",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.WOOD, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_HELMET_4 = ITEMS.register("tinkers_helmet_4",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.WOOD, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_HELMET_5 = ITEMS.register("tinkers_helmet_5",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.WOOD, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_HELMET_6 = ITEMS.register("tinkers_helmet_6",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.WOOD, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_HELMET_7 = ITEMS.register("tinkers_helmet_7",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.CACTUS, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_HELMET_8 = ITEMS.register("tinkers_helmet_8",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.CACTUS, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_HELMET_9 = ITEMS.register("tinkers_helmet_9",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.CACTUS, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_HELMET_10 = ITEMS.register("tinkers_helmet_10",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.CACTUS, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_HELMET_11 = ITEMS.register("tinkers_helmet_11",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.CACTUS, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_HELMET_12 = ITEMS.register("tinkers_helmet_12",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.CACTUS, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_HELMET_13 = ITEMS.register("tinkers_helmet_13",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_HELMET_14 = ITEMS.register("tinkers_helmet_14",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_HELMET_15 = ITEMS.register("tinkers_helmet_15",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_HELMET_16 = ITEMS.register("tinkers_helmet_16",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_HELMET_17 = ITEMS.register("tinkers_helmet_17",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_HELMET_18 = ITEMS.register("tinkers_helmet_18",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_HELMET_19 = ITEMS.register("tinkers_helmet_19",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.NETHERACK, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_HELMET_20 = ITEMS.register("tinkers_helmet_20",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.NETHERACK, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_HELMET_21 = ITEMS.register("tinkers_helmet_21",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.NETHERACK, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_HELMET_22 = ITEMS.register("tinkers_helmet_22",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.NETHERACK, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_HELMET_23 = ITEMS.register("tinkers_helmet_23",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.NETHERACK, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_HELMET_24 = ITEMS.register("tinkers_helmet_24",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.NETHERACK, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_HELMET_25 = ITEMS.register("tinkers_helmet_25",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.END_STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_HELMET_26 = ITEMS.register("tinkers_helmet_26",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.END_STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_HELMET_27 = ITEMS.register("tinkers_helmet_27",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.END_STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_HELMET_28 = ITEMS.register("tinkers_helmet_28",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.END_STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_HELMET_29 = ITEMS.register("tinkers_helmet_29",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.END_STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_HELMET_30 = ITEMS.register("tinkers_helmet_30",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.END_STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_HELMET_31 = ITEMS.register("tinkers_helmet_31",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.FLINT, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_HELMET_32 = ITEMS.register("tinkers_helmet_32",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.FLINT, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_HELMET_33 = ITEMS.register("tinkers_helmet_33",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.FLINT, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_HELMET_34 = ITEMS.register("tinkers_helmet_34",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.FLINT, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_HELMET_35 = ITEMS.register("tinkers_helmet_35",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.FLINT, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_HELMET_36 = ITEMS.register("tinkers_helmet_36",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.FLINT, ModMaterial.FLINT));

    public static RegistryObject<Item> TINKERS_CHESTPLATE_1 = ITEMS.register("tinkers_chestplate_1",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_2 = ITEMS.register("tinkers_chestplate_2",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_3 = ITEMS.register("tinkers_chestplate_3",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_4 = ITEMS.register("tinkers_chestplate_4",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_5 = ITEMS.register("tinkers_chestplate_5",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_6 = ITEMS.register("tinkers_chestplate_6",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_7 = ITEMS.register("tinkers_chestplate_7",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.CACTUS, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_8 = ITEMS.register("tinkers_chestplate_8",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.CACTUS, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_9 = ITEMS.register("tinkers_chestplate_9",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.CACTUS, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_10 = ITEMS.register("tinkers_chestplate_10",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.CACTUS, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_11 = ITEMS.register("tinkers_chestplate_11",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.CACTUS, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_12 = ITEMS.register("tinkers_chestplate_12",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.CACTUS, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_13 = ITEMS.register("tinkers_chestplate_13",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_14 = ITEMS.register("tinkers_chestplate_14",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_15 = ITEMS.register("tinkers_chestplate_15",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_16 = ITEMS.register("tinkers_chestplate_16",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_17 = ITEMS.register("tinkers_chestplate_17",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_18 = ITEMS.register("tinkers_chestplate_18",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_19 = ITEMS.register("tinkers_chestplate_19",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.NETHERACK, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_20 = ITEMS.register("tinkers_chestplate_20",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.NETHERACK, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_21 = ITEMS.register("tinkers_chestplate_21",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.NETHERACK, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_22 = ITEMS.register("tinkers_chestplate_22",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.NETHERACK, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_23 = ITEMS.register("tinkers_chestplate_23",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.NETHERACK, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_24 = ITEMS.register("tinkers_chestplate_24",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.NETHERACK, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_25 = ITEMS.register("tinkers_chestplate_25",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.END_STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_26 = ITEMS.register("tinkers_chestplate_26",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.END_STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_27 = ITEMS.register("tinkers_chestplate_27",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.END_STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_28 = ITEMS.register("tinkers_chestplate_28",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.END_STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_29 = ITEMS.register("tinkers_chestplate_29",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.END_STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_30 = ITEMS.register("tinkers_chestplate_30",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.END_STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_31 = ITEMS.register("tinkers_chestplate_31",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.FLINT, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_32 = ITEMS.register("tinkers_chestplate_32",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.FLINT, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_33 = ITEMS.register("tinkers_chestplate_33",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.FLINT, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_34 = ITEMS.register("tinkers_chestplate_34",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.FLINT, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_35 = ITEMS.register("tinkers_chestplate_35",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.FLINT, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_36 = ITEMS.register("tinkers_chestplate_36",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.FLINT, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_381 = ITEMS.register("tinkers_chestplate_381",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.WOOD, ModMaterial.CACTUS, ModMaterial.END_STONE, ModMaterial.NETHERACK, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_1556 = ITEMS.register("tinkers_chestplate_1556",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.CACTUS, ModMaterial.CACTUS, ModMaterial.CACTUS, ModMaterial.CACTUS, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_3111 = ITEMS.register("tinkers_chestplate_3111",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.STONE, ModMaterial.STONE, ModMaterial.STONE, ModMaterial.STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_4666 = ITEMS.register("tinkers_chestplate_4666",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.NETHERACK, ModMaterial.NETHERACK, ModMaterial.NETHERACK, ModMaterial.NETHERACK, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_6221 = ITEMS.register("tinkers_chestplate_6221",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.END_STONE, ModMaterial.END_STONE, ModMaterial.END_STONE, ModMaterial.END_STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_7776 = ITEMS.register("tinkers_chestplate_7776",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.FLINT, ModMaterial.FLINT, ModMaterial.FLINT, ModMaterial.FLINT, ModMaterial.FLINT));

    public static RegistryObject<Item> TINKERS_LEGGINGS_1 = ITEMS.register("tinkers_leggings_1",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_2 = ITEMS.register("tinkers_leggings_2",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_3 = ITEMS.register("tinkers_leggings_3",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_4 = ITEMS.register("tinkers_leggings_4",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_5 = ITEMS.register("tinkers_leggings_5",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_6 = ITEMS.register("tinkers_leggings_6",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_7 = ITEMS.register("tinkers_leggings_7",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.CACTUS, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_8 = ITEMS.register("tinkers_leggings_8",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.CACTUS, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_9 = ITEMS.register("tinkers_leggings_9",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.CACTUS, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_10 = ITEMS.register("tinkers_leggings_10",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.CACTUS, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_11 = ITEMS.register("tinkers_leggings_11",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.CACTUS, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_12 = ITEMS.register("tinkers_leggings_12",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.CACTUS, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_13 = ITEMS.register("tinkers_leggings_13",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_14 = ITEMS.register("tinkers_leggings_14",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_15 = ITEMS.register("tinkers_leggings_15",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_16 = ITEMS.register("tinkers_leggings_16",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_17 = ITEMS.register("tinkers_leggings_17",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_18 = ITEMS.register("tinkers_leggings_18",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_19 = ITEMS.register("tinkers_leggings_19",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.NETHERACK, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_20 = ITEMS.register("tinkers_leggings_20",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.NETHERACK, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_21 = ITEMS.register("tinkers_leggings_21",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.NETHERACK, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_22 = ITEMS.register("tinkers_leggings_22",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.NETHERACK, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_23 = ITEMS.register("tinkers_leggings_23",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.NETHERACK, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_24 = ITEMS.register("tinkers_leggings_24",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.NETHERACK, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_25 = ITEMS.register("tinkers_leggings_25",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.END_STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_26 = ITEMS.register("tinkers_leggings_26",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.END_STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_27 = ITEMS.register("tinkers_leggings_27",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.END_STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_28 = ITEMS.register("tinkers_leggings_28",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.END_STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_29 = ITEMS.register("tinkers_leggings_29",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.END_STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_30 = ITEMS.register("tinkers_leggings_30",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.END_STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_31 = ITEMS.register("tinkers_leggings_31",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.FLINT, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_32 = ITEMS.register("tinkers_leggings_32",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.FLINT, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_33 = ITEMS.register("tinkers_leggings_33",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.FLINT, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_34 = ITEMS.register("tinkers_leggings_34",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.FLINT, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_35 = ITEMS.register("tinkers_leggings_35",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.FLINT, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_36 = ITEMS.register("tinkers_leggings_36",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.WOOD, ModMaterial.FLINT, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_37 = ITEMS.register("tinkers_leggings_37",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.WOOD, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_38 = ITEMS.register("tinkers_leggings_38",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.WOOD, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_39 = ITEMS.register("tinkers_leggings_39",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.WOOD, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_40 = ITEMS.register("tinkers_leggings_40",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.WOOD, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_41 = ITEMS.register("tinkers_leggings_41",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.WOOD, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_42 = ITEMS.register("tinkers_leggings_42",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.WOOD, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_43 = ITEMS.register("tinkers_leggings_43",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.CACTUS, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_44 = ITEMS.register("tinkers_leggings_44",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.CACTUS, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_45 = ITEMS.register("tinkers_leggings_45",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.CACTUS, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_46 = ITEMS.register("tinkers_leggings_46",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.CACTUS, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_47 = ITEMS.register("tinkers_leggings_47",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.CACTUS, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_48 = ITEMS.register("tinkers_leggings_48",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.CACTUS, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_49 = ITEMS.register("tinkers_leggings_49",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_50 = ITEMS.register("tinkers_leggings_50",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_51 = ITEMS.register("tinkers_leggings_51",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_52 = ITEMS.register("tinkers_leggings_52",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_53 = ITEMS.register("tinkers_leggings_53",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_54 = ITEMS.register("tinkers_leggings_54",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_55 = ITEMS.register("tinkers_leggings_55",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.NETHERACK, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_56 = ITEMS.register("tinkers_leggings_56",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.NETHERACK, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_57 = ITEMS.register("tinkers_leggings_57",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.NETHERACK, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_58 = ITEMS.register("tinkers_leggings_58",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.NETHERACK, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_59 = ITEMS.register("tinkers_leggings_59",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.NETHERACK, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_60 = ITEMS.register("tinkers_leggings_60",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.NETHERACK, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_61 = ITEMS.register("tinkers_leggings_61",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.END_STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_62 = ITEMS.register("tinkers_leggings_62",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.END_STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_63 = ITEMS.register("tinkers_leggings_63",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.END_STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_64 = ITEMS.register("tinkers_leggings_64",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.END_STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_65 = ITEMS.register("tinkers_leggings_65",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.END_STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_66 = ITEMS.register("tinkers_leggings_66",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.END_STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_67 = ITEMS.register("tinkers_leggings_67",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.FLINT, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_68 = ITEMS.register("tinkers_leggings_68",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.FLINT, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_69 = ITEMS.register("tinkers_leggings_69",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.FLINT, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_70 = ITEMS.register("tinkers_leggings_70",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.FLINT, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_71 = ITEMS.register("tinkers_leggings_71",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.FLINT, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_72 = ITEMS.register("tinkers_leggings_72",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.CACTUS, ModMaterial.FLINT, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_73 = ITEMS.register("tinkers_leggings_73",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.WOOD, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_74 = ITEMS.register("tinkers_leggings_74",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.WOOD, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_75 = ITEMS.register("tinkers_leggings_75",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.WOOD, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_76 = ITEMS.register("tinkers_leggings_76",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.WOOD, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_77 = ITEMS.register("tinkers_leggings_77",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.WOOD, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_78 = ITEMS.register("tinkers_leggings_78",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.WOOD, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_79 = ITEMS.register("tinkers_leggings_79",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.CACTUS, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_80 = ITEMS.register("tinkers_leggings_80",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.CACTUS, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_81 = ITEMS.register("tinkers_leggings_81",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.CACTUS, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_82 = ITEMS.register("tinkers_leggings_82",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.CACTUS, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_83 = ITEMS.register("tinkers_leggings_83",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.CACTUS, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_84 = ITEMS.register("tinkers_leggings_84",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.CACTUS, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_85 = ITEMS.register("tinkers_leggings_85",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_86 = ITEMS.register("tinkers_leggings_86",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_87 = ITEMS.register("tinkers_leggings_87",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_88 = ITEMS.register("tinkers_leggings_88",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_89 = ITEMS.register("tinkers_leggings_89",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_90 = ITEMS.register("tinkers_leggings_90",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_91 = ITEMS.register("tinkers_leggings_91",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.NETHERACK, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_92 = ITEMS.register("tinkers_leggings_92",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.NETHERACK, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_93 = ITEMS.register("tinkers_leggings_93",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.NETHERACK, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_94 = ITEMS.register("tinkers_leggings_94",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.NETHERACK, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_95 = ITEMS.register("tinkers_leggings_95",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.NETHERACK, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_96 = ITEMS.register("tinkers_leggings_96",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.NETHERACK, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_97 = ITEMS.register("tinkers_leggings_97",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.END_STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_98 = ITEMS.register("tinkers_leggings_98",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.END_STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_99 = ITEMS.register("tinkers_leggings_99",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.END_STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_100 = ITEMS.register("tinkers_leggings_100",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.END_STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_101 = ITEMS.register("tinkers_leggings_101",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.END_STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_102 = ITEMS.register("tinkers_leggings_102",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.END_STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_103 = ITEMS.register("tinkers_leggings_103",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.FLINT, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_104 = ITEMS.register("tinkers_leggings_104",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.FLINT, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_105 = ITEMS.register("tinkers_leggings_105",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.FLINT, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_106 = ITEMS.register("tinkers_leggings_106",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.FLINT, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_107 = ITEMS.register("tinkers_leggings_107",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.FLINT, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_108 = ITEMS.register("tinkers_leggings_108",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.STONE, ModMaterial.FLINT, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_109 = ITEMS.register("tinkers_leggings_109",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.WOOD, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_110 = ITEMS.register("tinkers_leggings_110",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.WOOD, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_111 = ITEMS.register("tinkers_leggings_111",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.WOOD, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_112 = ITEMS.register("tinkers_leggings_112",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.WOOD, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_113 = ITEMS.register("tinkers_leggings_113",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.WOOD, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_114 = ITEMS.register("tinkers_leggings_114",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.WOOD, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_115 = ITEMS.register("tinkers_leggings_115",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.CACTUS, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_116 = ITEMS.register("tinkers_leggings_116",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.CACTUS, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_117 = ITEMS.register("tinkers_leggings_117",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.CACTUS, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_118 = ITEMS.register("tinkers_leggings_118",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.CACTUS, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_119 = ITEMS.register("tinkers_leggings_119",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.CACTUS, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_120 = ITEMS.register("tinkers_leggings_120",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.CACTUS, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_121 = ITEMS.register("tinkers_leggings_121",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_122 = ITEMS.register("tinkers_leggings_122",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_123 = ITEMS.register("tinkers_leggings_123",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_124 = ITEMS.register("tinkers_leggings_124",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_125 = ITEMS.register("tinkers_leggings_125",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_126 = ITEMS.register("tinkers_leggings_126",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_127 = ITEMS.register("tinkers_leggings_127",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.NETHERACK, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_128 = ITEMS.register("tinkers_leggings_128",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.NETHERACK, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_129 = ITEMS.register("tinkers_leggings_129",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.NETHERACK, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_130 = ITEMS.register("tinkers_leggings_130",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.NETHERACK, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_131 = ITEMS.register("tinkers_leggings_131",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.NETHERACK, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_132 = ITEMS.register("tinkers_leggings_132",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.NETHERACK, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_133 = ITEMS.register("tinkers_leggings_133",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.END_STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_134 = ITEMS.register("tinkers_leggings_134",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.END_STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_135 = ITEMS.register("tinkers_leggings_135",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.END_STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_136 = ITEMS.register("tinkers_leggings_136",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.END_STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_137 = ITEMS.register("tinkers_leggings_137",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.END_STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_138 = ITEMS.register("tinkers_leggings_138",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.END_STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_139 = ITEMS.register("tinkers_leggings_139",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.FLINT, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_140 = ITEMS.register("tinkers_leggings_140",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.FLINT, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_141 = ITEMS.register("tinkers_leggings_141",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.FLINT, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_142 = ITEMS.register("tinkers_leggings_142",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.FLINT, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_143 = ITEMS.register("tinkers_leggings_143",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.FLINT, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_144 = ITEMS.register("tinkers_leggings_144",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.FLINT, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_145 = ITEMS.register("tinkers_leggings_145",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.WOOD, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_146 = ITEMS.register("tinkers_leggings_146",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.WOOD, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_147 = ITEMS.register("tinkers_leggings_147",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.WOOD, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_148 = ITEMS.register("tinkers_leggings_148",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.WOOD, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_149 = ITEMS.register("tinkers_leggings_149",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.WOOD, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_150 = ITEMS.register("tinkers_leggings_150",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.WOOD, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_151 = ITEMS.register("tinkers_leggings_151",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.CACTUS, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_152 = ITEMS.register("tinkers_leggings_152",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.CACTUS, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_153 = ITEMS.register("tinkers_leggings_153",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.CACTUS, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_154 = ITEMS.register("tinkers_leggings_154",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.CACTUS, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_155 = ITEMS.register("tinkers_leggings_155",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.CACTUS, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_156 = ITEMS.register("tinkers_leggings_156",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.CACTUS, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_157 = ITEMS.register("tinkers_leggings_157",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_158 = ITEMS.register("tinkers_leggings_158",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_159 = ITEMS.register("tinkers_leggings_159",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_160 = ITEMS.register("tinkers_leggings_160",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_161 = ITEMS.register("tinkers_leggings_161",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_162 = ITEMS.register("tinkers_leggings_162",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_163 = ITEMS.register("tinkers_leggings_163",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.NETHERACK, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_164 = ITEMS.register("tinkers_leggings_164",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.NETHERACK, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_165 = ITEMS.register("tinkers_leggings_165",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.NETHERACK, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_166 = ITEMS.register("tinkers_leggings_166",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.NETHERACK, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_167 = ITEMS.register("tinkers_leggings_167",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.NETHERACK, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_168 = ITEMS.register("tinkers_leggings_168",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.NETHERACK, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_169 = ITEMS.register("tinkers_leggings_169",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.END_STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_170 = ITEMS.register("tinkers_leggings_170",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.END_STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_171 = ITEMS.register("tinkers_leggings_171",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.END_STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_172 = ITEMS.register("tinkers_leggings_172",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.END_STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_173 = ITEMS.register("tinkers_leggings_173",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.END_STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_174 = ITEMS.register("tinkers_leggings_174",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.END_STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_175 = ITEMS.register("tinkers_leggings_175",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.FLINT, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_176 = ITEMS.register("tinkers_leggings_176",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.FLINT, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_177 = ITEMS.register("tinkers_leggings_177",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.FLINT, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_178 = ITEMS.register("tinkers_leggings_178",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.FLINT, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_179 = ITEMS.register("tinkers_leggings_179",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.FLINT, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_180 = ITEMS.register("tinkers_leggings_180",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.END_STONE, ModMaterial.FLINT, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_181 = ITEMS.register("tinkers_leggings_181",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.WOOD, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_182 = ITEMS.register("tinkers_leggings_182",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.WOOD, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_183 = ITEMS.register("tinkers_leggings_183",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.WOOD, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_184 = ITEMS.register("tinkers_leggings_184",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.WOOD, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_185 = ITEMS.register("tinkers_leggings_185",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.WOOD, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_186 = ITEMS.register("tinkers_leggings_186",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.WOOD, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_187 = ITEMS.register("tinkers_leggings_187",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.CACTUS, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_188 = ITEMS.register("tinkers_leggings_188",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.CACTUS, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_189 = ITEMS.register("tinkers_leggings_189",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.CACTUS, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_190 = ITEMS.register("tinkers_leggings_190",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.CACTUS, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_191 = ITEMS.register("tinkers_leggings_191",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.CACTUS, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_192 = ITEMS.register("tinkers_leggings_192",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.CACTUS, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_193 = ITEMS.register("tinkers_leggings_193",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_194 = ITEMS.register("tinkers_leggings_194",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_195 = ITEMS.register("tinkers_leggings_195",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_196 = ITEMS.register("tinkers_leggings_196",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_197 = ITEMS.register("tinkers_leggings_197",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_198 = ITEMS.register("tinkers_leggings_198",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_199 = ITEMS.register("tinkers_leggings_199",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.NETHERACK, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_200 = ITEMS.register("tinkers_leggings_200",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.NETHERACK, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_201 = ITEMS.register("tinkers_leggings_201",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.NETHERACK, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_202 = ITEMS.register("tinkers_leggings_202",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.NETHERACK, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_203 = ITEMS.register("tinkers_leggings_203",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.NETHERACK, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_204 = ITEMS.register("tinkers_leggings_204",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.NETHERACK, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_205 = ITEMS.register("tinkers_leggings_205",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.END_STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_206 = ITEMS.register("tinkers_leggings_206",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.END_STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_207 = ITEMS.register("tinkers_leggings_207",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.END_STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_208 = ITEMS.register("tinkers_leggings_208",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.END_STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_209 = ITEMS.register("tinkers_leggings_209",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.END_STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_210 = ITEMS.register("tinkers_leggings_210",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.END_STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_LEGGINGS_211 = ITEMS.register("tinkers_leggings_211",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.FLINT, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_212 = ITEMS.register("tinkers_leggings_212",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.FLINT, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_213 = ITEMS.register("tinkers_leggings_213",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.FLINT, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_214 = ITEMS.register("tinkers_leggings_214",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.FLINT, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_LEGGINGS_215 = ITEMS.register("tinkers_leggings_215",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.FLINT, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_216 = ITEMS.register("tinkers_leggings_216",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.FLINT, ModMaterial.FLINT, ModMaterial.FLINT));

    public static RegistryObject<Item> TINKERS_BOOTS_1 = ITEMS.register("tinkers_boots_1",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.WOOD, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_BOOTS_2 = ITEMS.register("tinkers_boots_2",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.WOOD, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_BOOTS_3 = ITEMS.register("tinkers_boots_3",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.WOOD, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_BOOTS_4 = ITEMS.register("tinkers_boots_4",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.WOOD, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_BOOTS_5 = ITEMS.register("tinkers_boots_5",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.WOOD, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_BOOTS_6 = ITEMS.register("tinkers_boots_6",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.WOOD, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_BOOTS_7 = ITEMS.register("tinkers_boots_7",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.CACTUS, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_BOOTS_8 = ITEMS.register("tinkers_boots_8",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.CACTUS, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_BOOTS_9 = ITEMS.register("tinkers_boots_9",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.CACTUS, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_BOOTS_10 = ITEMS.register("tinkers_boots_10",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.CACTUS, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_BOOTS_11 = ITEMS.register("tinkers_boots_11",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.CACTUS, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_BOOTS_12 = ITEMS.register("tinkers_boots_12",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.CACTUS, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_BOOTS_13 = ITEMS.register("tinkers_boots_13",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_BOOTS_14 = ITEMS.register("tinkers_boots_14",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_BOOTS_15 = ITEMS.register("tinkers_boots_15",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_BOOTS_16 = ITEMS.register("tinkers_boots_16",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_BOOTS_17 = ITEMS.register("tinkers_boots_17",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_BOOTS_18 = ITEMS.register("tinkers_boots_18",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_BOOTS_19 = ITEMS.register("tinkers_boots_19",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_BOOTS_20 = ITEMS.register("tinkers_boots_20",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_BOOTS_21 = ITEMS.register("tinkers_boots_21",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_BOOTS_22 = ITEMS.register("tinkers_boots_22",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_BOOTS_23 = ITEMS.register("tinkers_boots_23",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_BOOTS_24 = ITEMS.register("tinkers_boots_24",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.NETHERACK, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_BOOTS_25 = ITEMS.register("tinkers_boots_25",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.END_STONE, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_BOOTS_26 = ITEMS.register("tinkers_boots_26",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.END_STONE, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_BOOTS_27 = ITEMS.register("tinkers_boots_27",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.END_STONE, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_BOOTS_28 = ITEMS.register("tinkers_boots_28",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.END_STONE, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_BOOTS_29 = ITEMS.register("tinkers_boots_29",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.END_STONE, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_BOOTS_30 = ITEMS.register("tinkers_boots_30",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.END_STONE, ModMaterial.FLINT));
    public static RegistryObject<Item> TINKERS_BOOTS_31 = ITEMS.register("tinkers_boots_31",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.FLINT, ModMaterial.WOOD));
    public static RegistryObject<Item> TINKERS_BOOTS_32 = ITEMS.register("tinkers_boots_32",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.FLINT, ModMaterial.CACTUS));
    public static RegistryObject<Item> TINKERS_BOOTS_33 = ITEMS.register("tinkers_boots_33",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.FLINT, ModMaterial.STONE));
    public static RegistryObject<Item> TINKERS_BOOTS_34 = ITEMS.register("tinkers_boots_34",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.FLINT, ModMaterial.NETHERACK));
    public static RegistryObject<Item> TINKERS_BOOTS_35 = ITEMS.register("tinkers_boots_35",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.FLINT, ModMaterial.END_STONE));
    public static RegistryObject<Item> TINKERS_BOOTS_36 = ITEMS.register("tinkers_boots_36",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.FLINT, ModMaterial.FLINT));


    // Register all the items in the list
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
