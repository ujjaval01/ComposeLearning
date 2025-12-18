package com.uv.jetpackcomposelearning.ui.kotlinLearning.BasicOops

open class Animal {
    open fun eat(){
        println("Animal is eating...")
    }
}

class Dog : Animal(){
//    override fun eat(){
//        super.eat()
//        println("Dog is eating...")
//    }
    fun bark(){
        super.eat()  // calling super class function
        println("Dog is barking...")
    }
}

fun main(){
    val d = Dog()
    d.bark()
//    d.eat()

}