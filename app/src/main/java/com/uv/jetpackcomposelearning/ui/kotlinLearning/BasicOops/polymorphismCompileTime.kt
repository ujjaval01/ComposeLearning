package com.uv.jetpackcomposelearning.ui.kotlinLearning.BasicOops

class PolymorphismCompileTime {
    // alls are the the CTP examples...
    fun add(a:Int, b:Int) :Int{
        return a+b
    }
    fun add(a:Int, b:Int, c:Int) :Int{
        return a+b+c
    }
    fun add(a:Int, b:Int,c:Int, d:Int) :Int{
        return a+b+c+d
    }
}

fun main(){
    val p = PolymorphismCompileTime()
    println(p.add(1,2))
    println(p.add(1,2,3))
    println(p.add(1,2,3,4))
}