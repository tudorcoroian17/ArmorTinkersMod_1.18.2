package me.tudorcoroian.armortinkers.item.custom;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.util.ModMaterial;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

public class ArmorPartItem extends Item {

    private final int materialColor;
    private final ModMaterial material;
    private static final List<ArmorPartItem> MOD_ARMOR_PARTS = new ArrayList<>();

    public ArmorPartItem(Properties pProperties, int pMaterialColor, ModMaterial pMaterial) {
        super(pProperties);
        this.materialColor = pMaterialColor;
        this.material = pMaterial;
        MOD_ARMOR_PARTS.add(this);
    }

    public int getMaterialColor() {
        return materialColor;
    }

    public ModMaterial getMaterial() {
        return material;
    }

    @Mod.EventBusSubscriber(value = Dist.CLIENT, modid = ArmorTinkers.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    private static class ColorRegisterHandler
    {
        @SubscribeEvent(priority = EventPriority.HIGHEST)
        public static void registerSpawnEggColors(ColorHandlerEvent.Item event)
        {
            MOD_ARMOR_PARTS.forEach(armorPartItem ->
                    event.getItemColors().register((stack, layer) -> armorPartItem.getMaterialColor(), armorPartItem)
            );
        }
    }
}
