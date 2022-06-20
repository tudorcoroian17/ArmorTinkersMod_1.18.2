package me.tudorcoroian.armortinkers.item;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.item.custom.ResinItem;
import me.tudorcoroian.armortinkers.recipe.ModRecipes;
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


    // Register all the items in the list
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
