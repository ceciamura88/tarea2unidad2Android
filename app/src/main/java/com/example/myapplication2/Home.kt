package com.example.myapplication2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication2.ui.theme.MyApplication2Theme

@Composable
fun HomeScreen(onUserClick: (String, String) -> Unit,
               onSettingsClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize()
                 .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Row(modifier = Modifier.padding(10.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)){
            Text(text ="Home",
                color = Color.Blue,
                fontWeight = FontWeight.Bold)


            Text(text ="Bienvenidos a tu app",
                color = Color.Gray,
                fontWeight = FontWeight.Bold)
        }

            // Simulamos hacer clic en un usuario
        Button(onClick = { onUserClick("42", "Android") }) {
            Text("Ir a Profile")
        }

        Button(
            onClick = { onSettingsClick() }
        ) {
            Text("Ir a Settings")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    MyApplication2Theme {
        HomeScreen(
            onUserClick = { _, _ -> },
            onSettingsClick = {}
        )
    }
}
