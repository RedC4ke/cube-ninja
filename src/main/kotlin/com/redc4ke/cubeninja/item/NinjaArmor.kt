package com.redc4ke.cubeninja.item

import com.redc4ke.cubeninja.Groups
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorItem

private val settings = FabricItemSettings().group(Groups.MAIN_GROUP)

class NinjaHood: ArmorItem(
        NinjaArmorMaterial(),
        EquipmentSlot.HEAD,
        settings
    ) {
}

class NinjaShirt: ArmorItem(
    NinjaArmorMaterial(),
    EquipmentSlot.CHEST,
    settings
) {
}

class NinjaPants: ArmorItem(
    NinjaArmorMaterial(),
    EquipmentSlot.LEGS,
    settings
) {
}

class NinjaSlippers: ArmorItem(
    NinjaArmorMaterial(),
    EquipmentSlot.FEET,
    settings
) {
}

