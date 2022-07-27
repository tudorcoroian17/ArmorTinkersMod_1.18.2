package me.tudorcoroian.armortinkers.screen;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, ArmorTinkers.MOD_ID);

    public static final RegistryObject<MenuType<ArmorPartMakerMenu>> ARMOR_PART_MAKER_MENU =
            registerMenuType(ArmorPartMakerMenu::new, "armor_part_maker_menu");
    public static final RegistryObject<MenuType<PatternStationMenu>> PATTERN_STATION_MENU =
            registerMenuType(PatternStationMenu::new, "pattern_station_menu");
    public static final RegistryObject<MenuType<ArmorForgeFirstTierMenu>> ARMOR_FORGE_TIER_1_MENU =
            registerMenuType(ArmorForgeFirstTierMenu::new, "armor_forge_tier_1_menu");
    public static final RegistryObject<MenuType<ArmorForgeSecondTierMenu>> ARMOR_FORGE_TIER_2_MENU =
            registerMenuType(ArmorForgeSecondTierMenu::new, "armor_forge_tier_2_menu");

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory,
                                                                                                  String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
