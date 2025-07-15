package net.wili.wilispikmins.entity.client;

import net.wili.wilispikmins.WilisPikmins;
import net.wili.wilispikmins.entity.custom.RedPikminEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RedPikminRenderer extends MobRenderer<RedPikminEntity, RedPikminModel<RedPikminEntity>> {
    public RedPikminRenderer(EntityRendererProvider.Context context) {
        super(context, new RedPikminModel<>(context.bakeLayer(RedPikminModel.LAYER_LOCATION)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(RedPikminEntity redPikminEntity) {
        return ResourceLocation.fromNamespaceAndPath(WilisPikmins.MOD_ID, "textures/entity/red_pikmin.png");
    }

    @Override
    public void render(RedPikminEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if(entity.isBaby()){
            poseStack.scale(0.45f, 0.45f, 0.45f);
        } else {
            poseStack.scale(1f, 1f, 1f);
        }

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
