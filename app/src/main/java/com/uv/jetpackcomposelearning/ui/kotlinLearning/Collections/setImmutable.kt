package com.uv.jetpackcomposelearning.ui.kotlinLearning.Collections

fun main() {
    var set = setOf(1,2,3,4,5)
    var set2 = setOf(2,3,8,9,0,2)
    set.forEach {
        print("$it ")
    }
    println()
    println(set.isEmpty())
    println(set.contains(3))
    println(set.max())
    println(set.min())
    println(set.average())
    println(set.sum())
    println(set.count())
    println(
        set.map {
            it * 2
        })
//    var set3 = set.union(set2); // combine two set
//    println(set3)

    var set3 = set.intersect(set2)  // common element from the set
    println(set3)


//    var set3 = set.subtract(set2)  // remove common element from the set
//    println(set3)
}