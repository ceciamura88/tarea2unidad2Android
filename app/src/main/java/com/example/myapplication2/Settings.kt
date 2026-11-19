package com.example.myapplication2

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication2.ui.theme.MyApplication2Theme

@Composable
fun SettingsScreen( onNavigateBack: () -> Unit, onGoingBackHome: () -> Unit ){
    Column(){
        Text(text = "Settings Screen")
        Button(onClick = { onNavigateBack() }) {
            Text("Volver a  Profile")
        }

        Button(
            onClick = { onGoingBackHome() }
        ) {
            Text("Volver a Home")
        }


    }

}

@Preview(showBackground = true)
@Composable
fun SettingsPreview() {
    MyApplication2Theme {
        SettingsScreen(onNavigateBack = {},
            onGoingBackHome = {})
    }
    }
