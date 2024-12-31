package com.example.myapplication

import android.util.Log

class Driver(var name: String) {

    private val car = Car()
    init {
        car.maxSpeed = 120
        car.start()
    }

    fun showDetails(){
//        Log.i("MY_TAG", "Name of driver is $driverName")
        Log.i("MY_TAG", "Name of driver is $name")

    }
}