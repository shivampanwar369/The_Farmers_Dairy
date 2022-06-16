package com.example.thefarmersdairy.presentation.theme.util

import android.window.SplashScreen
import android.window.SplashScreenView
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.thefarmersdairy.presentation.theme.splash.splashScreen


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.splashScreen.route
    )
    {
        composable(Screen.splashScreen.route) {
            splashScreen(navControler = navController)
            //   SplashScreenView(navController = navController)

        }
        composable(Screen.LoginScreen.route) {

        }

    }


}
