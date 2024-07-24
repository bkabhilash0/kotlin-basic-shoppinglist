package com.example.myapplication

fun main() {
    println("Hello World from Basics!")

    // Constants are created using val
    val pi = 3.14
    println("Pi Value is $pi")

    // Mutable Variables are created using var
    var age: Byte = 17
    println("Initial Value $age")
    age = 18
    println("New Value $age")

    // Unsigned Integers
    var height = 160u
    println(height)
    height = 170u
    println(height)

    // Characters
    val letter = 'a'
    println("The Letter is $letter")

    // Unicodes
    val copyright = '\u00ae'
    println("Copyrights $copyright")

    // String Datatypes
    var name = "Abhilash"
    println("Name is $name")
    println(name + "B K")

    name = "Dennis"
    println("New name is $name")

    println(name.lowercase())
    println(name.uppercase())

    // User Inputs
    print("Enter you age: ")
    age = readln().toByte()

    // Conditionals
    if (age >= 18) {
        println("You are Authorized!")
    } else if (age >= 14) {
        println("Few Years Left")
    } else {
        println("Not Authorized!")
    }

    // Range Check
    if (age in 18..40) {
        println("Age is between 18 to 40 inclusive")
    } else if (age > 40) {
        println("Too Old")
    } else {
        println("Too Young!")
    }

    // Loop
    var counter = 0;
    while (counter < 5) {
        println("Loop ${counter + 1}")
        counter++;
    }
}