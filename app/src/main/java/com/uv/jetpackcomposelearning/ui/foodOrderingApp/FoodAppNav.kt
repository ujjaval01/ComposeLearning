package com.uv.jetpackcomposelearning.ui.foodOrderingApp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun FoodAppNav() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = FoodRoutes.SPLASH
    ) {

        composable(FoodRoutes.SPLASH) {
            FoodSplashScreen(
                onFinished = {
                    navController.navigate(FoodRoutes.WELCOME) {
                        popUpTo(FoodRoutes.SPLASH) { inclusive = true }
                    }
                }
            )
        }

        composable(FoodRoutes.WELCOME) {
            WelcomeScreen(
                onContinue = {
                    navController.navigate(FoodRoutes.HOME) {
                        popUpTo(FoodRoutes.WELCOME) { inclusive = true }
                    }
                }
            )
        }

        composable(FoodRoutes.HOME) {
            HomeScreen()
        }
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun FoodAppNavPrev(modifier: Modifier = Modifier) {
    FoodAppNav()
}