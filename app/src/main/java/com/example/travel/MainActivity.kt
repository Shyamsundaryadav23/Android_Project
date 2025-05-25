package com.example.travel

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var currentTmg = 0
    var  places = arrayOf("Ram mandir","Gateway of india","Lotus Temple","Balaji Temple","Prem mandir")
    lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val next = findViewById<ImageButton>(R.id.btnnext)
        val prev = findViewById<ImageButton>(R.id.btnprev)
        val placeName = findViewById<TextView>(R.id.name)


        next.setOnClickListener {
            // Hide the current image
            val idCurrentImageString = "pic$currentTmg"
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            // Move to the next image
            currentTmg = (currentTmg + 1) % 5
            val idImageToShowString = "pic$currentTmg"
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            placeName.text= places[currentTmg]
        }

        prev.setOnClickListener {
            // Hide the current image
            val idCurrentImageString = "pic$currentTmg"
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            // Move to the previous image
            currentTmg = if (currentTmg - 1 < 0) 4 else currentTmg - 1
            val idImageToShowString = "pic$currentTmg"
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            placeName.text= places[currentTmg]
        }
    }
}
