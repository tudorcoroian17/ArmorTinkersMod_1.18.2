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
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));

    public static final RegistryObject<Item> BLANK_WOOD_PATTERN = ITEMS.register("blank_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> HEAD_PLATE_WOOD_PATTERN = ITEMS.register("head_plate_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> SHOULDER_PLATE_WOOD_PATTERN = ITEMS.register("shoulder_plate_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> FRONT_PLATE_WOOD_PATTERN = ITEMS.register("front_plate_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> BACK_PLATE_WOOD_PATTERN = ITEMS.register("back_plate_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> WRIST_BAND_WOOD_PATTERN = ITEMS.register("wrist_band_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> LEG_PLATE_WOOD_PATTERN = ITEMS.register("leg_plate_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> TAIL_PLATE_WOOD_PATTERN = ITEMS.register("tail_plate_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> BOOT_PLATE_WOOD_PATTERN = ITEMS.register("boot_plate_wood_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> BLANK_GOLD_PATTERN = ITEMS.register("blank_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> HEAD_PLATE_GOLD_PATTERN = ITEMS.register("head_plate_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> SHOULDER_PLATE_GOLD_PATTERN = ITEMS.register("shoulder_plate_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> FRONT_PLATE_GOLD_PATTERN = ITEMS.register("front_plate_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> BACK_PLATE_GOLD_PATTERN = ITEMS.register("back_plate_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> WRIST_BAND_GOLD_PATTERN = ITEMS.register("wrist_band_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> LEG_PLATE_GOLD_PATTERN = ITEMS.register("leg_plate_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> TAIL_PLATE_GOLD_PATTERN = ITEMS.register("tail_plate_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));
    public static final RegistryObject<Item> BOOT_PLATE_GOLD_PATTERN = ITEMS.register("boot_plate_gold_pattern",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PATTERN_TAB)));

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


    // Register all the items in the list
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
