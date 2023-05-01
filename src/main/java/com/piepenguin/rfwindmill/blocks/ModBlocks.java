package com.piepenguin.rfwindmill.blocks;

import net.minecraft.block.Block;

import com.piepenguin.rfwindmill.lib.ModConfiguration;

/**
 * Creates {@link Block} instances of all the blocks in the mod.
 */
public class ModBlocks {

    public static Block windmillBlock;
    public static Block rotorBlock1;

    /**
     * Create {@link Block} instances of all the blocks in the mod.
     */
    public static void init() {
        float[] efficiency = ModConfiguration.getWindmillEfficiency();
        int[] energyStorage = ModConfiguration.getWindmillEnergyStorage();
        windmillBlock = new WindmillBlock("windmillBlock", efficiency, energyStorage);
        rotorBlock1 = new RotorBlock();
    }
}
