package com.uv.jetpackcomposelearning.ui.kotlinLearning.BasicOops

class classWithPrimaryConstructor(name: String, age: Int){
    init {
        if(age >= 18) println("Student $name's age is valid for voting ")
        else println("Student $name's age is not valid for voting ")
    }
}
fun main(){
    val a = classWithPrimaryConstructor("ujjaval", 21)

}