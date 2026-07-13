package com.example.jetpackudemy.navigation

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import com.example.jetpackudemy.R
import kotlin.io.encoding.Base64



sealed class NavItem {
    object Home:
            Item(NavRoute.Home.path.toString(),
                "Home",
                Icons.Default.Home
            )

    object Profile:
        Item(NavRoute.Profile.path,
            "Profile",
            Icons.Default.Person)

    object Settings:
        Item(NavRoute.Settings.path,
            "Settings",
            Icons.Default.Settings)

}
