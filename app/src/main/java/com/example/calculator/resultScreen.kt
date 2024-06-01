package com.example.calculator

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView((R.layout.result_screen))

        val backButton = findViewById<Button>(R.id.goBack)
        backButton.setOnClickListener{
            finish()
        }
        val result= intent.getIntExtra("RESULT", 0)

        val ans=findViewById<TextView>(R.id.tv_ans)
        ans.text=result.toString()
    }
}