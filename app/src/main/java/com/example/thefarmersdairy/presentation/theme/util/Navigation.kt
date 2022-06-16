package com.example.thefarmersdairy.presentation.theme.util

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun NavController(){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = Screen.splashScreen.route  ){
        composable(Screen.splashScreen.route){

        }
        composable(Screen.LoginScreen.route){

        }

    }


}
