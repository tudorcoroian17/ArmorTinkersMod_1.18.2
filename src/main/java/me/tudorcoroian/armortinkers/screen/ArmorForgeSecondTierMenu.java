package me.tudorcoroian.armortinkers.screen;

import com.mojang.logging.LogUtils;
import me.tudorcoroian.armortinkers.block.ModBlocks;
import me.tudorcoroian.armortinkers.block.entity.ArmorForgeSecondTierBlockEntity;
import me.tudorcoroian.armortinkers.screen.slot.ModArmorForgeSlot;
import me.tudorcoroian.armortinkers.screen.slot.ModResultSlot;
import me.tudorcoroian.armortinkers.util.ModArmorForgeSlots;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.CapabilityItemHandler;

public class ArmorForgeSecondTierMenu extends AbstractContainerMenu {

    private final ArmorForgeSecondTierBlockEntity blockEntity;
    private final Level level;
    private final ContainerData data;
    // Slots for helmet crafting
    public ModArmorForgeSlot leftHeadPlateSlot;
    public ModArmorForgeSlot rightHeadPlateSlot;
    public ModArmorForgeSlot hideCapSlot;
    // Slots for chestplate crafting
    public ModArmorForgeSlot leftShoulderPlateSlot;
    public ModArmorForgeSlot rightShoulderPlateSlot;
    public ModArmorForgeSlot frontPlateSlot;
    public ModArmorForgeSlot backPlateSlot;
    public ModArmorForgeSlot wristBandSlot;
    public ModArmorForgeSlot hideVestSlot;
    // Slots for leggings crafting
    public ModArmorForgeSlot tailPlateSlot;
    public ModArmorForgeSlot leftLegPlateSlot;
    public ModArmorForgeSlot rightLegPlateSlot;
    public ModArmorForgeSlot hidePantsSlot;
    // Slots for boots crafting
    public ModArmorForgeSlot leftBootPlateSlot;
    public ModArmorForgeSlot rightBootPlateSlot;
    public ModArmorForgeSlot hideSocksSlot;

    public ArmorForgeSecondTierMenu(int windowId, Inventory inv, FriendlyByteBuf extraData) {
        this(windowId, inv, inv.player.level.getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(ModArmorForgeSlots.getNumberOfSlots()));
    }

