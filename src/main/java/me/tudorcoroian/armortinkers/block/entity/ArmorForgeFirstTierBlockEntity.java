package me.tudorcoroian.armortinkers.block.entity;

import com.mojang.logging.LogUtils;
import me.tudorcoroian.armortinkers.item.ModItems;
import me.tudorcoroian.armortinkers.item.custom.ArmorPartItem;
import me.tudorcoroian.armortinkers.item.custom.HelmetItem;
import me.tudorcoroian.armortinkers.recipe.*;
import me.tudorcoroian.armortinkers.screen.ArmorForgeFirstTierMenu;
import me.tudorcoroian.armortinkers.screen.slot.ModArmorForgeSlot;
import me.tudorcoroian.armortinkers.util.ModArmorForgeSlots;
import me.tudorcoroian.armortinkers.util.ModMaterial;
import me.tudorcoroian.armortinkers.util.ModTags;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class ArmorForgeFirstTierBlockEntity extends BlockEntity implements MenuProvider {

    private final ItemStackHandler itemHandler = new ItemStackHandler(ModArmorForgeSlots.getNumberOfSlots()) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 100;

    public ArmorForgeFirstTierBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.ARMOR_FORGE_TIER_1.get(), pWorldPosition, pBlockState);
        LogUtils.getLogger().info("How many slots? " + itemHandler.getSlots());
        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                switch (pIndex) {
                    case 0: return ArmorForgeFirstTierBlockEntity.this.progress;
                    case 1: return ArmorForgeFirstTierBlockEntity.this.maxProgress;
                    default: return 0;
                }
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0: ArmorForgeFirstTierBlockEntity.this.progress = progress; break;
                    case 1: ArmorForgeFirstTierBlockEntity.this.maxProgress = maxProgress; break;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("blockentity.armortinkers.armor_forge_be");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new ArmorForgeFirstTierMenu(pContainerId, pInventory, this, this.data);
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @javax.annotation.Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return lazyItemHandler.cast();
        }
        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("armorForgeFirstTier.inventory", itemHandler.serializeNBT());
        pTag.putInt("armorForgeFirstTier.progress", progress);
        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        itemHandler.deserializeNBT(pTag.getCompound("armorForgeFirstTier.inventory"));
        progress = pTag.getInt("armorForgeFirstTier.progress");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        LogUtils.getLogger().info("How many slots? " + itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, ArmorForgeFirstTierBlockEntity pBlockEntity) {
        if(hasHelmetRecipe(pBlockEntity)) {
            pBlockEntity.progress++;
            setChanged(pLevel, pPos, pState);

            if (pBlockEntity.progress > pBlockEntity.maxProgress) {
                craftHelmet(pBlockEntity);
                extractIngredientsHelmet(pBlockEntity);
            }
        } else if (hasChestplateRecipe(pBlockEntity)) {
            pBlockEntity.progress++;
            setChanged(pLevel, pPos, pState);

            if (pBlockEntity.progress > pBlockEntity.maxProgress) {
                craftChestplate(pBlockEntity);
                extractIngredientsChestplate(pBlockEntity);
            }
        } else if (hasLeggingsRecipe(pBlockEntity)) {
            pBlockEntity.progress++;
            setChanged(pLevel, pPos, pState);

            if (pBlockEntity.progress > pBlockEntity.maxProgress) {
                craftLeggings(pBlockEntity);
                extractIngredientsLeggings(pBlockEntity);
            }
        } else if (hasBootsRecipe(pBlockEntity)) {
            pBlockEntity.progress++;
            setChanged(pLevel, pPos, pState);

            if (pBlockEntity.progress > pBlockEntity.maxProgress) {
                craftBoots(pBlockEntity);
                extractIngredientsBoots(pBlockEntity);
            }
        } else {
            pBlockEntity.resetProgress();
            setChanged(pLevel, pPos, pState);
        }
    }

    private static boolean hasHelmetRecipe(ArmorForgeFirstTierBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(4);
        inventory.setItem(0, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.LEFT_HEAD_PLATE));
        inventory.setItem(1, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RIGHT_HEAD_PLATE));
        inventory.setItem(2, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.HIDE_CAP));
        inventory.setItem(3, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RESULT_SLOT));

        // Check if the items in slots match any recipe of Helmet Forging T1 type
        Optional<HelmetForgingRecipeFirstTier> match = level.getRecipeManager()
                .getRecipeFor(HelmetForgingRecipeFirstTier.Type.INSTANCE, inventory, level);

        return match.isPresent() && canInsertItemIntoOutputSlot(inventory, 3);
    }

    private static boolean hasChestplateRecipe(ArmorForgeFirstTierBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(7);
        inventory.setItem(0, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.LEFT_SHOULDER_PLATE));
        inventory.setItem(1, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RIGHT_SHOULDER_PLATE));
        inventory.setItem(2, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.FRONT_PLATE));
        inventory.setItem(3, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.BACK_PLATE));
        inventory.setItem(4, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.WRIST_BAND));
        inventory.setItem(5, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.HIDE_VEST));
        inventory.setItem(6, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RESULT_SLOT));

        // Check if the items in slots match any recipe of Chestplate Forging T1 type
        Optional<ChestPlateForgingRecipeFirstTier> match = level.getRecipeManager()
                .getRecipeFor(ChestPlateForgingRecipeFirstTier.Type.INSTANCE, inventory, level);

        return match.isPresent() && canInsertItemIntoOutputSlot(inventory, 6);
    }

    private static boolean hasLeggingsRecipe(ArmorForgeFirstTierBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(5);
        inventory.setItem(0, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.LEFT_LEG_PLATE));
        inventory.setItem(1, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RIGHT_LEG_PLATE));
        inventory.setItem(2, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.TAIL_PLATE));
        inventory.setItem(3, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.HIDE_PANTS));
        inventory.setItem(4, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RESULT_SLOT));

        // Check if the items in slots match any recipe of Leggings Forging T1 type
        Optional<LeggingsForgingRecipeFirstTier> match = level.getRecipeManager()
                .getRecipeFor(LeggingsForgingRecipeFirstTier.Type.INSTANCE, inventory, level);

        return match.isPresent() && canInsertItemIntoOutputSlot(inventory, 4);
    }

    private static boolean hasBootsRecipe(ArmorForgeFirstTierBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(4);
        inventory.setItem(0, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.LEFT_BOOT_PLATE));
        inventory.setItem(1, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RIGHT_BOOT_PLATE));
        inventory.setItem(2, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.HIDE_SOCKS));
        inventory.setItem(3, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RESULT_SLOT));

        // Check if the items in slots match any recipe of Boots Forging T1 type
        Optional<BootsForgingRecipeFirstTier> match = level.getRecipeManager()
                .getRecipeFor(BootsForgingRecipeFirstTier.Type.INSTANCE, inventory, level);

        return match.isPresent() && canInsertItemIntoOutputSlot(inventory, 3);
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory, int slot) {
        return inventory.getItem(slot).isEmpty();
    }

    private static void craftHelmet(ArmorForgeFirstTierBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(4);
        inventory.setItem(0, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.LEFT_HEAD_PLATE));
        inventory.setItem(1, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RIGHT_HEAD_PLATE));
        inventory.setItem(2, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.HIDE_CAP));
        inventory.setItem(3, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RESULT_SLOT));

        Optional<HelmetForgingRecipeFirstTier> match = level.getRecipeManager()
                .getRecipeFor(HelmetForgingRecipeFirstTier.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            entity.itemHandler.setStackInSlot(ModArmorForgeSlots.RESULT_SLOT, new ItemStack(match.get().getResultItem().getItem(), 1));
        }
    }

    private static void extractIngredientsHelmet(ArmorForgeFirstTierBlockEntity entity) {
        entity.itemHandler.extractItem(ModArmorForgeSlots.LEFT_HEAD_PLATE, 1, false);
        entity.itemHandler.extractItem(ModArmorForgeSlots.RIGHT_HEAD_PLATE, 1, false);
        entity.itemHandler.extractItem(ModArmorForgeSlots.HIDE_CAP, 1, false);

        entity.resetProgress();
    }

    private static void craftChestplate(ArmorForgeFirstTierBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(7);
        inventory.setItem(0, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.LEFT_SHOULDER_PLATE));
        inventory.setItem(1, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RIGHT_SHOULDER_PLATE));
        inventory.setItem(2, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.FRONT_PLATE));
        inventory.setItem(3, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.BACK_PLATE));
        inventory.setItem(4, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.WRIST_BAND));
        inventory.setItem(5, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.HIDE_VEST));
        inventory.setItem(6, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RESULT_SLOT));

        Optional<ChestPlateForgingRecipeFirstTier> match = level.getRecipeManager()
                .getRecipeFor(ChestPlateForgingRecipeFirstTier.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            entity.itemHandler.setStackInSlot(ModArmorForgeSlots.RESULT_SLOT, new ItemStack(match.get().getResultItem().getItem(), 1));
        }
    }

    private static void extractIngredientsChestplate(ArmorForgeFirstTierBlockEntity entity) {
        entity.itemHandler.extractItem(ModArmorForgeSlots.LEFT_SHOULDER_PLATE, 1, false);
        entity.itemHandler.extractItem(ModArmorForgeSlots.RIGHT_SHOULDER_PLATE, 1, false);
        entity.itemHandler.extractItem(ModArmorForgeSlots.FRONT_PLATE, 1, false);
        entity.itemHandler.extractItem(ModArmorForgeSlots.BACK_PLATE, 1, false);
        entity.itemHandler.extractItem(ModArmorForgeSlots.WRIST_BAND, 1, false);
        entity.itemHandler.extractItem(ModArmorForgeSlots.HIDE_VEST, 1, false);

        entity.resetProgress();
    }

    private static void craftLeggings(ArmorForgeFirstTierBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(5);
        inventory.setItem(0, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.LEFT_LEG_PLATE));
        inventory.setItem(1, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RIGHT_LEG_PLATE));
        inventory.setItem(2, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.TAIL_PLATE));
        inventory.setItem(3, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.HIDE_PANTS));
        inventory.setItem(4, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RESULT_SLOT));

        Optional<LeggingsForgingRecipeFirstTier> match = level.getRecipeManager()
                .getRecipeFor(LeggingsForgingRecipeFirstTier.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            entity.itemHandler.setStackInSlot(ModArmorForgeSlots.RESULT_SLOT, new ItemStack(match.get().getResultItem().getItem(), 1));
        }
    }

    private static void extractIngredientsLeggings(ArmorForgeFirstTierBlockEntity entity) {
        entity.itemHandler.extractItem(ModArmorForgeSlots.LEFT_LEG_PLATE, 1, false);
        entity.itemHandler.extractItem(ModArmorForgeSlots.RIGHT_LEG_PLATE, 1, false);
        entity.itemHandler.extractItem(ModArmorForgeSlots.TAIL_PLATE, 1, false);
        entity.itemHandler.extractItem(ModArmorForgeSlots.HIDE_PANTS, 1, false);

        entity.resetProgress();
    }

    private static void craftBoots(ArmorForgeFirstTierBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(4);
        inventory.setItem(0, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.LEFT_BOOT_PLATE));
        inventory.setItem(1, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RIGHT_BOOT_PLATE));
        inventory.setItem(2, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.HIDE_SOCKS));
        inventory.setItem(3, entity.itemHandler.getStackInSlot(ModArmorForgeSlots.RESULT_SLOT));

        Optional<BootsForgingRecipeFirstTier> match = level.getRecipeManager()
                .getRecipeFor(BootsForgingRecipeFirstTier.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            entity.itemHandler.setStackInSlot(ModArmorForgeSlots.RESULT_SLOT, new ItemStack(match.get().getResultItem().getItem(), 1));
        }
    }

    private static void extractIngredientsBoots(ArmorForgeFirstTierBlockEntity entity) {
        entity.itemHandler.extractItem(ModArmorForgeSlots.LEFT_BOOT_PLATE, 1, false);
        entity.itemHandler.extractItem(ModArmorForgeSlots.RIGHT_BOOT_PLATE, 1, false);
        entity.itemHandler.extractItem(ModArmorForgeSlots.HIDE_SOCKS, 1, false);

        entity.resetProgress();
    }

    public void resetProgress() {
        this.progress = 0;
    }
}
