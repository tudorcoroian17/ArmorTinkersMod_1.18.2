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

public class LeggingsItem extends ArmorItem implements IForgeItem {

    private static final UUID[] ARMOR_MODIFIER_UUID_PER_SLOT = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
            UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
            UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
            UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};

    public ModMaterial leftLegPlate;
    public ModMaterial rightLegPlate;
    public ModMaterial tailPlate;

    public int leftLegPlateColor;
    public int rightLegPlateColor;
    public int tailPlateColor;
    private static List<LeggingsItem> MOD_LEGGINGS = new ArrayList<>();

    private final Multimap<Attribute, AttributeModifier> customModifiers;

    public LeggingsItem(Properties pProperties, ModMaterial leftLegPlate, ModMaterial rightLegPlate, ModMaterial tailPlate) {
        super(ModArmorMaterials.HIDE, EquipmentSlot.LEGS, pProperties);

        this.leftLegPlate = leftLegPlate;
        this.rightLegPlate = rightLegPlate;
        this.tailPlate = tailPlate;

        this.leftLegPlateColor = ModColors.getColorOfMaterial(leftLegPlate);
        this.rightLegPlateColor = ModColors.getColorOfMaterial(rightLegPlate);
        this.tailPlateColor = ModColors.getColorOfMaterial(tailPlate);

        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        UUID uuid = ARMOR_MODIFIER_UUID_PER_SLOT[EquipmentSlot.LEGS.getIndex()];
        builder.put(Attributes.ARMOR, new AttributeModifier(uuid, "Armor modifier", (double)this.getDefense(), AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(uuid, "Armor toughness", (double)this.getToughness(), AttributeModifier.Operation.ADDITION));
        if (this.getKnockBackResistance() > 0) {
            builder.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(uuid, "Armor knockback resistance", (double)this.getKnockBackResistance(), AttributeModifier.Operation.ADDITION));
        }

        this.customModifiers = builder.build();
        MOD_LEGGINGS.add(this);
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
        ModMaterialProperties mmpLeftLegPlate = this.leftLegPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpRightLegPlate = this.rightLegPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpTailPlate = this.tailPlate.getPropertyOfMaterial();

        int durabilityOfLegsSlot = this.getMaterial().getDurabilityForSlot(EquipmentSlot.LEGS);
        int durabilityMultiplier = (int) (mmpLeftLegPlate.getDurabilityMultiplier() * 3 +
                mmpRightLegPlate.getDurabilityMultiplier() * 3 +
                mmpTailPlate.getDurabilityMultiplier() * 4);

        return durabilityOfLegsSlot * durabilityMultiplier;
    }

    @Override
    public int getDefense() {
        ModMaterialProperties mmpLeftLegPlate = this.leftLegPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpRightLegPlate = this.rightLegPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpTailPlate = this.tailPlate.getPropertyOfMaterial();

        int defenseOfMaterialLeftLegPlate = mmpLeftLegPlate.getPartProtections(ModArmorPart.LEG_PLATE);
        int defenseOfMaterialRightLegPlate = mmpRightLegPlate.getPartProtections(ModArmorPart.LEG_PLATE);
        int defenseOfMaterialTailPlate = mmpTailPlate.getPartProtections(ModArmorPart.TAIL_PLATE);

        return defenseOfMaterialLeftLegPlate +
                defenseOfMaterialRightLegPlate +
                defenseOfMaterialTailPlate;
    }

    @Override
    public float getToughness() {
        ModMaterialProperties mmpLeftLegPlate = this.leftLegPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpRightLegPlate = this.rightLegPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpTailPlate = this.tailPlate.getPropertyOfMaterial();

        float toughnessOfMaterialLeftLegPlate = mmpLeftLegPlate.getToughnessSmallPart();
        float toughnessOfMaterialRightLegPlate = mmpRightLegPlate.getToughnessSmallPart();
        float toughnessOfMaterialTailPlate = mmpTailPlate.getToughnessBigPart();

        return toughnessOfMaterialLeftLegPlate +
                toughnessOfMaterialRightLegPlate +
                toughnessOfMaterialTailPlate;
    }

    public float getKnockBackResistance() {
        ModMaterialProperties mmpLeftLegPlate = this.leftLegPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpRightLegPlate = this.rightLegPlate.getPropertyOfMaterial();
        ModMaterialProperties mmpTailPlate = this.tailPlate.getPropertyOfMaterial();

        float knockBackResistanceOfMaterialLeftLegPlate = mmpLeftLegPlate.getKnockbackResistanceSmallPart();
        float knockBackResistanceOfMaterialRightLegPlate = mmpRightLegPlate.getKnockbackResistanceSmallPart();
        float knockBackResistanceOfMaterialTailPlate = mmpTailPlate.getKnockbackResistanceBigPart();

        return knockBackResistanceOfMaterialLeftLegPlate +
                knockBackResistanceOfMaterialRightLegPlate +
                knockBackResistanceOfMaterialTailPlate;
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot pEquipmentSlot) {
        return pEquipmentSlot == this.slot ? this.customModifiers : super.getDefaultAttributeModifiers(pEquipmentSlot);
    }
    public int getColor(int pTintIndex) {
        if (pTintIndex == 0) {
            return this.leftLegPlateColor;
        } else if (pTintIndex == 1) {
            return this.rightLegPlateColor;
        } else if (pTintIndex == 2) {
            return this.tailPlateColor;
        }
        return ModColors.NONE;
    }

    @Mod.EventBusSubscriber(value = Dist.CLIENT, modid = ArmorTinkers.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    private static class ColorRegisterHandler
    {
        @SubscribeEvent(priority = EventPriority.HIGHEST)
        public static void registerSpawnEggColors(ColorHandlerEvent.Item event)
        {
            MOD_LEGGINGS.forEach(leggingsItem ->
                    event.getItemColors().register((stack, layer) -> leggingsItem.getColor(layer), leggingsItem)
            );
        }
    }
}
