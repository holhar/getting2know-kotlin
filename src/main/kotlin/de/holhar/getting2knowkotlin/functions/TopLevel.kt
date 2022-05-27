package de.holhar.getting2knowkotlin.functions

/*
 * Functions and properties that do not belong to a class are top-level functions / properties.
 * E.g. the following function and property are top-level - they belong to this file (there is NO class).
 */

const val courseName = "Kotlin programming"

fun topLevelFunction(): Int {
    return (1..100).random();
}


fun main() {
    val num = topLevelFunction()
    println("Num is $num")
}
