package com.uv.jetpackcomposelearning.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Greet(){
    Text("Hello Android")
}
@Composable
fun Greet(name: String){
    Text("Hello $name")
}
