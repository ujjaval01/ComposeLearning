package com.uv.jetpackcomposelearning.ui.kotlinLearning.Functions

fun main(){
    print("Enter the day num: ")
    val day = readln().toInt()

    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")

    }
}