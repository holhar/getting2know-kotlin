package de.holhar.getting2knowkotlin.basics

import de.holhar.getting2knowkotlin.functions.courseName
import de.holhar.getting2knowkotlin.functions.topLevelFunction

fun main() {

    // val signifies immutables
    val name = "Holger"
    println(name)

    // Doesn't compile - not allowed for immutables
    //name = "Holger2"

    // var signifies mutables
    var age = 35
    println(age)
    age = 36
    println(age)

    // Long value initialized by type inference
    val salary = 30000L
    println(salary)

    // Apply String interpolation
    val course = "Kotlin Spring"
    println("course: $course and the course length is ${course.length}")

    val multiLine = """
        ABC
        DEF
    """.trimIndent() // trimIndent() removes the prefixed spaces
    println(multiLine)

    // Use top-level function / property
    val num = topLevelFunction()
    println("Num is: $num")
    println("courseName: $courseName")
}
