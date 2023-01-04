package com.nicolas.androittraining23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var nameTV: TextView
    lateinit var nameButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameTV = findViewById<TextView>(R.id.nameTextView)
        nameButton = findViewById<Button>(R.id.nameChangeButton)

        nameButton.setOnClickListener{
            nameTV.text = "Nick"
        }

    }
}