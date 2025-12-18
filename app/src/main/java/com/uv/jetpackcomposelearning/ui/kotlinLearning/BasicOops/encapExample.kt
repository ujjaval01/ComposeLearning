package com.uv.jetpackcomposelearning.ui.kotlinLearning.BasicOops

class BankAccount{
    private var balance : Double = 0.0
    public var name: String = "Ujvl"

    fun deposit(amount: Double){
        if(amount > 0){
            balance += amount
            println("Thank you $name for depositing: $amount in your bank account")
        }else{
            println("Invalid amount")
        }
    }
    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Thank you $name for withdrawing: $amount from your bank account")
        }
    }
    fun getBalance(): Double{
        print("Your balance is: ")
        return balance
    }
}

fun main(){
    val b = BankAccount()
//    b.balance = 500.0
    b.deposit(5000.0)
    b.withdraw(2250.0)
    println(b.getBalance())

}