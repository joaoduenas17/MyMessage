package com.example.mymessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Name = findViewById<EditText>(R.id.editTextMessage)
        val sumbitButton=findViewById<Button>(R.id.buttonSumbit)
        val dispMessage=findViewById<TextView>(R.id.textView)
        sumbitButton.setOnClickListener {
           val Message: String

           Message="Su mensaje es: "+Name.text+ "!"

            val toast1 = Toast.makeText(applicationContext, Message, Toast.LENGTH_LONG)

            toast1.setGravity(Gravity.CENTER, 0,0)

            toast1.show()
        }
    }
}