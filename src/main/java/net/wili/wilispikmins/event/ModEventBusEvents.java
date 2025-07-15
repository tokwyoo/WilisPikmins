package net.wili.wilispikmins.event;

import net.wili.wilispikmins.WilisPikmins;
import net.wili.wilispikmins.entity.ModEntities;
import net.wili.wilispikmins.entity.client.RedPikminModel;
import net.wili.wilispikmins.entity.custom.RedPikminEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = WilisPikmins.MOD_ID)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(RedPikminModel.LAYER_LOCATION, RedPikminModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RED_PIKMIN.get(), RedPikminEntity.createAttribute().build());
    }
}
