package com.uv.jetpackcomposelearning.ui.kotlinLearning.Functions

fun main() {
    print("Enter Hindi: ")
    val hindi = readln().toInt()

    print("Enter English: ")
    val english = readln().toInt()

    print("Enter Math: ")
    val math = readln().toInt()

    print("Enter Science: ")
    val science = readln().toInt()

    print("Enter Social: ")
    val social = readln().toInt()

    print("Enter Art: ")
    val art = readln().toInt()

    calCgpa(hindi, english, math, science, social, art)
}

fun calCgpa(
    hindi: Int,
    english: Int,
    math: Int,
    science: Int,
    social: Int,
    art: Int
) {
    val totalMarks = hindi + english + math + science + social + art
    val cgpa = (totalMarks.toDouble() / 600) * 10
    println("Your cgpa is %.2f".format(cgpa))
    /*%d → Int
    %s → String
    %f → Float/Double
    %.2f → decimal control
    .format() → clean & professional output*/
}
