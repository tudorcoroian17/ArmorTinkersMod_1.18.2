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

    public static void register (IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        //Registry.register(Registry.RECIPE_TYPE, ArmorPartTinkeringRecipe.Type.ID, ArmorPartTinkeringRecipe.Type.INSTANCE);
        //Registry.register(Registry.RECIPE_TYPE, PatternScribingRecipe.Type.ID, PatternScribingRecipe.Type.INSTANCE);
    }
}
