package com.example.jetpackudemy.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen(
    id: Int,
    showDetails: Boolean,
    navigateToSettings: () -> Unit
){
    Column(modifier = Modifier.fillMaxWidth().padding(top = 250.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Profile ID: $id")
        Text("showDeatails: $showDetails")

        Button(onClick = {
        navigateToSettings()
        }) {
            Text("Go to settings")
        }
    }
}
