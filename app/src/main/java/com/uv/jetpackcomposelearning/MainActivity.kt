package com.uv.jetpackcomposelearning

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.uv.jetpackcomposelearning.ui.ComposeLearning.Greet
import com.uv.jetpackcomposelearning.ui.theme.JetPackComposeLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            JetPackComposeLearningTheme {
                Column {
//                    Row {
//                        Greet("Vanshika")
//                        Spacer(modifier = Modifier.width(16.dp))
//                        Greet("Ujjaval")
//                    }
//
//
                //                    ProfileCard("Saini", 22, Color.YELLOW.toString())

                    Greet("Vanshika")


                }

            }
        }
    }
}
