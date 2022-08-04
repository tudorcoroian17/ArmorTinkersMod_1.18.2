package me.tudorcoroian.armortinkers.integration;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.block.ModBlocks;
import me.tudorcoroian.armortinkers.recipe.ChestPlateForgingRecipeFirstTier;
import me.tudorcoroian.armortinkers.recipe.PatternScribingRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class ChestplateForgingFirstTierRecipeCategory implements IRecipeCategory<ChestPlateForgingRecipeFirstTier> {
    public final static ResourceLocation UID = new ResourceLocation(ArmorTinkers.MOD_ID, "chestplate_forging_t1");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(ArmorTinkers.MOD_ID, "textures/gui/armor_forge_tier_1_chestplate_jei.png");

    private final IDrawable background;
    private final IDrawable icon;

    public ChestplateForgingFirstTierRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 175, 72);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.ARMOR_FORGE_TIER_1.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends ChestPlateForgingRecipeFirstTier> getRecipeClass() {
        return ChestPlateForgingRecipeFirstTier.class;
    }

    @Override
    public Component getTitle() {
        return new TranslatableComponent("blockentity.armortinkers.armor_forge_be");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull ChestPlateForgingRecipeFirstTier recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 14, 15).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 14, 37).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 26).addIngredients(recipe.getIngredients().get(2));
        builder.addSlot(RecipeIngredientRole.INPUT, 36, 26).addIngredients(recipe.getIngredients().get(3));
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 48).addIngredients(recipe.getIngredients().get(4));
        builder.addSlot(RecipeIngredientRole.INPUT, 58, 26).addIngredients(recipe.getIngredients().get(5));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 126, 26).addItemStack(recipe.getResultItem());
    }
}
