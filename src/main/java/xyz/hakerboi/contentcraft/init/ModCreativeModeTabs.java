package xyz.hakerboi.contentcraft.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import xyz.hakerboi.contentcraft.ContentCraft;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ContentCraft.MOD_ID);

    public static final Supplier<CreativeModeTab> CONTENTCRAFT = CREATIVE_MODE_TAB.register("contentcraft",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.XAENON_INGOT.get()))
                    .title(Component.translatable("creativetab.contentcraft.contentcraft"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.XAENON_INGOT);
                        output.accept(ModItems.RAW_XAENON);
                        output.accept(ModBlocks.XAENON_BLOCK);
                        output.accept(ModBlocks.RAW_XAENON_BLOCK);
                        output.accept(ModBlocks.XAENON_ORE);

                        output.accept(ModItems.XAENON_SWORD);
                        output.accept(ModItems.XAENON_AXE);
                        output.accept(ModItems.XAENON_PICKAXE);
                        output.accept(ModItems.XAENON_SHOVEL);
                        output.accept(ModItems.XAENON_HOE);
                        
                        output.accept(ModItems.XAENON_HELMET);
                        output.accept(ModItems.XAENON_CHESTPLATE);
                        output.accept(ModItems.XAENON_LEGGINGS);
                        output.accept(ModItems.XAENON_BOOTS);


                        output.accept(ModBlocks.MAPLE_LOG.get());
                        output.accept(ModBlocks.MAPLE_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_MAPLE_LOG.get());
                        output.accept(ModBlocks.STRIPPED_MAPLE_WOOD.get());

                        output.accept(ModBlocks.MAPLE_PLANKS.get());
                        output.accept(ModBlocks.MAPLE_SAPLING.get());

                        output.accept(ModBlocks.MAPLE_LEAVES.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}