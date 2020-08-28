package com.example.testcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.setContent
import androidx.ui.foundation.Text

class TestActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // esto no se usa más
        //setContentView(R.layout.activity_main)
        setContent {
            // debemos ejecutar cosas de tipo composable
            Text(text = "example")
        }
    }
}