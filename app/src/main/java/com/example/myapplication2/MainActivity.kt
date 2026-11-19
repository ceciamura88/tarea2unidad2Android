package com.example.myapplication2

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.net.toUri
import com.example.myapplication2.ui.theme.MyApplication2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplication2Theme {
                MyAppNavHost()

             /*   val intentWeb = Intent(
                    Intent.ACTION_VIEW,
                    "geo:37.7749,-122.4194?q=Restaurante".toUri()
                )
// 2. Intentar lanzar la actividad
                try {
                    startActivity(intentWeb)
                } catch (e: ActivityNotFoundException) {
// No hay app para abrir webs (caso poco común)
// Notificar al usuario amigablemente
                    Toast.makeText(this, "No tienes un navegador  instalado", Toast.LENGTH_SHORT).show()
                }*/
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplication2Theme {
        Greeting("Android")
    }
}