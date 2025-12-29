package com.uv.jetpackcomposelearning.ui.kotlinLearning.rowsAndCols

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ListExamplePrev(modifier: Modifier = Modifier) {
    ListExample()
}