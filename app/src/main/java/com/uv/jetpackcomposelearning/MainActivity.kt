package com.uv.jetpackcomposelearning

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.uv.jetpackcomposelearning.ui.ComposeLearning.ColumnExample
import com.uv.jetpackcomposelearning.ui.ComposeLearning.CounterScreen
import com.uv.jetpackcomposelearning.ui.ComposeLearning.Greet
import com.uv.jetpackcomposelearning.ui.ComposeLearning.HomeScreen
//import com.uv.jetpackcomposelearning.ui.ComposeLearning.ToastExample
import com.uv.jetpackcomposelearning.ui.ComposeLearning.LazyColumnExample
import com.uv.jetpackcomposelearning.ui.ComposeLearning.LoginScreen
import com.uv.jetpackcomposelearning.ui.ComposeLearning.RowAndCol
import com.uv.jetpackcomposelearning.ui.ComposeLearning.SignupScreen
import com.uv.jetpackcomposelearning.ui.ComposeLearning.SplashScreen
import com.uv.jetpackcomposelearning.ui.ComposeLearning.WelcomeScreen
import com.uv.jetpackcomposelearning.ui.theme.JetPackComposeLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            LoginScreen()
//            SignupScreen()
//            JetPackComposeLearningTheme {
//                var showSplash by remember { mutableStateOf(true) }
//
//                if (showSplash) {
//                    SplashScreen {
//                        showSplash = false
//                    }
//                } else {
//                    WelcomeScreen() // ya HomeScreen()
//                }
//                Column {
////                    CounterScreen()
////                    ColumnExample()
////                    LazyColumnExample()
////                    ToastExample()
////                    RowAndCol()
////                    SplashScreen()
////                    WelcomeScreen()
//                    HomeScreen()
//                }

            }
        }
    }
//}
