package me.tudorcoroian.armortinkers.world;


import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.world.gen.ModOreGeneration;
import me.tudorcoroian.armortinkers.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ArmorTinkers.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        // Be careful at the order
        ModTreeGeneration.generateTrees(event);
        ModOreGeneration.generateOres(event);
    }

}
