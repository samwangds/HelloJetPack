package com.sam.hellojetpack.startup

class WorldComponent private constructor() {
    val msg = "World"
    companion object{
        lateinit var instance: WorldComponent
        fun create() :WorldComponent{
            instance = WorldComponent()
            return instance
        }
    }
}