package de.holhar.getting2knowkotlin.interfaces

import de.holhar.getting2knowkotlin.classes.Course

interface CourseRepository {

    var isCoursePersisted : Boolean

    fun getById(id: Int) : Course

    // Provide default method
    fun save(course: Course) : Int {
        isCoursePersisted = true
        println("save course : $course")
        return course.id
    }
}

interface Repository {
    fun getAll() : Any
}

// Implementing multiple interfaces
class SqlCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Reactive programming in modern Java using project Reactor", "Dilip")
    }

    override fun getAll(): Any {
        return 1
    }
}

class NoSqlCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Reactive programming in modern Java using project Reactor", "Dilip")
    }

    // Override default implementation of interface
    override fun save(course: Course): Int {
        isCoursePersisted = true
        println("save course in NoSqlCourseRepository: $course")
        return course.id
    }
}

interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething in B")
    }
}

class AB : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in AB")
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
    println("Course is persisted: ${sqlCourseRepository.isCoursePersisted}")
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
    println("Course is persisted: ${noSqlCourseRepository.isCoursePersisted}")
    println("Saved course id is $savedCourseId2")

    val ab = AB()
    ab.doSomething()
}
