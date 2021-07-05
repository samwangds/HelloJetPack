package com.sam.hellojetpack.startup

import android.content.Context
import androidx.startup.Initializer

class HelloInitializer : Initializer<HelloComponent> {
    override fun create(context: Context): HelloComponent {
        return HelloComponent.create()
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf(WorldInitializer::class.java)
    }
}