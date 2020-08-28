package com.example.testcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.unit.sp

class TestActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeaderTest()
        }
    }

    // los metodos de tipo composable empiezan con mayuscula
    // se pueden llamar desde cualquier lado
    @Composable
    fun HeaderTest() {
        Text(text = "example", fontSize = 24.sp)
    }
}