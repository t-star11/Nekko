package com.example.nekko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

/**
 * Kotlin Code for Activity 4
 *
 * Uses onClickListener for go_back to return to Main Activity
 *
 * */

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // set layout to activity_4
        setContentView(R.layout.activity_4)

        // go_back button when clicked will send user back to MainActivity
        go_back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }// end listener
    }// end onCreate
}// end class