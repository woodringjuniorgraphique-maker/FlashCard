package com.exemple.flashcardapp

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcardAnswer = findViewById<TextView>(R.id.flashcard_answer)
        val flashcard_answer2 = findViewById<TextView>(R.id.flashcard_answer2)
        val flashcardAnswer3 = findViewById<TextView>(R.id.flashcard_answer3)


        flashcardAnswer.setOnClickListener {
            flashcardAnswer.setBackgroundColor(getResources().getColor(R.color.Rouge, null))
            flashcard_answer2.setBackgroundColor(getResources().getColor(R.color.vert, null))
        }

        flashcard_answer2.setOnClickListener {
            flashcard_answer2.setBackgroundColor(getResources().getColor(R.color.vert, null))
        }

        flashcardAnswer3.setOnClickListener {
            flashcardAnswer3.setBackgroundColor(getResources().getColor(R.color.Rouge, null))
            flashcard_answer2.setBackgroundColor(getResources().getColor(R.color.vert, null))
        }

       }
    }
