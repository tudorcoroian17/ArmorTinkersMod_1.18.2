package me.tudorcoroian.armortinkers.integration;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.recipe.*;
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
        registration.addRecipeCategories(new HelmetForgingFirstTierRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new ChestplateForgingFirstTierRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new LeggingsForgingFirstTierRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new BootsForgingFirstTierRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<ArmorPartTinkeringRecipe> armorPartTinkeringRecipes = rm.getAllRecipesFor(ArmorPartTinkeringRecipe.Type.INSTANCE);
        List<PatternScribingRecipe> patternScribingRecipes = rm.getAllRecipesFor(PatternScribingRecipe.Type.INSTANCE);
        List<HelmetForgingRecipeFirstTier> helmetForgingFirstTierRecipes = rm.getAllRecipesFor(HelmetForgingRecipeFirstTier.Type.INSTANCE);
        List<ChestPlateForgingRecipeFirstTier> chestPlateForgingRecipes = rm.getAllRecipesFor(ChestPlateForgingRecipeFirstTier.Type.INSTANCE);
        List<LeggingsForgingRecipeFirstTier> leggingsForgingRecipes = rm.getAllRecipesFor(LeggingsForgingRecipeFirstTier.Type.INSTANCE);
        List<BootsForgingRecipeFirstTier> bootsForgingRecipes = rm.getAllRecipesFor(BootsForgingRecipeFirstTier.Type.INSTANCE);

        registration.addRecipes(new RecipeType<>(ArmorPartStationRecipeCategory.UID, ArmorPartTinkeringRecipe.class), armorPartTinkeringRecipes);
        registration.addRecipes(new RecipeType<>(PatternStationRecipeCategory.UID, PatternScribingRecipe.class), patternScribingRecipes);
        registration.addRecipes(new RecipeType<>(HelmetForgingFirstTierRecipeCategory.UID, HelmetForgingRecipeFirstTier.class), helmetForgingFirstTierRecipes);
        registration.addRecipes(new RecipeType<>(ChestplateForgingFirstTierRecipeCategory.UID, ChestPlateForgingRecipeFirstTier.class), chestPlateForgingRecipes);
        registration.addRecipes(new RecipeType<>(LeggingsForgingFirstTierRecipeCategory.UID, LeggingsForgingRecipeFirstTier.class), leggingsForgingRecipes);
        registration.addRecipes(new RecipeType<>(BootsForgingFirstTierRecipeCategory.UID, BootsForgingRecipeFirstTier.class), bootsForgingRecipes);
    }
}
