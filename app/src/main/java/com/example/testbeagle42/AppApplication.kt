package com.example.testbeagle42

import android.app.Application
import com.example.testbeagle42.beagle.BeagleSetup

class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        BeagleSetup().init(this)
    }
}