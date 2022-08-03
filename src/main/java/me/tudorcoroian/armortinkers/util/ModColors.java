package me.tudorcoroian.armortinkers.util;

public class ModColors {

    public static final int NONE = 16777215; // 0xFFFFFF
    public static final int MAGNESIUM = 13537472;
    public static final int WOOD = 4996390;
    public static final int CACTUS = 3758106;
    public static final int STONE = 6842472;
    public static final int NETHERACK = 5249819;
    public static final int END_STONE = 14608036;
    public static final int FLINT = 3026221;
    public static final int COPPER = 12671542;
    public static final int IRON = 14211288;
    public static final int GOLD = 16438858;
    public static final int OBSIDIAN = 2563645;
    public static final int ALUMINIUM = 11853035;
    public static final int TIN = 11917812;
    public static final int ZINC = 10202789;
    public static final int SILVER = 9301243;
    public static final int LEAD = 13817335;
    public static final int BRASS = 10259456;
    public static final int BRONZE = 15637870;
    public static final int VIBRANIUM = 6239960;
    public static final int ADAMANTIUM = 4467277;
    
    public static final int getColorOfMaterial(ModMaterial material) {
        switch (material) {
            case WOOD:
                return WOOD;
            case CACTUS:
                return CACTUS;
            case STONE:
                return STONE;
            case NETHERACK:
                return NETHERACK;
            case END_STONE:
                return END_STONE;
            case FLINT:
                return FLINT;
            case COPPER:
                return COPPER;
            case IRON:
                return IRON;
            case GOLD:
                return GOLD;
            case OBSIDIAN:
                return OBSIDIAN;
            case ALUMINIUM:
                return ALUMINIUM;
            case TIN:
                return TIN;
            case ZINC:
                return ZINC;
            case MAGNESIUM:
                return MAGNESIUM;
            case SILVER:
                return SILVER;
            case LEAD:
                return LEAD;
            case BRASS:
                return BRASS;
            case BRONZE:
                return BRONZE;
            case VIBRANIUM:
                return VIBRANIUM;
            case ADAMANTIUM:
                return ADAMANTIUM;
            default:
                return 0;
        }
    }
}
