package de.holhar.getting2knowkotlin.collections

import de.holhar.getting2knowkotlin.dataset.Course
import de.holhar.getting2knowkotlin.dataset.CourseCategory
import de.holhar.getting2knowkotlin.dataset.courseList

fun main() {
    val courseList = courseList()

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPMENT }
    val designPredicate = { c: Course -> c.category == CourseCategory.DESIGN }

    exploreFilter(courseList, devPredicate)

    exploreMap(courseList, designPredicate)
}

fun exploreFilter(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {
    // 'it' is a dedicated keyword representing the iterated element for each loop
    courseList
        .filter { predicate.invoke(it) }
        .forEach { println("course: $it") }
}

fun exploreMap(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {
    courseList
        .filter { predicate.invoke(it) }
        .map { "${it.name} - ${it.category}" }
        .forEach { println(it) }
}
