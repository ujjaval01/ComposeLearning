package com.uv.jetpackcomposelearning


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.uv.jetpackcomposelearning.ui.foodOrderingApp.FoodAppNav
import com.uv.jetpackcomposelearning.ui.loginAndSignup.SignupScreen
import com.uv.jetpackcomposelearning.ui.theme.JetPackComposeLearningTheme
import com.uv.jetpackcomposelearning.ui.weatherApp.WeatherPage
import com.uv.jetpackcomposelearning.ui.weatherApp.WeatherViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.uv.jetpackcomposelearning.ui.calculator.Calculator
import com.uv.jetpackcomposelearning.ui.calculator.CalculatorViewModel
import com.uv.jetpackcomposelearning.ui.kotlinLearning.rowsAndCols.ListExample

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val calculatorViewModel = ViewModelProvider(this)[CalculatorViewModel::class.java]   first method
        setContent {
            val weatherViewModel: WeatherViewModel = viewModel()
            val calculatorViewModel: CalculatorViewModel = viewModel()   //second method...
            JetPackComposeLearningTheme {
                ListExample()
//                WeatherPage(weatherViewModel)
//                AppNavigation()
//                Scaffold (modifier = Modifier.fillMaxSize()){innerPadding ->
//                    Calculator(modifier = Modifier.padding(innerPadding),calculatorViewModel)
//                }
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


