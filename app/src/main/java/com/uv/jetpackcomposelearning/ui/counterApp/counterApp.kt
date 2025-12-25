package com.uv.jetpackcomposelearning.ui.counterApp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.uv.jetpackcomposelearning.R

@Composable
fun CounterScreen() {
    var count by rememberSaveable { mutableIntStateOf(0) }
    val reset = 0
    Column {
        Text("$count", modifier = Modifier.padding(20.dp), color = colorResource(R.color.teal_200))

        // space between two components
        Spacer(modifier = Modifier.height(10.dp))
        // Button for increment
        Button(onClick =  {
            count++
        }){
            Text("Increment", modifier = Modifier.padding(10.dp), color = colorResource(R.color.purple_200))
        }

        // space between two components
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            count = reset
        }) { Text("Reset") }
    }


}