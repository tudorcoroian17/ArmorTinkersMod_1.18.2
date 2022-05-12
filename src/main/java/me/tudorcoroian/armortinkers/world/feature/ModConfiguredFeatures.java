package me.tudorcoroian.armortinkers.world.feature;

import me.tudorcoroian.armortinkers.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeatures {
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
}
