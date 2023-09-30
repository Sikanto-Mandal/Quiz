package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btnStart)
        val etName: EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener{

            if(etName.text.isEmpty()){
                Toast.makeText(this,"Please Enter the name",Toast.LENGTH_LONG).show()
            } else{
                val intent = Intent(this, QuizQuestionsActivity :: class.java)
                intent.putExtra(Constants.USER_NAME,etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}