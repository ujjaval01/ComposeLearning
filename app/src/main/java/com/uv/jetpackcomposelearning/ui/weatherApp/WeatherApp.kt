package com.uv.jetpackcomposelearning.ui.weatherApp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil3.compose.AsyncImage
import com.uv.jetpackcomposelearning.ui.ComposeLearning.ColumnExample
import com.uv.jetpackcomposelearning.ui.weatherApp.api.NetworkResponse
import com.uv.jetpackcomposelearning.ui.weatherApp.api.WeatherModel

@Composable
fun WeatherPage(viewModel: WeatherViewModel,modifier: Modifier = Modifier) {
    var city by remember() {
        mutableStateOf("")
    }

    val weatherResult = viewModel.weatherResult.observeAsState()

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
            IconButton(onClick = {
                viewModel.getData(city)
            }) {
                Icon(imageVector = Icons.Default.Search,
                    contentDescription = "Search"
                )
            }
        }
        when(val res = weatherResult.value){
            is NetworkResponse.Error ->{
                Text(text = res.message)
            }
            is NetworkResponse.Success ->{
                WeatherDetails(data = res.data)
            }
            NetworkResponse.Loading ->{
                CircularProgressIndicator()
            }
            else -> {}

        }
    }

}


@Composable
fun WeatherDetails(data : WeatherModel) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Bottom
        ) {
            Icon(
                imageVector = Icons.Default.LocationOn,
                contentDescription = "Location",
                modifier = Modifier.size(40.dp)
            )
            Text(text = data.location.name, fontSize = 30.sp)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = data.location.country, fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "${data.current.temp_c} °C",
            fontSize = 56.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
//        Spacer(modifier = Modifier.height(16.dp))
//        Text(
//            text = data.current.condition.text
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//        AsyncImage(
//            model = "https:${data.current.condition.icon}",
//            contentDescription = "Weather Icon",
//            modifier = Modifier.size(128.dp)
//        )
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun WeatherPagePrev(modifier: Modifier = Modifier) {
    val weatherViewModel: WeatherViewModel = viewModel()
    WeatherPage(weatherViewModel)
}