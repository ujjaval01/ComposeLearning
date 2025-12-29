package com.uv.jetpackcomposelearning.ui.kotlinLearning.rowsAndCols

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ListExample(modifier: Modifier = Modifier) {
    val names = listOf(
        "Sagar", "Suraj", "Ujvl", "Anuj",
        "Amit", "Aashish", "Aman", "Raja",
        "Aadi", "Ujjaval", "Aditya", "Sorav",
        "Heer", "Ranjha", "Gorav", "Annu", "Ashmit", "Sagar", "Suraj", "Ujvl", "Anuj",
        "Amit", "Aashish", "Aman", "Raja",
        "Aadi", "Ujjaval", "Aditya", "Sorav",
        "Heer", "Ranjha", "Gorav", "Annu", "Ashmit"
    )
    LazyColumn(

    ) {
        items(names.size){ value->  // index-> explicit, it-> implicit
            Text(names[value], modifier = Modifier.padding(18.dp))
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color.Black)
            )
            Divider(
                thickness = 1.dp,
                color = Color.Red
            )
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ListExamplePrev(modifier: Modifier = Modifier) {
    ListExample()
}