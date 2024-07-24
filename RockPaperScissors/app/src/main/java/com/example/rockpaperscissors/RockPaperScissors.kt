package com.example.rockpaperscissors

fun main() {
    var isRunning = 1;
    while (isRunning == 1) {
        val computerChoice: String
        println("Rock, Paper or Scissors?")
        println("Enter your choice: ")
        val playerChoice: String = readln()

        val randomNumber = (1..3).random()

        computerChoice = when (randomNumber) {
            1 -> {
                "Rock"
            }

            2 -> {
                "Paper"
            }

            else -> {
                "Scissors"
            }
        }

        println("Computer Choice is $computerChoice")

        val winner = when {
            playerChoice == computerChoice -> "Tie"
            playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
            playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
            playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
            else -> "Computer"
        }

        if (winner == "Tie") {
            println("Match Tie")
        } else {
            println("The winner is $winner")
        }

        println("Enter 0 to Exit or 1 to Continue: ")
        println("Enter you choice: ")

        val choice = readln();
        if(choice == "0"){
            isRunning = 0;
        }
    }

}