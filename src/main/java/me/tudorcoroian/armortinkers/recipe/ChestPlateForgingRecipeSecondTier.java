package me.tudorcoroian.armortinkers.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import me.tudorcoroian.armortinkers.ArmorTinkers;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class ChestPlateForgingRecipeSecondTier implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;

    public ChestPlateForgingRecipeSecondTier(ResourceLocation id, ItemStack output, NonNullList<Ingredient> recipeItems) {
        this.id = id;
        this.recipeItems = recipeItems;
        this.output = output;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        // Left shoulder material match
        if (recipeItems.get(0).test(pContainer.getItem(0))) {
            // Right shoulder material match
            if (recipeItems.get(1).test(pContainer.getItem(1))) {
                // Back plate material match
                if (recipeItems.get(3).test(pContainer.getItem(2))) {
                    // Hide vest match
                    if (recipeItems.get(5).test(pContainer.getItem(3))) {
                        // Wrist band material match
                        if (recipeItems.get(4).test(pContainer.getItem(4))) {
                            // Front plate material match
                            return recipeItems.get(2).test(pContainer.getItem(5));
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        return recipeItems;
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer) {
        return output;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem() {
        return output.copy();
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ChestPlateForgingRecipeSecondTier.Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return ChestPlateForgingRecipeSecondTier.Type.INSTANCE;
    }

    public static class Type implements RecipeType<ChestPlateForgingRecipeSecondTier> {
        private Type() {  }
        public static final ChestPlateForgingRecipeSecondTier.Type INSTANCE = new ChestPlateForgingRecipeSecondTier.Type();
        public static final String ID = "chestplate_forging_t2";
    }

    public static class Serializer implements RecipeSerializer<ChestPlateForgingRecipeSecondTier> {
        public static final ChestPlateForgingRecipeSecondTier.Serializer INSTANCE = new ChestPlateForgingRecipeSecondTier.Serializer();
        public static final ResourceLocation ID = new ResourceLocation(ArmorTinkers.MOD_ID, "chestplate_forging_t2");

        @Override
        public ChestPlateForgingRecipeSecondTier fromJson(ResourceLocation id, JsonObject json) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(6, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new ChestPlateForgingRecipeSecondTier(id, output, inputs);
        }
        @Override
        public ChestPlateForgingRecipeSecondTier fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }

            ItemStack output = buf.readItem();
            return new ChestPlateForgingRecipeSecondTier(id, output, inputs);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, ChestPlateForgingRecipeSecondTier recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.toNetwork(buf);
            }
            buf.writeItemStack(recipe.getResultItem(), false);
        }

        @Override
        public RecipeSerializer<?> setRegistryName(ResourceLocation name) {
            return INSTANCE;
        }

        @Nullable
        @Override
        public ResourceLocation getRegistryName() {
            return ID;
        }

        @Override
        public Class<RecipeSerializer<?>> getRegistryType() {
            return ChestPlateForgingRecipeSecondTier.Serializer.castClass(RecipeSerializer.class);
        }

        @SuppressWarnings("unchecked") // Need this wrapper, because generics
        private static <G> Class<G> castClass(Class<?> cls) {
            return (Class<G>)cls;
        }
    }

}
