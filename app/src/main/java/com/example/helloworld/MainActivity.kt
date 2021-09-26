package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var myButton: Button
    lateinit var myText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         myText = findViewById(R.id.tvGender)
         myButton = findViewById(R.id.Submit)

        myButton.setOnClickListener {(changeColor())}

    }

    fun changeColor (){
        myButton.setBackgroundColor(Color.RED)
    }

}