package de.holhar.getting2knowkotlin.classes

import java.lang.IllegalArgumentException

class Item() {

    var name : String = ""
    var price : Double = 0.0

    get() {
        println("Inside getter")
        return field
    }
    set(value) {
        println("Inside setter")
        if (value >= 0.0) {
            field = value
        } else {
            throw IllegalArgumentException("Negative price is not allowed!")
        }
    }

    // Secondary constructor (this() invokes primary constructor that does not take any params here)
    constructor(_name: String): this() {
        name = _name
    }
}

fun main() {
    val item = Item("iPhone")
    println("Item name: ${item.name}")
    item.name = "Samsung Galaxy S22"
    println("Item name: ${item.name}")

    item.price = 10.0
    println(item.price)
    item.price = -10.0
}
