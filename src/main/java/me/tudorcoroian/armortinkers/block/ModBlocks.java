package me.tudorcoroian.armortinkers.block;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.block.custom.ArmorPartMakerBlock;
import me.tudorcoroian.armortinkers.block.custom.ModFlammableRotatedPillarBlock;
import me.tudorcoroian.armortinkers.block.custom.PatternStationBlock;
import me.tudorcoroian.armortinkers.item.ModCreativeModeTab;
import me.tudorcoroian.armortinkers.item.ModItems;
import me.tudorcoroian.armortinkers.world.feature.tree.MapleTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ArmorTinkers.MOD_ID);

    public static final RegistryObject<Block> ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> ZINC_BLOCK = registerBlock("zinc_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> MAGNESIUM_BLOCK = registerBlock("magnesium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> BRASS_BLOCK = registerBlock("brass_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);

    public static final RegistryObject<Block> ALUMINIUM_ORE = registerBlock("aluminium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> ALUMINIUM_DEEPSLATE_ORE = registerBlock("aluminium_deepslate_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> TIN_DEEPSLATE_ORE = registerBlock("tin_deepslate_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> LEAD_DEEPSLATE_ORE = registerBlock("lead_deepslate_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> SILVER_DEEPSLATE_ORE = registerBlock("silver_deepslate_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> ZINC_ORE = registerBlock("zinc_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> ZINC_DEEPSLATE_ORE = registerBlock("zinc_deepslate_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> MAGNESIUM_ORE = registerBlock("magnesium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> MAGNESIUM_DEEPSLATE_ORE = registerBlock("magnesium_deepslate_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2.5f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);

    public static final RegistryObject<Block> ARMOR_PART_MAKER = registerBlock("armor_part_maker",
            () -> new ArmorPartMakerBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE).noOcclusion()),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> PATTERN_STATION = registerBlock("pattern_station",
            () -> new PatternStationBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion()),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);

    public static final RegistryObject<Block> MAPLE_LOG = registerBlock("maple_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).requiresCorrectToolForDrops()),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> MAPLE_WOOD = registerBlock("maple_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD).requiresCorrectToolForDrops()),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).requiresCorrectToolForDrops()),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD).requiresCorrectToolForDrops()),
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> MAPLE_PLANKS = registerBlock("maple_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).requiresCorrectToolForDrops()){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            },
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> MAPLE_LEAVES = registerBlock("maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            },
            ModCreativeModeTab.ARMOR_TINKERS_TAB);
    public static final RegistryObject<Block> MAPLE_SAPLING = registerBlock("maple_sapling",
            () -> new SaplingBlock(new MapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_SAPLING)),
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
