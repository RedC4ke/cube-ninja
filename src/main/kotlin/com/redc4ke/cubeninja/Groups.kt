package com.redc4ke.cubeninja

import com.redc4ke.cubeninja.register.Items
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier

object Groups {
    val MAIN_GROUP: ItemGroup = FabricItemGroupBuilder.create(
        Identifier("cubeninja", "main"))
        .icon { ItemStack(Items.BLACK_FABRIC) }
        .build()
}