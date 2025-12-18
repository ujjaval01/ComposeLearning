package com.uv.jetpackcomposelearning.ui.kotlinLearning.BasicOops

interface OpenCamera{
    fun clickPic()
}
interface OpenFlash{
    fun flashOn()
}

class Camera : OpenCamera, OpenFlash{
    override fun clickPic() {
        println("Picture clicked...")
    }

    override fun flashOn() {
        println("Flash turned on...")
    }
    fun captureVideo(){
        println("Video captured...")
    }
    fun all(){
        clickPic()
        flashOn()
        captureVideo()
    }
}

fun main(){
    val c = Camera()
    c.all()
}