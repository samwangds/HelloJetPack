package com.sam.hellojetpack.startup

import android.content.Context
import androidx.startup.Initializer

class WorldInitializer : Initializer<WorldComponent> {
    override fun create(context: Context): WorldComponent {
        return WorldComponent.create()
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}