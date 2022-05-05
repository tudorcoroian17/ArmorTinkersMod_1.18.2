package me.tudorcoroian.armortinkers.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ARMOR_TINKERS_TAB = new CreativeModeTab("armortinkerstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HIDE_VEST.get());
        }
    };
}
