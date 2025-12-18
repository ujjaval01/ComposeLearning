package com.uv.jetpackcomposelearning.ui.kotlinLearning.String

fun main(){
//    val name = "Ujvl"
//    val surname: String = "Saini"
//    val print = "My name is $name $surname"
//    val fullName = "ujvl" + "saini"
//    println(print.uppercase())
//    println(fullName)
//
//    val age = 22
//    println("My age is $age")
//    println("Next year ${age + 1}")

    val s = "kotlin"
    for (ch in s) {
        print("$ch")
    }
    println()
    //String to CharArray-> ['k', 'o', 't', 'l', 'i', 'n']
    val arr = s.toCharArray()
    arr.forEach { print(it) }
    println()
    //length
    println(s.length)
    println(s.uppercase())  // KOTLIN
    println(s.lowercase())  // kotlin
    println(s.contains("Kot"))  // false
    println(s.startsWith("Ko")) // false
    println(s.endsWith("in"))   // true
    println(s.isEmpty())    // false
    println("ffffffffffffffffff")
    println(s.isBlank()) //
    println(s.isNotEmpty()) // true

//    println(s.substring(0, 3))  // kot
    s.replace("Kot", "Hot")
    println(s)

    // trim String
    val str = "  hi  "
    println(str.trim())

    // Splitting String
    val str2 = "a,b,c"
    val parts = str2.split(",")
    println(parts)


    val a = "hello"
    val b = "hello"

   println( a == b)     // true (value comparison)
    println(a === b )   // reference comparison









}