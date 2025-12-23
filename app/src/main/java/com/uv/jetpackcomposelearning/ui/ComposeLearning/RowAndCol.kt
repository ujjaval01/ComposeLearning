package com.uv.jetpackcomposelearning.ui.ComposeLearning

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RowAndCol(){
//    Row (
//        modifier = Modifier.fillMaxSize(),
//        horizontalArrangement = Arrangement.Center,
//        verticalAlignment = Alignment.CenterVertically
//    ){
//        Text("Ujjaval")
//        Text("Vanshika")
//    }
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Ujjaval",
            modifier = Modifier.padding(16.dp)
            )
        Text(
            text = "Vanshika",
            modifier = Modifier.padding(16.dp)
        )
    }


}