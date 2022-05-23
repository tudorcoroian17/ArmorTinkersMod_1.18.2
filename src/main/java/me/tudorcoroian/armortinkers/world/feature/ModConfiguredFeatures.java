package me.tudorcoroian.armortinkers.world.feature;

import me.tudorcoroian.armortinkers.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfiguredFeatures {
    /**
     * Ores configured features
     **/
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ALUMINIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ALUMINIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ALUMINIUM_DEEPSLATE_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TIN_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TIN_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.TIN_DEEPSLATE_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_LEAD_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LEAD_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.LEAD_DEEPSLATE_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SILVER_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.SILVER_DEEPSLATE_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ZINC_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ZINC_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ZINC_DEEPSLATE_ORE.get().defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_MAGNESIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MAGNESIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.MAGNESIUM_DEEPSLATE_ORE.get().defaultBlockState())
    );

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ALUMINIUM_ORE_SMALL = FeatureUtils.register("aluminium_ore_small",
            Feature.ORE, new OreConfiguration(OVERWORLD_ALUMINIUM_ORES, 9 /*Blocks per vein*/));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ALUMINIUM_ORE_LARGE = FeatureUtils.register("aluminium_ore_large",
            Feature.ORE, new OreConfiguration(OVERWORLD_ALUMINIUM_ORES, 10 /*Blocks per vein*/));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TIN_ORE_SMALL = FeatureUtils.register("tin_ore_small",
            Feature.ORE, new OreConfiguration(OVERWORLD_TIN_ORES, 9 /*Blocks per vein*/));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TIN_ORE_LARGE = FeatureUtils.register("tin_ore_large",
            Feature.ORE, new OreConfiguration(OVERWORLD_TIN_ORES, 10 /*Blocks per vein*/));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> LEAD_ORE_SMALL = FeatureUtils.register("lead_ore_small",
            Feature.ORE, new OreConfiguration(OVERWORLD_LEAD_ORES, 5 /*Blocks per vein*/));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> LEAD_ORE_LARGE = FeatureUtils.register("lead_ore_large",
            Feature.ORE, new OreConfiguration(OVERWORLD_LEAD_ORES, 7 /*Blocks per vein*/));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SILVER_ORE_SMALL = FeatureUtils.register("silver_ore_small",
            Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES, 5 /*Blocks per vein*/));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SILVER_ORE_LARGE = FeatureUtils.register("silver_ore_large",
            Feature.ORE, new OreConfiguration(OVERWORLD_SILVER_ORES, 7 /*Blocks per vein*/));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ZINC_ORE_SMALL = FeatureUtils.register("zinc_ore_small",
            Feature.ORE, new OreConfiguration(OVERWORLD_ZINC_ORES, 8 /*Blocks per vein*/));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ZINC_ORE_LARGE = FeatureUtils.register("zinc_ore_large",
            Feature.ORE, new OreConfiguration(OVERWORLD_ZINC_ORES, 10 /*Blocks per vein*/));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MAGNESIUM_ORE_SMALL = FeatureUtils.register("magnesium_ore_small",
            Feature.ORE, new OreConfiguration(OVERWORLD_MAGNESIUM_ORES, 8 /*Blocks per vein*/));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MAGNESIUM_ORE_LARGE = FeatureUtils.register("magnesium_ore_large",
            Feature.ORE, new OreConfiguration(OVERWORLD_MAGNESIUM_ORES, 10 /*Blocks per vein*/));

    /**
     * Tree configured features
     **/
    public static final Holder<? extends ConfiguredFeature<TreeConfiguration, ?>> MAPLE_TREE =
            FeatureUtils.register("maple", Feature.TREE,
                    new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(ModBlocks.MAPLE_LOG.get()),
                            new StraightTrunkPlacer(7, 9, 3),
                            BlockStateProvider.simple(ModBlocks.MAPLE_LEAVES.get()),
                            new SpruceFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), ConstantInt.of(4)),
                            new TwoLayersFeatureSize(1, 0, 2)).build());
    public static final Holder<PlacedFeature> MAPLE_CHECKED = PlacementUtils.register("maple_checked",
            MAPLE_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.MAPLE_SAPLING.get()));


    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> MAPLE_SPAWN =
            FeatureUtils.register("maple_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(MAPLE_CHECKED, 0.5F)), MAPLE_CHECKED));



}
