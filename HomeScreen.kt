package com.example.jetpackudemy.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    navigateToProfile: (Int,Boolean) -> Unit,
    navigateToSettings: () -> Unit
){
    Column(modifier = Modifier.fillMaxWidth().padding(top = 250.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "Home Screen", fontSize = 42.sp, fontWeight = FontWeight.Bold)

        Button(onClick = {
        navigateToProfile(2681,true)
        }) {
            Text("Profile")
        }
        Button(onClick = {
        navigateToSettings()
        }) {
            Text("Settings")
        }

    }
}
