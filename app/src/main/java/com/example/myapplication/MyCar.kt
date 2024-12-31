package com.example.myapplication

import android.util.Log

class MyCar : Car() {
    override fun start() {
        Log.i("MY_TAG", "My Car is running...")
    }
}