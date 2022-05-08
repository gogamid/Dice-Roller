package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
    val roll1 = dice.roll()
    val roll2 = dice.roll()
    val dice1: ImageView = findViewById(R.id.dice1_image)
    val dice2: ImageView = findViewById(R.id.dice2_image)
    dice1.setImageResource(R.drawable.dice_1)
    dice2.setImageResource(R.drawable.dice_1)
  }
}