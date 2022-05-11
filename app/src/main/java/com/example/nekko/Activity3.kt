package com.example.nekko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

/**
 * Kotlin Code for Activity 3
 *
 * Uses onClickListener for go_back to return to Main Activity
 *
 * */

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // set layout as activity_3
        setContentView(R.layout.activity_3)

        // go_back button when clicked will send user back to MainActivity
        go_back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }// end listener
    }// end onCreate
}// end class