package com.uv.jetpackcomposelearning.ui.kotlinLearning.Array
fun main(){
    val arr = arrayOf(1,2,3,4,5)
    for(ele in arr){
        print("$ele ")
    }
    println()
    var i = 0;
    var j = arr.size-1;
    while (i<j){
        var temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
        i++
        j--
    }
    for(ele in arr){
        print("$ele ")
    }

}