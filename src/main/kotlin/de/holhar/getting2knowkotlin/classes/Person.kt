package de.holhar.getting2knowkotlin.classes

class Person {

    fun action() {
        println("Person walks")
    }
}

fun main() {
    // No need to use the 'new' keyword for class instantiation
    val person = Person()
    person.action()
}
