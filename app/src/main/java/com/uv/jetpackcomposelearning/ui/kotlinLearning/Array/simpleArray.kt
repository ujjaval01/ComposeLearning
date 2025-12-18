package com.uv.jetpackcomposelearning.ui.kotlinLearning.Array

fun main(){
//    val arr = arrayOf(1,2,3,4,5)
    val arr = arrayOf(1, "Bhai", true)


//    arr.sortDescending()



    // first method
    print("Using java foreach loop: ")
    for(ele in arr){
        print("$ele ")
    }
    println()
    // second method
    print("Using simple loop: ")
    for(i in 0..arr.size-1){
        print("${arr[i]} ")

    }

    println()
    // fourth method
    print("Using foreach: ")
    arr.forEach {
        print("$it ")
    }
    println()
    // third method
    print("printing valid indices: ")
    for(e in arr.indices){
        print("$e ")
    }



}