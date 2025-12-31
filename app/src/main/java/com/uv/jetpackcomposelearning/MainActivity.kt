package com.uv.jetpackcomposelearning


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.uv.jetpackcomposelearning.ui.foodOrderingApp.FoodAppNav
import com.uv.jetpackcomposelearning.ui.loginAndSignup.screens.SignupScreen
import com.uv.jetpackcomposelearning.ui.theme.JetPackComposeLearningTheme
import com.uv.jetpackcomposelearning.ui.weatherApp.WeatherPage
import com.uv.jetpackcomposelearning.ui.weatherApp.WeatherViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.ui.NavDisplay
import com.uv.jetpackcomposelearning.ui.calculator.CalculatorViewModel
import com.uv.jetpackcomposelearning.ui.navigationLibrary.ScreenA
import com.uv.jetpackcomposelearning.ui.navigationLibrary.ScreenB
import com.uv.jetpackcomposelearning.ui.navigationLibrary.ScreenC

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val calculatorViewModel = ViewModelProvider(this)[CalculatorViewModel::class.java]   first method
        setContent {
            val weatherViewModel: WeatherViewModel = viewModel()
            val calculatorViewModel: CalculatorViewModel = viewModel()   //second method...
            JetPackComposeLearningTheme {
                Nav3HubSetup()
//                ListExample()
//                HorizontalListExample()
//                WeatherPage(weatherViewModel)
//                AppNavigation()
//                Scaffold (modifier = Modifier.fillMaxSize()){innerPadding ->
//                    Calculator(modifier = Modifier.padding(innerPadding),calculatorViewModel)
//                }
            }
        }
    }
}

// Navigation hub for switching app from the main screen
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
        composable ("food_app") {
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

// its just a practice how the navigation's works...
@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun Nav3HubSetup() {
    val backStack = remember {
        mutableStateListOf<ScreenKey>(ScreenAKey)
    }
    NavDisplay(
        backStack = backStack,
        onBack = {
            if (backStack.size > 1) {
                backStack.removeLast()
            }
        },
        entryProvider = { key ->
            when (key) {
                ScreenAKey -> NavEntry(key) { ScreenA(
                    onNextButtonClicked = { backStack.add(ScreenBKey) }
                ) }
                ScreenBKey -> NavEntry(key) { ScreenB(
                    onNextButtonClicked = { backStack.add(ScreenCKey) }
                ) }
                ScreenCKey -> NavEntry(key) { ScreenC() }
            }
        }
    )
}

sealed interface ScreenKey
data object ScreenAKey : ScreenKey
data object ScreenBKey : ScreenKey
data object ScreenCKey : ScreenKey



