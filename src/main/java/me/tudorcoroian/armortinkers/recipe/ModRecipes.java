package me.tudorcoroian.armortinkers.recipe;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ArmorTinkers.MOD_ID);

    public static final RegistryObject<RecipeSerializer<ArmorPartTinkeringRecipe>> ARMOR_PART_MAKER_SERIALIZER =
            SERIALIZERS.register("armor_part_tinkering", () -> ArmorPartTinkeringRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<PatternScribingRecipe>> PATTERN_STATION_SERIALIZER =
            SERIALIZERS.register("pattern_scribing", () -> PatternScribingRecipe.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<HelmetForgingRecipeFirstTier>> ARMOR_FORGE_HELMET_T1_SERIALIZER =
            SERIALIZERS.register("helmet_forging_t1", () -> HelmetForgingRecipeFirstTier.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<HelmetForgingRecipeSecondTier>> ARMOR_FORGE_HELMET_T2_SERIALIZER =
            SERIALIZERS.register("helmet_forging_t2", () -> HelmetForgingRecipeSecondTier.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<ChestPlateForgingRecipeFirstTier>> ARMOR_FORGE_CHESTPLATE_T1_SERIALIZER =
            SERIALIZERS.register("chestplate_forging_t1", () -> ChestPlateForgingRecipeFirstTier.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<ChestPlateForgingRecipeSecondTier>> ARMOR_FORGE_CHESTPLATE_T2_SERIALIZER =
            SERIALIZERS.register("chestplate_forging_t2", () -> ChestPlateForgingRecipeSecondTier.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<LeggingsForgingRecipeFirstTier>> ARMOR_FORGE_LEGGINGS_T1_SERIALIZER =
            SERIALIZERS.register("leggings_forging_t1", () -> LeggingsForgingRecipeFirstTier.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<LeggingsForgingRecipeSecondTier>> ARMOR_FORGE_LEGGINGS_T2_SERIALIZER =
            SERIALIZERS.register("leggings_forging_t2", () -> LeggingsForgingRecipeSecondTier.Serializer.INSTANCE);

    public static final RegistryObject<RecipeSerializer<BootsForgingRecipeFirstTier>> ARMOR_FORGE_BOOTS_T1_SERIALIZER =
            SERIALIZERS.register("boots_forging_t1", () -> BootsForgingRecipeFirstTier.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<BootsForgingRecipeSecondTier>> ARMOR_FORGE_BOOTS_T2_SERIALIZER =
            SERIALIZERS.register("boots_forging_t2", () -> BootsForgingRecipeSecondTier.Serializer.INSTANCE);

    public static void register (IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
