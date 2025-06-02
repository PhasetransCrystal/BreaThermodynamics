package com.phasetranscrystal.breathermodynamics.system.thermodynamics;

import com.phasetranscrystal.metal.BreaMetalRegistries;
import com.phasetranscrystal.metal.material.Material;

public interface IThermoMatBackground extends IThermoBackground {

    Material getMaterial();

    default int maxT() {
        return (int) (getMaterial().getFeature(BreaMetalRegistries.PHASE_TRANSIT.get()).getInstance().mp * 1.14F);
    }

    default long getMC() {
        return (long) (getMaterial().getFeature(BreaMetalRegistries.THERMO.get()).getInstance().c * getM() / 1000);
    }

    default float getK() {
        return getMaterial().getFeature(BreaMetalRegistries.THERMO.get()).getInstance().k;
    }

    long getM();//单位mB
}
