package com.redc4ke.cubeninja.item

import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent

class BlackFabricMaterial: ArmorMaterial {
    private val baseDurability = arrayListOf<Int>(13, 15, 16, 11)
    private val protectionValues = arrayListOf<Int>(1, 2, 3, 2)

    override fun getDurability(slot: EquipmentSlot?): Int {
        return baseDurability[slot!!.entitySlotId] * 50
    }

    override fun getProtectionAmount(slot: EquipmentSlot?): Int {
        return protectionValues[slot!!.entitySlotId]
    }

    override fun getEnchantability(): Int {
        TODO("Not yet implemented")
    }

    override fun getEquipSound(): SoundEvent {
        TODO("Not yet implemented")
    }

    override fun getRepairIngredient(): Ingredient {
        TODO("Not yet implemented")
    }

    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun getToughness(): Float {
        TODO("Not yet implemented")
    }

    override fun getKnockbackResistance(): Float {
        TODO("Not yet implemented")
    }
}