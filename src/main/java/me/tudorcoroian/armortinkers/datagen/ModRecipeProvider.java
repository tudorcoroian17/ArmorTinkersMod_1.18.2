package me.tudorcoroian.armortinkers.datagen;

import me.tudorcoroian.armortinkers.block.ModBlocks;
import me.tudorcoroian.armortinkers.datagen.custom.ArmorPartTinkeringRecipeBuilder;
import me.tudorcoroian.armortinkers.datagen.custom.PatternScribingRecipeBuilder;
import me.tudorcoroian.armortinkers.item.ModItems;
import me.tudorcoroian.armortinkers.util.ModTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(ModBlocks.ARMOR_PART_MAKER.get())
                .define('S', Blocks.SMOOTH_STONE)
                .define('L', Blocks.OAK_LOG)
                .define('P', ModTags.Items.BLANK_PATTERNS)
                .pattern("SSS")
                .pattern("LPL")
                .pattern("L L")
                .unlockedBy("has_blank_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.BLANK_PATTERNS).build()))
                .save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModBlocks.PATTERN_STATION.get())
                .define('S', Blocks.OAK_PLANKS)
                .define('L', Blocks.OAK_LOG)
                .define('P', ModTags.Items.BLANK_PATTERNS)
                .pattern("SSS")
                .pattern("LPL")
                .pattern("L L")
                .unlockedBy("has_blank_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModTags.Items.BLANK_PATTERNS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.STONE_HAMMER.get())
                .define('C', Blocks.COBBLESTONE)
                .define('S', Items.STICK)
                .pattern(" C ")
                .pattern(" SC")
                .pattern("S  ")
                .unlockedBy("has_cobblestone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Blocks.COBBLESTONE).build()))
                .save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.IRON_HAMMER.get())
                .define('I', Items.IRON_INGOT)
                .define('S', Items.STICK)
                .pattern(" I ")
                .pattern(" SI")
                .pattern("S  ")
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.BLANK_WOOD_PATTERN.get())
                .define('W', ModTags.Items.WOODEN_PLANKS)
                .define('S', Items.STICK)
                .pattern("WS")
                .pattern("SW")
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.BLANK_GOLD_PATTERN.get())
                .define('G', Items.GOLD_INGOT)
                .define('S', Items.STICK)
                .pattern("GS")
                .pattern("SG")
                .unlockedBy("has_stick", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.STICK).build()))
                .save(pFinishedRecipeConsumer);

        new PatternScribingRecipeBuilder(Items.RED_DYE,
                ModItems.BLANK_WOOD_PATTERN.get(),
                ModItems.HEAD_PLATE_WOOD_PATTERN.get(), 1)
                .unlockedBy("has_blank_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new PatternScribingRecipeBuilder(Items.RED_DYE,
                ModItems.BLANK_GOLD_PATTERN.get(),
                ModItems.HEAD_PLATE_GOLD_PATTERN.get(), 1)
                .unlockedBy("has_blank_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new PatternScribingRecipeBuilder(Items.BLUE_DYE,
                ModItems.BLANK_WOOD_PATTERN.get(),
                ModItems.FRONT_PLATE_WOOD_PATTERN.get(), 1)
                .unlockedBy("has_blank_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new PatternScribingRecipeBuilder(Items.BLUE_DYE,
                ModItems.BLANK_GOLD_PATTERN.get(),
                ModItems.FRONT_PLATE_GOLD_PATTERN.get(), 1)
                .unlockedBy("has_blank_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new PatternScribingRecipeBuilder(Items.BLACK_DYE,
                ModItems.BLANK_WOOD_PATTERN.get(),
                ModItems.BACK_PLATE_WOOD_PATTERN.get(), 1)
                .unlockedBy("has_blank_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new PatternScribingRecipeBuilder(Items.BLACK_DYE,
                ModItems.BLANK_GOLD_PATTERN.get(),
                ModItems.BACK_PLATE_GOLD_PATTERN.get(), 1)
                .unlockedBy("has_blank_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new PatternScribingRecipeBuilder(Items.GREEN_DYE,
                ModItems.BLANK_WOOD_PATTERN.get(),
                ModItems.SHOULDER_PLATE_WOOD_PATTERN.get(), 1)
                .unlockedBy("has_blank_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new PatternScribingRecipeBuilder(Items.GREEN_DYE,
                ModItems.BLANK_GOLD_PATTERN.get(),
                ModItems.SHOULDER_PLATE_GOLD_PATTERN.get(), 1)
                .unlockedBy("has_blank_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new PatternScribingRecipeBuilder(Items.PINK_DYE,
                ModItems.BLANK_WOOD_PATTERN.get(),
                ModItems.WRIST_BAND_WOOD_PATTERN.get(), 1)
                .unlockedBy("has_blank_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new PatternScribingRecipeBuilder(Items.PINK_DYE,
                ModItems.BLANK_GOLD_PATTERN.get(),
                ModItems.WRIST_BAND_GOLD_PATTERN.get(), 1)
                .unlockedBy("has_blank_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new PatternScribingRecipeBuilder(Items.WHITE_DYE,
                ModItems.BLANK_WOOD_PATTERN.get(),
                ModItems.LEG_PLATE_WOOD_PATTERN.get(), 1)
                .unlockedBy("has_blank_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new PatternScribingRecipeBuilder(Items.WHITE_DYE,
                ModItems.BLANK_GOLD_PATTERN.get(),
                ModItems.LEG_PLATE_GOLD_PATTERN.get(), 1)
                .unlockedBy("has_blank_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new PatternScribingRecipeBuilder(Items.YELLOW_DYE,
                ModItems.BLANK_WOOD_PATTERN.get(),
                ModItems.TAIL_PLATE_WOOD_PATTERN.get(), 1)
                .unlockedBy("has_blank_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new PatternScribingRecipeBuilder(Items.YELLOW_DYE,
                ModItems.BLANK_GOLD_PATTERN.get(),
                ModItems.TAIL_PLATE_GOLD_PATTERN.get(), 1)
                .unlockedBy("has_blank_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new PatternScribingRecipeBuilder(Items.CYAN_DYE,
                ModItems.BLANK_WOOD_PATTERN.get(),
                ModItems.BOOT_PLATE_WOOD_PATTERN.get(), 1)
                .unlockedBy("has_blank_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new PatternScribingRecipeBuilder(Items.CYAN_DYE,
                ModItems.BLANK_GOLD_PATTERN.get(),
                ModItems.BOOT_PLATE_GOLD_PATTERN.get(), 1)
                .unlockedBy("has_blank_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLANK_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.HEAD_PLATE_GOLD_PATTERN.get(),
                ModItems.MAGNESIUM_INGOT.get(),
                ModItems.MAGNESIUM_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.FRONT_PLATE_GOLD_PATTERN.get(),
                ModItems.MAGNESIUM_INGOT.get(),
                ModItems.MAGNESIUM_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BACK_PLATE_GOLD_PATTERN.get(),
                ModItems.MAGNESIUM_INGOT.get(),
                ModItems.MAGNESIUM_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.SHOULDER_PLATE_GOLD_PATTERN.get(),
                ModItems.MAGNESIUM_INGOT.get(),
                ModItems.MAGNESIUM_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.WRIST_BAND_GOLD_PATTERN.get(),
                ModItems.MAGNESIUM_INGOT.get(),
                ModItems.MAGNESIUM_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.LEG_PLATE_GOLD_PATTERN.get(),
                ModItems.MAGNESIUM_INGOT.get(),
                ModItems.MAGNESIUM_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.TAIL_PLATE_GOLD_PATTERN.get(),
                ModItems.MAGNESIUM_INGOT.get(),
                ModItems.MAGNESIUM_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BOOT_PLATE_GOLD_PATTERN.get(),
                ModItems.MAGNESIUM_INGOT.get(),
                ModItems.MAGNESIUM_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.HEAD_PLATE_GOLD_PATTERN.get(),
                ModItems.TIN_INGOT.get(),
                ModItems.TIN_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.FRONT_PLATE_GOLD_PATTERN.get(),
                ModItems.TIN_INGOT.get(),
                ModItems.TIN_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BACK_PLATE_GOLD_PATTERN.get(),
                ModItems.TIN_INGOT.get(),
                ModItems.TIN_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.SHOULDER_PLATE_GOLD_PATTERN.get(),
                ModItems.TIN_INGOT.get(),
                ModItems.TIN_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.WRIST_BAND_GOLD_PATTERN.get(),
                ModItems.TIN_INGOT.get(),
                ModItems.TIN_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.LEG_PLATE_GOLD_PATTERN.get(),
                ModItems.TIN_INGOT.get(),
                ModItems.TIN_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.TAIL_PLATE_GOLD_PATTERN.get(),
                ModItems.TIN_INGOT.get(),
                ModItems.TIN_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BOOT_PLATE_GOLD_PATTERN.get(),
                ModItems.TIN_INGOT.get(),
                ModItems.TIN_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.HEAD_PLATE_GOLD_PATTERN.get(),
                ModItems.ZINC_INGOT.get(),
                ModItems.ZINC_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.FRONT_PLATE_GOLD_PATTERN.get(),
                ModItems.ZINC_INGOT.get(),
                ModItems.ZINC_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BACK_PLATE_GOLD_PATTERN.get(),
                ModItems.ZINC_INGOT.get(),
                ModItems.ZINC_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.SHOULDER_PLATE_GOLD_PATTERN.get(),
                ModItems.ZINC_INGOT.get(),
                ModItems.ZINC_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.WRIST_BAND_GOLD_PATTERN.get(),
                ModItems.ZINC_INGOT.get(),
                ModItems.ZINC_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.LEG_PLATE_GOLD_PATTERN.get(),
                ModItems.ZINC_INGOT.get(),
                ModItems.ZINC_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.TAIL_PLATE_GOLD_PATTERN.get(),
                ModItems.ZINC_INGOT.get(),
                ModItems.ZINC_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BOOT_PLATE_GOLD_PATTERN.get(),
                ModItems.ZINC_INGOT.get(),
                ModItems.ZINC_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.HEAD_PLATE_GOLD_PATTERN.get(),
                ModItems.SILVER_INGOT.get(),
                ModItems.SILVER_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.FRONT_PLATE_GOLD_PATTERN.get(),
                ModItems.SILVER_INGOT.get(),
                ModItems.SILVER_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BACK_PLATE_GOLD_PATTERN.get(),
                ModItems.SILVER_INGOT.get(),
                ModItems.SILVER_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.SHOULDER_PLATE_GOLD_PATTERN.get(),
                ModItems.SILVER_INGOT.get(),
                ModItems.SILVER_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.WRIST_BAND_GOLD_PATTERN.get(),
                ModItems.SILVER_INGOT.get(),
                ModItems.SILVER_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.LEG_PLATE_GOLD_PATTERN.get(),
                ModItems.SILVER_INGOT.get(),
                ModItems.SILVER_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.TAIL_PLATE_GOLD_PATTERN.get(),
                ModItems.SILVER_INGOT.get(),
                ModItems.SILVER_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BOOT_PLATE_GOLD_PATTERN.get(),
                ModItems.SILVER_INGOT.get(),
                ModItems.SILVER_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.HEAD_PLATE_GOLD_PATTERN.get(),
                ModItems.LEAD_INGOT.get(),
                ModItems.LEAD_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.FRONT_PLATE_GOLD_PATTERN.get(),
                ModItems.LEAD_INGOT.get(),
                ModItems.LEAD_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BACK_PLATE_GOLD_PATTERN.get(),
                ModItems.LEAD_INGOT.get(),
                ModItems.LEAD_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.SHOULDER_PLATE_GOLD_PATTERN.get(),
                ModItems.LEAD_INGOT.get(),
                ModItems.LEAD_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.WRIST_BAND_GOLD_PATTERN.get(),
                ModItems.LEAD_INGOT.get(),
                ModItems.LEAD_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.LEG_PLATE_GOLD_PATTERN.get(),
                ModItems.LEAD_INGOT.get(),
                ModItems.LEAD_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.TAIL_PLATE_GOLD_PATTERN.get(),
                ModItems.LEAD_INGOT.get(),
                ModItems.LEAD_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BOOT_PLATE_GOLD_PATTERN.get(),
                ModItems.LEAD_INGOT.get(),
                ModItems.LEAD_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.HEAD_PLATE_GOLD_PATTERN.get(),
                ModItems.BRASS_INGOT.get(),
                ModItems.BRASS_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.FRONT_PLATE_GOLD_PATTERN.get(),
                ModItems.BRASS_INGOT.get(),
                ModItems.BRASS_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BACK_PLATE_GOLD_PATTERN.get(),
                ModItems.BRASS_INGOT.get(),
                ModItems.BRASS_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.SHOULDER_PLATE_GOLD_PATTERN.get(),
                ModItems.BRASS_INGOT.get(),
                ModItems.BRASS_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.WRIST_BAND_GOLD_PATTERN.get(),
                ModItems.BRASS_INGOT.get(),
                ModItems.BRASS_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.LEG_PLATE_GOLD_PATTERN.get(),
                ModItems.BRASS_INGOT.get(),
                ModItems.BRASS_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.TAIL_PLATE_GOLD_PATTERN.get(),
                ModItems.BRASS_INGOT.get(),
                ModItems.BRASS_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BOOT_PLATE_GOLD_PATTERN.get(),
                ModItems.BRASS_INGOT.get(),
                ModItems.BRASS_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.HEAD_PLATE_GOLD_PATTERN.get(),
                ModItems.BRONZE_INGOT.get(),
                ModItems.BRONZE_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.FRONT_PLATE_GOLD_PATTERN.get(),
                ModItems.BRONZE_INGOT.get(),
                ModItems.BRONZE_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BACK_PLATE_GOLD_PATTERN.get(),
                ModItems.BRONZE_INGOT.get(),
                ModItems.BRONZE_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.SHOULDER_PLATE_GOLD_PATTERN.get(),
                ModItems.BRONZE_INGOT.get(),
                ModItems.BRONZE_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.WRIST_BAND_GOLD_PATTERN.get(),
                ModItems.BRONZE_INGOT.get(),
                ModItems.BRONZE_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.LEG_PLATE_GOLD_PATTERN.get(),
                ModItems.BRONZE_INGOT.get(),
                ModItems.BRONZE_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.TAIL_PLATE_GOLD_PATTERN.get(),
                ModItems.BRONZE_INGOT.get(),
                ModItems.BRONZE_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BOOT_PLATE_GOLD_PATTERN.get(),
                ModItems.BRONZE_INGOT.get(),
                ModItems.BRONZE_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.HEAD_PLATE_GOLD_PATTERN.get(),
                ModItems.VIBRANIUM_INGOT.get(),
                ModItems.VIBRANIUM_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.FRONT_PLATE_GOLD_PATTERN.get(),
                ModItems.VIBRANIUM_INGOT.get(),
                ModItems.VIBRANIUM_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BACK_PLATE_GOLD_PATTERN.get(),
                ModItems.VIBRANIUM_INGOT.get(),
                ModItems.VIBRANIUM_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.SHOULDER_PLATE_GOLD_PATTERN.get(),
                ModItems.VIBRANIUM_INGOT.get(),
                ModItems.VIBRANIUM_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.WRIST_BAND_GOLD_PATTERN.get(),
                ModItems.VIBRANIUM_INGOT.get(),
                ModItems.VIBRANIUM_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.LEG_PLATE_GOLD_PATTERN.get(),
                ModItems.VIBRANIUM_INGOT.get(),
                ModItems.VIBRANIUM_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.TAIL_PLATE_GOLD_PATTERN.get(),
                ModItems.VIBRANIUM_INGOT.get(),
                ModItems.VIBRANIUM_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BOOT_PLATE_GOLD_PATTERN.get(),
                ModItems.VIBRANIUM_INGOT.get(),
                ModItems.VIBRANIUM_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.HEAD_PLATE_GOLD_PATTERN.get(),
                ModItems.ADAMANTIUM_INGOT.get(),
                ModItems.ADAMANTIUM_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.FRONT_PLATE_GOLD_PATTERN.get(),
                ModItems.ADAMANTIUM_INGOT.get(),
                ModItems.ADAMANTIUM_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BACK_PLATE_GOLD_PATTERN.get(),
                ModItems.ADAMANTIUM_INGOT.get(),
                ModItems.ADAMANTIUM_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.SHOULDER_PLATE_GOLD_PATTERN.get(),
                ModItems.ADAMANTIUM_INGOT.get(),
                ModItems.ADAMANTIUM_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.WRIST_BAND_GOLD_PATTERN.get(),
                ModItems.ADAMANTIUM_INGOT.get(),
                ModItems.ADAMANTIUM_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.LEG_PLATE_GOLD_PATTERN.get(),
                ModItems.ADAMANTIUM_INGOT.get(),
                ModItems.ADAMANTIUM_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.TAIL_PLATE_GOLD_PATTERN.get(),
                ModItems.ADAMANTIUM_INGOT.get(),
                ModItems.ADAMANTIUM_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BOOT_PLATE_GOLD_PATTERN.get(),
                ModItems.ADAMANTIUM_INGOT.get(),
                ModItems.ADAMANTIUM_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.HEAD_PLATE_GOLD_PATTERN.get(),
                Items.COPPER_INGOT,
                ModItems.COPPER_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.FRONT_PLATE_GOLD_PATTERN.get(),
                Items.COPPER_INGOT,
                ModItems.COPPER_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BACK_PLATE_GOLD_PATTERN.get(),
                Items.COPPER_INGOT,
                ModItems.COPPER_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.SHOULDER_PLATE_GOLD_PATTERN.get(),
                Items.COPPER_INGOT,
                ModItems.COPPER_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.WRIST_BAND_GOLD_PATTERN.get(),
                Items.COPPER_INGOT,
                ModItems.COPPER_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.LEG_PLATE_GOLD_PATTERN.get(),
                Items.COPPER_INGOT,
                ModItems.COPPER_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.TAIL_PLATE_GOLD_PATTERN.get(),
                Items.COPPER_INGOT,
                ModItems.COPPER_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BOOT_PLATE_GOLD_PATTERN.get(),
                Items.COPPER_INGOT,
                ModItems.COPPER_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.HEAD_PLATE_GOLD_PATTERN.get(),
                Items.IRON_INGOT,
                ModItems.IRON_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.FRONT_PLATE_GOLD_PATTERN.get(),
                Items.IRON_INGOT,
                ModItems.IRON_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BACK_PLATE_GOLD_PATTERN.get(),
                Items.IRON_INGOT,
                ModItems.IRON_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.SHOULDER_PLATE_GOLD_PATTERN.get(),
                Items.IRON_INGOT,
                ModItems.IRON_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.WRIST_BAND_GOLD_PATTERN.get(),
                Items.IRON_INGOT,
                ModItems.IRON_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.LEG_PLATE_GOLD_PATTERN.get(),
                Items.IRON_INGOT,
                ModItems.IRON_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.TAIL_PLATE_GOLD_PATTERN.get(),
                Items.IRON_INGOT,
                ModItems.IRON_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BOOT_PLATE_GOLD_PATTERN.get(),
                Items.IRON_INGOT,
                ModItems.IRON_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.HEAD_PLATE_GOLD_PATTERN.get(),
                Items.GOLD_INGOT,
                ModItems.GOLD_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.FRONT_PLATE_GOLD_PATTERN.get(),
                Items.GOLD_INGOT,
                ModItems.GOLD_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BACK_PLATE_GOLD_PATTERN.get(),
                Items.GOLD_INGOT,
                ModItems.GOLD_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.SHOULDER_PLATE_GOLD_PATTERN.get(),
                Items.GOLD_INGOT,
                ModItems.GOLD_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.WRIST_BAND_GOLD_PATTERN.get(),
                Items.GOLD_INGOT,
                ModItems.GOLD_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.LEG_PLATE_GOLD_PATTERN.get(),
                Items.GOLD_INGOT,
                ModItems.GOLD_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.TAIL_PLATE_GOLD_PATTERN.get(),
                Items.GOLD_INGOT,
                ModItems.GOLD_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BOOT_PLATE_GOLD_PATTERN.get(),
                Items.GOLD_INGOT,
                ModItems.GOLD_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.HEAD_PLATE_GOLD_PATTERN.get(),
                Blocks.OBSIDIAN,
                ModItems.OBSIDIAN_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.FRONT_PLATE_GOLD_PATTERN.get(),
                Blocks.OBSIDIAN,
                ModItems.OBSIDIAN_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BACK_PLATE_GOLD_PATTERN.get(),
                Blocks.OBSIDIAN,
                ModItems.OBSIDIAN_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.SHOULDER_PLATE_GOLD_PATTERN.get(),
                Blocks.OBSIDIAN,
                ModItems.OBSIDIAN_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.WRIST_BAND_GOLD_PATTERN.get(),
                Blocks.OBSIDIAN,
                ModItems.OBSIDIAN_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.LEG_PLATE_GOLD_PATTERN.get(),
                Blocks.OBSIDIAN,
                ModItems.OBSIDIAN_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.TAIL_PLATE_GOLD_PATTERN.get(),
                Blocks.OBSIDIAN,
                ModItems.OBSIDIAN_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.IRON_HAMMER.get(),
                ModItems.BOOT_PLATE_GOLD_PATTERN.get(),
                Blocks.OBSIDIAN,
                ModItems.OBSIDIAN_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_gold_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_GOLD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.HEAD_PLATE_WOOD_PATTERN.get(),
                ModBlocks.MAPLE_LOG.get(),
                ModItems.WOOD_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.FRONT_PLATE_WOOD_PATTERN.get(),
                ModBlocks.MAPLE_LOG.get(),
                ModItems.WOOD_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.BACK_PLATE_WOOD_PATTERN.get(),
                ModBlocks.MAPLE_LOG.get(),
                ModItems.WOOD_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.SHOULDER_PLATE_WOOD_PATTERN.get(),
                ModBlocks.MAPLE_LOG.get(),
                ModItems.WOOD_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.WRIST_BAND_WOOD_PATTERN.get(),
                ModBlocks.MAPLE_LOG.get(),
                ModItems.WOOD_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.LEG_PLATE_WOOD_PATTERN.get(),
                ModBlocks.MAPLE_LOG.get(),
                ModItems.WOOD_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.TAIL_PLATE_WOOD_PATTERN.get(),
                ModBlocks.MAPLE_LOG.get(),
                ModItems.WOOD_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.BOOT_PLATE_WOOD_PATTERN.get(),
                ModBlocks.MAPLE_LOG.get(),
                ModItems.WOOD_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.HEAD_PLATE_WOOD_PATTERN.get(),
                Blocks.CACTUS,
                ModItems.CACTUS_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.FRONT_PLATE_WOOD_PATTERN.get(),
                Blocks.CACTUS,
                ModItems.CACTUS_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.BACK_PLATE_WOOD_PATTERN.get(),
                Blocks.CACTUS,
                ModItems.CACTUS_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.SHOULDER_PLATE_WOOD_PATTERN.get(),
                Blocks.CACTUS,
                ModItems.CACTUS_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.WRIST_BAND_WOOD_PATTERN.get(),
                Blocks.CACTUS,
                ModItems.CACTUS_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.LEG_PLATE_WOOD_PATTERN.get(),
                Blocks.CACTUS,
                ModItems.CACTUS_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.TAIL_PLATE_WOOD_PATTERN.get(),
                Blocks.CACTUS,
                ModItems.CACTUS_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.BOOT_PLATE_WOOD_PATTERN.get(),
                Blocks.CACTUS,
                ModItems.CACTUS_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.HEAD_PLATE_WOOD_PATTERN.get(),
                Blocks.STONE,
                ModItems.STONE_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.FRONT_PLATE_WOOD_PATTERN.get(),
                Blocks.STONE,
                ModItems.STONE_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.BACK_PLATE_WOOD_PATTERN.get(),
                Blocks.STONE,
                ModItems.STONE_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.SHOULDER_PLATE_WOOD_PATTERN.get(),
                Blocks.STONE,
                ModItems.STONE_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.WRIST_BAND_WOOD_PATTERN.get(),
                Blocks.STONE,
                ModItems.STONE_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.LEG_PLATE_WOOD_PATTERN.get(),
                Blocks.STONE,
                ModItems.STONE_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.TAIL_PLATE_WOOD_PATTERN.get(),
                Blocks.STONE,
                ModItems.STONE_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.BOOT_PLATE_WOOD_PATTERN.get(),
                Blocks.STONE,
                ModItems.STONE_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.HEAD_PLATE_WOOD_PATTERN.get(),
                Blocks.NETHERRACK,
                ModItems.NETHERACK_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.FRONT_PLATE_WOOD_PATTERN.get(),
                Blocks.NETHERRACK,
                ModItems.NETHERACK_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.BACK_PLATE_WOOD_PATTERN.get(),
                Blocks.NETHERRACK,
                ModItems.NETHERACK_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.SHOULDER_PLATE_WOOD_PATTERN.get(),
                Blocks.NETHERRACK,
                ModItems.NETHERACK_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.WRIST_BAND_WOOD_PATTERN.get(),
                Blocks.NETHERRACK,
                ModItems.NETHERACK_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.LEG_PLATE_WOOD_PATTERN.get(),
                Blocks.NETHERRACK,
                ModItems.NETHERACK_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.TAIL_PLATE_WOOD_PATTERN.get(),
                Blocks.NETHERRACK,
                ModItems.NETHERACK_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.BOOT_PLATE_WOOD_PATTERN.get(),
                Blocks.NETHERRACK,
                ModItems.NETHERACK_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.HEAD_PLATE_WOOD_PATTERN.get(),
                Blocks.END_STONE,
                ModItems.END_STONE_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.FRONT_PLATE_WOOD_PATTERN.get(),
                Blocks.END_STONE,
                ModItems.END_STONE_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.BACK_PLATE_WOOD_PATTERN.get(),
                Blocks.END_STONE,
                ModItems.END_STONE_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.SHOULDER_PLATE_WOOD_PATTERN.get(),
                Blocks.END_STONE,
                ModItems.END_STONE_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.WRIST_BAND_WOOD_PATTERN.get(),
                Blocks.END_STONE,
                ModItems.END_STONE_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.LEG_PLATE_WOOD_PATTERN.get(),
                Blocks.END_STONE,
                ModItems.END_STONE_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.TAIL_PLATE_WOOD_PATTERN.get(),
                Blocks.END_STONE,
                ModItems.END_STONE_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.BOOT_PLATE_WOOD_PATTERN.get(),
                Blocks.END_STONE,
                ModItems.END_STONE_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);

        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.HEAD_PLATE_WOOD_PATTERN.get(),
                Items.FLINT,
                ModItems.FLINT_HEAD_PLATE.get(), 1)
                .unlockedBy("has_head_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.HEAD_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.FRONT_PLATE_WOOD_PATTERN.get(),
                Items.FLINT,
                ModItems.FLINT_FRONT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.FRONT_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.BACK_PLATE_WOOD_PATTERN.get(),
                Items.FLINT,
                ModItems.FLINT_BACK_PLATE.get(), 1)
                .unlockedBy("has_back_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BACK_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.SHOULDER_PLATE_WOOD_PATTERN.get(),
                Items.FLINT,
                ModItems.FLINT_SHOULDER_PLATE.get(), 1)
                .unlockedBy("has_shoulder_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SHOULDER_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.WRIST_BAND_WOOD_PATTERN.get(),
                Items.FLINT,
                ModItems.FLINT_WRIST_BAND.get(), 1)
                .unlockedBy("has_wrist_band_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WRIST_BAND_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.LEG_PLATE_WOOD_PATTERN.get(),
                Items.FLINT,
                ModItems.FLINT_LEG_PLATE.get(), 1)
                .unlockedBy("has_leg_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEG_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.TAIL_PLATE_WOOD_PATTERN.get(),
                Items.FLINT,
                ModItems.FLINT_TAIL_PLATE.get(), 1)
                .unlockedBy("has_tail_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TAIL_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
        new ArmorPartTinkeringRecipeBuilder(ModItems.STONE_HAMMER.get(),
                ModItems.BOOT_PLATE_WOOD_PATTERN.get(),
                Items.FLINT,
                ModItems.FLINT_BOOT_PLATE.get(), 1)
                .unlockedBy("has_front_plate_wood_pattern", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BOOT_PLATE_WOOD_PATTERN.get()).build()))
                .save(pFinishedRecipeConsumer);
    }
}