    public ArmorForgeSecondTierMenu(int windowId, Inventory inv, BlockEntity blockEntity, ContainerData data) {
        super(ModMenuTypes.ARMOR_FORGE_TIER_2_MENU.get(), windowId);
        checkContainerSize(inv, ModArmorForgeSlots.getNumberOfSlots());
        this.blockEntity = ((ArmorForgeSecondTierBlockEntity) blockEntity);
        this.level = inv.player.level;
        this.data = data;

        addPlayerInventory(inv);
        addPlayerHotbar(inv);

        this.blockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY).ifPresent(handler -> {
            LogUtils.getLogger().info("How many slots? " + handler.getSlots());

            this.leftHeadPlateSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.LEFT_HEAD_PLATE, 36, 32, true);
            this.rightHeadPlateSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.RIGHT_HEAD_PLATE, 58, 32, true);
            this.hideCapSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.HIDE_CAP, 80, 32, true);

            this.leftShoulderPlateSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.LEFT_SHOULDER_PLATE, 14, 21, false);
            this.rightShoulderPlateSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.RIGHT_SHOULDER_PLATE, 14, 43, false);
            this.frontPlateSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.FRONT_PLATE, 36, 32, false);
            this.backPlateSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.BACK_PLATE, 58, 32, false);
            this.wristBandSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.WRIST_BAND, 80, 54, false);
            this.hideVestSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.HIDE_VEST, 80, 32, false);

            this.leftLegPlateSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.LEFT_LEG_PLATE, 36, 21, false);
            this.rightLegPlateSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.RIGHT_LEG_PLATE, 36, 43, false);
            this.tailPlateSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.TAIL_PLATE, 80, 32, false);
            this.hidePantsSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.HIDE_PANTS, 58, 32, false);

            this.leftBootPlateSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.LEFT_BOOT_PLATE, 36, 32, false);
            this.rightBootPlateSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.RIGHT_BOOT_PLATE, 80, 32, false);
            this.hideSocksSlot = new ModArmorForgeSlot(handler, ModArmorForgeSlots.HIDE_SOCKS, 58, 32, false);

            this.addSlot((leftHeadPlateSlot));
            this.addSlot((rightHeadPlateSlot));
            this.addSlot((hideCapSlot));

            this.addSlot((leftShoulderPlateSlot));
            this.addSlot((rightShoulderPlateSlot));
            this.addSlot((frontPlateSlot));
            this.addSlot((backPlateSlot));
            this.addSlot((wristBandSlot));
            this.addSlot((hideVestSlot));

            this.addSlot((leftLegPlateSlot));
            this.addSlot((rightLegPlateSlot));
            this.addSlot((tailPlateSlot));
            this.addSlot((hidePantsSlot));

            this.addSlot((leftBootPlateSlot));
            this.addSlot((rightBootPlateSlot));
            this.addSlot((hideSocksSlot));

            this.addSlot(new ModResultSlot(handler, ModArmorForgeSlots.RESULT_SLOT, 126, 32));
            this.addSlot(new ModResultSlot(handler, ModArmorForgeSlots.HELMET_BUTTON, 178, 0));
            this.addSlot(new ModResultSlot(handler, ModArmorForgeSlots.CHESTPLATE_BUTTON, 178, 18));
            this.addSlot(new ModResultSlot(handler, ModArmorForgeSlots.LEGGINGS_BUTTON, 178, 36));
            this.addSlot(new ModResultSlot(handler, ModArmorForgeSlots.BOOTS_BUTTON, 178, 54));
        });

        addDataSlots(data);
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                pPlayer, ModBlocks.ARMOR_FORGE_TIER_2.get());
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 86 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 144));
        }
    }

    public boolean isCrafting() {
        return data.get(0) > 0;
    }

    public int getScaledProgressHelmet() {
        int progress = this.data.get(0);
        int maxProgress = this.data.get(1);
        int progressBarSize = 12;

        return maxProgress != 0 && progress != 0 ? progress * progressBarSize / maxProgress : 0;
    }

    public int getScaledProgressChestplate() {
        int progress = this.data.get(0);
        int maxProgress = this.data.get(1);
        int progressBarSize = 16;

        return maxProgress != 0 && progress != 0 ? progress * progressBarSize / maxProgress : 0;
    }

    public int getScaledProgressLeggings() {
        int progress = this.data.get(0);
        int maxProgress = this.data.get(1);
        int progressBarSize = 10;

        return maxProgress != 0 && progress != 0 ? progress * progressBarSize / maxProgress : 0;
    }

    public int getScaledProgressBoots() {
        int progress = this.data.get(0);
        int maxProgress = this.data.get(1);
        int progressBarSize = 14;

        return maxProgress != 0 && progress != 0 ? progress * progressBarSize / maxProgress : 0;
    }

    // CREDIT GOES TO: diesieben07 | https://github.com/diesieben07/SevenCommons
    // must assign a slot number to each of the slots used by the GUI.
    // For this container, we can see both the tile inventory's slots as well as the player inventory slots and the hotbar.
    // Each time we add a Slot to the container, it automatically increases the slotIndex, which means
    //  0 - 8 = hotbar slots (which will map to the InventoryPlayer slot numbers 0 - 8)
    //  9 - 35 = player inventory slots (which map to the InventoryPlayer slot numbers 9 - 35)
    //  36 - 44 = TileInventory slots, which map to our TileEntity slot numbers 0 - 8)
    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

    // THIS YOU HAVE TO DEFINE!
    private static final int TE_INVENTORY_SLOT_COUNT = 21;  // must be the number of slots you have!

    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
        Slot sourceSlot = slots.get(index);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;  //EMPTY_ITEM
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        // Check if the slot clicked is one of the vanilla container slots
        if (index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            // This is a vanilla container slot so merge the stack into the tile inventory
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX
                    + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;  // EMPTY_ITEM
            }
        } else if (index < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            // This is a TE slot so merge the stack into the players inventory
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + index);
            return ItemStack.EMPTY;
        }
        // If stack size == 0 (the entire stack was moved) set slot contents to null
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }
}
