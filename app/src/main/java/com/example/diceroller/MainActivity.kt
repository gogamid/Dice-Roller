package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val button: Button = findViewById(R.id.roll_button)
    button.setOnClickListener { rollDice() }

  }

  private fun rollDice() {
    val dice = Dice(6)
    val resultTextView1: TextView = findViewById(R.id.dice1_text)
    resultTextView1.text = dice.roll().toString()
    val resultTextView2: TextView = findViewById(R.id.dice2_text)
    resultTextView2.text = dice.roll().toString()
  }
}