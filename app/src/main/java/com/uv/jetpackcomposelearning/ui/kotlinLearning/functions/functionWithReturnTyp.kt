package com.uv.jetpackcomposelearning.ui.kotlinLearning.functions


fun main(){
    val res = calculatePercentage(400, 600)
    println("Percentage %.2f".format(res))
}

fun calculatePercentage(marks:Int, totalMarks:Int): Float{
    return (marks.toFloat()/totalMarks)*100
}