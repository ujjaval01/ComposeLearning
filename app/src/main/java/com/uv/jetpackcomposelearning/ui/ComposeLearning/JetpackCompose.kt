package com.uv.jetpackcomposelearning.ui.ComposeLearning

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Greet(){
    Text("Hello Android")
}
@Composable
fun Greet(name: String){
    Text("Hello $name")
}
@Composable
fun ProfileCard(name:String, age:Int, color: String){
    Text("$name $age $color")
}
