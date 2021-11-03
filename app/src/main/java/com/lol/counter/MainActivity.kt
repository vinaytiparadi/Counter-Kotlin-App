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
        val decrementButton : Button = findViewById(R.id.main_activity_bt_decrement)

        //Set click listeners for each buttons
        submitButton.setOnClickListener { submitNumber() }
        randomButton.setOnClickListener { generateRandomNumber() }
        incrementButton.setOnClickListener { increment() }
        decrementButton.setOnClickListener { decrement() }

        //Set the values to our views initialized with late-init
        numberText = findViewById(R.id.main_activity_tv_number)
        numberInput = findViewById(R.id.editTextNumber2)
        interval = findViewById(R.id.main_activity_et_random_number)
        summary = findViewById(R.id.main_activity_tv_summary)
    }

    //Get a number from an edit text and display it to the screen
    private fun submitNumber(){
        //Get the number in the editText the user wants to submit
        var startingNumber = numberInput.text.toString()

        //Check to see if the user ledt the editText blank , if so default to a value of 5
        if (startingNumber ==""){
            startingNumber = "5"
        }

        //Set our starting number in TextView
        numberText.text=startingNumber

        //Clear editText after pressing submit button
        numberInput.setText("")
    }

    //Generate a random number and display it to the screen
    private fun generateRandomNumber(){
        //Generate random number from -100 to 100
        val randomNumber = (-100..100).random()
        numberText.text = randomNumber.toString()
    }

    //Increment a number by given value
    private fun increment(){
        //Get the current number and increment
        val currentNumber = numberText.text.toString().toInt()
        var incrementValue = interval.text.toString()

        //Check if increment value is blank, if so set 1
        if (incrementValue ==""){
            incrementValue="1"
        }

        //Determine new number to the display and display it
        val newNumber = currentNumber + incrementValue.toInt()
        numberText.text = newNumber.toString()

        //Update summary msg
        summary.text="$currentNumber + $incrementValue = $newNumber "
    }

    //Decrement a number by a given value
    private fun decrement(){

        //Get the current number and increment
        val currentNumber = numberText.text.toString().toInt()
        var incrementValue = interval.text.toString()

        //Check if increment value is blank, if so set 1
        if (incrementValue ==""){
            incrementValue="1"
        }

        //Determine new number to the display and display it
        val newNumber = currentNumber - incrementValue.toInt()
        numberText.text=newNumber.toString()

        //Update summary msg
        summary.text="$currentNumber - $incrementValue = $newNumber  "

    }
}