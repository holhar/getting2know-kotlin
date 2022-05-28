package de.holhar.getting2knowkotlin.scopefunctions

import de.holhar.getting2knowkotlin.classes.Course
import de.holhar.getting2knowkotlin.classes.CourseCategory

fun main() {
    // POI: https://kotlinlang.org/docs/scope-functions.html
    exploreApply()
    exploreAlso()
    exploreLet()
    exploreWith()
    exploreRun()
}

fun exploreApply() {

    val course = Course(
        1,
        "Design Thinking in Kotlin",
        "Dilip"
    ).apply {
        //category = CourseCategory.DESIGN
        this.category = CourseCategory.DESIGN
    }

    println("course: $course")
}

fun exploreAlso() {

    val course = Course(
        1,
        "Design Thinking in Kotlin",
        "Dilip"
    ).also {
        //it.category = CourseCategory.DESIGN
        println("Course is $it")
    }.apply {
        //category = CourseCategory.DESIGN
        this.category = CourseCategory.DESIGN
    }

    println("course: $course")
}

fun exploreLet() {

    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result1 = numbers.map { it * 2 }.filter { it > 5 }.let {
        println(it)
        it.sum()
    }
    println(result1)

    var name : String? = null
    name = "Holger"
    val result2 = name?.let {
        println(it)
        it.uppercase()
    }
    println(result2)
}

fun exploreWith() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    val result = with(numbers) {
        //println("Size is ${numbers.size}")
        println("Size is ${size}")
        //val list = numbers.plus(6)
        val list = plus(6)
        list.sum()
    }
    println("With result is $result")
}

fun exploreRun() {
    var numbers : MutableList<Int>? = null
    val result = numbers.run {
        numbers = mutableListOf(1, 2, 3)
        numbers?.sum()
    }
    println("Run result is $result")

    val length = run {
        val name = "Holger"
        println(name)
        name.length
    }
    println("Run length is $length")
}
