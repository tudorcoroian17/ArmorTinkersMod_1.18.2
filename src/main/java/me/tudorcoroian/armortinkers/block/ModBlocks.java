package me.tudorcoroian.armortinkers.block;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.item.ModCreativeModeTab;
import me.tudorcoroian.armortinkers.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ArmorTinkers.MOD_ID);

    // Create the blocks
    public static final RegistryObject<Block> ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);

    // Register the block created in this class
    private static <T extends Block> RegistryObject<T> registerBlock(String name,
                                                                     Supplier<T> block,
                                                                     CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    // Register the item associated with the block
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,
                                                                            RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name,
                () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


}
