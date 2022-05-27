package de.holhar.getting2knowkotlin.classes

data class Employee(val id: Int, val name: String)

fun main() {
    val employee1 = Employee(1, "Holger")
    println(employee1)
    val employee2 = Employee(1, "Holger")
    println("employee1 equals employee2: ${employee1 == employee2}")
    val employee3 = employee1.copy(2)
    println("employee1 equals employee3: ${employee1 == employee3}")
}
