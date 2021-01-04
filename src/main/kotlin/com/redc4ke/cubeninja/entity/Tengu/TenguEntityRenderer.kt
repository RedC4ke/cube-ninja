package com.redc4ke.cubeninja.entity.Tengu

import com.redc4ke.cubeninja.TenguEntityModel
import com.redc4ke.cubeninja.entity.TenguEntity
import net.minecraft.client.render.entity.EntityRenderDispatcher
import net.minecraft.client.render.entity.MobEntityRenderer
import net.minecraft.util.Identifier

class TenguEntityRenderer(entityRenderDispatcher: EntityRenderDispatcher):
    MobEntityRenderer<TenguEntity, TenguEntityModel>(entityRenderDispatcher, TenguEntityModel(), 0.5f) {

    override fun getTexture(entity: TenguEntity?): Identifier {
        return Identifier("cubeninja", "textures/entity/tengu/tengu.png")
    }
}