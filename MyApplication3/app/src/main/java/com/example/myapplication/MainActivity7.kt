package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity7 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        /*var buttoneasy: Button?=null
        buttoneasy=findViewById<Button>(R.id.BUY)
        buttoneasy?.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Order Placed", Toast.LENGTH_SHORT).show()
        })*/
    }
}