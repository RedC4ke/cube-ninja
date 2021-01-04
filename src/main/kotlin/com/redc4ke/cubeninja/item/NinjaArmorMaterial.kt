package com.redc4ke.cubeninja.item

import com.redc4ke.cubeninja.register.Items
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents

class NinjaArmorMaterial: ArmorMaterial {
    private val baseDurability = arrayListOf<Int>(13, 15, 16, 11)
    private val protectionValues = arrayListOf<Int>(1, 2, 3, 2)

    override fun getDurability(slot: EquipmentSlot?): Int {
        return baseDurability[slot!!.entitySlotId] * 50
    }

    override fun getProtectionAmount(slot: EquipmentSlot?): Int {
        return protectionValues[slot!!.entitySlotId]
    }

    override fun getEnchantability(): Int {
        return 20
    }

    override fun getEquipSound(): SoundEvent {
        return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER
    }

    override fun getRepairIngredient(): Ingredient {
        return Ingredient.ofItems(Items.BLACK_FABRIC)
    }

    override fun getName(): String {
        return "black_fabric"
    }

    override fun getToughness(): Float {
        return 1.0F
    }

    override fun getKnockbackResistance(): Float {
        return 0F
    }
}