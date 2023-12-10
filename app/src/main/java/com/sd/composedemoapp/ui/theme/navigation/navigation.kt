package com.sd.composedemoapp.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sd.composedemoapp.ui.theme.screen.Login

@Composable
fun navigationGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination =ScreenRoutes.LOGIN ){
        composable(ScreenRoutes.LOGIN){
            Login()

        }

    }
}