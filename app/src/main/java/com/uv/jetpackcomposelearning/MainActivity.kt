package com.uv.jetpackcomposelearning

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import com.uv.jetpackcomposelearning.ui.Greet
import com.uv.jetpackcomposelearning.ui.ProfileCard
import com.uv.jetpackcomposelearning.ui.theme.JetPackComposeLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            JetPackComposeLearningTheme {
                Column {
                    Greet("Vanshika")
                    Greet("Ujjaval")
                    ProfileCard("Saini", 22, Color.YELLOW.toString())
                }

            }
        }
    }
}
