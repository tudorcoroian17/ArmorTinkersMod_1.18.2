package me.tudorcoroian.armortinkers.block.entity;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ArmorTinkers.MOD_ID);

    public static final RegistryObject<BlockEntityType<ArmorPartMakerBlockEntity>> ARMOR_PART_MAKER =
            BLOCK_ENTITIES.register("armor_part_maker", () ->
                    BlockEntityType.Builder.of(ArmorPartMakerBlockEntity::new,
                            ModBlocks.ARMOR_PART_MAKER.get()).build(null));
    public static final RegistryObject<BlockEntityType<PatternStationBlockEntity>> PATTERN_STATION =
            BLOCK_ENTITIES.register("pattern_station", () ->
                    BlockEntityType.Builder.of(PatternStationBlockEntity::new,
                            ModBlocks.PATTERN_STATION.get()).build(null));
    public static final RegistryObject<BlockEntityType<ArmorForgeFirstTierBlockEntity>> ARMOR_FORGE_TIER_1 =
            BLOCK_ENTITIES.register("armor_forge_tier_1", () ->
                    BlockEntityType.Builder.of(ArmorForgeFirstTierBlockEntity::new,
                            ModBlocks.ARMOR_FORGE_TIER_1.get()).build(null));
    public static final RegistryObject<BlockEntityType<ArmorForgeSecondTierBlockEntity>> ARMOR_FORGE_TIER_2 =
            BLOCK_ENTITIES.register("armor_forge_tier_2", () ->
                    BlockEntityType.Builder.of(ArmorForgeSecondTierBlockEntity::new,
                            ModBlocks.ARMOR_FORGE_TIER_2.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
