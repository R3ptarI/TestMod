package com.julian.testmod.item;

import com.julian.testmod.TestMod;
import com.julian.testmod.item.custom.ChiselItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> ENDERITE = ITEMS.register("enderite",
            () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("enderite"))
            ));

    public static final RegistryObject<Item> BEER = ITEMS.register("beer",
            () -> new Item(new Item.Properties()
                    .setId(ITEMS.key("beer"))
                    .food(new FoodProperties(1, 1, true))
            ));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties()
                    .setId(ITEMS.key("chisel"))
                    .durability(32)
            ));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
