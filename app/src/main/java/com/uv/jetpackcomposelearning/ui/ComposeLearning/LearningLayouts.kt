package com.uv.jetpackcomposelearning.ui.ComposeLearning

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uv.jetpackcomposelearning.R

@Composable
fun ColumnExample(modifier: Modifier = Modifier) {
//    Column(modifier = modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
//        Text("Ujjaval Saini")
//        Text("Vanshika Saini")
//        Button(onClick = {}) {
//            Text("Click Me")
//        }
//    }

//    Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
//        Text("Ujjaval Saini")
//        Text("Vanshika Saini")
//        Button(onClick = {}) {
//            Text("Click Me")
//        }
//    }

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.mypic),
            contentDescription = null,
            modifier = Modifier
//                .size(250.dp)
                .width(200.dp)
                .height(200.dp)
                .align(Alignment.Center)
        )
        Text("Ujjaval Saini",
            color = Color.Black,
            modifier = Modifier.
            align(Alignment.BottomCenter))
    }

}




@Composable
@Preview(showSystemUi = true)
fun PreviewScreen(modifier: Modifier = Modifier){
    ColumnExample()
}