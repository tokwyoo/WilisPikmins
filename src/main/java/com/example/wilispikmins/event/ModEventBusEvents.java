package com.example.wilispikmins.event;

import com.example.wilispikmins.WilisPikmins;
import com.example.wilispikmins.entity.ModEntities;
import com.example.wilispikmins.entity.client.RedPikminModel;
import com.example.wilispikmins.entity.custom.RedPikminEntity;
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
