package com.example.myapplication2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen(userId: String, userName: String, onNavigateBack: () -> Unit, onSettingsClick: () -> Unit) {
    Column() {

        Text(
            text = "Detalles del usuario"
        )
        Text(
            text = "ID recibido:  $userId "
        )
        Text(
            text = "Nombre recibido $userName"
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onSettingsClick) {
            Text(
                text = "Ir a Settings"
            )
        }
        Button(onClick = onNavigateBack) {
            Text(
                text = "Volver"
            )
        }
    }
}