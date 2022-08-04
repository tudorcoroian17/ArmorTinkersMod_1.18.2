package me.tudorcoroian.armortinkers.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import me.tudorcoroian.armortinkers.ArmorTinkers;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class ArmorForgeSecondTierScreen extends AbstractContainerScreen<ArmorForgeSecondTierMenu> {

    private static final ResourceLocation TEXTURE_HELMET =
            new ResourceLocation(ArmorTinkers.MOD_ID, "textures/gui/armor_forge_tier_2_helmet.png");
    private static final ResourceLocation TEXTURE_CHESTPLATE =
            new ResourceLocation(ArmorTinkers.MOD_ID, "textures/gui/armor_forge_tier_2_chestplate.png");
    private static final ResourceLocation TEXTURE_LEGGINGS =
            new ResourceLocation(ArmorTinkers.MOD_ID, "textures/gui/armor_forge_tier_2_leggings.png");
    private static final ResourceLocation TEXTURE_BOOTS =
            new ResourceLocation(ArmorTinkers.MOD_ID, "textures/gui/armor_forge_tier_2_boots.png");
    private static final ResourceLocation WIDGET_TEXTURE =
            new ResourceLocation(ArmorTinkers.MOD_ID, "textures/gui/button_widgets.png");
    private ResourceLocation texture;

    public ArmorForgeSecondTierScreen(ArmorForgeSecondTierMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
        this.texture = TEXTURE_HELMET;
    }

    protected void init() {
        super.init();
        this.addRenderableWidget(new ImageButton(this.leftPos + imageWidth + 2, this.topPos, 16, 16, 0, 0, 0,
                WIDGET_TEXTURE,
                btn -> {
                    this.texture = TEXTURE_HELMET;
                    changeSlotsHelmet();
                }));
        this.addRenderableWidget(new ImageButton(this.leftPos + imageWidth + 2, this.topPos + 18, 16, 16, 16, 0, 0,
                WIDGET_TEXTURE,
                btn -> {
                    this.texture = TEXTURE_CHESTPLATE;
                    changeSlotsChestPlate();
                }));
        this.addRenderableWidget(new ImageButton(this.leftPos + imageWidth + 2, this.topPos + 36, 16, 16, 32, 0, 0,
                WIDGET_TEXTURE,
                btn -> {
                    this.texture = TEXTURE_LEGGINGS;
                    changeSlotsLeggings();
                }));
        this.addRenderableWidget(new ImageButton(this.leftPos + imageWidth + 2, this.topPos + 54, 16, 16, 48, 0, 0,
                WIDGET_TEXTURE,
                btn -> {
                    this.texture = TEXTURE_BOOTS;
                    changeSlotsBoots();
                }));
    }

    @Override
    protected void renderBg(PoseStack pPoseStack, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, texture);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(pPoseStack, x, y, 0, 0, imageWidth, imageHeight);

        if (menu.isCrafting()) {
            if (this.getMenu().hideCapSlot.isActive()) {
                blit(pPoseStack, x + 103, y + 34, 176, 0, menu.getScaledProgressHelmet(), 12 );
            } else if (this.getMenu().hideVestSlot.isActive()) {
                blit(pPoseStack, x + 101, y + 33 , 176, 0, menu.getScaledProgressChestplate(), 14 );
            } else if (this.getMenu().hidePantsSlot.isActive()) {
                blit(pPoseStack, x + 104, y + 33, 176, 0, menu.getScaledProgressLeggings(), 14 );
            } else if (this.getMenu().hideSocksSlot.isActive()) {
                blit(pPoseStack, x + 102, y + 34, 176, 0, menu.getScaledProgressBoots(), 12 );
            }
        }
    }

    @Override
    public void render(PoseStack pPoseStack, int mouseX, int mouseY, float delta) {
        renderBackground(pPoseStack);
        super.render(pPoseStack, mouseX, mouseY, delta);
        renderTooltip(pPoseStack, mouseX, mouseY);
    }

    public void changeSlotsHelmet() {
        this.getMenu().leftHeadPlateSlot.setActive();
        this.getMenu().rightHeadPlateSlot.setActive();
        this.getMenu().hideCapSlot.setActive();

        this.getMenu().leftShoulderPlateSlot.setInactive();
        this.getMenu().rightShoulderPlateSlot.setInactive();
        this.getMenu().frontPlateSlot.setInactive();
        this.getMenu().backPlateSlot.setInactive();
        this.getMenu().wristBandSlot.setInactive();
        this.getMenu().hideVestSlot.setInactive();

        this.getMenu().tailPlateSlot.setInactive();
        this.getMenu().leftLegPlateSlot.setInactive();
        this.getMenu().rightLegPlateSlot.setInactive();
        this.getMenu().hidePantsSlot.setInactive();

        this.getMenu().leftBootPlateSlot.setInactive();
        this.getMenu().rightBootPlateSlot.setInactive();
        this.getMenu().hideSocksSlot.setInactive();
    }

    public void changeSlotsChestPlate() {
        this.getMenu().leftHeadPlateSlot.setInactive();
        this.getMenu().rightHeadPlateSlot.setInactive();
        this.getMenu().hideCapSlot.setInactive();

        this.getMenu().leftShoulderPlateSlot.setActive();
        this.getMenu().rightShoulderPlateSlot.setActive();
        this.getMenu().frontPlateSlot.setActive();
        this.getMenu().backPlateSlot.setActive();
        this.getMenu().wristBandSlot.setActive();
        this.getMenu().hideVestSlot.setActive();

        this.getMenu().tailPlateSlot.setInactive();
        this.getMenu().leftLegPlateSlot.setInactive();
        this.getMenu().rightLegPlateSlot.setInactive();
        this.getMenu().hidePantsSlot.setInactive();

        this.getMenu().leftBootPlateSlot.setInactive();
        this.getMenu().rightBootPlateSlot.setInactive();
        this.getMenu().hideSocksSlot.setInactive();
    }

    public void changeSlotsLeggings() {
        this.getMenu().leftHeadPlateSlot.setInactive();
        this.getMenu().rightHeadPlateSlot.setInactive();
        this.getMenu().hideCapSlot.setInactive();

        this.getMenu().leftShoulderPlateSlot.setInactive();
        this.getMenu().rightShoulderPlateSlot.setInactive();
        this.getMenu().frontPlateSlot.setInactive();
        this.getMenu().backPlateSlot.setInactive();
        this.getMenu().wristBandSlot.setInactive();
        this.getMenu().hideVestSlot.setInactive();

        this.getMenu().tailPlateSlot.setActive();
        this.getMenu().leftLegPlateSlot.setActive();
        this.getMenu().rightLegPlateSlot.setActive();
        this.getMenu().hidePantsSlot.setActive();

        this.getMenu().leftBootPlateSlot.setInactive();
        this.getMenu().rightBootPlateSlot.setInactive();
        this.getMenu().hideSocksSlot.setInactive();
    }

    public void changeSlotsBoots() {
        this.getMenu().leftHeadPlateSlot.setInactive();
        this.getMenu().rightHeadPlateSlot.setInactive();
        this.getMenu().hideCapSlot.setInactive();

        this.getMenu().leftShoulderPlateSlot.setInactive();
        this.getMenu().rightShoulderPlateSlot.setInactive();
        this.getMenu().frontPlateSlot.setInactive();
        this.getMenu().backPlateSlot.setInactive();
        this.getMenu().wristBandSlot.setInactive();
        this.getMenu().hideVestSlot.setInactive();

        this.getMenu().tailPlateSlot.setInactive();
        this.getMenu().leftLegPlateSlot.setInactive();
        this.getMenu().rightLegPlateSlot.setInactive();
        this.getMenu().hidePantsSlot.setInactive();

        this.getMenu().leftBootPlateSlot.setActive();
        this.getMenu().rightBootPlateSlot.setActive();
        this.getMenu().hideSocksSlot.setActive();
    }
}
