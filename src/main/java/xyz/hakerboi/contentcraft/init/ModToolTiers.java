package xyz.hakerboi.contentcraft.init;


import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier XAENON = new SimpleTier(
            ModTags.Blocks.INCORRECT_FOR_XAENON_TOOL,
            2800,
            11.0f,
            5.0f,
            18,
            () -> Ingredient.of(ModItems.XAENON_INGOT)
    );


}
