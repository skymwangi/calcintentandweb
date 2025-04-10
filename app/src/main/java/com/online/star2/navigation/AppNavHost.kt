package com.online.star2.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.online.star2.ui.theme.screens.calc.Calc_Screen
import com.online.star2.ui.theme.screens.home.Homescreen
import com.online.star2.ui.theme.screens.intent.Intent_Screen
import com.online.star2.ui.theme.screens.web.Web_Screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               star : NavHostController= rememberNavController(),
               startDestination: String="home"
) {
    NavHost(modifier=modifier,startDestination=startDestination, navController = star){
        composable (ROUTE_HOME){
            Homescreen(star)
        }
        composable ("calc"){
            Calc_Screen(star)
        }
        composable("intent") {
            Intent_Screen(star)
        }
        composable("web") {
            Web_Screen(star)
        }

    }

}