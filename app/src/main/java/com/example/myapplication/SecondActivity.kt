package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("MY_TAG", "SecondActivity: OnCreate")

        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)
        val message = "$userName, you'll get free access to all the content for one month"
        textView.text = message
    }

    override fun onStart() {
        super.onStart()
        Log.i("MY_TAG", "SecondActivity: OnStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i("MY_TAG", "SecondActivity: OnResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i("MY_TAG", "SecondActivity: OnPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i("MY_TAG", "SecondActivity: OnStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MY_TAG", "SecondActivity: OnDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MY_TAG", "SecondActivity: OnRestart")

    }
}