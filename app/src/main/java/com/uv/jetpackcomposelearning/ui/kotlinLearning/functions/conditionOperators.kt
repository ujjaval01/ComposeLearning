package com.uv.jetpackcomposelearning.ui.kotlinLearning.functions

fun ujvl(){
    print("Enter your age: ")
    val age = readln().toInt()

    if(age >= 18) println("e")
    else println("Not e")

    if(age in 18..45) println("Eligible for vote")
    else println("Not eligible for vote")
}

fun main(){
    ujvl()
}