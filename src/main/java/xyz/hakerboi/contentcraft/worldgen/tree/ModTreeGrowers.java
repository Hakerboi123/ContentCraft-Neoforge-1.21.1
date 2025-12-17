package xyz.hakerboi.contentcraft.worldgen.tree;


import net.minecraft.world.level.block.grower.TreeGrower;
import xyz.hakerboi.contentcraft.ContentCraft;
import xyz.hakerboi.contentcraft.worldgen.ModConfiguredFeatures;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower MAPLE = new TreeGrower(ContentCraft.MOD_ID + ":maple",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MAPLE_KEY), Optional.empty());

}
