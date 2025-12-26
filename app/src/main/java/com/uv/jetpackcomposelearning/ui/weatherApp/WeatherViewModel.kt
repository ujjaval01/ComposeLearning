package com.uv.jetpackcomposelearning.ui.weatherApp

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.uv.jetpackcomposelearning.ui.weatherApp.api.Constant
import com.uv.jetpackcomposelearning.ui.weatherApp.api.RetrofitInstance
import kotlinx.coroutines.launch
class WeatherViewModel : ViewModel() {

    private val weatherApi = RetrofitInstance.weatherApi

    fun getData(city: String) {
        viewModelScope.launch {
            try {
                val response = weatherApi.getWeather(Constant.apiKey, city)

                if (response.isSuccessful) {
                    Log.d("Weather", response.body().toString())
                } else {
                    Log.e("Weather", response.errorBody()?.string().toString())
                }

            } catch (e: Exception) {
                Log.e("Weather", e.message.toString())
            }
        }
    }
}
