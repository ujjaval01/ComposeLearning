package com.uv.jetpackcomposelearning.ui.weatherApp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.uv.jetpackcomposelearning.ui.ComposeLearning.ColumnExample

@Composable
fun WeatherPage(viewModel: WeatherViewModel,modifier: Modifier = Modifier) {
    var city by remember() {
        mutableStateOf("")
    }
    Column (modifier = modifier
        .fillMaxWidth()
        .padding(8.dp),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ){
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            OutlinedTextField(
                modifier = modifier.weight(1f),
                value = city,
                onValueChange = {
                    city = it
                },
                label = {
                    Text("Search for any location")
                }
            )
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Search,
                    contentDescription = "Search")
            }
        }
    }

}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun WeatherPagePrev(modifier: Modifier = Modifier) {
    val weatherViewModel: WeatherViewModel = viewModel()
    WeatherPage(weatherViewModel)
}