package de.holhar.getting2knowkotlin.lambdas

fun main() {

    // The type is necessary; type inference is not available here
    val addLambda = { x : Int -> x + x}
    val addResult = addLambda(3)
    println("addResult: $addResult")

    // Defining multi-line lambdas
    val multiplyLambda = { x: Int, y: Int ->
        println("x is $x and y is $y")
        x * y
    }
    val multiplyResult = multiplyLambda(4, 5)
    println("multiplyResult: $multiplyResult")
}
