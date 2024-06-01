package com.example.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(){
//    lateinit var btnSub: Button
//    lateinit var btnMul: Button
//    lateinit var btnDiv: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd= findViewById<Button>(R.id.btn_add)
        val btnSub= findViewById<Button>(R.id.btn_subtract)
        val btnMul= findViewById<Button>(R.id.btn_multiply)
        val btnDiv= findViewById<Button>(R.id.btn_divide)

        var result= 0.0


        btnAdd.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)

            val num1 = findViewById<EditText>(R.id.et_num1).text.toString().toDouble()
            val num2= findViewById<EditText>(R.id.et_num2).text.toString().toDouble()
            result= num1 + num2

            intent.putExtra("RESULT", result)
            startActivity(intent)
        }

        btnSub.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)

            val num1 = findViewById<EditText>(R.id.et_num1).text.toString().toDouble()
            val num2= findViewById<EditText>(R.id.et_num2).text.toString().toDouble()
            result= num1 - num2

            intent.putExtra("RESULT", result)
            startActivity(intent)
        }

        btnMul.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)

            val num1 = findViewById<EditText>(R.id.et_num1).text.toString().toDouble()
            val num2= findViewById<EditText>(R.id.et_num2).text.toString().toDouble()
            result= num1 * num2

            intent.putExtra("RESULT", result)
            startActivity(intent)
        }

        btnDiv.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)

            val num1 = findViewById<EditText>(R.id.et_num1).text.toString().toDouble()
            val num2= findViewById<EditText>(R.id.et_num2).text.toString().toDouble()
            if (num2 != 0.0) {
                result = num1 / num2
                intent.putExtra("RESULT", result)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        }
    }
}