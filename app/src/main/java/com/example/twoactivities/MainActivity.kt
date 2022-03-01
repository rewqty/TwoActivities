package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val dataIntent = Intent(this, SecondActivity::class.java).apply {
                putExtra(KEY_MAIN, "text from main activity")
            }
            startActivity(dataIntent)
        }
    }
    companion object{
        const val KEY_MAIN = "HotDog"
    }
}