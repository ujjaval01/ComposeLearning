package com.uv.jetpackcomposelearning.ui.navigationLibrary

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.uv.jetpackcomposelearning.AppHubScreen
import com.uv.jetpackcomposelearning.ui.foodOrderingApp.FoodAppNav
import com.uv.jetpackcomposelearning.ui.loginAndSignup.screens.SignupScreen
import com.uv.jetpackcomposelearning.ui.weatherApp.WeatherPage
import com.uv.jetpackcomposelearning.ui.weatherApp.WeatherViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "hub"
    ) {

        composable("hub") {
            AppHubScreen(navController)
        }

        composable("food_app") {
            FoodAppNav()
        }

        composable("weather_app") {
            val weatherViewModel: WeatherViewModel = viewModel()
            WeatherPage(weatherViewModel)
        }

        composable("signup") {
            SignupScreen(
                navController = navController,
                viewModel = viewModel()
            )
        }
    }
}
