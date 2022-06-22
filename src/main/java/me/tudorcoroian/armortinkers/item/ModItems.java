package me.tudorcoroian.armortinkers.item;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.item.custom.ArmorPartItem;
import me.tudorcoroian.armortinkers.item.custom.ResinItem;
import me.tudorcoroian.armortinkers.recipe.ModRecipes;
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


    // Register all the items in the list
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
