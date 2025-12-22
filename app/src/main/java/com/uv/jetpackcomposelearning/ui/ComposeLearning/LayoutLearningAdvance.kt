package com.uv.jetpackcomposelearning.ui.ComposeLearning

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnExample(modifier: Modifier = Modifier) {
//    LazyColumn(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ){
//        items(count = 100){index->
//            Text(text = "Item $index",
//                modifier = Modifier.padding(10.dp))
//        }
//    }
//    LazyRow(
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        items(10) { index ->
//            Text(
//                text = "Item $index",
//                modifier = Modifier.padding(16.dp)
//            )
//        }
//    }

//    Column(modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center
//        horizontalAlignment = Alignment.CenterHorizontally
//        ){
//        Button(onClick = {}) {
//            Text("Click Me")
//        }
//    }

}
//@Composable
//fun ToastExample() {
//    val context = LocalContext.current
//
//    Button(onClick = {
//        Toast.makeText(
//            context,
//            "Hello Toast!",
//            Toast.LENGTH_SHORT
//        ).show()
//    }) {
//        Text("Show Toast")
//    }
//}



@Composable
@Preview(showSystemUi = true, showBackground = true)
fun Prev(modifier: Modifier = Modifier) {
   LazyColumnExample()
//    ToastExample
//    ()
}