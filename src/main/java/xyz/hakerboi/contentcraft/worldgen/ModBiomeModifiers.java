package xyz.hakerboi.contentcraft.worldgen;


import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import xyz.hakerboi.contentcraft.ContentCraft;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_TREE_MAPLE = registerKey("add_tree_maple");
    
    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_TREE_MAPLE, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(
                        biomes.getOrThrow(Biomes.PLAINS)
//                        biomes.getOrThrow(Biomes.SNOWY_PLAINS),
//                        biomes.getOrThrow(Biomes.SNOWY_SLOPES),
//                        biomes.getOrThrow(Biomes.SNOWY_BEACH),
//                        biomes.getOrThrow(Biomes.SNOWY_TAIGA),
//                        biomes.getOrThrow(Biomes.TAIGA),
//                        biomes.getOrThrow(Biomes.OLD_GROWTH_SPRUCE_TAIGA),
//                        biomes.getOrThrow(Biomes.OLD_GROWTH_PINE_TAIGA)
                ),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MAPLE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(ContentCraft.MOD_ID, name));
    }
}
