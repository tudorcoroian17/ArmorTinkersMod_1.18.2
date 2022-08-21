package me.tudorcoroian.armortinkers.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> ALUMINIUM_ORE_TRIANGLE = PlacementUtils.register("aluminium_ore_triangle",
            ModConfiguredFeatures.ALUMINIUM_ORE_LARGE, ModOrePlacement.commonOrePlacement(17, // Veins per chunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-32), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> ALUMINIUM_ORE_UNIFORM = PlacementUtils.register("aluminium_ore_uniform",
            ModConfiguredFeatures.ALUMINIUM_ORE_SMALL, ModOrePlacement.commonOrePlacement(10, // Veins per chunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-16), VerticalAnchor.aboveBottom(112))));

    public static final Holder<PlacedFeature> TIN_ORE_TRIANGLE = PlacementUtils.register("tin_ore_triangle",
            ModConfiguredFeatures.TIN_ORE_LARGE, ModOrePlacement.commonOrePlacement(17, // Veins per chunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-32), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> TIN_ORE_UNIFORM = PlacementUtils.register("tin_ore_uniform",
            ModConfiguredFeatures.TIN_ORE_SMALL, ModOrePlacement.commonOrePlacement(10, // Veins per chunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-16), VerticalAnchor.aboveBottom(112))));

    public static final Holder<PlacedFeature> LEAD_ORE_TRIANGLE = PlacementUtils.register("lead_ore_triangle",
            ModConfiguredFeatures.LEAD_ORE_LARGE, ModOrePlacement.commonOrePlacement(10, // Veins per chunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-40), VerticalAnchor.aboveBottom(40))));
    public static final Holder<PlacedFeature> LEAD_ORE_UNIFORM = PlacementUtils.register("lead_ore_uniform",
            ModConfiguredFeatures.LEAD_ORE_SMALL, ModOrePlacement.commonOrePlacement(15, // Veins per chunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(40))));

    public static final Holder<PlacedFeature> SILVER_ORE_TRIANGLE = PlacementUtils.register("silver_ore_triangle",
            ModConfiguredFeatures.SILVER_ORE_LARGE, ModOrePlacement.commonOrePlacement(10, // Veins per chunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-40), VerticalAnchor.aboveBottom(40))));
    public static final Holder<PlacedFeature> SILVER_ORE_UNIFORM = PlacementUtils.register("silver_ore_uniform",
            ModConfiguredFeatures.SILVER_ORE_SMALL, ModOrePlacement.commonOrePlacement(15, // Veins per chunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(40))));

    public static final Holder<PlacedFeature> ZINC_ORE_TRIANGLE = PlacementUtils.register("zinc_ore_triangle",
            ModConfiguredFeatures.ZINC_ORE_LARGE, ModOrePlacement.commonOrePlacement(10, // Veins per chunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> ZINC_ORE_UNIFORM = PlacementUtils.register("zinc_ore_uniform",
            ModConfiguredFeatures.ZINC_ORE_SMALL, ModOrePlacement.commonOrePlacement(30, // Veins per chunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(32), VerticalAnchor.aboveBottom(64))));

    public static final Holder<PlacedFeature> MAGNESIUM_ORE_TRIANGLE = PlacementUtils.register("magnesium_ore_triangle",
            ModConfiguredFeatures.MAGNESIUM_ORE_LARGE, ModOrePlacement.commonOrePlacement(10, // Veins per chunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    public static final Holder<PlacedFeature> MAGNESIUM_ORE_UNIFORM = PlacementUtils.register("magnesium_ore_uniform",
            ModConfiguredFeatures.MAGNESIUM_ORE_SMALL, ModOrePlacement.commonOrePlacement(30, // Veins per chunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-16), VerticalAnchor.aboveBottom(16))));



    public static final Holder<PlacedFeature> MAPLE_PLACED =
            PlacementUtils.register("maple_placed",
                    ModConfiguredFeatures.MAPLE_SPAWN,
                    VegetationPlacements.treePlacement(
                            PlacementUtils.countExtra(1, 0.1f,2))
                    );
}
