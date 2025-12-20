package com.uv.jetpackcomposelearning.ui.kotlinLearning.Collections

fun main() {
    var map = mapOf(1 to "A", 2 to "B", 3 to "C", 4 to "D")
    println(map)
    println(map.size)
    println(map.keys)
    println(map.values)
    println(map.entries)
    var k = map.keys
    var v = map.values
    map.forEach{
        println("${it.key} -> ${it.value}")
    }
}