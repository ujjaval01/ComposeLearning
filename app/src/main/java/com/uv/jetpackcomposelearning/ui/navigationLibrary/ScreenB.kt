package com.uv.jetpackcomposelearning.ui.navigationLibrary

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScreenB(onNextButtonClicked : () -> Unit) {
    Column (
        modifier = Modifier.fillMaxSize()
            .background(color = Color.Magenta),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text("Screen B",
            fontSize = 25.sp,
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(modifier = Modifier.wrapContentSize(),onClick = {
            onNextButtonClicked.invoke()
        }) {
            Text("Go to Screen C",
                fontSize = 22.sp)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ScreeAPrev() {
    ScreenB({})
}