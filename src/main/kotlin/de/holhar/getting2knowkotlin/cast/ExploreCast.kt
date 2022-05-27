package de.holhar.getting2knowkotlin.cast

import de.holhar.getting2knowkotlin.classes.Course

fun checkType(type: Any) {
    when(type) {
        // Apply type checking
        is Course -> {
            println(type.copy())
        }
        is String -> {
            // Smart cast is here applicable - from here on no cast is necessary as it is
            // ensured that the 'type' variable is a String
            println(type.lowercase())
        }
    }
}

fun castNumber(any: Any) {
    when(any) {
        // Apply cast
        any as Double -> println("Value is Double")
    }
}

fun main() {
    val course = Course(1, "Reactive programming in modern Java using project Reactor", "Dilip")

    checkType(course)
    checkType("HOLGER")

    castNumber(1.0)
    // Throws ClassCastException -> Integer can not be cast to Double
    //castNumber(1)

    val number = 1
    val numberToDouble = number.toDouble()
    println(numberToDouble)
}
