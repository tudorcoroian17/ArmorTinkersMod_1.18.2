package me.tudorcoroian.armortinkers.screen.slot;

import me.tudorcoroian.armortinkers.util.ModArmorForgeSlots;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

public class ModArmorForgeSlot extends SlotItemHandler {
    private boolean active;

    public ModArmorForgeSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition, boolean active) {
        super(itemHandler, index, xPosition, yPosition);
        this.active = active;
    }

    @Override
    public boolean mayPlace(@NotNull ItemStack stack) {
        return true;
    }

    @Override
    public int getMaxStackSize(@NotNull ItemStack stack) {
        return 1;
    }

    @Override
    public boolean isActive() {
        return active;
    }

    public void setActive() {
        active = true;
    }

    public void setInactive(){
        active = false;
    }

    public boolean isEmpty(int slotId) {
        return this.getItemHandler().getStackInSlot(slotId).isEmpty();
    }
}
