@file:JvmName("CourseUtils")

package de.holhar.getting2knowkotlin.classes

import de.holhar.getting2knowkotlin.CourseJava

// Using data classes - automatically create toString(), hash(), equals(), and copy() methods
data class Course @JvmOverloads constructor(
    val id: Int,
    val name: String,
    val author: String,
    var category: CourseCategory = CourseCategory.DEVELOPMENT
) {
    @JvmField
    var noOfCourses = 10

    companion object {

        @JvmStatic
        fun printName(name: String = "default") {
            println("name: $name")
        }
    }
}

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

@JvmName("printNameWithFallback")
@JvmOverloads
fun printName(name: String = "default") {
    println("name: $name")
}

fun main() {
    val course1 = Course(1, "Reactive programming in modern Java using project Reactor", "Dilip")
    println(course1)

    val course2 = Course(2, "Reactive programming in modern Java using project Reactor", "Dilip")

    println("Checking object equality: ${course1 == course2}")

    val course3 = course2.copy(
        id = 3, name = "Dilip3"
    )
    println(course3)

    val course4 = Course(4, "Facebook Marketing", "Max Power", CourseCategory.MARKETING)
    println(course4)

    val courseJava = CourseJava(2, "Facebook Marketing", "Dilip")
    println("courseJava $courseJava")
    courseJava.id = 3
    courseJava.name = "something Different"
    println("courseJava $courseJava")
}
