package de.holhar.getting2knowkotlin.basics

fun main() {

    // RANGE
    val range = 1..10
    for (i in range) {
        println("i: $i")
    }

    // Create reverse range
    val reverseRange = 10 downTo 1
    for (i in reverseRange) {
        println("reverseRange: $i")
    }

    // Skip values in loop
    for (i in reverseRange step 2) {
        println("reverseRange with step: $i")
    }

    // WHILE
    exploreWhile()
    exploreDoWhile()
}

fun exploreWhile() {
    var x = 1
    while (x < 5) {
        println("Value of x is: $x")
        x++
    }
}

fun exploreDoWhile() {
    var i = 0
    do {
        println("Value of i is: $i")
        i++
    } while (i < 5)
}
