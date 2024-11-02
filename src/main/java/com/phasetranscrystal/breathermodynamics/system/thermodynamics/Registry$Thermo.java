package com.phasetranscrystal.breathermodynamics.system.thermodynamics;

import com.phasetranscrystal.breathermodynamics.BreaThermodynamics;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Registry$Thermo {
    public static void bootstrap(IEventBus bus){
    }

    private static final DeferredRegister<BlockEntityType<?>> ENTITY_TYPE = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, BreaThermodynamics.MODID);

//    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<ThermoBlockEntity>> THERMO_BLOCK = ENTITY_TYPE.register("thermo")

}
