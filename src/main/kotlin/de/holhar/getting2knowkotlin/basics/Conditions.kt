package de.holhar.getting2knowkotlin.basics

fun main() {

    // IF/ELSE
    var name = "Alex"
    name = "Chloe"
    // if-else block is an expression and has a return type
    val result = if (name.length == 4) {
        println("name is four characters")
        name.length
    } else {
        println("name is not four characters")
        name.length
    }
    println("result: $result")

    // WHEN
    // 1 -> GOLD, 2 -> SILVER, 3 -> BRONZE
    val position = 1
    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }
    println(medal)
}
