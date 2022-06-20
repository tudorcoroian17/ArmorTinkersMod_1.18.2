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

    public static final RegistryObject<RecipeSerializer<ArmorPartMakerRecipe>> ARMOR_PART_MAKER_SERIALIZER =
            SERIALIZERS.register("armor_part_crafting", () -> ArmorPartMakerRecipe.Serializer.INSTANCE);

    public static void register (IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        //Registry.register(Registry.RECIPE_TYPE, ArmorPartMakerRecipe.Type.ID, ArmorPartMakerRecipe.Type.INSTANCE);
    }
}
