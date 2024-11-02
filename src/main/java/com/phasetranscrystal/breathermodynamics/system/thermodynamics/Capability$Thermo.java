package com.phasetranscrystal.breathermodynamics.system.thermodynamics;

import com.phasetranscrystal.breathermodynamics.BreaThermodynamics;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.capabilities.BlockCapability;

public class Capability$Thermo {
    public static final ResourceLocation CAP_ID = ResourceLocation.fromNamespaceAndPath(BreaThermodynamics.MODID,"thermo");
    public static final BlockCapability<IThermoBackground,Void> THERMO_BLOCK = BlockCapability.createVoid(CAP_ID, IThermoBackground.class);
}
