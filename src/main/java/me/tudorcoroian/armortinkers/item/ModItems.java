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

    public static RegistryObject<Item> TINKERS_HELMET_37 = ITEMS.register("tinkers_helmet_37",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.COPPER, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_HELMET_38 = ITEMS.register("tinkers_helmet_38",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.COPPER, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_HELMET_39 = ITEMS.register("tinkers_helmet_39",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.COPPER, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_HELMET_40 = ITEMS.register("tinkers_helmet_40",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.COPPER, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_HELMET_41 = ITEMS.register("tinkers_helmet_41",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.COPPER, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_HELMET_42 = ITEMS.register("tinkers_helmet_42",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.COPPER, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_HELMET_43 = ITEMS.register("tinkers_helmet_43",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.COPPER, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_HELMET_44 = ITEMS.register("tinkers_helmet_44",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.COPPER, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_HELMET_45 = ITEMS.register("tinkers_helmet_45",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.COPPER, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_HELMET_46 = ITEMS.register("tinkers_helmet_46",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.COPPER, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_HELMET_47 = ITEMS.register("tinkers_helmet_47",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.COPPER, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_HELMET_48 = ITEMS.register("tinkers_helmet_48",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.COPPER, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_HELMET_49 = ITEMS.register("tinkers_helmet_49",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.COPPER, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_HELMET_50 = ITEMS.register("tinkers_helmet_50",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.COPPER, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_HELMET_51 = ITEMS.register("tinkers_helmet_51",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.IRON, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_HELMET_52 = ITEMS.register("tinkers_helmet_52",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.IRON, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_HELMET_53 = ITEMS.register("tinkers_helmet_53",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.IRON, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_HELMET_54 = ITEMS.register("tinkers_helmet_54",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.IRON, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_HELMET_55 = ITEMS.register("tinkers_helmet_55",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.IRON, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_HELMET_56 = ITEMS.register("tinkers_helmet_56",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.IRON, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_HELMET_57 = ITEMS.register("tinkers_helmet_57",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.IRON, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_HELMET_58 = ITEMS.register("tinkers_helmet_58",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.IRON, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_HELMET_59 = ITEMS.register("tinkers_helmet_59",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.IRON, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_HELMET_60 = ITEMS.register("tinkers_helmet_60",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.IRON, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_HELMET_61 = ITEMS.register("tinkers_helmet_61",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.IRON, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_HELMET_62 = ITEMS.register("tinkers_helmet_62",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.IRON, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_HELMET_63 = ITEMS.register("tinkers_helmet_63",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.IRON, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_HELMET_64 = ITEMS.register("tinkers_helmet_64",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.IRON, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_HELMET_65 = ITEMS.register("tinkers_helmet_65",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.GOLD, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_HELMET_66 = ITEMS.register("tinkers_helmet_66",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.GOLD, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_HELMET_67 = ITEMS.register("tinkers_helmet_67",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.GOLD, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_HELMET_68 = ITEMS.register("tinkers_helmet_68",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.GOLD, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_HELMET_69 = ITEMS.register("tinkers_helmet_69",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.GOLD, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_HELMET_70 = ITEMS.register("tinkers_helmet_70",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.GOLD, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_HELMET_71 = ITEMS.register("tinkers_helmet_71",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.GOLD, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_HELMET_72 = ITEMS.register("tinkers_helmet_72",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.GOLD, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_HELMET_73 = ITEMS.register("tinkers_helmet_73",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.GOLD, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_HELMET_74 = ITEMS.register("tinkers_helmet_74",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.GOLD, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_HELMET_75 = ITEMS.register("tinkers_helmet_75",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.GOLD, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_HELMET_76 = ITEMS.register("tinkers_helmet_76",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.GOLD, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_HELMET_77 = ITEMS.register("tinkers_helmet_77",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.GOLD, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_HELMET_78 = ITEMS.register("tinkers_helmet_78",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.GOLD, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_HELMET_79 = ITEMS.register("tinkers_helmet_79",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_HELMET_80 = ITEMS.register("tinkers_helmet_80",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_HELMET_81 = ITEMS.register("tinkers_helmet_81",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_HELMET_82 = ITEMS.register("tinkers_helmet_82",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_HELMET_83 = ITEMS.register("tinkers_helmet_83",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_HELMET_84 = ITEMS.register("tinkers_helmet_84",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_HELMET_85 = ITEMS.register("tinkers_helmet_85",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_HELMET_86 = ITEMS.register("tinkers_helmet_86",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_HELMET_87 = ITEMS.register("tinkers_helmet_87",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_HELMET_88 = ITEMS.register("tinkers_helmet_88",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_HELMET_89 = ITEMS.register("tinkers_helmet_89",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_HELMET_90 = ITEMS.register("tinkers_helmet_90",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_HELMET_91 = ITEMS.register("tinkers_helmet_91",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_HELMET_92 = ITEMS.register("tinkers_helmet_92",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_HELMET_93 = ITEMS.register("tinkers_helmet_93",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_HELMET_94 = ITEMS.register("tinkers_helmet_94",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_HELMET_95 = ITEMS.register("tinkers_helmet_95",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_HELMET_96 = ITEMS.register("tinkers_helmet_96",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_HELMET_97 = ITEMS.register("tinkers_helmet_97",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_HELMET_98 = ITEMS.register("tinkers_helmet_98",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_HELMET_99 = ITEMS.register("tinkers_helmet_99",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_HELMET_100 = ITEMS.register("tinkers_helmet_100",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_HELMET_101 = ITEMS.register("tinkers_helmet_101",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_HELMET_102 = ITEMS.register("tinkers_helmet_102",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_HELMET_103 = ITEMS.register("tinkers_helmet_103",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_HELMET_104 = ITEMS.register("tinkers_helmet_104",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_HELMET_105 = ITEMS.register("tinkers_helmet_105",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_HELMET_106 = ITEMS.register("tinkers_helmet_106",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_HELMET_107 = ITEMS.register("tinkers_helmet_107",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.TIN, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_HELMET_108 = ITEMS.register("tinkers_helmet_108",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.TIN, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_HELMET_109 = ITEMS.register("tinkers_helmet_109",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.TIN, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_HELMET_110 = ITEMS.register("tinkers_helmet_110",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.TIN, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_HELMET_111 = ITEMS.register("tinkers_helmet_111",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.TIN, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_HELMET_112 = ITEMS.register("tinkers_helmet_112",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.TIN, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_HELMET_113 = ITEMS.register("tinkers_helmet_113",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.TIN, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_HELMET_114 = ITEMS.register("tinkers_helmet_114",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.TIN, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_HELMET_115 = ITEMS.register("tinkers_helmet_115",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.TIN, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_HELMET_116 = ITEMS.register("tinkers_helmet_116",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.TIN, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_HELMET_117 = ITEMS.register("tinkers_helmet_117",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.TIN, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_HELMET_118 = ITEMS.register("tinkers_helmet_118",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.TIN, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_HELMET_119 = ITEMS.register("tinkers_helmet_119",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.TIN, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_HELMET_120 = ITEMS.register("tinkers_helmet_120",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.TIN, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_HELMET_121 = ITEMS.register("tinkers_helmet_121",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ZINC, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_HELMET_122 = ITEMS.register("tinkers_helmet_122",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ZINC, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_HELMET_123 = ITEMS.register("tinkers_helmet_123",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ZINC, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_HELMET_124 = ITEMS.register("tinkers_helmet_124",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ZINC, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_HELMET_125 = ITEMS.register("tinkers_helmet_125",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ZINC, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_HELMET_126 = ITEMS.register("tinkers_helmet_126",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ZINC, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_HELMET_127 = ITEMS.register("tinkers_helmet_127",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ZINC, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_HELMET_128 = ITEMS.register("tinkers_helmet_128",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ZINC, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_HELMET_129 = ITEMS.register("tinkers_helmet_129",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ZINC, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_HELMET_130 = ITEMS.register("tinkers_helmet_130",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ZINC, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_HELMET_131 = ITEMS.register("tinkers_helmet_131",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ZINC, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_HELMET_132 = ITEMS.register("tinkers_helmet_132",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ZINC, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_HELMET_133 = ITEMS.register("tinkers_helmet_133",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ZINC, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_HELMET_134 = ITEMS.register("tinkers_helmet_134",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ZINC, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_HELMET_135 = ITEMS.register("tinkers_helmet_135",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_HELMET_136 = ITEMS.register("tinkers_helmet_136",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_HELMET_137 = ITEMS.register("tinkers_helmet_137",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_HELMET_138 = ITEMS.register("tinkers_helmet_138",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_HELMET_139 = ITEMS.register("tinkers_helmet_139",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_HELMET_140 = ITEMS.register("tinkers_helmet_140",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_HELMET_141 = ITEMS.register("tinkers_helmet_141",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_HELMET_142 = ITEMS.register("tinkers_helmet_142",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_HELMET_143 = ITEMS.register("tinkers_helmet_143",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_HELMET_144 = ITEMS.register("tinkers_helmet_144",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_HELMET_145 = ITEMS.register("tinkers_helmet_145",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_HELMET_146 = ITEMS.register("tinkers_helmet_146",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_HELMET_147 = ITEMS.register("tinkers_helmet_147",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_HELMET_148 = ITEMS.register("tinkers_helmet_148",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_HELMET_149 = ITEMS.register("tinkers_helmet_149",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.SILVER, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_HELMET_150 = ITEMS.register("tinkers_helmet_150",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.SILVER, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_HELMET_151 = ITEMS.register("tinkers_helmet_151",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.SILVER, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_HELMET_152 = ITEMS.register("tinkers_helmet_152",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.SILVER, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_HELMET_153 = ITEMS.register("tinkers_helmet_153",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.SILVER, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_HELMET_154 = ITEMS.register("tinkers_helmet_154",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.SILVER, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_HELMET_155 = ITEMS.register("tinkers_helmet_155",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.SILVER, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_HELMET_156 = ITEMS.register("tinkers_helmet_156",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.SILVER, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_HELMET_157 = ITEMS.register("tinkers_helmet_157",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.SILVER, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_HELMET_158 = ITEMS.register("tinkers_helmet_158",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.SILVER, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_HELMET_159 = ITEMS.register("tinkers_helmet_159",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.SILVER, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_HELMET_160 = ITEMS.register("tinkers_helmet_160",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.SILVER, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_HELMET_161 = ITEMS.register("tinkers_helmet_161",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.SILVER, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_HELMET_162 = ITEMS.register("tinkers_helmet_162",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.SILVER, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_HELMET_163 = ITEMS.register("tinkers_helmet_163",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.LEAD, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_HELMET_164 = ITEMS.register("tinkers_helmet_164",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.LEAD, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_HELMET_165 = ITEMS.register("tinkers_helmet_165",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.LEAD, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_HELMET_166 = ITEMS.register("tinkers_helmet_166",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.LEAD, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_HELMET_167 = ITEMS.register("tinkers_helmet_167",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.LEAD, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_HELMET_168 = ITEMS.register("tinkers_helmet_168",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.LEAD, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_HELMET_169 = ITEMS.register("tinkers_helmet_169",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.LEAD, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_HELMET_170 = ITEMS.register("tinkers_helmet_170",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.LEAD, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_HELMET_171 = ITEMS.register("tinkers_helmet_171",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.LEAD, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_HELMET_172 = ITEMS.register("tinkers_helmet_172",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.LEAD, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_HELMET_173 = ITEMS.register("tinkers_helmet_173",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.LEAD, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_HELMET_174 = ITEMS.register("tinkers_helmet_174",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.LEAD, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_HELMET_175 = ITEMS.register("tinkers_helmet_175",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.LEAD, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_HELMET_176 = ITEMS.register("tinkers_helmet_176",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.LEAD, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_HELMET_177 = ITEMS.register("tinkers_helmet_177",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRASS, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_HELMET_178 = ITEMS.register("tinkers_helmet_178",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRASS, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_HELMET_179 = ITEMS.register("tinkers_helmet_179",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRASS, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_HELMET_180 = ITEMS.register("tinkers_helmet_180",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRASS, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_HELMET_181 = ITEMS.register("tinkers_helmet_181",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRASS, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_HELMET_182 = ITEMS.register("tinkers_helmet_182",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRASS, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_HELMET_183 = ITEMS.register("tinkers_helmet_183",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRASS, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_HELMET_184 = ITEMS.register("tinkers_helmet_184",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRASS, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_HELMET_185 = ITEMS.register("tinkers_helmet_185",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRASS, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_HELMET_186 = ITEMS.register("tinkers_helmet_186",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRASS, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_HELMET_187 = ITEMS.register("tinkers_helmet_187",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRASS, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_HELMET_188 = ITEMS.register("tinkers_helmet_188",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRASS, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_HELMET_189 = ITEMS.register("tinkers_helmet_189",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRASS, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_HELMET_190 = ITEMS.register("tinkers_helmet_190",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRASS, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_HELMET_191 = ITEMS.register("tinkers_helmet_191",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRONZE, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_HELMET_192 = ITEMS.register("tinkers_helmet_192",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRONZE, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_HELMET_193 = ITEMS.register("tinkers_helmet_193",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRONZE, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_HELMET_194 = ITEMS.register("tinkers_helmet_194",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRONZE, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_HELMET_195 = ITEMS.register("tinkers_helmet_195",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRONZE, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_HELMET_196 = ITEMS.register("tinkers_helmet_196",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRONZE, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_HELMET_197 = ITEMS.register("tinkers_helmet_197",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRONZE, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_HELMET_198 = ITEMS.register("tinkers_helmet_198",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRONZE, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_HELMET_199 = ITEMS.register("tinkers_helmet_199",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRONZE, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_HELMET_200 = ITEMS.register("tinkers_helmet_200",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRONZE, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_HELMET_201 = ITEMS.register("tinkers_helmet_201",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRONZE, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_HELMET_202 = ITEMS.register("tinkers_helmet_202",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRONZE, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_HELMET_203 = ITEMS.register("tinkers_helmet_203",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRONZE, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_HELMET_204 = ITEMS.register("tinkers_helmet_204",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.BRONZE, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_HELMET_205 = ITEMS.register("tinkers_helmet_205",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_HELMET_206 = ITEMS.register("tinkers_helmet_206",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_HELMET_207 = ITEMS.register("tinkers_helmet_207",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_HELMET_208 = ITEMS.register("tinkers_helmet_208",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_HELMET_209 = ITEMS.register("tinkers_helmet_209",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_HELMET_210 = ITEMS.register("tinkers_helmet_210",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_HELMET_211 = ITEMS.register("tinkers_helmet_211",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_HELMET_212 = ITEMS.register("tinkers_helmet_212",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_HELMET_213 = ITEMS.register("tinkers_helmet_213",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_HELMET_214 = ITEMS.register("tinkers_helmet_214",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_HELMET_215 = ITEMS.register("tinkers_helmet_215",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_HELMET_216 = ITEMS.register("tinkers_helmet_216",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_HELMET_217 = ITEMS.register("tinkers_helmet_217",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_HELMET_218 = ITEMS.register("tinkers_helmet_218",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_HELMET_219 = ITEMS.register("tinkers_helmet_219",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_HELMET_220 = ITEMS.register("tinkers_helmet_220",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_HELMET_221 = ITEMS.register("tinkers_helmet_221",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_HELMET_222 = ITEMS.register("tinkers_helmet_222",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_HELMET_223 = ITEMS.register("tinkers_helmet_223",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_HELMET_224 = ITEMS.register("tinkers_helmet_224",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_HELMET_225 = ITEMS.register("tinkers_helmet_225",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_HELMET_226 = ITEMS.register("tinkers_helmet_226",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_HELMET_227 = ITEMS.register("tinkers_helmet_227",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_HELMET_228 = ITEMS.register("tinkers_helmet_228",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_HELMET_229 = ITEMS.register("tinkers_helmet_229",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_HELMET_230 = ITEMS.register("tinkers_helmet_230",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_HELMET_231 = ITEMS.register("tinkers_helmet_231",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_HELMET_232 = ITEMS.register("tinkers_helmet_232",
            () -> new HelmetItem(new Item.Properties().tab(ModCreativeModeTab.HELMET_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.ADAMANTIUM));

    public static RegistryObject<Item> TINKERS_CHESTPLATE_7777 = ITEMS.register("tinkers_chestplate_7777",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.COPPER, ModMaterial.COPPER, ModMaterial.COPPER, ModMaterial.COPPER, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_49148 = ITEMS.register("tinkers_chestplate_49148",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.IRON, ModMaterial.IRON, ModMaterial.IRON, ModMaterial.IRON, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_90519 = ITEMS.register("tinkers_chestplate_90519",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.GOLD, ModMaterial.GOLD, ModMaterial.GOLD, ModMaterial.GOLD, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_131890 = ITEMS.register("tinkers_chestplate_131890",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.OBSIDIAN, ModMaterial.OBSIDIAN, ModMaterial.OBSIDIAN, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_173261 = ITEMS.register("tinkers_chestplate_173261",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.ALUMINIUM, ModMaterial.ALUMINIUM, ModMaterial.ALUMINIUM, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_214632 = ITEMS.register("tinkers_chestplate_214632",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.TIN, ModMaterial.TIN, ModMaterial.TIN, ModMaterial.TIN, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_256003 = ITEMS.register("tinkers_chestplate_256003",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.ZINC, ModMaterial.ZINC, ModMaterial.ZINC, ModMaterial.ZINC, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_297374 = ITEMS.register("tinkers_chestplate_297374",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.MAGNESIUM, ModMaterial.MAGNESIUM, ModMaterial.MAGNESIUM, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_338745 = ITEMS.register("tinkers_chestplate_338745",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.SILVER, ModMaterial.SILVER, ModMaterial.SILVER, ModMaterial.SILVER, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_380116 = ITEMS.register("tinkers_chestplate_380116",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.LEAD, ModMaterial.LEAD, ModMaterial.LEAD, ModMaterial.LEAD, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_421487 = ITEMS.register("tinkers_chestplate_421487",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.BRASS, ModMaterial.BRASS, ModMaterial.BRASS, ModMaterial.BRASS, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_462858 = ITEMS.register("tinkers_chestplate_462858",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.BRONZE, ModMaterial.BRONZE, ModMaterial.BRONZE, ModMaterial.BRONZE, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_504229 = ITEMS.register("tinkers_chestplate_504229",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.VIBRANIUM, ModMaterial.VIBRANIUM, ModMaterial.VIBRANIUM, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_545600 = ITEMS.register("tinkers_chestplate_545600",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.ADAMANTIUM, ModMaterial.ADAMANTIUM, ModMaterial.ADAMANTIUM, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_CHESTPLATE_10961 = ITEMS.register("tinkers_chestplate_10961",
            () -> new ChestPlateItem(new Item.Properties().tab(ModCreativeModeTab.CHESTPLATE_TAB),
                    ModMaterial.COPPER, ModMaterial.IRON, ModMaterial.GOLD, ModMaterial.OBSIDIAN, ModMaterial.ZINC));

    public static RegistryObject<Item> TINKERS_LEGGINGS_217 = ITEMS.register("tinkers_leggings_217",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.COPPER, ModMaterial.COPPER, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_LEGGINGS_428 = ITEMS.register("tinkers_leggings_428",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.IRON, ModMaterial.IRON, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_LEGGINGS_639 = ITEMS.register("tinkers_leggings_639",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.GOLD, ModMaterial.GOLD, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_850 = ITEMS.register("tinkers_leggings_850",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.OBSIDIAN, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_LEGGINGS_1061 = ITEMS.register("tinkers_leggings_1061",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.ALUMINIUM, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_LEGGINGS_1272 = ITEMS.register("tinkers_leggings_1272",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.TIN, ModMaterial.TIN, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_LEGGINGS_1483 = ITEMS.register("tinkers_leggings_1483",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.ZINC, ModMaterial.ZINC, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_LEGGINGS_1694 = ITEMS.register("tinkers_leggings_1694",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.MAGNESIUM, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_LEGGINGS_1905 = ITEMS.register("tinkers_leggings_1905",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.SILVER, ModMaterial.SILVER, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_LEGGINGS_2116 = ITEMS.register("tinkers_leggings_2116",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.LEAD, ModMaterial.LEAD, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_LEGGINGS_2327 = ITEMS.register("tinkers_leggings_2327",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.BRASS, ModMaterial.BRASS, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_LEGGINGS_2538 = ITEMS.register("tinkers_leggings_2538",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.BRONZE, ModMaterial.BRONZE, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_LEGGINGS_2749 = ITEMS.register("tinkers_leggings_2749",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.VIBRANIUM, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_LEGGINGS_2960 = ITEMS.register("tinkers_leggings_2960",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.ADAMANTIUM, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_LEGGINGS_233 = ITEMS.register("tinkers_leggings_233",
            () -> new LeggingsItem(new Item.Properties().tab(ModCreativeModeTab.LEGGINGS_TAB),
                    ModMaterial.COPPER, ModMaterial.IRON, ModMaterial.GOLD));

    public static RegistryObject<Item> TINKERS_BOOTS_37 = ITEMS.register("tinkers_boots_37",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.COPPER, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_BOOTS_38 = ITEMS.register("tinkers_boots_38",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.COPPER, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_BOOTS_39 = ITEMS.register("tinkers_boots_39",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.COPPER, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_BOOTS_40 = ITEMS.register("tinkers_boots_40",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.COPPER, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_BOOTS_41 = ITEMS.register("tinkers_boots_41",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.COPPER, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_42 = ITEMS.register("tinkers_boots_42",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.COPPER, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_BOOTS_43 = ITEMS.register("tinkers_boots_43",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.COPPER, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_BOOTS_44 = ITEMS.register("tinkers_boots_44",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.COPPER, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_45 = ITEMS.register("tinkers_boots_45",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.COPPER, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_BOOTS_46 = ITEMS.register("tinkers_boots_46",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.COPPER, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_BOOTS_47 = ITEMS.register("tinkers_boots_47",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.COPPER, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_BOOTS_48 = ITEMS.register("tinkers_boots_48",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.COPPER, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_BOOTS_49 = ITEMS.register("tinkers_boots_49",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.COPPER, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_50 = ITEMS.register("tinkers_boots_50",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.COPPER, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_51 = ITEMS.register("tinkers_boots_51",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.IRON, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_BOOTS_52 = ITEMS.register("tinkers_boots_52",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.IRON, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_BOOTS_53 = ITEMS.register("tinkers_boots_53",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.IRON, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_BOOTS_54 = ITEMS.register("tinkers_boots_54",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.IRON, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_BOOTS_55 = ITEMS.register("tinkers_boots_55",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.IRON, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_56 = ITEMS.register("tinkers_boots_56",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.IRON, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_BOOTS_57 = ITEMS.register("tinkers_boots_57",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.IRON, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_BOOTS_58 = ITEMS.register("tinkers_boots_58",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.IRON, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_59 = ITEMS.register("tinkers_boots_59",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.IRON, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_BOOTS_60 = ITEMS.register("tinkers_boots_60",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.IRON, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_BOOTS_61 = ITEMS.register("tinkers_boots_61",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.IRON, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_BOOTS_62 = ITEMS.register("tinkers_boots_62",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.IRON, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_BOOTS_63 = ITEMS.register("tinkers_boots_63",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.IRON, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_64 = ITEMS.register("tinkers_boots_64",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.IRON, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_65 = ITEMS.register("tinkers_boots_65",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.GOLD, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_BOOTS_66 = ITEMS.register("tinkers_boots_66",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.GOLD, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_BOOTS_67 = ITEMS.register("tinkers_boots_67",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.GOLD, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_BOOTS_68 = ITEMS.register("tinkers_boots_68",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.GOLD, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_BOOTS_69 = ITEMS.register("tinkers_boots_69",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.GOLD, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_70 = ITEMS.register("tinkers_boots_70",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.GOLD, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_BOOTS_71 = ITEMS.register("tinkers_boots_71",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.GOLD, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_BOOTS_72 = ITEMS.register("tinkers_boots_72",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.GOLD, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_73 = ITEMS.register("tinkers_boots_73",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.GOLD, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_BOOTS_74 = ITEMS.register("tinkers_boots_74",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.GOLD, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_BOOTS_75 = ITEMS.register("tinkers_boots_75",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.GOLD, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_BOOTS_76 = ITEMS.register("tinkers_boots_76",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.GOLD, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_BOOTS_77 = ITEMS.register("tinkers_boots_77",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.GOLD, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_78 = ITEMS.register("tinkers_boots_78",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.GOLD, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_79 = ITEMS.register("tinkers_boots_79",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_BOOTS_80 = ITEMS.register("tinkers_boots_80",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_BOOTS_81 = ITEMS.register("tinkers_boots_81",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_BOOTS_82 = ITEMS.register("tinkers_boots_82",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_BOOTS_83 = ITEMS.register("tinkers_boots_83",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_84 = ITEMS.register("tinkers_boots_84",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_BOOTS_85 = ITEMS.register("tinkers_boots_85",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_BOOTS_86 = ITEMS.register("tinkers_boots_86",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_87 = ITEMS.register("tinkers_boots_87",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_BOOTS_88 = ITEMS.register("tinkers_boots_88",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_BOOTS_89 = ITEMS.register("tinkers_boots_89",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_BOOTS_90 = ITEMS.register("tinkers_boots_90",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_BOOTS_91 = ITEMS.register("tinkers_boots_91",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_92 = ITEMS.register("tinkers_boots_92",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.OBSIDIAN, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_93 = ITEMS.register("tinkers_boots_93",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_BOOTS_94 = ITEMS.register("tinkers_boots_94",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_BOOTS_95 = ITEMS.register("tinkers_boots_95",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_BOOTS_96 = ITEMS.register("tinkers_boots_96",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_BOOTS_97 = ITEMS.register("tinkers_boots_97",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_98 = ITEMS.register("tinkers_boots_98",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_BOOTS_99 = ITEMS.register("tinkers_boots_99",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_BOOTS_100 = ITEMS.register("tinkers_boots_100",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_101 = ITEMS.register("tinkers_boots_101",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_BOOTS_102 = ITEMS.register("tinkers_boots_102",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_BOOTS_103 = ITEMS.register("tinkers_boots_103",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_BOOTS_104 = ITEMS.register("tinkers_boots_104",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_BOOTS_105 = ITEMS.register("tinkers_boots_105",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_106 = ITEMS.register("tinkers_boots_106",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ALUMINIUM, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_107 = ITEMS.register("tinkers_boots_107",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.TIN, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_BOOTS_108 = ITEMS.register("tinkers_boots_108",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.TIN, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_BOOTS_109 = ITEMS.register("tinkers_boots_109",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.TIN, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_BOOTS_110 = ITEMS.register("tinkers_boots_110",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.TIN, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_BOOTS_111 = ITEMS.register("tinkers_boots_111",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.TIN, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_112 = ITEMS.register("tinkers_boots_112",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.TIN, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_BOOTS_113 = ITEMS.register("tinkers_boots_113",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.TIN, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_BOOTS_114 = ITEMS.register("tinkers_boots_114",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.TIN, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_115 = ITEMS.register("tinkers_boots_115",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.TIN, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_BOOTS_116 = ITEMS.register("tinkers_boots_116",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.TIN, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_BOOTS_117 = ITEMS.register("tinkers_boots_117",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.TIN, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_BOOTS_118 = ITEMS.register("tinkers_boots_118",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.TIN, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_BOOTS_119 = ITEMS.register("tinkers_boots_119",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.TIN, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_120 = ITEMS.register("tinkers_boots_120",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.TIN, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_121 = ITEMS.register("tinkers_boots_121",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ZINC, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_BOOTS_122 = ITEMS.register("tinkers_boots_122",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ZINC, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_BOOTS_123 = ITEMS.register("tinkers_boots_123",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ZINC, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_BOOTS_124 = ITEMS.register("tinkers_boots_124",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ZINC, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_BOOTS_125 = ITEMS.register("tinkers_boots_125",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ZINC, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_126 = ITEMS.register("tinkers_boots_126",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ZINC, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_BOOTS_127 = ITEMS.register("tinkers_boots_127",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ZINC, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_BOOTS_128 = ITEMS.register("tinkers_boots_128",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ZINC, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_129 = ITEMS.register("tinkers_boots_129",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ZINC, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_BOOTS_130 = ITEMS.register("tinkers_boots_130",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ZINC, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_BOOTS_131 = ITEMS.register("tinkers_boots_131",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ZINC, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_BOOTS_132 = ITEMS.register("tinkers_boots_132",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ZINC, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_BOOTS_133 = ITEMS.register("tinkers_boots_133",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ZINC, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_134 = ITEMS.register("tinkers_boots_134",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ZINC, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_135 = ITEMS.register("tinkers_boots_135",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_BOOTS_136 = ITEMS.register("tinkers_boots_136",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_BOOTS_137 = ITEMS.register("tinkers_boots_137",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_BOOTS_138 = ITEMS.register("tinkers_boots_138",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_BOOTS_139 = ITEMS.register("tinkers_boots_139",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_140 = ITEMS.register("tinkers_boots_140",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_BOOTS_141 = ITEMS.register("tinkers_boots_141",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_BOOTS_142 = ITEMS.register("tinkers_boots_142",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_143 = ITEMS.register("tinkers_boots_143",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_BOOTS_144 = ITEMS.register("tinkers_boots_144",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_BOOTS_145 = ITEMS.register("tinkers_boots_145",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_BOOTS_146 = ITEMS.register("tinkers_boots_146",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_BOOTS_147 = ITEMS.register("tinkers_boots_147",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_148 = ITEMS.register("tinkers_boots_148",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.MAGNESIUM, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_149 = ITEMS.register("tinkers_boots_149",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.SILVER, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_BOOTS_150 = ITEMS.register("tinkers_boots_150",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.SILVER, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_BOOTS_151 = ITEMS.register("tinkers_boots_151",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.SILVER, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_BOOTS_152 = ITEMS.register("tinkers_boots_152",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.SILVER, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_BOOTS_153 = ITEMS.register("tinkers_boots_153",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.SILVER, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_154 = ITEMS.register("tinkers_boots_154",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.SILVER, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_BOOTS_155 = ITEMS.register("tinkers_boots_155",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.SILVER, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_BOOTS_156 = ITEMS.register("tinkers_boots_156",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.SILVER, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_157 = ITEMS.register("tinkers_boots_157",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.SILVER, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_BOOTS_158 = ITEMS.register("tinkers_boots_158",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.SILVER, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_BOOTS_159 = ITEMS.register("tinkers_boots_159",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.SILVER, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_BOOTS_160 = ITEMS.register("tinkers_boots_160",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.SILVER, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_BOOTS_161 = ITEMS.register("tinkers_boots_161",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.SILVER, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_162 = ITEMS.register("tinkers_boots_162",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.SILVER, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_163 = ITEMS.register("tinkers_boots_163",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.LEAD, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_BOOTS_164 = ITEMS.register("tinkers_boots_164",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.LEAD, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_BOOTS_165 = ITEMS.register("tinkers_boots_165",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.LEAD, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_BOOTS_166 = ITEMS.register("tinkers_boots_166",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.LEAD, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_BOOTS_167 = ITEMS.register("tinkers_boots_167",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.LEAD, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_168 = ITEMS.register("tinkers_boots_168",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.LEAD, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_BOOTS_169 = ITEMS.register("tinkers_boots_169",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.LEAD, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_BOOTS_170 = ITEMS.register("tinkers_boots_170",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.LEAD, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_171 = ITEMS.register("tinkers_boots_171",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.LEAD, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_BOOTS_172 = ITEMS.register("tinkers_boots_172",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.LEAD, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_BOOTS_173 = ITEMS.register("tinkers_boots_173",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.LEAD, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_BOOTS_174 = ITEMS.register("tinkers_boots_174",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.LEAD, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_BOOTS_175 = ITEMS.register("tinkers_boots_175",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.LEAD, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_176 = ITEMS.register("tinkers_boots_176",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.LEAD, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_177 = ITEMS.register("tinkers_boots_177",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRASS, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_BOOTS_178 = ITEMS.register("tinkers_boots_178",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRASS, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_BOOTS_179 = ITEMS.register("tinkers_boots_179",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRASS, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_BOOTS_180 = ITEMS.register("tinkers_boots_180",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRASS, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_BOOTS_181 = ITEMS.register("tinkers_boots_181",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRASS, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_182 = ITEMS.register("tinkers_boots_182",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRASS, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_BOOTS_183 = ITEMS.register("tinkers_boots_183",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRASS, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_BOOTS_184 = ITEMS.register("tinkers_boots_184",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRASS, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_185 = ITEMS.register("tinkers_boots_185",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRASS, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_BOOTS_186 = ITEMS.register("tinkers_boots_186",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRASS, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_BOOTS_187 = ITEMS.register("tinkers_boots_187",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRASS, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_BOOTS_188 = ITEMS.register("tinkers_boots_188",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRASS, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_BOOTS_189 = ITEMS.register("tinkers_boots_189",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRASS, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_190 = ITEMS.register("tinkers_boots_190",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRASS, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_191 = ITEMS.register("tinkers_boots_191",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRONZE, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_BOOTS_192 = ITEMS.register("tinkers_boots_192",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRONZE, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_BOOTS_193 = ITEMS.register("tinkers_boots_193",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRONZE, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_BOOTS_194 = ITEMS.register("tinkers_boots_194",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRONZE, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_BOOTS_195 = ITEMS.register("tinkers_boots_195",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRONZE, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_196 = ITEMS.register("tinkers_boots_196",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRONZE, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_BOOTS_197 = ITEMS.register("tinkers_boots_197",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRONZE, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_BOOTS_198 = ITEMS.register("tinkers_boots_198",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRONZE, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_199 = ITEMS.register("tinkers_boots_199",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRONZE, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_BOOTS_200 = ITEMS.register("tinkers_boots_200",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRONZE, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_BOOTS_201 = ITEMS.register("tinkers_boots_201",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRONZE, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_BOOTS_202 = ITEMS.register("tinkers_boots_202",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRONZE, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_BOOTS_203 = ITEMS.register("tinkers_boots_203",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRONZE, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_204 = ITEMS.register("tinkers_boots_204",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.BRONZE, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_205 = ITEMS.register("tinkers_boots_205",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_BOOTS_206 = ITEMS.register("tinkers_boots_206",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_BOOTS_207 = ITEMS.register("tinkers_boots_207",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_BOOTS_208 = ITEMS.register("tinkers_boots_208",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_BOOTS_209 = ITEMS.register("tinkers_boots_209",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_210 = ITEMS.register("tinkers_boots_210",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_BOOTS_211 = ITEMS.register("tinkers_boots_211",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_BOOTS_212 = ITEMS.register("tinkers_boots_212",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_213 = ITEMS.register("tinkers_boots_213",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_BOOTS_214 = ITEMS.register("tinkers_boots_214",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_BOOTS_215 = ITEMS.register("tinkers_boots_215",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_BOOTS_216 = ITEMS.register("tinkers_boots_216",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_BOOTS_217 = ITEMS.register("tinkers_boots_217",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_218 = ITEMS.register("tinkers_boots_218",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.VIBRANIUM, ModMaterial.ADAMANTIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_219 = ITEMS.register("tinkers_boots_219",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.COPPER));
    public static RegistryObject<Item> TINKERS_BOOTS_220 = ITEMS.register("tinkers_boots_220",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.IRON));
    public static RegistryObject<Item> TINKERS_BOOTS_221 = ITEMS.register("tinkers_boots_221",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.GOLD));
    public static RegistryObject<Item> TINKERS_BOOTS_222 = ITEMS.register("tinkers_boots_222",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.OBSIDIAN));
    public static RegistryObject<Item> TINKERS_BOOTS_223 = ITEMS.register("tinkers_boots_223",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.ALUMINIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_224 = ITEMS.register("tinkers_boots_224",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.TIN));
    public static RegistryObject<Item> TINKERS_BOOTS_225 = ITEMS.register("tinkers_boots_225",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.ZINC));
    public static RegistryObject<Item> TINKERS_BOOTS_226 = ITEMS.register("tinkers_boots_226",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.MAGNESIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_227 = ITEMS.register("tinkers_boots_227",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.SILVER));
    public static RegistryObject<Item> TINKERS_BOOTS_228 = ITEMS.register("tinkers_boots_228",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.LEAD));
    public static RegistryObject<Item> TINKERS_BOOTS_229 = ITEMS.register("tinkers_boots_229",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.BRASS));
    public static RegistryObject<Item> TINKERS_BOOTS_230 = ITEMS.register("tinkers_boots_230",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.BRONZE));
    public static RegistryObject<Item> TINKERS_BOOTS_231 = ITEMS.register("tinkers_boots_231",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.VIBRANIUM));
    public static RegistryObject<Item> TINKERS_BOOTS_232 = ITEMS.register("tinkers_boots_232",
            () -> new BootsItem(new Item.Properties().tab(ModCreativeModeTab.BOOTS_TAB),
                    ModMaterial.ADAMANTIUM, ModMaterial.ADAMANTIUM));


    // Register all the items in the list
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
