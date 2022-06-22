package me.tudorcoroian.armortinkers.integration;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.block.ModBlocks;
import me.tudorcoroian.armortinkers.recipe.ArmorPartTinkeringRecipe;
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

public class ArmorPartStationRecipeCategory implements IRecipeCategory<ArmorPartTinkeringRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(ArmorTinkers.MOD_ID, "armor_part_tinkering");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(ArmorTinkers.MOD_ID, "textures/gui/armor_part_maker_jei.png");

    private final IDrawable background;
    private final IDrawable icon;

    public ArmorPartStationRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 73);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.ARMOR_PART_MAKER.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends ArmorPartTinkeringRecipe> getRecipeClass() {
        return ArmorPartTinkeringRecipe.class;
    }

    @Override
    public Component getTitle() {
        return new TranslatableComponent("blockentity.armortinkers.armor_part_maker_be");
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
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull ArmorPartTinkeringRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 23, 32).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 58, 21).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.INPUT, 58, 43).addIngredients(recipe.getIngredients().get(2));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 125, 32).addItemStack(recipe.getResultItem());
    }
}
