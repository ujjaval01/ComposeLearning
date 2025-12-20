package com.uv.jetpackcomposelearning.ui.ComposeLearning

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.w3c.dom.Text

//@Composable
//fun Greet(){
//    Text("Hello Android")
//}
////@Composable
////fun Greet(name: String){
////    Text("Hello $name")
////}
//@Composable
//fun ProfileCard(name:String, age:Int, color: String){
//    Text("$name $age $color")
//}

@Composable
fun Greet(name: String){
    Text("Hello $name")
}
// Recomposition..
@Preview(showBackground = true)
@Composable
fun PreviewGreet() {
    Greet(name = "Vanshika")
}
