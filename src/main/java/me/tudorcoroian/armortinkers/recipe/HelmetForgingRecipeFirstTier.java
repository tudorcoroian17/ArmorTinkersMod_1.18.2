package me.tudorcoroian.armortinkers.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.util.ModArmorForgeSlots;
import net.minecraft.core.NonNullList;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class HelmetForgingRecipeFirstTier implements Recipe<SimpleContainer> {

    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;

    public HelmetForgingRecipeFirstTier(ResourceLocation id, ItemStack output, NonNullList<Ingredient> recipeItems) {
        this.id = id;
        this.recipeItems = recipeItems;
        this.output = output;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        // Left head plate material match
        if(recipeItems.get(0).test(pContainer.getItem(0))) {
            // Hide cap match
            if (recipeItems.get(2).test(pContainer.getItem(1))) {
                // Right head plate material match
                return recipeItems.get(1).test(pContainer.getItem(2));
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
        return HelmetForgingRecipeFirstTier.Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return HelmetForgingRecipeFirstTier.Type.INSTANCE;
    }

    public static class Type implements RecipeType<HelmetForgingRecipeFirstTier> {
        private Type() {  }
        public static final HelmetForgingRecipeFirstTier.Type INSTANCE = new HelmetForgingRecipeFirstTier.Type();
        public static final String ID = "helmet_forging_t1";
    }

    public static class Serializer implements RecipeSerializer<HelmetForgingRecipeFirstTier> {
        public static final HelmetForgingRecipeFirstTier.Serializer INSTANCE = new HelmetForgingRecipeFirstTier.Serializer();
        public static final ResourceLocation ID = new ResourceLocation(ArmorTinkers.MOD_ID, "helmet_forging_t1");

        @Override
        public HelmetForgingRecipeFirstTier fromJson(ResourceLocation id, JsonObject json) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(3, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new HelmetForgingRecipeFirstTier(id, output, inputs);
        }
        @Override
        public HelmetForgingRecipeFirstTier fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }

            ItemStack output = buf.readItem();
            return new HelmetForgingRecipeFirstTier(id, output, inputs);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, HelmetForgingRecipeFirstTier recipe) {
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
            return HelmetForgingRecipeFirstTier.Serializer.castClass(RecipeSerializer.class);
        }

        @SuppressWarnings("unchecked") // Need this wrapper, because generics
        private static <G> Class<G> castClass(Class<?> cls) {
            return (Class<G>)cls;
        }
    }
}
