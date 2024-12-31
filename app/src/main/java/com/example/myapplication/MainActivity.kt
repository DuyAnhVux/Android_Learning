package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val car = Car()
//        car.maxSpeed = 120
//        car.start()

        val car = MyCar()
        car.maxSpeed = 200
        car.start()

//        val driver = Driver("BoBo")
//        driver.showDetails()
//        Log.i("MY_TAG", "MainActivity: OnCreate")
//        val greetingTextView = findViewById<TextView>(R.id.tvHello)
//        val inputField = findViewById<EditText>(R.id.etName)
//        val submitButton = findViewById<Button>(R.id.btnSubmit)
//        val offerButton = findViewById<Button>(R.id.btnOffer)
//        var enteredName = ""
//
//        submitButton.setOnClickListener {
//            enteredName = inputField.text.toString()
//            if (enteredName == ""){
//                offerButton.visibility = INVISIBLE
//                greetingTextView.text = ""
//                Toast.makeText(
//                    this@MainActivity,
//                    "Please, enter your name!",
//                    Toast.LENGTH_SHORT
//                ).show()
//            }else{
//                val message = "Welcome $enteredName"
//                greetingTextView.text = message
//                inputField.text.clear()
//                offerButton.visibility = VISIBLE
//            }
//        }
//
//        offerButton.setOnClickListener {
//            val intent = Intent(this, SecondActivity::class.java)
//            intent.putExtra("USER", enteredName)
//            startActivity(intent)
//        }
    }

//    override fun onStart() {
//        super.onStart()
//        Log.i("MY_TAG", "MainActivity: OnStart")
//
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.i("MY_TAG", "MainActivity: OnResume")
//
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.i("MY_TAG", "MainActivity: OnPause")
//
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.i("MY_TAG", "MainActivity: OnStop")
//
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.i("MY_TAG", "MainActivity: OnDestroy")
//
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.i("MY_TAG", "MainActivity: OnRestart")
//
//    }
}