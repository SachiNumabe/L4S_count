package com.example.l4s_count

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var number: Int = 0
        numberTextView.text ="0"

        plusButton.setOnClickListener {
            number += 1
            fizzBuzz(number)
            numberTextView.text = number.toString()
        }
        minusButton.setOnClickListener {
            number -= 1
            fizzBuzz(number)
            numberTextView.text = number.toString()
        }
        resetButton.setOnClickListener {
            number = 0
            numberTextView.text = number.toString()
        }
    }

    fun fizzBuzz(i:Int){
        when {
            i % 15 == 0 -> numberTextView.setTextColor(Color.rgb(0,250,0))
            i % 3 == 0 -> numberTextView.setTextColor(Color.rgb(250,0,0))
            i % 5 == 0 -> numberTextView.setTextColor(Color.rgb(0,0,250))
            else -> numberTextView.setTextColor(Color.rgb(0,0,0))
            }
    }


}
