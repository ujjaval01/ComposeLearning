package com.uv.jetpackcomposelearning.ui.kotlinLearning.rowsAndCols

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ListExample(modifier: Modifier = Modifier) {
    val names = listOf("sagar, suraj, ujvl, anuj," +
            " amit, aashish, aman, raja, aadi, ujjaval," +
            " aditya, sorav , heer, ranjha, gorav, annu, asmhit"
    )

    LazyColumn {
        items(names.size) {
            Text(text = names[it])
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ListExamplePrev(modifier: Modifier = Modifier) {
    ListExample()
}