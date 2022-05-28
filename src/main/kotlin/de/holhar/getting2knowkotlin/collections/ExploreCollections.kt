package de.holhar.getting2knowkotlin.collections

fun main() {

    // LIST
    val names = listOf("Alex", "Ben", "Chloe")
    println("Names: $names")

    val namesMutableList = mutableListOf("Alex", "Ben", "Chloe")
    println("namesMutableList: $namesMutableList")
    namesMutableList.add("Adam")
    println("namesMutableList: $namesMutableList")

    // SET
    val set = setOf("Alex", "Ben", "Chloe")
    println("Set: $set")

    val mutableSet = mutableSetOf("Alex", "Ben", "Chloe")
    println("mutableSet: $mutableSet")
    mutableSet.add("Adam")
    println("mutableSet: $mutableSet")

    // MAP
    val nameAgeMap = mapOf("Holger" to 36, "Scooby" to 4)
    println("nameAgeMap: $nameAgeMap")

    val nameAgeMutableMap = mutableMapOf("Holger" to 36, "Scooby" to 4)
    println("nameAgeMutableMap: $nameAgeMutableMap")
    nameAgeMutableMap["Tom"] = 50
    println("nameAgeMutableMap: $nameAgeMutableMap")
}
