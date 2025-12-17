package xyz.hakerboi.contentcraft.datagen;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import xyz.hakerboi.contentcraft.ContentCraft;
import xyz.hakerboi.contentcraft.init.ModBlocks;
import xyz.hakerboi.contentcraft.init.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ContentCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.XAENON_ORE.get())
                .add(ModBlocks.XAENON_BLOCK.get())
                .add(ModBlocks.RAW_XAENON_BLOCK.get())
        ;

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.XAENON_ORE.get())
                .add(ModBlocks.XAENON_BLOCK.get())
                .add(ModBlocks.RAW_XAENON_BLOCK.get())
        ;

        tag(ModTags.Blocks.NEEDS_XAENON_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL)
        ;

        tag(ModTags.Blocks.INCORRECT_FOR_XAENON_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .remove(ModTags.Blocks.NEEDS_XAENON_TOOL)
        ;

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAPLE_LOG.get())
                .add(ModBlocks.MAPLE_WOOD.get())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.get())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.get());
    }
}
