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

    // First tier of the mod guide book
    public static final RegistryObject<Item> GUIDE_BOOK_TIER_1 = ITEMS.register("guide_book_t1",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    // Register all the items in the list
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
