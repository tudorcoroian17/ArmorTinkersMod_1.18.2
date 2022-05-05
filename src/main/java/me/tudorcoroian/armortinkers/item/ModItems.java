package me.tudorcoroian.armortinkers.item;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // List of all the items added by the mod
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArmorTinkers.MOD_ID);

    // Declare and instantiate items
    public static final RegistryObject<Item> GUIDE_BOOK_TIER_1 = ITEMS.register("guide_book_t1",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));

    public static final RegistryObject<Item> HIDE_CAP = ITEMS.register("hide_cap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> HIDE_VEST = ITEMS.register("hide_vest",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> HIDE_PANTS = ITEMS.register("hide_pants",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));
    public static final RegistryObject<Item> HIDE_SOCKS = ITEMS.register("hide_socks",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ARMOR_TINKERS_TAB)));


    // Register all the items in the list
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
