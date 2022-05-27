package de.holhar.getting2knowkotlin.functions

import java.time.LocalDate

// Unit is a type signifying that the function doesn't return anything (it's optional to define it explicitly here)
fun printName(name: String) : Unit {
    println("Name is: $name")
}

fun addition(x: Int, y: Int): Int {
    return x + y
}

// Define function as expression
fun additionExpression(x: Int, y: Int) = x+y

// Default value parameters (specify fallback values for not passed values)
fun printPersonDetails(
        name: String,
        email: String = "",
        dob: LocalDate = LocalDate.now()) {
    println("Name is $name and the email is $email and the dob is $dob")
}

fun main() {
    val unit = printName("Holger")
    println("unit is $unit")

    val result = addition(1, 2)
    println("Result is $result")

    val result1 = additionExpression(1, 2)
    println("Result is $result1")

    printPersonDetails("Holger", "abc@gmail.com", LocalDate.parse("2000-01-01"))

    printPersonDetails("Holger")

    // Named arguments (pass the name of the variable with the value of it - the order does not matter anymore)
    printPersonDetails(dob = LocalDate.parse("2000-01-01"), name = "Holger", email = "abc@gmail.com")
}
