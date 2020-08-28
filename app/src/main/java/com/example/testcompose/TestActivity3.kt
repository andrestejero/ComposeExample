package com.example.testcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.sp

class TestActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeaderTest()
        }
    }

    @Composable
    fun HeaderTest() {
        Text(text = "example ddddh", fontSize = 24.sp)
    }

    @Preview
    @Composable
    fun PreviewHeaderTest() {
        HeaderTest()
    }
}