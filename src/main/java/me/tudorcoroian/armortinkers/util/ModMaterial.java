package me.tudorcoroian.armortinkers.util;

public enum ModMaterial {
    DEFAULT,
    WOOD,
    CACTUS,
    STONE,
    NETHERACK,
    END_STONE,
    FLINT,
    COPPER,
    IRON,
    GOLD,
    OBSIDIAN,
    ALUMINIUM,
    TIN,
    ZINC,
    MAGNESIUM,
    SILVER,
    LEAD,
    BRASS,
    BRONZE,
    VIBRANIUM,
    ADAMANTIUM;

    public ModMaterialProperties getPropertyOfMaterial () {
        switch (this) {
            case WOOD:
                return ModMaterialProperties.WOOD;
            case CACTUS:
                return ModMaterialProperties.CACTUS;
            case STONE:
                return ModMaterialProperties.STONE;
            case NETHERACK:
                return ModMaterialProperties.NETHERACK;
            case END_STONE:
                return ModMaterialProperties.END_STONE;
            case FLINT:
                return ModMaterialProperties.FLINT;
            case COPPER:
                return ModMaterialProperties.COPPER;
            case IRON:
                return ModMaterialProperties.IRON;
            case GOLD:
                return ModMaterialProperties.GOLD;
            case OBSIDIAN:
                return ModMaterialProperties.OBSIDIAN;
            case ALUMINIUM:
                return ModMaterialProperties.ALUMINIUM;
            case TIN:
                return ModMaterialProperties.TIN;
            case ZINC:
                return ModMaterialProperties.ZINC;
            case MAGNESIUM:
                return ModMaterialProperties.MAGNESIUM;
            case SILVER:
                return ModMaterialProperties.SILVER;
            case LEAD:
                return ModMaterialProperties.LEAD;
            case BRASS:
                return ModMaterialProperties.BRASS;
            case BRONZE:
                return ModMaterialProperties.BRONZE;
            case VIBRANIUM:
                return ModMaterialProperties.VIBRANIUM;
            case ADAMANTIUM:
                return ModMaterialProperties.ADAMANTIUM;
            default:
                return ModMaterialProperties.DEFAULT;
        }
    }
}
