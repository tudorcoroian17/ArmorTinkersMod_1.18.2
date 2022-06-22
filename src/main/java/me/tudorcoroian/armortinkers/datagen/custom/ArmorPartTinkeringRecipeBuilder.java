package me.tudorcoroian.armortinkers.datagen.custom;

import com.google.gson.JsonObject;
import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.recipe.ArmorPartTinkeringRecipe;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.Nullable;

import com.google.gson.JsonArray;
import java.util.function.Consumer;

public class ArmorPartTinkeringRecipeBuilder implements RecipeBuilder {
    private final Item result;
    private final Ingredient hammer;
    private final Ingredient pattern;
    private final Ingredient material;
    private final int count;
    private final Advancement.Builder advancement = Advancement.Builder.advancement();

    public ArmorPartTinkeringRecipeBuilder(ItemLike hammer, ItemLike pattern, ItemLike material,ItemLike result, int count) {
        this.hammer = Ingredient.of(hammer);
        this.pattern = Ingredient.of(pattern);
        this.material = Ingredient.of(material);
        this.result = result.asItem();
        this.count = count;
    }

    @Override
    public RecipeBuilder unlockedBy(String pCriterionName, CriterionTriggerInstance pCriterionTrigger) {
        this.advancement.addCriterion(pCriterionName, pCriterionTrigger);
        return this;
    }

    @Override
    public RecipeBuilder group(@Nullable String pGroupName) {
        return this;
    }

    @Override
    public Item getResult() {
        return result;
    }

    @Override
    public void save(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ResourceLocation pRecipeId) {
        this.advancement.parent(new ResourceLocation("recipes/root"))
                .addCriterion("has_the_recipe",
                        RecipeUnlockedTrigger.unlocked(pRecipeId))
                .rewards(AdvancementRewards.Builder.recipe(pRecipeId)).requirements(RequirementsStrategy.OR);

        pFinishedRecipeConsumer.accept(new ArmorPartTinkeringRecipeBuilder.Result(pRecipeId, this.result, this.count,
                this.hammer, this.pattern, this.material,
                this.advancement, new ResourceLocation(pRecipeId.getNamespace(), "recipes/" +
                this.result.getItemCategory().getRecipeFolderName() + "/" + pRecipeId.getPath())));
    }

    public static class Result implements FinishedRecipe {
        private final ResourceLocation id;
        private final Item result;
        private final Ingredient hammer;
        private final Ingredient material;
        private final Ingredient pattern;
        private final int count;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;

        public Result(ResourceLocation pId, Item pResult, int pCount, Ingredient hammer, Ingredient pattern, Ingredient material, Advancement.Builder pAdvancement,
                      ResourceLocation pAdvancementId) {
            this.id = pId;
            this.result = pResult;
            this.count = pCount;
            this.hammer = hammer;
            this.material = material;
            this.pattern = pattern;
            this.advancement = pAdvancement;
            this.advancementId = pAdvancementId;
        }

        @Override
        public void serializeRecipeData(JsonObject pJson) {
            JsonArray jsonarray = new JsonArray();
            jsonarray.add(hammer.toJson());
            jsonarray.add(material.toJson());
            jsonarray.add(pattern.toJson());

            pJson.add("ingredients", jsonarray);
            JsonObject jsonobject = new JsonObject();
            jsonobject.addProperty("item", this.result.getRegistryName().toString());

            if (this.count > 1) {
                jsonobject.addProperty("count", this.count);
            }
            pJson.add("output", jsonobject);
        }

        @Override
        public ResourceLocation getId() {
            return new ResourceLocation(ArmorTinkers.MOD_ID,
                    this.result.getRegistryName().getPath() + "_from_armor_part_tinkering");
        }

        @Override
        public RecipeSerializer<?> getType() {
            return ArmorPartTinkeringRecipe.Serializer.INSTANCE;
        }

        @javax.annotation.Nullable
        public JsonObject serializeAdvancement() {
            return this.advancement.serializeToJson();
        }

        @javax.annotation.Nullable
        public ResourceLocation getAdvancementId() {
            return this.advancementId;
        }
    }
}
