package de.holhar.getting2knowkotlin.classes

// Using data classes - automatically create toString(), hash(), equals(), and copy() methods
data class Course(
    val id: Int,
    val name: String,
    val author: String,
    var category: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
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
}
