package de.holhar.getting2knowkotlin.functions

// Unit is a type signifying that the function doesn't return anything (it's optional to define it explicitly here)
fun printName(name: String) : Unit {
    println("Name is: $name")
}

fun addition(x: Int, y: Int): Int {
    return x + y
}

// Define function as expression
fun additionExpression(x: Int, y: Int) = x+y

fun main() {
    val unit = printName("Holger")
    println("unit is $unit")

    val result = addition(1, 2)
    println("Result is $result")

    val result1 = additionExpression(1, 2)
    println("Result is $result1")
}
