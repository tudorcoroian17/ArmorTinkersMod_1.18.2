package me.tudorcoroian.armortinkers.item.custom;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.item.ModArmorMaterials;
import me.tudorcoroian.armortinkers.util.ModArmorPart;
import me.tudorcoroian.armortinkers.util.ModColors;
import me.tudorcoroian.armortinkers.util.ModMaterial;
import me.tudorcoroian.armortinkers.util.ModMaterialProperties;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.extensions.IForgeItem;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class HelmetItem extends ArmorItem implements IForgeItem {
    private static final UUID[] ARMOR_MODIFIER_UUID_PER_SLOT = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
            UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
            UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
            UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};

    public ModMaterial leftHeadPlate;
    public ModMaterial rightHeadPlate;

    public int leftHeadPlateColor;
    public int rightHeadPlateColor;
    private static List<HelmetItem> MOD_HELMETS = new ArrayList<>();

    private final Multimap<Attribute, AttributeModifier> customModifiers;

    public HelmetItem(Properties pProperties, ModMaterial leftHeadPlate, ModMaterial rightHeadPlate) {
        super(ModArmorMaterials.HIDE, EquipmentSlot.HEAD, pProperties);

        this.leftHeadPlate = leftHeadPlate;
        this.rightHeadPlate = rightHeadPlate;

        this.leftHeadPlateColor = ModColors.getColorOfMaterial(leftHeadPlate);
        this.rightHeadPlateColor = ModColors.getColorOfMaterial(rightHeadPlate);

        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        UUID uuid = ARMOR_MODIFIER_UUID_PER_SLOT[EquipmentSlot.HEAD.getIndex()];
        builder.put(Attributes.ARMOR, new AttributeModifier(uuid, "Armor modifier", (double)this.getDefense(), AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(uuid, "Armor toughness", (double)this.getToughness(), AttributeModifier.Operation.ADDITION));
        if (this.getKnockBackResistance() > 0) {
            builder.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(uuid, "Armor knockback resistance", (double)this.getKnockBackResistance(), AttributeModifier.Operation.ADDITION));
        }

        this.customModifiers = builder.build();
        MOD_HELMETS.add(this);
    }

    @Override
    public boolean isEnchantable(ItemStack pStack) {
        return false;
    }

    @Override
    public int getItemStackLimit(ItemStack stack) {
        return 1;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public boolean isValidRepairItem(ItemStack pToRepair, ItemStack pRepair) {
        return false;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        ModMaterialProperties mmpLeftHeadPlate = leftHeadPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpRightHeadPlate = rightHeadPlate.getPropertyOfMaterial();

        int durabilityOfHeadSlot = this.getMaterial().getDurabilityForSlot(EquipmentSlot.HEAD);
        int durabilityMultiplier = (int) (mmpLeftHeadPlate.getDurabilityMultiplier() * 5 +
                mmpRightHeadPlate.getDurabilityMultiplier() * 5);

        return durabilityOfHeadSlot * durabilityMultiplier;
    }

    @Override
    public int getDefense() {
        ModMaterialProperties mmpLeftHeadPlate = leftHeadPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpRightHeadPlate = rightHeadPlate.getPropertyOfMaterial();

        int defenceOfMaterialLeft = mmpLeftHeadPlate.getPartProtections(ModArmorPart.HEAD_PLATE);
        int defenceOfMaterialRight = mmpRightHeadPlate.getPartProtections(ModArmorPart.HEAD_PLATE);

        return defenceOfMaterialLeft + defenceOfMaterialRight;
    }

    @Override
    public float getToughness() {
        ModMaterialProperties mmpLeftHeadPlate = leftHeadPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpRightHeadPlate = rightHeadPlate.getPropertyOfMaterial();

        float toughnessOfMaterialLeft = mmpLeftHeadPlate.getToughnessSmallPart();
        float toughnessOfMaterialRight = mmpRightHeadPlate.getToughnessSmallPart();

        return toughnessOfMaterialLeft + toughnessOfMaterialRight;
    }

    public float getKnockBackResistance() {
        ModMaterialProperties mmpLeftHeadPlate = leftHeadPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpRightHeadPlate = rightHeadPlate.getPropertyOfMaterial();

        float knockBackResistanceOfMaterialLeft = mmpLeftHeadPlate.getKnockbackResistanceSmallPart();
        float knockBackResistanceOfMaterialRight = mmpRightHeadPlate.getKnockbackResistanceSmallPart();

        return knockBackResistanceOfMaterialLeft + knockBackResistanceOfMaterialRight;
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot pEquipmentSlot) {
        return pEquipmentSlot == this.slot ? this.customModifiers : super.getDefaultAttributeModifiers(pEquipmentSlot);
    }

    public int getColor(int pTintIndex) {
        if (pTintIndex == 0) {
            return this.leftHeadPlateColor;
        } else if (pTintIndex == 1) {
            return this.rightHeadPlateColor;
        }
        return ModColors.NONE;
    }

    @Mod.EventBusSubscriber(value = Dist.CLIENT, modid = ArmorTinkers.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    private static class ColorRegisterHandler
    {
        @SubscribeEvent(priority = EventPriority.HIGHEST)
        public static void registerSpawnEggColors(ColorHandlerEvent.Item event)
        {
            MOD_HELMETS.forEach(helmetItem ->
                    event.getItemColors().register((stack, layer) -> helmetItem.getColor(layer), helmetItem)
            );
        }
    }
}
