package com.uv.jetpackcomposelearning.ui.kotlinLearning.functions

fun main(){
//    for (i in 1..10){
//        println("2 * $i = ${i*2}")
//    }

//    var i = 1;
//    while(i<=10){
//        println("2 * $i = ${i*2}")
//        i++
//    }

//    var i = 1
//    do{
//        println("2 * $i = ${i*2}")
//        i++
//    }while(i<=10)

//    for(i in 1..5){
//        for (j in 1..i){
//            print("*")
//        }
//        println()
////        *
////        **
////        ***
////        ****
////        *****
//    }

//    for (i in 0..5){
//        for (j in 1..5-i){
//            print("*")
//        }
//        println()
////        *****
////        ****
////        ***
////        **
////        *
//    }

//    for (i in 1..5){
//        for (j in 1..5-i){
//            print(" ")
//        }
//        for (k in 1..i){
//            print("*")
//        }
//        println()
////        *
////        **
////        ***
////        ****
////        *****
//    }

    for(i in 1..5){
        for(j in 1..5-i){
            print(" ")
        }
        for (k in 1..i){
            print("*")
        }
        println()
//        *
//        **
//        ***
//        ****
//        *****
    }
}