
package com.uv.jetpackcomposelearning.ui.kotlinLearning.BasicOops

class Student {
    private var name = "ujvl"
    var rollNo = 0

    fun getName(): String{
        return name
    }

    fun display(){
        println("Name: $name")
        println("Roll No: $rollNo")
    }
}

fun main(){
    var s1 = Student()
    s1.rollNo = 1;
    println(s1.rollNo)
    println(s1.getName())
}