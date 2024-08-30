package be.noah.invasion.entity;

import be.noah.invasion.Invasion;
import be.noah.invasion.entity.turret.TurretEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Invasion.MODID);
    public static final RegistryObject<EntityType<TurretEntity>> TURRET =
            ENTITY_TYPES.register("turret", () -> EntityType.Builder.of(TurretEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("rhino"));
    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
