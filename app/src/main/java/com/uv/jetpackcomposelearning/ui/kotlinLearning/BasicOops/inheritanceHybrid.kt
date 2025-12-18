package com.uv.jetpackcomposelearning.ui.kotlinLearning.BasicOops

open class Device {
    fun powerOn() {
        println("Power ON")
    }
}

interface Wifi {
    fun connect()
}

// interface and class order doesn't matter...
class SmartPhone : Wifi, Device() {
    override fun connect() {
        super.powerOn()
        println("WiFi Connected")
    }
}

fun main(){
    val s = SmartPhone()
//    s.powerOn()
    s.connect()

}