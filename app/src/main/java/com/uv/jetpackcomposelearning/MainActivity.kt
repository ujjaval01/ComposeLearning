package com.uv.jetpackcomposelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.uv.jetpackcomposelearning.ui.navigationLibrary.AppNavigation
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
