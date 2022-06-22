package me.tudorcoroian.armortinkers.block.entity;

import com.mojang.logging.LogUtils;
import me.tudorcoroian.armortinkers.item.ModItems;
import me.tudorcoroian.armortinkers.recipe.ArmorPartTinkeringRecipe;
import me.tudorcoroian.armortinkers.screen.ArmorPartMakerMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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
import org.slf4j.Logger;

import java.util.Optional;

public class ArmorPartMakerBlockEntity extends BlockEntity implements MenuProvider {
    private static final Logger LOGGER = LogUtils.getLogger();

    private final ItemStackHandler itemHandler = new ItemStackHandler(4) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 20;


    public ArmorPartMakerBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.ARMOR_PART_MAKER.get(), pWorldPosition, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                switch (pIndex) {
                    case 0: return ArmorPartMakerBlockEntity.this.progress;
                    case 1: return ArmorPartMakerBlockEntity.this.maxProgress;
                    default: return 0;
                }
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0: ArmorPartMakerBlockEntity.this.progress = progress; break;
                    case 1: ArmorPartMakerBlockEntity.this.maxProgress = maxProgress; break;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    /* From MenuProvider interface */
    @Override
    public Component getDisplayName() {
        return new TranslatableComponent("blockentity.armortinkers.armor_part_maker_be");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player pPlayer) {
        return new ArmorPartMakerMenu(pContainerId, pInventory, this, this.data);
    }

    /* Inherited from BlockEntity class */
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
        pTag.put("armorPartMaker.inventory", itemHandler.serializeNBT());
        pTag.putInt("armorPartMaker.progress", progress);
        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        itemHandler.deserializeNBT(pTag.getCompound("armorPartMaker.inventory"));
        progress = pTag.getInt("armorPartMaker.progress");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, ArmorPartMakerBlockEntity pBlockEntity) {
        if(hasRecipe(pBlockEntity)) {
            pBlockEntity.progress++;
            setChanged(pLevel, pPos, pState);

            if (pBlockEntity.progress > pBlockEntity.maxProgress) {
                craftItem(pBlockEntity);
                extractIngredients(pBlockEntity);
            }
        } else {
            pBlockEntity.resetProgress();
            setChanged(pLevel, pPos, pState);
        }
    }

    private static void extractIngredients(ArmorPartMakerBlockEntity entity) {
        int hammerDamage =entity.itemHandler.getStackInSlot(0).getDamageValue();
        LOGGER.info("Hammer damage " + hammerDamage);
        entity.itemHandler.getStackInSlot(0).setDamageValue(hammerDamage + 1);
        if (isDurabilityZero(entity.itemHandler.getStackInSlot(0))) {
            entity.itemHandler.extractItem(0, 1, false);
        }

        int patternDamage = entity.itemHandler.getStackInSlot(2).getDamageValue();
        LOGGER.info("Pattern damage " + patternDamage);
        entity.itemHandler.getStackInSlot(2).setDamageValue(patternDamage + 1);
        if (isDurabilityZero(entity.itemHandler.getStackInSlot(2))) {
            entity.itemHandler.extractItem(2, 1, false);
        }

        entity.itemHandler.extractItem(1, 1, false);

        entity.resetProgress();
    }

    private static void craftItem(ArmorPartMakerBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        Optional<ArmorPartTinkeringRecipe> match = level.getRecipeManager()
                .getRecipeFor(ArmorPartTinkeringRecipe.Type.INSTANCE, inventory, level);

        if (match.isPresent()) {
            entity.itemHandler.setStackInSlot(3, new ItemStack(match.get().getResultItem().getItem(), 1));
        }
//        entity.itemHandler.setStackInSlot(3, new ItemStack(ModItems.BRONZE_INGOT.get(), 1));
    }

    private static boolean hasRecipe(ArmorPartMakerBlockEntity entity) {
        Level level = entity.level;
        SimpleContainer inventory = new SimpleContainer(entity.itemHandler.getSlots());
        for (int i = 0; i < entity.itemHandler.getSlots(); i++) {
            inventory.setItem(i, entity.itemHandler.getStackInSlot(i));
        }

        // Check if the items in slots match any recipe of ArmorPartTinkering type
        Optional<ArmorPartTinkeringRecipe> match = level.getRecipeManager()
                .getRecipeFor(ArmorPartTinkeringRecipe.Type.INSTANCE, inventory, level);

        return match.isPresent() && canInsertItemIntoOutputSlot(inventory);
//        if (entity.itemHandler.getStackInSlot(0).getItem() == ModItems.ALUMINIUM_INGOT.get()) {
//            if (entity.itemHandler.getStackInSlot(1).getItem() == ModItems.MAGNESIUM_INGOT.get()) {
//                if (entity.itemHandler.getStackInSlot(2).getItem() == ModItems.ZINC_INGOT.get()) {
//                    return entity.itemHandler.getStackInSlot(3) == ItemStack.EMPTY;
//                }
//            }
//        }
//        return false;
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleContainer inventory) {
        return inventory.getItem(3).isEmpty();
    }

    public void resetProgress() {
        this.progress = 0;
    }

    public static boolean isDurabilityZero(ItemStack itemStack) {
        if (itemStack.getDamageValue() == itemStack.getMaxDamage()) {
            return true;
        }
        return false;
    }
}
