package com.uv.jetpackcomposelearning.ui.kotlinLearning.BasicOops

open class Shape {
    fun draw() {
        println("Drawing shape")
    }
}

class Circle : Shape(){
    fun fill(){
        super.draw()
        println("Filling Circle")
    }
}
class Rectangle : Shape(){
    fun fill(){
        super.draw()
        println("Filling Rectangle")
    }
}
class Triangle : Shape(){
    fun fill(){
        super.draw()
        println("Filling Triangle")
    }
}

fun main(){
    val c = Circle()
//    c.fill()
    val t = Triangle()
//    t.fill()
    val r = Rectangle()
    r.fill()

}


