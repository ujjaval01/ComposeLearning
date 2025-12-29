package com.uv.jetpackcomposelearning.ui.kotlinLearning.rowsAndCols

import android.provider.CalendarContract.Colors
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HorizontalListExample(modifier: Modifier = Modifier) {
    val names = listOf(
        "Sagar", "Suraj", "Ujvl", "Anuj",
        "Amit", "Aashish", "Aman", "Raja",
        "Aadi", "Ujjaval", "Aditya", "Sorav",
        "Heer", "Ranjha", "Gorav", "Annu", "Ashmit", "Sagar", "Suraj", "Ujvl", "Anuj",
        "Amit", "Aashish", "Aman", "Raja",
        "Aadi", "Ujjaval", "Aditya", "Sorav",
        "Heer", "Ranjha", "Gorav", "Annu", "Ashmit"
    )
    LazyRow(

    ) {
        items(names.size){ value->  // index-> explicit, it-> implicit
            Row(
                modifier = Modifier
                    .height(60.dp)
                    .background(color = Color(0xFFF6F3F3))
                ,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(names[value], modifier = Modifier.padding(18.dp),
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    fontSize = 18.sp,
                    color = Color(0xFF0069B7)
                )
                Spacer(modifier = Modifier
                    .height(40.dp)
                    .width(1.dp)
                    .background(Color.Black)
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun HorizontalListExamplePrev(modifier: Modifier = Modifier) {
    HorizontalListExample()
}