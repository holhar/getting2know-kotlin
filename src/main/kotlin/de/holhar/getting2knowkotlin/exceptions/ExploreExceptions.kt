package de.holhar.getting2knowkotlin.exceptions

import java.lang.Exception
import java.lang.RuntimeException

fun main() {
    println("Name length is ${nameLength("Holger")}")
    println("Name length is ${nameLength(null)}")

    returnNothing()
}

fun nameLength(name: String?) : Int? {
    // try-block can be used as expression
    val result = try {
        name!!.length
    } catch (ex: Exception) {
        println("Exception is $ex")
        null
    }
    return result
}

// Nothing type will be returned...
fun returnNothing() : Nothing {
    throw RuntimeException("Exception")
}
