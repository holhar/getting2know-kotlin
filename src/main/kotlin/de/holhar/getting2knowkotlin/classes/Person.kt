package de.holhar.getting2knowkotlin.classes

// Primary constructor
class Person(
            val name : String = "",
            val age: Int = 0
        ) {

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
}
