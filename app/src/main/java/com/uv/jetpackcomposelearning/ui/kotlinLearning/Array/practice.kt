package com.uv.jetpackcomposelearning.ui.kotlinLearning.Array
fun main() {
    val arr = intArrayOf(5, 8, 2, 9)
    val key = 8
    var found = false

    for (i in arr) {
        if (i == key) {
            found = true
            break
        }
    }

    println(found)
}
