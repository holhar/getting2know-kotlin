package de.holhar.getting2knowkotlin.classes

// Allow this class to be extendable by adding the 'open' keyword
open class User(val name : String) {

    fun login() {
        println("Inside user login")
    }
}

// Student class is extending User class
class Student(name: String) : User(name)

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Alex")
    println("Name is: ${student.name}")
    student.login()

    val instructor = Instructor("Dilip")
    println("Name is: ${instructor.name}")
    instructor.login()
}
