package me.tudorcoroian.armortinkers.util;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> MAPLE_LOGS = tag("maple_logs");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ArmorTinkers.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MAPLE_LOGS = tag("maple_logs");
        public static final TagKey<Item> PATTERNS = tag("patterns");
        public static final TagKey<Item> BLANK_PATTERNS = tag("blank_patterns");
        public static final TagKey<Item> WOODEN_PLANKS = tag("wooden_planks_t1");
        public static final TagKey<Item> HELMET_PLATES_T1 = tag("helmet_plates_t1");
        public static final TagKey<Item> SHOULDER_PLATES_T1 = tag("shoulder_plates_t1");
        public static final TagKey<Item> FRONT_PLATES_T1 = tag("front_plates_t1");
        public static final TagKey<Item> BACK_PLATES_T1 = tag("back_plates_t1");
        public static final TagKey<Item> WRIST_BANDS_T1 = tag("wrist_bands_t1");
        public static final TagKey<Item> TAIL_PLATES_T1 = tag("tail_plates_t1");
        public static final TagKey<Item> LEG_PLATES_T1 = tag("leg_bands_t1");
        public static final TagKey<Item> BOOT_PLATES_T1 = tag("boot_bands_t1");
        public static final TagKey<Item> HELMET_PLATES_T2 = tag("helmet_plates_t2");
        public static final TagKey<Item> SHOULDER_PLATES_T2 = tag("shoulder_plates_t2");
        public static final TagKey<Item> FRONT_PLATES_T2 = tag("front_plates_t2");
        public static final TagKey<Item> BACK_PLATES_T2 = tag("back_plates_t2");
        public static final TagKey<Item> WRIST_BANDS_T2 = tag("wrist_bands_t2");
        public static final TagKey<Item> TAIL_PLATES_T2 = tag("tail_plates_t2");
        public static final TagKey<Item> LEG_PLATES_T2 = tag("leg_bands_t2");
        public static final TagKey<Item> BOOT_PLATES_T2 = tag("boot_bands_t2");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(ArmorTinkers.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
