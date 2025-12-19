package com.uv.jetpackcomposelearning.ui.kotlinLearning.Collections

fun main() {
    // immutable list, fixed size, read only, no changes no updates
    val list = listOf(1,2,3,4,2,8)
    println(list)
//    list[0] = 9  // changes not allow..
    for(i in 0..list.size-1){
        print("${list.get(i)} ")  // also we can use list[i]
    }
    println()
    for ((i, v) in list.withIndex()) {
        println("$i -> $v")  // 0 -> 1, 1 -> 2(idx, val)
    }
    // list basic operation...
    println(list.size)
    println(list.contains(2))
    println(list.containsAll(listOf(1,2)))
    println(list.indexOf(2))
    println(list.lastIndexOf(2))
    println(list.subList(0,2))
    println(list.isEmpty())
    println(list.isNotEmpty())
    println(list.drop(1))
    println(list.dropLast(1))
    println(list.take(2))
    println(list.takeLast(2))
    println(list.filter { it % 2 == 0 })
    println(list.filterNot { it % 2 == 0 })





}