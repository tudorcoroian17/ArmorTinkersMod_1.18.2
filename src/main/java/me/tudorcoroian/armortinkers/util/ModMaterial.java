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

    public String getMaterialName () {
        switch (this) {
            case WOOD:
                return "§a§lWood§r §a§o";
            case CACTUS:
                return "§2§lCactus§r §2§o";
            case STONE:
                return "§7§lStone§r §7§o";
            case NETHERACK:
                return "§4§lNetherrack§r §4§o";
            case END_STONE:
                return "§e§lEnd Stone§r §e§o";
            case FLINT:
                return "§8§lFlint§r §8§o";
            case COPPER:
                return "§6§lCopper§r §6§o";
            case IRON:
                return "§f§lIron§r §f§o";
            case GOLD:
                return "§e§lGold§r §e§o";
            case OBSIDIAN:
                return "§5§lObsidian§r §5§o";
            case ALUMINIUM:
                return "§3§lAluminium§r §3§o";
            case TIN:
                return "§9§lTin§r §9§o";
            case ZINC:
                return "§b§lZinc§r §b§o";
            case MAGNESIUM:
                return "§d§lMagnesium§r §d§o";
            case SILVER:
                return "§f§lSilver§r §f§o";
            case LEAD:
                return "§1§lLead§r §1§o";
            case BRASS:
                return "§c§lBrass§r §c§o";
            case BRONZE:
                return "§6§lBronze§r §6§o";
            case VIBRANIUM:
                return "§5§lVibranium§r §5§o";
            case ADAMANTIUM:
                return "§0§lAdamantium§r §0§o";
            default:
                return "";
        }
    }
}
