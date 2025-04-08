package com.online.star2.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.online.star2.ui.theme.screens.home.Homescreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               star : NavHostController= rememberNavController(),
               startDestination: String="home"
) {
    NavHost(modifier=modifier,startDestination=startDestination, navController = star){
        composable (ROUTE_HOME){
            Homescreen()
        }

    }

}