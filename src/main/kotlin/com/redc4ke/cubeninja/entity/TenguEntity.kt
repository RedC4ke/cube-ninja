package com.redc4ke.cubeninja.entity

import net.minecraft.entity.EntityType
import net.minecraft.entity.mob.PathAwareEntity
import net.minecraft.world.World


class TenguEntity(entityType: EntityType<out PathAwareEntity?>?, world: World?) :
    PathAwareEntity(entityType, world) {

}
