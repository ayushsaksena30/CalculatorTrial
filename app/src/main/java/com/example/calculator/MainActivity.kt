package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(){
    //lateinit var num1: EditText
//    lateinit var num2: EditText
//    lateinit var btnAdd: Button
//    lateinit var btnSub: Button
//    lateinit var btnMul: Button
//    lateinit var btnDiv: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById<EditText>(R.id.et_num1).text.toString()
        val num2= findViewById<EditText>(R.id.et_num2).text.toString()
        val btnAdd= findViewById<Button>(R.id.btn_add)
        val btnSub= findViewById<Button>(R.id.btn_subtract)
        val btnMul= findViewById<Button>(R.id.btn_multiply)
        val btnDiv= findViewById<Button>(R.id.btn_divide)
        val btn_next = findViewById<Button>(R.id.btn_next)

        var result= 0

        btnAdd.setOnClickListener{
            Intent(this,SecondActivity::class.java).also {
                startActivity(it)
                result= num1 + num2

            }
        }
        btnSub.setOnClickListener{
            Intent(this,SecondActivity::class.java).also {
                startActivity(it)
                val result= num1 - num2

            }
        }
        btnMul.setOnClickListener{
            Intent(this,SecondActivity::class.java).also {
                startActivity(it)
                val result= num1 * num2

            }
        }
        btnDiv.setOnClickListener{
            Intent(this,SecondActivity::class.java).also {
                startActivity(it)
                val result= num1 / num2

            }
        }
        btn_next.setOnClickListener{
            val intent= Intent(this, SecondActivity:: class.java)
            intent.putExtra("RESULT", result)
            startActivity(intent)
        }


    }
}