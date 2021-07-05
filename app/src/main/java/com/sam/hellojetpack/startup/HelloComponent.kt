package com.sam.hellojetpack.startup

import android.util.Log

// 依赖于 WorldComponent
class HelloComponent private constructor() {
    private lateinit var world: WorldComponent
    private val msg = "Hello"
    fun print() {
        Log.i("Startup","$msg ${world.msg}")
    }
    companion object {
        lateinit var instance: HelloComponent
        fun create() :HelloComponent{
            instance = HelloComponent()
            instance.world = WorldComponent.instance
            return instance
        }
    }
}