package com.uv.jetpackcomposelearning.ui.kotlinLearning

enum class Order(val status: String){
    PENDING("Order is pending"),
    SHIPPED("Order is shipped"),
    DELIVERED("Order is delivered");
    fun getResult(): String{
        return status
    }
}
fun checkStatus(order: Order){
    when(order){
        Order.PENDING -> println(order.getResult())
        Order.SHIPPED -> println(order.getResult())
        Order.DELIVERED -> println(order.getResult())
    }
}

fun main(){
    checkStatus(Order.PENDING)
    checkStatus(Order.SHIPPED)
    checkStatus(Order.DELIVERED)
}
