package com.phasetranscrystal.breathermodynamics.system.thermodynamics;

import com.phasetranscrystal.metal.BreaMetal;
import com.phasetranscrystal.metal.BreaMetalRegistries;
import com.phasetranscrystal.metal.expansion.materialfeature.CombustibleMF;
import com.phasetranscrystal.metal.mfeature.IMaterialFeature;
import com.phasetranscrystal.metal.mitemtype.ITypedMaterialObj;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.OptionalDouble;

public class System$Thermo {
    public static OptionalDouble getCombustionInternalEnergy(@Nonnull ItemStack stack) {
        ITypedMaterialObj matinfo = BreaMetal.getMaterialInfo(stack.getItem());
        if (matinfo == null) return OptionalDouble.empty();
        IMaterialFeature<CombustibleMF> combus = matinfo.getMaterial().get().getFeature(BreaMetalRegistries.COMBUSTIBLE.get());
        if (combus == null) return OptionalDouble.empty();
        return OptionalDouble.of(matinfo.getAvailable() * combus.getInstance().q);
    }
}
