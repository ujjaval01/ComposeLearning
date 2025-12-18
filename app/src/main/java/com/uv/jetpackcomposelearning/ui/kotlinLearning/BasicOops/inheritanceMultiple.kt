package com.uv.jetpackcomposelearning.ui.kotlinLearning.BasicOops

// correct way of multiple Inheritance...
interface A {
    fun show() {
        println("A show")
    }
}

interface B {
    fun show() {
        println("B show")
    }
}

class C : A, B {
    override fun show() {
        super<A>.show()
        super<B>.show()
    }
}

fun main() {
    val obj = C()
    obj.show()
}


//  ambiguity occurs in this code...
//interface WithFlash{
//    fun clickPic(){
//        println("Picture clicked...")
//    }
//}
//interface WithoutFlash{
//    fun clickPic(){
//        println("Flash turned on...")
//    }
//}
//class Camera : WithFlash, WithoutFlash{
//    fun clickPicture(){
//        super.clickPic()  // ambiguity occurs..
//        super.clickPic()
//    }
//}
//
//fun main(){
//    val c = Camera()
//    c.clickPicture()
//}