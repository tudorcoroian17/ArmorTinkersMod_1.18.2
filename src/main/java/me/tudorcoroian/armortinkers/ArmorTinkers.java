package me.tudorcoroian.armortinkers;

import com.mojang.logging.LogUtils;
import me.tudorcoroian.armortinkers.block.ModBlocks;
import me.tudorcoroian.armortinkers.block.entity.ModBlockEntities;
import me.tudorcoroian.armortinkers.item.ModItems;
import me.tudorcoroian.armortinkers.recipe.ModRecipes;
import me.tudorcoroian.armortinkers.screen.ArmorPartMakerScreen;
import me.tudorcoroian.armortinkers.screen.ModMenuTypes;
import me.tudorcoroian.armortinkers.screen.PatternStationScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ArmorTinkers.MOD_ID)
public class ArmorTinkers {
    private static final Logger LOGGER = LogUtils.getLogger();
    // Directly reference a slf4j logger
    public static final String MOD_ID = "armortinkers";

    public ArmorTinkers() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        ModRecipes.register(eventBus);

        // Register the setup method for modloading
        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ARMOR_PART_MAKER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PATTERN_STATION.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAPLE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAPLE_SAPLING.get(), RenderType.cutout());

        MenuScreens.register(ModMenuTypes.ARMOR_PART_MAKER_MENU.get(), ArmorPartMakerScreen::new);
        MenuScreens.register(ModMenuTypes.PATTERN_STATION_MENU.get(), PatternStationScreen::new);
    }
}
