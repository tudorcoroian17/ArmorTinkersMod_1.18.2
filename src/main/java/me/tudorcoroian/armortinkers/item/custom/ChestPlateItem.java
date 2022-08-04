package me.tudorcoroian.armortinkers.item.custom;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import me.tudorcoroian.armortinkers.ArmorTinkers;
import me.tudorcoroian.armortinkers.item.ModArmorMaterials;
import me.tudorcoroian.armortinkers.util.ModArmorPart;
import me.tudorcoroian.armortinkers.util.ModColors;
import me.tudorcoroian.armortinkers.util.ModMaterial;
import me.tudorcoroian.armortinkers.util.ModMaterialProperties;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.extensions.IForgeItem;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ChestPlateItem extends ArmorItem implements IForgeItem {
    private static final UUID[] ARMOR_MODIFIER_UUID_PER_SLOT = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
            UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
            UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
            UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};

    public ModMaterial leftShoulderPlate;
    public ModMaterial rightShoulderPlate;
    public ModMaterial frontPlate;
    public ModMaterial backPlate;
    public ModMaterial wristBand;

    public int leftShoulderPlateColor;
    public int rightShoulderPlateColor;
    public int frontPlateColor;
    public int backPlateColor;
    public int wristBandColor;
    private static List<ChestPlateItem> MOD_CHESTPLATES = new ArrayList<>();

    private final Multimap<Attribute, AttributeModifier> customModifiers;

    public ChestPlateItem(Properties pProperties, ModMaterial leftShoulderPlate, ModMaterial rightShoulderPlate, ModMaterial frontPlate, ModMaterial backPlate, ModMaterial wristBand) {
        super(ModArmorMaterials.HIDE, EquipmentSlot.CHEST, pProperties);

        this.leftShoulderPlate = leftShoulderPlate;
        this.rightShoulderPlate = rightShoulderPlate;
        this.frontPlate = frontPlate;
        this.backPlate = backPlate;
        this.wristBand = wristBand;

        this.leftShoulderPlateColor = ModColors.getColorOfMaterial(leftShoulderPlate);
        this.rightShoulderPlateColor = ModColors.getColorOfMaterial(rightShoulderPlate);
        this.frontPlateColor = ModColors.getColorOfMaterial(frontPlate);
        this.backPlateColor = ModColors.getColorOfMaterial(backPlate);
        this.wristBandColor = ModColors.getColorOfMaterial(wristBand);

        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        UUID uuid = ARMOR_MODIFIER_UUID_PER_SLOT[EquipmentSlot.CHEST.getIndex()];
        builder.put(Attributes.ARMOR, new AttributeModifier(uuid, "Armor modifier", (double)this.getDefense(), AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(uuid, "Armor toughness", (double)this.getToughness(), AttributeModifier.Operation.ADDITION));
        if (this.getKnockBackResistance() > 0) {
            builder.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(uuid, "Armor knockback resistance", (double)this.getKnockBackResistance(), AttributeModifier.Operation.ADDITION));
        }

        this.customModifiers = builder.build();
        MOD_CHESTPLATES.add(this);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        String leftShoulderPlateTooltip = this.leftShoulderPlate.getMaterialName() + "Left Shoulder Plate";
        String rightShoulderPlateTooltip = this.rightShoulderPlate.getMaterialName() + "Right Shoulder Plate";
        String frontPlateTooltip = this.frontPlate.getMaterialName() + "Front Plate";
        String backPlateTooltip = this.backPlate.getMaterialName() + "Back Plate";
        String wristBandTooltip = this.wristBand.getMaterialName() + "Wrist Band";
        pTooltipComponents.add(new TextComponent(leftShoulderPlateTooltip));
        pTooltipComponents.add(new TextComponent(rightShoulderPlateTooltip));
        pTooltipComponents.add(new TextComponent(frontPlateTooltip));
        pTooltipComponents.add(new TextComponent(backPlateTooltip));
        pTooltipComponents.add(new TextComponent(wristBandTooltip));
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
        ModMaterialProperties mmpLeftShoulderPlate = this.leftShoulderPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpRightShoulderPlate = this.rightShoulderPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpFrontPlate = this.frontPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpBackPlate = this.backPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpWristBand = this.wristBand.getPropertyOfMaterial();

        int durabilityOfChestSlot = this.getMaterial().getDurabilityForSlot(EquipmentSlot.CHEST);
        int durabilityMultiplier = (int) (mmpLeftShoulderPlate.getDurabilityMultiplier() * 2 +
                mmpRightShoulderPlate.getDurabilityMultiplier() * 2 +
                mmpFrontPlate.getDurabilityMultiplier() * 3 +
                mmpBackPlate.getDurabilityMultiplier() * 2 +
                mmpWristBand.getDurabilityMultiplier() * 1);

        return durabilityOfChestSlot * durabilityMultiplier;
    }

    @Override
    public int getDefense() {
        ModMaterialProperties mmpLeftShoulderPlate = this.leftShoulderPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpRightShoulderPlate = this.rightShoulderPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpFrontPlate = this.frontPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpBackPlate = this.backPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpWristBand = this.wristBand.getPropertyOfMaterial();

        int defenseOfMaterialLeftShoulderPlate = mmpLeftShoulderPlate.getPartProtections(ModArmorPart.SHOULDER_PLATE);
        int defenseOfMaterialRightShoulderPlate = mmpRightShoulderPlate.getPartProtections(ModArmorPart.SHOULDER_PLATE);
        int defenseOfMaterialFrontPlate = mmpFrontPlate.getPartProtections(ModArmorPart.FRONT_PLATE);
        int defenseOfMaterialBackPlate = mmpBackPlate.getPartProtections(ModArmorPart.BACK_PLATE);
        int defenseOfMaterialWristBand = mmpWristBand.getPartProtections(ModArmorPart.WRIST_BAND);

        return defenseOfMaterialLeftShoulderPlate +
                defenseOfMaterialRightShoulderPlate +
                defenseOfMaterialFrontPlate +
                defenseOfMaterialBackPlate +
                defenseOfMaterialWristBand;
    }

    @Override
    public float getToughness() {
        ModMaterialProperties mmpLeftShoulderPlate = this.leftShoulderPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpRightShoulderPlate = this.rightShoulderPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpFrontPlate = this.frontPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpBackPlate = this.backPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpWristBand = this.wristBand.getPropertyOfMaterial();

        float toughnessOfMaterialLeftShoulderPlate = mmpLeftShoulderPlate.getToughnessSmallPart();
        float toughnessOfMaterialRightShoulderPlate = mmpRightShoulderPlate.getToughnessSmallPart();
        float toughnessOfMaterialFrontPlate = mmpFrontPlate.getToughnessBigPart();
        float toughnessOfMaterialBackPlate = mmpBackPlate.getToughnessBigPart();
        float toughnessOfMaterialWristBand = mmpWristBand.getToughnessSmallPart();

        return toughnessOfMaterialLeftShoulderPlate +
                toughnessOfMaterialRightShoulderPlate +
                toughnessOfMaterialFrontPlate +
                toughnessOfMaterialBackPlate +
                toughnessOfMaterialWristBand;
    }

    public float getKnockBackResistance() {
        ModMaterialProperties mmpLeftShoulderPlate = this.leftShoulderPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpRightShoulderPlate = this.rightShoulderPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpFrontPlate = this.frontPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpBackPlate = this.backPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpWristBand = this.wristBand.getPropertyOfMaterial();

        float knockBackResistanceOfMaterialLeftShoulderPlate = mmpLeftShoulderPlate.getKnockbackResistanceSmallPart();
        float knockBackResistanceOfMaterialRightShoulderPlate = mmpRightShoulderPlate.getKnockbackResistanceSmallPart();
        float knockBackResistanceOfMaterialFrontPlate = mmpFrontPlate.getKnockbackResistanceBigPart();
        float knockBackResistanceOfMaterialBackPlate = mmpBackPlate.getKnockbackResistanceBigPart();
        float knockBackResistanceOfMaterialWristBand = mmpWristBand.getKnockbackResistanceSmallPart();

        return knockBackResistanceOfMaterialLeftShoulderPlate +
                knockBackResistanceOfMaterialRightShoulderPlate +
                knockBackResistanceOfMaterialFrontPlate +
                knockBackResistanceOfMaterialBackPlate +
                knockBackResistanceOfMaterialWristBand;
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot pEquipmentSlot) {
        return pEquipmentSlot == this.slot ? this.customModifiers : super.getDefaultAttributeModifiers(pEquipmentSlot);
    }

    public int getColor(int pTintIndex) {
        if (pTintIndex == 0) {
            return this.leftShoulderPlateColor;
        } else if (pTintIndex == 1) {
            return this.rightShoulderPlateColor;
        } else if (pTintIndex == 2) {
            return this.frontPlateColor;
        } else if (pTintIndex == 3) {
            return this.backPlateColor;
        } else if (pTintIndex == 4) {
            return this.wristBandColor;
        }
        return ModColors.NONE;
    }

    @Mod.EventBusSubscriber(value = Dist.CLIENT, modid = ArmorTinkers.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    private static class ColorRegisterHandler
    {
        @SubscribeEvent(priority = EventPriority.HIGHEST)
        public static void registerSpawnEggColors(ColorHandlerEvent.Item event)
        {
            MOD_CHESTPLATES.forEach(chestPlateItem ->
                    event.getItemColors().register((stack, layer) -> chestPlateItem.getColor(layer), chestPlateItem)
            );
        }
    }
}
