package com.example.nekko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

/**
 * Kotlin Code for Activity 2
 *
 * Uses onClickListener for go_back to return to Main Activity
 * Uses onClickListener schedule to "schedule" and print confirmation message
 *
 * */

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        // set layout to activity_2
        setContentView(R.layout.activity_2)

        // go_back button when clicked will send user back to MainActivity
        go_back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }// end listener

        // schedule button when clicked will print confirmation message
        schedule.setOnClickListener{
            // set text of confirm to message
            confirm.setText("You have been scheduled!")
        }// end listener
    }// end onCreate
}// end class