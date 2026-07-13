package com.example.jetpackudemy.navigation

import android.graphics.drawable.Icon
import android.graphics.drawable.VectorDrawable
import android.media.Image
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.ui.graphics.vector.ImageVector

open class Item(
    val path: String,
    val title: String,
    val icon: ImageVector
) {
}
