package com.example.myapplication

fun main() {
    val myBankAccount = BankAccount("Abhilash B K", 10000.0)

    myBankAccount.deposit(200.0)
    myBankAccount.withdraw(1200.0)
    myBankAccount.deposit(3333.578)
    myBankAccount.withdraw(200000.0)

    myBankAccount.displayTransactionHistory()
    myBankAccount.displayBalance()

}