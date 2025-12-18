package com.uv.jetpackcomposelearning.ui.kotlinLearning.BasicOops

open class Vehicle {
    fun start() {
        println("Vehicle started")
    }
}

open class Car : Vehicle() {
    fun drive() {
        println("Car driving")
    }
    fun parked(){
        print("Car parked")
    }
}

class ElectricCar : Car() {
    fun charge() {
        super.parked()
        println(" and on Charging")
    }
}

fun main() {
    val ev = ElectricCar()
//    ev.start()
//    ev.drive()
    ev.charge()

//    val c = Car()
//    c.start()
//    c.drive()


}