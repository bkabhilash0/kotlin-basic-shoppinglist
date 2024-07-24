package com.example.myapplication

fun main() {
    // Immutable List
    val shoppingList = listOf("Processor", "RAM", "Graphics Card", "CPU")
    println(shoppingList);

    // Mutable List
    val myCart = mutableListOf("Processor", "RAM", "Graphics Card", "CPU")
    println("My Cart => $myCart")
    myCart.add("Keyboard")
    println("Adding Keyboard")
    println("My Cart => $myCart")

    myCart[0] = "Processor 1"
    println("My Cart => $myCart")

    println(myCart.contains("RAM"))
    println(myCart.contains("Mouse"))

    // Looping
    for (item in myCart){
        if(item == "RAM"){
            break
        }
        println(item)
    }

    // Get the Index
    for(item in 0 until myCart.size){
        // This returns the index of the array
        println("Item ${item + 1} => ${myCart[item]}")
    }
}