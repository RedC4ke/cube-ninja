package com.redc4ke.cubeninja

import com.redc4ke.cubeninja.entity.Tengu.TenguEntityRenderer
import com.redc4ke.cubeninja.register.Entities
import com.redc4ke.cubeninja.register.Items
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry

class CubeNinja(): ModInitializer, ClientModInitializer {

    override fun onInitialize() {
        Items.register()
        Entities.registerAttributes()
    }

    override fun onInitializeClient() {
        setupRenderers()
    }

    private fun setupRenderers() {
        EntityRendererRegistry.INSTANCE.register(Entities.TENGU)
        {dispatcher, _ ->  TenguEntityRenderer(dispatcher) }
    }
}
