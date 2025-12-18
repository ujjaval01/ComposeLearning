package com.uv.jetpackcomposelearning.ui.kotlinLearning.BasicOops

open class Person{
    open fun display() {
        println("I am the person class")
    }
}
class Ujvl: Person(){
    override fun display(){
        println("I am the ujvl class")

    }
}
class Aman : Person(){
    override fun display(){
        println("I am the aman class")

    }
}

fun main(){
    /*Method Overriding- reference from the parent class
     and object from the child class, RTP*/
    val p1 : Person = Ujvl()
    val p2 : Person = Aman()

    p1.display()
    p2.display()
}