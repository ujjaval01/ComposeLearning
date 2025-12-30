package com.uv.jetpackcomposelearning.ui.navigationLibrary

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ScreenC(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxSize()
            .background(color = Color.Yellow),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text("Screen C",
            fontSize = 25.sp,
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ScreeAPrev() {
    ScreenC()
}