package com.nuriulgen.week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var button2 : Button
    private lateinit var image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2 = findViewById(R.id.button2)
        image = findViewById(R.id.imageView)

        button2.setOnClickListener{
            changeImage()
        }
    }

    private fun changeImage() {
        val drawImage = when(Random().nextInt(6) +1){
            1 -> R.drawable.ic_dice_1
            2 -> R.drawable.ic_dice_2
            3 -> R.drawable.ic_dice_3
            4 -> R.drawable.ic_dice_4
            5 -> R.drawable.ic_dice_5

            else -> R.drawable.ic_dice_6
        }
        image.setImageResource(drawImage)
    }
}