package com.redc4ke.cubeninja.item

import com.redc4ke.cubeninja.Groups
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.world.World

private val settings: FabricItemSettings = FabricItemSettings().maxCount(64).group(Groups.MAIN_GROUP)

class BlackFabric: Item(settings) {

    override fun appendTooltip(
        stack: ItemStack?,
        world: World?,
        tooltip: MutableList<Text>?,
        context: TooltipContext?
    ) {
        super.appendTooltip(stack, world, tooltip, context)
        tooltip?.add(TranslatableText("item.cubeninja.black_fabric.tooltip_1"))
        tooltip?.add(TranslatableText("item.cubeninja.black_fabric.tooltip_2"))
    }
}