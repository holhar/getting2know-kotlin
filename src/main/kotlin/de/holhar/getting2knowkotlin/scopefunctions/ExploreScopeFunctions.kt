package de.holhar.getting2knowkotlin.scopefunctions

import de.holhar.getting2knowkotlin.classes.Course
import de.holhar.getting2knowkotlin.classes.CourseCategory

fun main() {
    exploreApply()

    exploreAlso()
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
