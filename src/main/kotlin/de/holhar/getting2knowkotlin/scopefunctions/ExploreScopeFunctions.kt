package de.holhar.getting2knowkotlin.scopefunctions

import de.holhar.getting2knowkotlin.classes.Course
import de.holhar.getting2knowkotlin.classes.CourseCategory

fun main() {
    exploreApply()

    exploreAlso()

    exploreLet()
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
