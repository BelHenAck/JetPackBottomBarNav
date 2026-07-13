package com.example.jetpackudemy.navigation

sealed class NavRoute(val path: String) {
    // Using objects to create single sub-classes of NavRoute
    object Home: NavRoute("home")

    object Profile: NavRoute("profile"){
        val id = "id"
        val showDetails = "showDetails"
    }

    object Settings: NavRoute("settings")


}
