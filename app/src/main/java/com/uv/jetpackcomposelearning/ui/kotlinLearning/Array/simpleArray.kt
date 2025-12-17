package com.uv.jetpackcomposelearning.ui.kotlinLearning.Array

fun main(){
    val arr = arrayOf(1,2,3,4,5)
    // first method
    for(ele in arr){
        print("$ele ")
    }
    println()
    // second method
    for(i in 0..arr.size-1){
        print("${arr[i]} ")
    }
    // third method
    for(e in arr.indices){
        println(e)
    }

}