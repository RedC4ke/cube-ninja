package com.redc4ke.cubeninja

import com.redc4ke.cubeninja.item.BlackFabric
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class CubeNinja(): ModInitializer {

    override fun onInitialize() {
        println("Hello Fabric world!")

        Registry.register(Registry.ITEM, Identifier("cubeninja", "black_fabric"), BlackFabric())
    }
}
