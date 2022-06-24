package me.tudorcoroian.armortinkers.integration;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.recipe.ArmorPartTinkeringRecipe;
import me.tudorcoroian.armortinkers.recipe.PatternScribingRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEIArmorTinkersPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(ArmorTinkers.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new ArmorPartStationRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new PatternStationRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<ArmorPartTinkeringRecipe> armorPartTinkeringRecipes = rm.getAllRecipesFor(ArmorPartTinkeringRecipe.Type.INSTANCE);
        List<PatternScribingRecipe> patternScribingRecipes = rm.getAllRecipesFor(PatternScribingRecipe.Type.INSTANCE);

        registration.addRecipes(new RecipeType<>(ArmorPartStationRecipeCategory.UID, ArmorPartTinkeringRecipe.class), armorPartTinkeringRecipes);
        registration.addRecipes(new RecipeType<>(PatternStationRecipeCategory.UID, PatternScribingRecipe.class), patternScribingRecipes);
    }
}
