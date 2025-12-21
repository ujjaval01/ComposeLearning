package com.uv.jetpackcomposelearning.ui.ComposeLearning

import android.widget.Button
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun CounterScreen() {
    var count by remember { mutableIntStateOf(0) }
    var reset = 0
    Text("$count")

    Button(onClick =  {
        count++
    }){
        Text("Increment")
    }
    Button(onClick = {
        count = reset
    }) { Text("Reset") }

}