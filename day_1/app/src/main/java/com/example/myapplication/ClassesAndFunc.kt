package com.example.myapplication

data class Dog(val name: String)

class Person(val name: String, var age: Int = 0) {
    init {
        println("The name of the Person is $name and is $age years old!")
    }

    fun walk() {
        println("The person is walking...")
    }

    fun growUp(years: Int) {
        println("Passing Time for $years years...")
        this.age += years
    }
}

fun main() {
    val myDog = Dog("Jimmy")
    println("The name of the dog is ${myDog.name}")
    val abhi = Person("Abhilash", 24)
    abhi.walk()

    printDetails(abhi)
    abhi.growUp(2)
    printDetails(abhi)
}

fun printDetails(person: Person) {
    println("Name of the Person is ${person.name} and age is ${person.age}")
}