package com.uv.jetpackcomposelearning.ui.kotlinLearning

fun main() {
//    var str: String = null // error(Pure nullable)
    var str: String? = "saini"  // may be nullable or not...
    println(str?.length)  // if null then print null, if not then print the length
    var len = str?.length ?: -1 // if null then return -1, if not then return the length
    println(len)

//    println(str!!.length) // use this, when u are 100% sure is not null...

    str?.let{
        println(str.uppercase())
        println(str.length)
    }


}