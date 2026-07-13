package com.example.jetpackudemy.navigation

sealed class NavRoute(val path: String) {
    // Using objects to create single sub-classes of NavRoute
    object Home: NavRoute("home")

    object Profile: NavRoute("profile"){
        
        fun createRoute(id: Int, showDeatils: Boolean): String{
        return "profile/$id/$showDetails"
        }
    }

    object Settings: NavRoute("settings")


}
