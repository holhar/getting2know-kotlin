package de.holhar.getting2knowkotlin.basics

fun main() {

    // val signifies immutables
    val name : String = "Holger"
    println(name)

    // Doesn't compile - not allowed for immutables
    //name = "Holger2"

    // var signifies mutables
    var age : Int = 35
    println(age)
    age = 36
    println(age)
}
