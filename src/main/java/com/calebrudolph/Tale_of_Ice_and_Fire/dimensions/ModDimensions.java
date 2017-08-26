package com.calebrudolph.Tale_of_Ice_and_Fire.dimensions;

import com.calebrudolph.Tale_of_Ice_and_Fire.Reference;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.config.Config;

public class ModDimensions {

    public static DimensionType testDimensionType;

    public static void init() {
        registerDimensionTypes();
        registerDimensions();
    }

    private static void registerDimensionTypes() {
        testDimensionType = DimensionType.register(Reference.MOD_ID, "_test", Reference.BOSSFIGHT1, CustomWorldProvider.class, false);
    }

    private static void registerDimensions() {
        DimensionManager.registerDimension(Reference.BOSSFIGHT1, testDimensionType);
    }
}
