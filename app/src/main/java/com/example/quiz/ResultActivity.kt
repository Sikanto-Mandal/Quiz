package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var tvName : TextView = findViewById(R.id.tvName)
        var tvScore : TextView = findViewById(R.id.tvScore)
        var btnFinish : Button = findViewById(R.id.btnFinish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        val totalQustios = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        var correctAnswers  = intent.getIntExtra(Constants.CORRECT_ANSWER,0)

        tvScore.text = "Your Score is $correctAnswers out of $totalQustios"

        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}