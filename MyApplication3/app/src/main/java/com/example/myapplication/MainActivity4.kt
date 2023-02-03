package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var buttoneasy: ImageView?=null
        buttoneasy=findViewById<ImageView>(R.id.sample)
        buttoneasy?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Item1::class.java)
            startActivity(intent)
        })


    }
}