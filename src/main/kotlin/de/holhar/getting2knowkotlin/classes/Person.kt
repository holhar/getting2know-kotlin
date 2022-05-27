package de.holhar.getting2knowkotlin.classes

// Primary constructor - USE WHENEVER POSSIBLE
class Person(
            val name : String = "",
            val age: Int = 0
        ) {

    var email : String = ""

    // Secondary constructor - TRY TO AVOID THESE
    constructor(
                _email: String,
                _name: String = "",
                _age: Int = 0
            ) : this(_name, _age) {
        email = _email
    }

    fun action() {
        println("Person walks")
    }
}

fun main() {
    // No need to use the 'new' keyword for class instantiation
    val person = Person("Alex", 25)
    person.action()
    println("Name: ${person.name}; age: ${person.age}")

    // Params not needed because of defined default values in primary constructor
    val person2 = Person()
    println("Name: ${person2.name}; age: ${person2.age}")

    // Use named argument concept to target the secondary constructor
    val person3 = Person(_email = "abc@gmail.com", "Alex", 25)
    println("Name: ${person3.name}; age: ${person3.age}; email: ${person3.email}")
}
