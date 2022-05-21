package com.example.gamegoogle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Dice(val numSide: Int) {
    fun roll(): Int {
        return (1..numSide).random()
    }
}

class MainActivity : AppCompatActivity() {
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButton: Button = findViewById(R.id.button1)
        rollButton.setOnClickListener {
            rollDice()
        }

    }
}