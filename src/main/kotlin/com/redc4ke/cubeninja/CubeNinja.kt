package com.redc4ke.cubeninja

import net.fabricmc.api.ModInitializer

class CubeNinja(): ModInitializer {

    override fun onInitialize() {
        RegisterItems.register()
    }
}
