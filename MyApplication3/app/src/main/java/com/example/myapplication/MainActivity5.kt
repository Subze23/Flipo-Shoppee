package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var buttoneasy: Button?=null
        buttoneasy=findViewById<Button>(R.id.button1)
        buttoneasy?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        })
    }
}