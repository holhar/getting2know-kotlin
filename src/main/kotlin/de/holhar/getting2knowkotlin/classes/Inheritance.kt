package de.holhar.getting2knowkotlin.classes

// Allow this class to be extendable by adding the 'open' keyword
open class User(val name : String) {

    // Make variable overridable by adding the 'open' keyword
    open var isLoggedIn : Boolean = false

    // Make function overridable by adding the 'open' keyword
    open fun login() {
        println("Inside user login")
    }

    private fun secret() {
        println("user secret function")
    }

    protected open fun logout() {
        println("user logout function")
    }
}

// Student class is extending User class
class Student(name: String) : User(name) {

    // Override isLoggedIn variable by adding 'override' keyword
    override var isLoggedIn : Boolean = false

    // Companion object can be used to introduce static functionalities that are tied to the class
    companion object {

        const val noOfEnrolledCourses = 10

        fun country() = "Germany"
    }

    // Override login function by adding 'override' keyword
    override fun login() {
        println("Inside student login")
        // Call login() function from super class
        super.login()
    }

    // Override protected method and make it public!
    public override fun logout() {
        println("student logout function")
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Alex")
    println("Name is: ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Student isLoggedIn: ${student.isLoggedIn}")

    println("Country is ${Student.country()}")
    println("noOfEnrolledCourses is ${Student.noOfEnrolledCourses}")

    val instructor = Instructor("Dilip")
    println("Name is: ${instructor.name}")
    instructor.login()

    val user = User("Holger")
    // Private/protected function not accessible
    //user.secret()
    //user.logout()

    // In student logout function is available
    student.logout()
}
