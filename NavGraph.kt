package com.example.jetpackudemy.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.jetpackudemy.navigation.NavRoute.Profile.id
import com.example.jetpackudemy.navigation.NavRoute.Profile.showDetails
import com.example.jetpackudemy.screens.HomeScreen
import com.example.jetpackudemy.screens.ProfileScreen
import com.example.jetpackudemy.screens.SettingsScreen

@Composable
fun NavGraph(navController: NavHostController, modifier: Modifier){

    //Utilise the navController to navigate around pour navGraph
    NavHost(navController = navController,
        startDestination = "home") {
        addHomeScreen(navController,this)
        addProfileScreen(navController,this)
        addSettingsScreen(navController, this)
    }

}

fun addHomeScreen(navController: NavHostController,
                  navGraphBuilder: NavGraphBuilder){

    //NavGraphBuilder defines the composable route
    navGraphBuilder.composable(
        route = NavRoute.Home.path
    ){

        HomeScreen(navigateToProfile = {
            id,showDetails ->
            navController.navigate(
                NavRoute.Profile.createRoute(1872,true)
            )
        },
            navigateToSettings = {

                navController.navigate(NavRoute.Settings.path )
            }
            )

    }
}

fun addProfileScreen(navController: NavHostController,
                     navGraphBuilder: NavGraphBuilder){

    navGraphBuilder.composable(
        route = NavRoute.Profile.path.plus("/{id}/{showDetails}"),
        arguments = listOf(
            navArgument(NavRoute.Profile.id){
                type = NavType.IntType
            },
            navArgument(NavRoute.Profile.showDetails){
                type = NavType.BoolType
            }
        )
    ){

        navBackStackEntry ->

        val args = navBackStackEntry.arguments

        ProfileScreen(
            id = args?.getInt("id")!!,
            showDetails = args.getBoolean("showDetails"),
            navigateToSettings =  { navController.navigate("settings") }
        )
    }

}

fun addSettingsScreen(navController: NavHostController,
                      navGraphBuilder: NavGraphBuilder){
    navGraphBuilder.composable(
        route = NavRoute.Settings.path
    ){
        SettingsScreen(
            navigateToHome = { navController.navigate("home") }
        )
    }
}
