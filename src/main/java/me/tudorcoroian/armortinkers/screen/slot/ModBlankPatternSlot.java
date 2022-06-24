package me.tudorcoroian.armortinkers.screen.slot;

import me.tudorcoroian.armortinkers.util.ModTags;
import net.minecraft.core.Registry;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

public class ModBlankPatternSlot extends SlotItemHandler {
    public ModBlankPatternSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(@NotNull ItemStack stack) {
        return ModBlankPatternSlot.isBlankPattern(stack);
    }

    @Override
    public int getMaxStackSize(@NotNull ItemStack stack) {
        return 64;
    }

    public static boolean isBlankPattern(ItemStack item) {
        return Registry.ITEM.getHolderOrThrow(Registry.ITEM.getResourceKey(item.getItem()).get())
                .is(ModTags.Items.BLANK_PATTERNS);
    }
}
