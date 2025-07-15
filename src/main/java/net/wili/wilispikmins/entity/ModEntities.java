package net.wili.wilispikmins.entity;

import net.wili.wilispikmins.WilisPikmins;
import net.wili.wilispikmins.entity.custom.RedPikminEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, WilisPikmins.MOD_ID);

    public static final Supplier<EntityType<RedPikminEntity>> RED_PIKMIN =
            ENTITY_TYPES.register("red_pikmin", () -> EntityType.Builder.of(RedPikminEntity::new, MobCategory.CREATURE)
                    .sized(0.75f, 0.35f).build("red_pikmin"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
