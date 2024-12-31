package com.example.myapplication

import android.util.Log

open class Car {
    var maxSpeed = 30

    open fun start(){
        Log.i("MY_TAG", "Car is starting...")
        Log.i("MY_TAG", "Maximum is: $maxSpeed")

    }
}