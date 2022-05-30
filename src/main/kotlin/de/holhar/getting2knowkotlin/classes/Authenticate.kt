package de.holhar.getting2knowkotlin.classes

// 'object' keyword allows us to create a class and an instance of the class at the same time
// Equivalent to a singleton pattern in Java
object Authenticate {

    @JvmStatic
    fun authenticate(userName: String, password: String) {
        println("User ${userName} authenticated")
    }
}

fun main() {
    Authenticate.authenticate("Holger", "123456")
}
