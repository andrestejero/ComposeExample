package com.example.testcompose

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.AdapterList
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.Divider
import androidx.ui.material.ListItem
import androidx.ui.unit.dp
import com.example.testcompose.ui.typography

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PayDetailContent()
        }
    }
}

@Composable
fun PayDetailContent() {
    val context = ContextAmbient.current
    Column(modifier = Modifier.padding(16.dp, 60.dp)) {
        Text("Ejemplo de lista", style = typography.body1)
        AdapterList(data = arrayListOf("boca", "river", "racing", "independiente", "san lorenzo", "gimnasia", "estudiantes", "central", "newells", "argentinos", "platense", "el porvenir", "all boys")) {
            ListItem(text = it, onClick = { Toast.makeText(context, it, Toast.LENGTH_SHORT).show()}, modifier = Modifier.padding(10.dp, 10.dp))
            Divider(color = Color.Green)
        }
    }
}
