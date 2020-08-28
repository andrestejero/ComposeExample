package com.example.testcompose

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.testcompose.ui.buttonOrange
import com.example.testcompose.ui.typography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PayRaiseLimitsError()
        }
    }
}

@Composable
fun PayRaiseLimitsError() {
    MaterialTheme() {
        Column(modifier = Modifier.padding(0.dp, 32.dp, 0.dp, 0.dp)) {
            Text(
                    text = "Ocurrió Algo",
                    modifier = Modifier.padding(16.dp, 0.dp),
                    style = typography.body1
            )
            Text(
                    text = "No pudimos procesar tus datos",
                    modifier = Modifier.padding(16.dp, 0.dp),
                    style = typography.body2
            )
            Image(imageResource(
                    id = R.drawable.pay_mod_app_error),
                    contentScale = ContentScale.Crop
            )
            PayErrorButtons()
        }
    }
}

@Composable
fun PayErrorButtons() {
    val context = ContextAmbient.current
    Button(
            onClick = { context.startActivity(Intent(context, DetailActivity::class.java)) },
            backgroundColor = buttonOrange,
            modifier = Modifier.fillMaxWidth()
    ) {
        Text("Entendido", color = Color.White)
    }
    Button(onClick = { Toast.makeText(context, "Salir del flujo", Toast.LENGTH_SHORT).show() }, backgroundColor = Color.Companion.LightGray, modifier = Modifier.fillMaxWidth()) {
        Text("Abandonar")
    }
}

@Preview
@Composable
fun DefaultPreview() {
    PayRaiseLimitsError()
}
