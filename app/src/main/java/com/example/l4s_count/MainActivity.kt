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
        fizzBuzz(number)

        plusButton.setOnClickListener {
            number += 1
            numberTextView.text = number.toString()
            fizzBuzz(number)
        }
        minusButton.setOnClickListener {
            number -= 1
            numberTextView.text = number.toString()
            fizzBuzz(number)
        }
        resetButton.setOnClickListener {
            number = 0
            numberTextView.text = number.toString()
            fizzBuzz(number)
        }
    }

    fun fizzBuzz(i:Int){
        when {
            i % 15 == 0 -> numberTextView.backgroundTintList = ColorStateList.valueOf(Color.rgb(250,0,250))
            i % 3 == 0 -> numberTextView.backgroundTintList = ColorStateList.valueOf(Color.rgb(250,0,0))
            i % 5 == 0 -> numberTextView.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,0,250))
            else -> numberTextView.backgroundTintList = ColorStateList.valueOf(Color.rgb(250,250,250))
            }
    }


}
