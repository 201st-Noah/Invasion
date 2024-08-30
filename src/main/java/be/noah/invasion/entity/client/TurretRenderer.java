package be.noah.invasion.entity.client;

import be.noah.invasion.Invasion;
import be.noah.invasion.entity.turret.TurretEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TurretRenderer  extends MobRenderer<TurretEntity, TurretModel<TurretEntity>> {
    public TurretRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new TurretModel<>(pContext.bakeLayer(ModModelLayers.TURRET_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(TurretEntity pEntity) {
        return ResourceLocation.parse("textures/entity/turret.png");
    }

    @Override
    public void render(TurretEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
