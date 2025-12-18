package com.uv.jetpackcomposelearning.ui.kotlinLearning

sealed class Result{
    data class Success(val data: String): Result()
    data class Error(val message: String): Result()
    object Loading: Result()

}

fun processResult(result: Result){
    when(result){
        is Result.Success -> println("Success: ${result.data}")
        is Result.Error -> println("Error: ${result.message}")
        is Result.Loading -> println("Loading...")

    }
}

fun main(){
    val successResult = Result.Success("User profile fetch..")
    val error = Result.Error("Network issues...")
    val loading = Result.Loading
    processResult(successResult)
    processResult(error)
    processResult(loading)

}