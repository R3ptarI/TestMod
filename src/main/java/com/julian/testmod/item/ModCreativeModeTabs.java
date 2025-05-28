package com.julian.testmod.item;

import com.julian.testmod.TestMod;
import com.julian.testmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ENDERITE_ITEMS =
            CREATIVE_MODE_TABS.register("enderite_items_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ENDERITE.get()))
                    .title(Component.translatable("creativetab.testmod.enderite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ENDERITE.get());
                        output.accept(ModItems.BEER.get());
                        output.accept(ModItems.CHISEL.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ENDERITE_BLOCKS =
            CREATIVE_MODE_TABS.register("enderite_blocks_tab", () -> CreativeModeTab.builder()
                    .withTabsBefore(ENDERITE_ITEMS.getId())
                    .icon(() -> new ItemStack(ModBlocks.ENDERITE_BLOCK.get()))
                    .title(Component.translatable("creativetab.testmod.enderite_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ENDERITE_BLOCK.get());
                    })
                    .build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
