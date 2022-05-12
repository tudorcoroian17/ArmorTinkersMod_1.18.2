package me.tudorcoroian.armortinkers.world.gen;

import me.tudorcoroian.armortinkers.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);
        base.add(ModPlacedFeatures.ALUMINIUM_ORE_TRIANGLE);
        base.add(ModPlacedFeatures.ALUMINIUM_ORE_UNIFORM);
        base.add(ModPlacedFeatures.TIN_ORE_TRIANGLE);
        base.add(ModPlacedFeatures.TIN_ORE_UNIFORM);
        base.add(ModPlacedFeatures.LEAD_ORE_TRIANGLE);
        base.add(ModPlacedFeatures.LEAD_ORE_UNIFORM);
        base.add(ModPlacedFeatures.SILVER_ORE_TRIANGLE);
        base.add(ModPlacedFeatures.SILVER_ORE_UNIFORM);
        base.add(ModPlacedFeatures.ZINC_ORE_TRIANGLE);
        base.add(ModPlacedFeatures.ZINC_ORE_UNIFORM);
        base.add(ModPlacedFeatures.MAGNESIUM_ORE_TRIANGLE);
        base.add(ModPlacedFeatures.MAGNESIUM_ORE_UNIFORM);
    }
}
