package com.uv.jetpackcomposelearning.ui.weatherApp

import android.R.attr.data
import android.graphics.Color
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
import androidx.compose.material3.Card
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
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage


import com.uv.jetpackcomposelearning.ui.ComposeLearning.ColumnExample
import com.uv.jetpackcomposelearning.ui.weatherApp.api.NetworkResponse
import com.uv.jetpackcomposelearning.ui.weatherApp.api.WeatherModel

@Composable
fun WeatherPage(viewModel: WeatherViewModel,modifier: Modifier = Modifier) {
    var city by remember() {
        mutableStateOf("")
    }

    val weatherResult = viewModel.weatherResult.observeAsState()

    val keyboardController = LocalSoftwareKeyboardController.current

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
                keyboardController?.hide()

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
        AsyncImage(
            model = "https:${data.current.condition.icon}".replace("64x64", "128x128"),
            contentDescription = "Weather Icon",
            modifier = Modifier.size(160.dp)
        )
        Text(
            text = data.current.condition.text,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Card {
            Column(
                modifier =  Modifier.fillMaxWidth(),
            ) {
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                  WeatherKeyVal("Humidity", data.current.humidity)
                  WeatherKeyVal("Wind Speed", "${data.current.wind_kph} km/h")
                }
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    WeatherKeyVal("UV", data.current.uv)
                    WeatherKeyVal("Participation", "${data.current.precip_mm} mm")
                }
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    WeatherKeyVal("Local Time", data.location.localtime.split(" ")[1])
                    WeatherKeyVal("Local Date", data.location.localtime.split(" ")[0])
                }
            }
        }

    }
}

@Composable
fun WeatherKeyVal(key : String, value : String) {
    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = value, fontSize = 18.sp)
        Text(text = key, fontSize = 18.sp)
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun WeatherPagePrev(modifier: Modifier = Modifier) {
    val weatherViewModel: WeatherViewModel = viewModel()
    WeatherPage(weatherViewModel)
}