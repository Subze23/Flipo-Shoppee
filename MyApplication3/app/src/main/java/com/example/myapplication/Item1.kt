package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Item1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item1)
        var buttoneasy: Button?=null
        buttoneasy=findViewById<Button>(R.id.button1)
        buttoneasy?.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Order Placed", Toast.LENGTH_SHORT).show()
        })
    }
}