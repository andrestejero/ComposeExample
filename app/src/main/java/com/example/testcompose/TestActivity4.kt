package com.example.testcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.material.Surface
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.sp

class TestActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                HeaderTest("Texto de prueba")
            }
        }
    }

    @Composable
    fun HeaderTest(text: String) {
        Text(text = text, fontSize = 24.sp)
    }

    @Preview
    @Composable
    fun PreviewHeaderTest() {
        MyApp {
            HeaderTest("Tools")
        }
    }

    @Composable
    fun MyApp(content: @Composable () -> Unit) {
        Surface(color = Color.Green) {
            content()
        }
    }
}