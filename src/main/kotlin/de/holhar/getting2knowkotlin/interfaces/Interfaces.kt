package de.holhar.getting2knowkotlin.interfaces

import de.holhar.getting2knowkotlin.classes.Course

interface CourseRepository {
    fun getById(id: Int) : Course

    // Provide default method
    fun save(course: Course) : Int {
        println("save course : $course")
        return course.id
    }
}

interface Repository {
    fun getAll() : Any
}

// Implementing multiple interfaces
class SqlCourseRepository : CourseRepository, Repository {
    override fun getById(id: Int): Course {
        return Course(id, "Reactive programming in modern Java using project Reactor", "Dilip")
    }

    override fun getAll(): Any {
        return 1
    }
}

class NoSqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(id, "Reactive programming in modern Java using project Reactor", "Dilip")
    }

    // Override default implementation of interface
    override fun save(course: Course): Int {
        println("save course in NoSqlCourseRepository: $course")
        return course.id
    }
}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course1 = sqlCourseRepository.getById(10)
    println("Course is $course1")
    val savedCourseId = sqlCourseRepository.save(
        Course(
            100,
            "Reactive programming in modern Java using project Reactor",
            "Dilip"
        )
    )
    println("Saved course id is $savedCourseId")

    val noSqlCourseRepository = NoSqlCourseRepository()
    val course2 = noSqlCourseRepository.getById(10)
    println("Course is $course2")
    val savedCourseId2 = noSqlCourseRepository.save(
        Course(
            99,
            "Reactive programming in modern Java using project Reactor",
            "Dilip"
        )
    )
    println("Saved course id is $savedCourseId2")
}
