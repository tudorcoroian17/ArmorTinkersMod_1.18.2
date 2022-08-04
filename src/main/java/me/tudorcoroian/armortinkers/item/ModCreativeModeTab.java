package me.tudorcoroian.armortinkers.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ARMOR_TINKERS_TAB = new CreativeModeTab("armortinkerstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HIDE_VEST.get());
        }
    };

    public static final CreativeModeTab PATTERN_TAB = new CreativeModeTab("patterntab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLANK_WOOD_PATTERN.get());
        }
    };
    public static final CreativeModeTab ARMOR_PART_TAB = new CreativeModeTab("armorparttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MAGNESIUM_HEAD_PLATE.get());
        }
    };
    public static final CreativeModeTab HELMET_TAB = new CreativeModeTab("helmettab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HELP_HELMET.get());
        }
    };

    public static final CreativeModeTab CHESTPLATE_TAB = new CreativeModeTab("chestplatetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HELP_CHESTPLATE.get());
        }
    };

    public static final CreativeModeTab LEGGINGS_TAB = new CreativeModeTab("leggingstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HELP_LEGGINGS.get());
        }
    };

    public static final CreativeModeTab BOOTS_TAB = new CreativeModeTab("bootstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HELP_BOOTS.get());
        }
    };
}
