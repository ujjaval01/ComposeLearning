package com.uv.jetpackcomposelearning.ui.weatherApp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.uv.jetpackcomposelearning.ui.weatherApp.api.Constant
import com.uv.jetpackcomposelearning.ui.weatherApp.api.NetworkResponse
import com.uv.jetpackcomposelearning.ui.weatherApp.api.RetrofitInstance
import com.uv.jetpackcomposelearning.ui.weatherApp.api.WeatherModel
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {

    private val weatherApi = RetrofitInstance.weatherApi

    private val _weatherResult =
        MutableLiveData<NetworkResponse<WeatherModel>>()

    val weatherResult: LiveData<NetworkResponse<WeatherModel>> =
        _weatherResult

    fun getData(city: String) {

        _weatherResult.value = NetworkResponse.Loading

        viewModelScope.launch {
            try {
                val response =
                    weatherApi.getWeather(city, Constant.apiKey)

                if (response.isSuccessful) {

                    val body = response.body()

                    if (body != null) {
                        _weatherResult.value =
                            NetworkResponse.Success(body)
                    } else {
                        _weatherResult.value =
                            NetworkResponse.Error("Empty response")
                    }

                } else {
                    _weatherResult.value =
                        NetworkResponse.Error("Failed: ${response.code()}")
                }

            } catch (e: Exception) {
                _weatherResult.value =
                    NetworkResponse.Error(
                        e.message ?: "Unknown error"
                    )
            }
        }
    }
}
