package com.redc4ke.cubeninja.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup

val settings: FabricItemSettings = FabricItemSettings().maxCount(64).group(ItemGroup.MATERIALS)

class BlackFabric: Item(settings) {

}