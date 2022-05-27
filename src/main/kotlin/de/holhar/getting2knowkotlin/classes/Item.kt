package de.holhar.getting2knowkotlin.classes

class Item() {

    var name : String = ""

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
}
