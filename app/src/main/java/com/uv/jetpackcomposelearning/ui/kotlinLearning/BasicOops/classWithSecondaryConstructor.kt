package com.uv.jetpackcomposelearning.ui.kotlinLearning.BasicOops

class classWithSecondaryConstructor {
    var name: String = "ujvl"
    var age: Int = 23

    // default constructor...
    constructor(){
        println("Constructor called")
        println("Name: $name")
        println("Age: $age")
        println()

    }
    // parameterized constructor...
    constructor(name: String, age: Int){
        this.name = name
        this.age =age
    }
    // function call
    fun display(){
        println("Name: $name")
        println("Age: $age")
    }
}

fun main(){
    val a = classWithSecondaryConstructor()
    val c = classWithSecondaryConstructor("ujjaval",21)
    c.display()
}