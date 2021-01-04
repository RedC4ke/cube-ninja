package com.redc4ke.cubeninja.register

import com.redc4ke.cubeninja.item.*
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object Items {

    val BLACK_FABRIC = BlackFabric()
    val TENGU_FEATHER = TenguFeather()
    val TENGU_FEATHER_RED = TenguFeatherRed()
    private val NINJA_MASK = NinjaHood()
    private val NINJA_SHIRT = NinjaShirt()
    private val NINJA_PANTS = NinjaPants()
    private val NINJA_SLIPPERS = NinjaSlippers()

    fun register() {
        Registry.register(Registry.ITEM, Identifier("cubeninja", "black_fabric"),
            BLACK_FABRIC
        )
        Registry.register(Registry.ITEM, Identifier("cubeninja", "tengu_feather"),
            TENGU_FEATHER
        )
        Registry.register(Registry.ITEM, Identifier("cubeninja", "tengu_feather_red"),
            TENGU_FEATHER_RED
        )
        Registry.register(Registry.ITEM, Identifier("cubeninja", "ninja_mask"),
            NINJA_MASK
        )
        Registry.register(Registry.ITEM, Identifier("cubeninja", "ninja_shirt"),
            NINJA_SHIRT
        )
        Registry.register(Registry.ITEM, Identifier("cubeninja", "ninja_pants"),
            NINJA_PANTS
        )
        Registry.register(Registry.ITEM, Identifier("cubeninja", "ninja_slippers"),
            NINJA_SLIPPERS
        )
    }
}