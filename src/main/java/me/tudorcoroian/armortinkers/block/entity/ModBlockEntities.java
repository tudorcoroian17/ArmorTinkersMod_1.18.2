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


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
