package com.example.jetpackudemy.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(navController: NavController){

   // Items of Bottom Nav Bar

    val navItems = listOf(NavItem.Profile, NavItem.Home, NavItem.Settings)

    // Create a persistent state across composables
    // Observe backstack entry
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    //Navigation Bar
    NavigationBar {
        navItems.forEach { item ->
            NavigationBarItem(
                selected = currentRoute?.startsWith(item.path) == true,
                onClick = {
                    val route = if (item.path == NavRoute.Profile.path) {
                        "${NavRoute.Profile.path}/2681/true"
                    } else {
                        item.path
                    }

                    navController.navigate(route)
                },
                icon = {
                    Icon(item.icon, contentDescription = item.title)
                },
                label = {
                    Text(item.title)
                }
            )
        }
    }

}
