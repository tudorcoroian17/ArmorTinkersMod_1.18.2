package me.tudorcoroian.armortinkers.screen.slot;

import me.tudorcoroian.armortinkers.item.ModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

public class ModHammerSlot extends SlotItemHandler {
    public ModHammerSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(@NotNull ItemStack stack) {
        return ModHammerSlot.isHammer(stack);
    }

    @Override
    public int getMaxStackSize(@NotNull ItemStack stack) {
        return 1;
    }

    private static boolean isHammer(ItemStack itemStack) {
        return itemStack.is(ModItems.STONE_HAMMER.get()) ||
                itemStack.is(ModItems.IRON_HAMMER.get());
    }
}
