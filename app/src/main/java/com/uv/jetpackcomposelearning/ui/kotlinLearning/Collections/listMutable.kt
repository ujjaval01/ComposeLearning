package com.uv.jetpackcomposelearning.ui.kotlinLearning.Collections

fun main(){
    // we can change on it...
    val list = mutableListOf(1,2,3,2,3,4,5)
    list.add(6)
    list.add(7)
    list.add(8)
    println(list)
    print("Using forEach Loop: ")
    list.forEach {
        print("$it ")
    }
    println()

    list.set(2, 10) // also we can use list[2] = 100 instead of set
    println(list)
    list.sortedDescending()
    println(list)
    list.sort()
    println(list)

    println(list.removeAt(0))
    println(list) // after removing element form the any of the index...
    println(list.remove(2))   // its also return boolean value...
    println(list) // after removing element form the value...
//    list.forEach(println(it))
//    println(
//        list.filter {
//        it % 2 == 0
//        })

    println(
        list.map {
            it * 2 })  // new list creating with given multiple value...
    println(list)

    println(
        list.find {
            it < 2  // return null if not present in the list..
        })

    println(
        list.any{
            it > 50   // return boolean if element present
        })
    println(
        list.all{
            it > 50   // return boolean if all element present
        })
    println(list.distinct()) // remove duplicates from the list


}