package be.noah.invasion.event;

import be.noah.invasion.Invasion;
import be.noah.invasion.entity.ModEntities;
import be.noah.invasion.entity.turret.TurretEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Invasion.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.TURRET.get(), TurretEntity.createAttributes().build());
    }
}
