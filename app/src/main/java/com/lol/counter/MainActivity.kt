package com.lol.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Using late-init to initialize our views to be used throughout the class
    //will define them in onCreate
    private lateinit var numberText : TextView
    private lateinit var numberInput : EditText
    private lateinit var interval : EditText
    private lateinit var summary : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get reference to our buttons
        val submitButton : Button = findViewById(R.id.main_activity_bt_submit)
        val  randomButton : Button = findViewById(R.id.main_acitivty_bt_random_number)
        val incrementButton : Button = findViewById(R.id.main_activity_bt_increment)
        val decrementButton : Button = findViewById(R.id.main_activity_bt_increment)

        //Set click listeners for each buttons
        submitButton.setOnClickListener { submitNumber() }
        randomButton.setOnClickListener { generateRandomNumber() }
        incrementButton.setOnClickListener { increment() }
        decrementButton.setOnClickListener { decrement() }

        //Set the values to our views initialized with late-init
        numberText = findViewById(R.id.main_activity_tv_number)
        numberInput = findViewById(R.id.editTextNumber2)
        interval = findViewById(R.id.main_activity_et_random_number)
        summary = findViewById(R.id.main_activity_et_random_number)
    }

    //Get a number from an edit text and display it to the screen
    private fun submitNumber(){

    }

    //Generate a random number and display it to the screen
    private fun generateRandomNumber(){

    }

    //Increment a number by given value
    private fun increment(){

    }

    //Decrement a number by a given value
    private fun decrement(){

    }
}