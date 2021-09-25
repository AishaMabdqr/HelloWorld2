package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(" Hello there ")
        var num1 = 7
        var num2 = 10
        if( num1 > num2){
            Log.d("MainActivity","$num1 is greater than $num2")
        } else {
            Log.d("MainActivity","$num2 is greater than $num1")
        }

        calculation(num1, num2)
    }

    fun calculation( num: Int,  num2: Int ){
        var ans = num + num2
        Log.d("MainActivity", "$ans")

    }
}