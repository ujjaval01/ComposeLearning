package com.uv.jetpackcomposelearning.ui.kotlinLearning.BasicOops
abstract class Engine {
    abstract fun start()

    fun horn() {
        println("Horn sound...")
    }
}

interface Brake {
    fun applyBrakes()

    fun stop() {
        println("Vehicle stopped")
    }
}

class Tractor : Engine(), Brake {
    override fun start() {
        println("Tractor started")
    }

    override fun applyBrakes() {
        println("Tractor brakes applied")
    }
}

class Bike : Engine() {
    override fun start() {
        println("Bike started")
    }
}

fun main() {
    val t = Tractor()
    t.start()
    t.horn()
    t.applyBrakes()

}
