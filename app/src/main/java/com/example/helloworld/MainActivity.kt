package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        val toastMessage = resources.getString(R.string.button_toast_message)
        button.setOnClickListener {
            Log.v("hello world", "hello button clicked")
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
        }
    }
}