package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var buttoneasy: Button?=null
        buttoneasy=findViewById<Button>(R.id.button1)
        buttoneasy?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        })
        var buttoneasy2: Button?=null
        buttoneasy2=findViewById<Button>(R.id.button2)
        buttoneasy2?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        })
        var buttoneasy3: Button?=null
        buttoneasy2=findViewById<Button>(R.id.button3)
        buttoneasy2?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        })
    }
}