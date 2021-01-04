package com.redc4ke.cubeninja.register

import com.redc4ke.cubeninja.entity.TenguEntity
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricDefaultAttributeRegistry
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricEntityTypeBuilder
import net.minecraft.entity.EntityDimensions
import net.minecraft.entity.EntityType
import net.minecraft.entity.SpawnGroup
import net.minecraft.entity.attribute.EntityAttributes
import net.minecraft.entity.mob.MobEntity
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object Entities {

    val TENGU = Registry.register(
        Registry.ENTITY_TYPE,
        Identifier("cubeninja", "tengu"),

        FabricEntityTypeBuilder
            .create(SpawnGroup.AMBIENT, ::TenguEntity)
            .dimensions(EntityDimensions.changing(0.9F, 1.9F))
            .trackRangeBlocks(64)
            .trackedUpdateRate(1)
            .build()
    )


    fun registerAttributes() {
        FabricDefaultAttributeRegistry.register(
            TENGU,
            MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 150.0)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 7.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.5))
    }
}