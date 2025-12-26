package com.uv.jetpackcomposelearning


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.uv.jetpackcomposelearning.ui.foodOrderingApp.FoodAppNav
import com.uv.jetpackcomposelearning.ui.loginAndSignup.SignupScreen
import com.uv.jetpackcomposelearning.ui.theme.JetPackComposeLearningTheme
import com.uv.jetpackcomposelearning.ui.weatherApp.WeatherPage
import com.uv.jetpackcomposelearning.ui.weatherApp.WeatherViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val weatherViewModel: WeatherViewModel = viewModel()
            JetPackComposeLearningTheme {
//                WeatherPage(weatherViewModel)
                AppNavigation()
            }
        }
    }
}

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

        composable("todo_app") {
            SignupScreen(navController)
        }
    }
}


