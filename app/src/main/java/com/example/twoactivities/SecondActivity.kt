package com.example.twoactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val view = findViewById<TextView>(R.id.textViewGetFromMain)

        val data = intent?.getStringExtra(MainActivity.KEY_MAIN)
        view.text = data ?: ""
    }
}