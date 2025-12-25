package com.uv.jetpackcomposelearning


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.uv.jetpackcomposelearning.ui.counterApp.CounterScreen
import com.uv.jetpackcomposelearning.ui.foodOrderingApp.HomeScreen
import com.uv.jetpackcomposelearning.ui.loginAndSignup.SignupScreen
import com.uv.jetpackcomposelearning.ui.theme.JetPackComposeLearningTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetPackComposeLearningTheme {
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
            HomeScreen()
        }

        composable("weather_app") {
            CounterScreen()
        }

        composable("todo_app") {
            SignupScreen(navController)
        }
    }
}


