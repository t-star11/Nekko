package com.example.nekko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

/**
 * Kotlin Code for Main Activity
 *
 * Uses onClickListeners for the three buttons on main page
 * to direct user to appropriate activity
 *
 * */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // set layout to activity_main
        setContentView(R.layout.activity_main)

        // a2 button when clicked will redirect user to Activity 2
        a2.setOnClickListener{
            val intent2 = Intent(this, Activity2::class.java)
            startActivity(intent2)
        }// end listener

        // a2 button when clicked will redirect user to Activity 3
        a3.setOnClickListener{
            val intent3 = Intent(this, Activity3::class.java)
            startActivity(intent3)
        }// end listener

        // a2 button when clicked will redirect user to Activity 4
        a4.setOnClickListener{
            val intent4 = Intent(this, Activity4::class.java)
            startActivity(intent4)
        }// end listener
    }// end onCreate
}// end class