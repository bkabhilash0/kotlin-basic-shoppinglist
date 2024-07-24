package com.example.myapplication

class BankAccount(private var accountHolder: String, private var balance: Double) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $amount")
    }

    fun withdraw(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $amount")
        } else {
            println("Insufficient Funds!")
        }
    }

    fun displayTransactionHistory() {
        println("------------------------------------------")
        println("Transaction History for $accountHolder")
        for (transaction in transactionHistory) {
            println(transaction)
        }
        println("------------------------------------------")
    }

    fun displayBalance() {
        println("$accountHolder balance is $balance")
    }
}