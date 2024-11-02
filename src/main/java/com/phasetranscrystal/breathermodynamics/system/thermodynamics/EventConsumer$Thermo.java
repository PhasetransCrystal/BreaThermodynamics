package com.phasetranscrystal.breathermodynamics.system.thermodynamics;

import com.phasetranscrystal.breathermodynamics.BreaThermodynamics;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = BreaThermodynamics.MODID)
public class EventConsumer$Thermo {
    @SubscribeEvent
    public static void capAttach(RegisterCapabilitiesEvent event) {
        for (BlockEntityType<?> type : BuiltInRegistries.BLOCK_ENTITY_TYPE) {
            try {
                BlockEntity e = type.create(null, null);
                if (e instanceof IThermoBackground) {
                    event.registerBlockEntity(Capability$Thermo.THERMO_BLOCK, type, (be, n) -> (IThermoBackground) be);
                }
            } catch (Exception ignored) {
            }
        }
    }
}
