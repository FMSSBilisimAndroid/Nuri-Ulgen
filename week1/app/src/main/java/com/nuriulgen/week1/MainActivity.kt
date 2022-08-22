package com.nuriulgen.week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    //Variables
    private lateinit var button2 : Button
    private lateinit var image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //id of used variables
        button2 = findViewById(R.id.button2)
        image = findViewById(R.id.imageView)

        //actions to be taken on button click event
        button2.setOnClickListener{
            changeImage()
        }
    }

    //image change method
    private fun changeImage() {
        // Generating random numbers between 1 and 6 and assigning them to the variable
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