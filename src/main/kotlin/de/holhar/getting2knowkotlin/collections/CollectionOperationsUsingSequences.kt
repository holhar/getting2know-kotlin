package de.holhar.getting2knowkotlin.collections

import de.holhar.getting2knowkotlin.dataset.Course
import de.holhar.getting2knowkotlin.dataset.CourseCategory
import de.holhar.getting2knowkotlin.dataset.courseList

fun main() {
    // SEQUENCE PROCESSING of collections performs better for large data sets

    val namesListUsingSequence = listOf("Alex", "Ben", "Chloe")
        .asSequence() // Specify sequence processing
        .filter { it.length >= 4 }
        .map { it.uppercase() }
        .toList() // Specify terminal operation (necessary to start processing)

    println("namesListUsingSequence: $namesListUsingSequence")

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPMENT }
    exploreFilterUsingSequence(courseList(), devPredicate)

    // The following would break the program with an OutOfMemoryError if not triggered as sequence
    val range = 1..1000_000_000
    range
        .asSequence()
        .map { it.toDouble() }
        .take(40) // just take the first 40 elements of the sequence
        .forEach { println("Value is $it") }
}

fun exploreFilterUsingSequence(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {
    // 'it' is a dedicated keyword representing the iterated element for each loop
    courseList
        .asSequence()
        .filter { predicate.invoke(it) }
        .forEach { println("course: $it") }
}
