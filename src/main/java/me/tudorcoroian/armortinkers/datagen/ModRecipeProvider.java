package me.tudorcoroian.armortinkers.datagen;

import me.tudorcoroian.armortinkers.datagen.custom.ArmorPartTinkeringRecipeBuilder;
import me.tudorcoroian.armortinkers.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
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
    }
}
