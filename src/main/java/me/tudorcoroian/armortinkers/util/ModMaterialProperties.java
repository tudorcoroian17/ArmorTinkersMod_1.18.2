package me.tudorcoroian.armortinkers.util;

public enum ModMaterialProperties {
    DEFAULT(ModMaterial.DEFAULT, 0, new int[] {0, 0, 0, 0, 0, 0, 0, 0}, 0.0F, 0.0F, 0.0F, 0.0F),
    WOOD(ModMaterial.WOOD, 2, new int[]{1, 1, 1, 1, 1, 1, 1, 1}, 0.0F, 0.0F,  0.0F, 0.0F),
    CACTUS(ModMaterial.CACTUS, 1, new int[]{1, 1, 1, 1, 1, 1, 1, 1}, 0.0F, 0.0F,  0.0F, 0.0F),
    STONE(ModMaterial.STONE, 3, new int[]{1, 2, 2, 1, 1, 1, 1, 1}, 0.0F, 0.0F,  0.0F, 0.0F),
    NETHERACK(ModMaterial.NETHERACK, 3, new int[]{1, 2, 2, 1, 1, 1, 1, 1}, 0.0F, 0.0F,  0.0F, 0.0F),
    END_STONE(ModMaterial.END_STONE, 3, new int[]{1, 2, 2, 1, 1, 1, 1, 1}, 0.0F, 0.0F,  0.0F, 0.0F),
    FLINT(ModMaterial.FLINT, 2, new int[]{1, 1, 1, 1, 1, 1, 1, 1}, 0.0F, 0.0F, 0.0F, 0.0F),
    COPPER(ModMaterial.COPPER, 4, new int[]{1, 2, 2, 1, 1, 1, 2, 1}, 0.0F, 0.0F, 0.0F, 0.0F),
    IRON(ModMaterial.IRON, 5, new int[]{1, 2, 2, 1, 1, 2, 2, 1}, 0.0F, 0.0F, 0.0F, 0.0F),
    GOLD(ModMaterial.GOLD, 4, new int[]{1, 2, 2, 1, 1, 2, 1, 1}, 0.0F, 0.0F, 0.0F, 0.0F),
    OBSIDIAN(ModMaterial.OBSIDIAN, 5, new int[]{1, 1, 1, 1, 1, 1, 1, 1}, 1.0F, 2.0F, 0.05F, 0.1F),
    ALUMINIUM(ModMaterial.ALUMINIUM, 4, new int[]{1, 2, 2, 1, 1, 1, 2, 1}, 0.0F, 0.0F, 0.0F, 0.0F),
    TIN(ModMaterial.TIN, 4, new int[]{1, 2, 2, 1, 1, 1, 2, 1}, 0.0F, 0.0F, 0.0F, 0.0F),
    ZINC(ModMaterial.ZINC, 5, new int[]{1, 2, 2, 1, 1, 2, 2, 1}, 0.0F, 0.0F, 0.0F, 0.0F),
    MAGNESIUM(ModMaterial.MAGNESIUM, 5, new int[]{1, 2, 2, 1, 1, 2, 2, 1}, 0.0F, 0.0F, 0.0F, 0.0F),
    SILVER(ModMaterial.SILVER, 6, new int[]{1, 2, 2, 1, 1, 2, 3, 1}, 0.0F, 0.0F, 0.0F, 0.0F),
    LEAD(ModMaterial.LEAD, 6, new int[]{1, 2, 2, 1, 1, 2, 3, 1}, 0.0F, 0.0F, 0.0F, 0.0F),
    BRASS(ModMaterial.BRASS, 7, new int[]{1, 2, 2, 1, 1, 2, 3, 1}, 0.5F, 1.0F, 0.0F, 0.0F),
    BRONZE(ModMaterial.BRONZE, 7, new int[]{1, 2, 2, 1, 1, 2, 3, 1}, 0.5F, 1.0F, 0.0F, 0.0F),
    VIBRANIUM(ModMaterial.VIBRANIUM, 9, new int[]{1, 3, 3, 1, 1, 2, 3, 1}, 2.0F, 3.0F, 0.1F, 0.25F),
    ADAMANTIUM(ModMaterial.ADAMANTIUM, 12, new int[]{1, 3, 3, 1, 1, 2, 3, 1}, 3.0F, 5.0F, 0.2F, 0.3F),
    ;

    private final ModMaterial material;
    private final int durabilityMultiplier;
    private final int[] partProtections;
    private final float toughnessSmallPart;
    private final float toughnessBigPart;
    private final float knockbackResistanceSmallPart;
    private final float knockbackResistanceBigPart;

    ModMaterialProperties(ModMaterial material, int durabilityMultiplier, int[] partProtections, float toughnessSmallPart, float toughnessBigPart, float knockbackResistanceSmallPart, float knockbackResistanceBigPart) {
        this.material = material;
        this.durabilityMultiplier = durabilityMultiplier;
        this.partProtections = partProtections;
        this.toughnessSmallPart = toughnessSmallPart;
        this.toughnessBigPart = toughnessBigPart;
        this.knockbackResistanceSmallPart = knockbackResistanceSmallPart;
        this.knockbackResistanceBigPart = knockbackResistanceBigPart;
    }

    public int getDurabilityMultiplier() {
        return durabilityMultiplier;
    }

    public int getPartProtections(ModArmorPart part) {
        return partProtections[part.ordinal()];
    }

    public ModMaterial getMaterial() {
        return material;
    }

    public int[] getPartProtections() {
        return partProtections;
    }

    public float getToughnessSmallPart() {
        return toughnessSmallPart;
    }

    public float getToughnessBigPart() {
        return toughnessBigPart;
    }

    public float getKnockbackResistanceSmallPart() {
        return knockbackResistanceSmallPart;
    }

    public float getKnockbackResistanceBigPart() {
        return knockbackResistanceBigPart;
    }
}
