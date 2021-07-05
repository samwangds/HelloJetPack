package com.sam.hellojetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.startup.AppInitializer
import com.sam.hellojetpack.startup.HelloComponent
import com.sam.hellojetpack.startup.HelloInitializer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppInitializer.getInstance(applicationContext)
            .initializeComponent(HelloInitializer::class.java)
        HelloComponent.instance.print()
    }
}