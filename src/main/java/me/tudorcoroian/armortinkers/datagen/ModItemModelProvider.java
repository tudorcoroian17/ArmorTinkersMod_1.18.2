package me.tudorcoroian.armortinkers.datagen;

import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.item.ModItems;
import me.tudorcoroian.armortinkers.util.ModArmorPart;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ArmorTinkers.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.VIBRANIUM_INGOT.get());
        simpleItem(ModItems.VIBRANIUM_NUGGET.get());
        simpleItem(ModItems.ADAMANTIUM_INGOT.get());

        armorPartItem(ModItems.CACTUS_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.CACTUS_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.CACTUS_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.CACTUS_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.CACTUS_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.CACTUS_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.CACTUS_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.CACTUS_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.STONE_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.STONE_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.STONE_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.STONE_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.STONE_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.STONE_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.STONE_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.STONE_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.NETHERACK_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.NETHERACK_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.NETHERACK_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.NETHERACK_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.NETHERACK_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.NETHERACK_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.NETHERACK_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.NETHERACK_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.END_STONE_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.END_STONE_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.END_STONE_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.END_STONE_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.END_STONE_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.END_STONE_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.END_STONE_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.END_STONE_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.FLINT_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.FLINT_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.FLINT_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.FLINT_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.FLINT_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.FLINT_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.FLINT_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.FLINT_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.COPPER_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.COPPER_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.COPPER_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.COPPER_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.COPPER_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.COPPER_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.COPPER_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.COPPER_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.IRON_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.IRON_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.IRON_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.IRON_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.IRON_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.IRON_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.IRON_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.IRON_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.GOLD_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.GOLD_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.GOLD_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.GOLD_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.GOLD_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.GOLD_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.GOLD_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.GOLD_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.OBSIDIAN_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.OBSIDIAN_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.OBSIDIAN_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.OBSIDIAN_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.OBSIDIAN_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.OBSIDIAN_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.OBSIDIAN_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.OBSIDIAN_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.ALUMINIUM_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.ALUMINIUM_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.ALUMINIUM_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.ALUMINIUM_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.ALUMINIUM_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.ALUMINIUM_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.ALUMINIUM_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.ALUMINIUM_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.TIN_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.TIN_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.TIN_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.TIN_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.TIN_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.TIN_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.TIN_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.TIN_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.ZINC_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.ZINC_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.ZINC_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.ZINC_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.ZINC_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.ZINC_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.ZINC_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.ZINC_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.SILVER_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.SILVER_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.SILVER_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.SILVER_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.SILVER_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.SILVER_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.SILVER_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.SILVER_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.LEAD_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.LEAD_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.LEAD_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.LEAD_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.LEAD_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.LEAD_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.LEAD_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.LEAD_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.BRASS_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.BRASS_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.BRASS_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.BRASS_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.BRASS_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.BRASS_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.BRASS_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.BRASS_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.BRONZE_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.BRONZE_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.BRONZE_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.BRONZE_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.BRONZE_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.BRONZE_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.BRONZE_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.BRONZE_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.VIBRANIUM_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.VIBRANIUM_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.VIBRANIUM_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.VIBRANIUM_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.VIBRANIUM_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.VIBRANIUM_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.VIBRANIUM_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.VIBRANIUM_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);

        armorPartItem(ModItems.ADAMANTIUM_HEAD_PLATE.get(), ModArmorPart.HEAD_PLATE);
        armorPartItem(ModItems.ADAMANTIUM_FRONT_PLATE.get(), ModArmorPart.FRONT_PLATE);
        armorPartItem(ModItems.ADAMANTIUM_BACK_PLATE.get(), ModArmorPart.BACK_PLATE);
        armorPartItem(ModItems.ADAMANTIUM_SHOULDER_PLATE.get(), ModArmorPart.SHOULDER_PLATE);
        armorPartItem(ModItems.ADAMANTIUM_WRIST_BAND.get(), ModArmorPart.WRIST_BAND);
        armorPartItem(ModItems.ADAMANTIUM_LEG_PLATE.get(), ModArmorPart.LEG_PLATE);
        armorPartItem(ModItems.ADAMANTIUM_TAIL_PLATE.get(), ModArmorPart.TAIL_PLATE);
        armorPartItem(ModItems.ADAMANTIUM_BOOT_PLATE.get(), ModArmorPart.BOOT_PLATE);


    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(ArmorTinkers.MOD_ID, "item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(), new ResourceLocation("item/handheld"))
                .texture("layer0", new ResourceLocation(ArmorTinkers.MOD_ID, "item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder armorPartItem(Item item, ModArmorPart part) {
        switch(part) {
            case HEAD_PLATE -> {
                return withExistingParent(item.getRegistryName().getPath(),
                        new ResourceLocation(ArmorTinkers.MOD_ID, "item/template_armor_part_head_plate"));
            }
            case FRONT_PLATE -> {
                return withExistingParent(item.getRegistryName().getPath(),
                        new ResourceLocation(ArmorTinkers.MOD_ID, "item/template_armor_part_front_plate"));
            }
            case BACK_PLATE -> {
                return withExistingParent(item.getRegistryName().getPath(),
                        new ResourceLocation(ArmorTinkers.MOD_ID, "item/template_armor_part_back_plate"));
            }
            case SHOULDER_PLATE -> {
                return withExistingParent(item.getRegistryName().getPath(),
                        new ResourceLocation(ArmorTinkers.MOD_ID, "item/template_armor_part_shoulder_plate"));
            }
            case WRIST_BAND -> {
                return withExistingParent(item.getRegistryName().getPath(),
                        new ResourceLocation(ArmorTinkers.MOD_ID, "item/template_armor_part_wrist_band"));
            }
            case LEG_PLATE -> {
                return withExistingParent(item.getRegistryName().getPath(),
                        new ResourceLocation(ArmorTinkers.MOD_ID, "item/template_armor_part_leg_plate"));
            }
            case TAIL_PLATE -> {
                return withExistingParent(item.getRegistryName().getPath(),
                        new ResourceLocation(ArmorTinkers.MOD_ID, "item/template_armor_part_tail_plate"));
            }
            case BOOT_PLATE -> {
                return withExistingParent(item.getRegistryName().getPath(),
                        new ResourceLocation(ArmorTinkers.MOD_ID, "item/template_armor_part_boot_plate"));
            }
        }
        return null;
    }
}
