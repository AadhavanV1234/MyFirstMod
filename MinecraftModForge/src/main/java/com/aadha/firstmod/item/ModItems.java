package com.aadha.firstmod.item;

import com.aadha.firstmod.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> ORIDIUM_INGOT =
            Registration.ITEMS.register("oridium_ingot",
                    () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static void register() {  }

}
