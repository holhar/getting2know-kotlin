package de.holhar.getting2knowkotlin.lambdas

// HIGHER ORDER FUNCTION (a function that accepts another function)
// Third argument is a function that matches the specified signature
fun calculate(x: Int, y: Int, op: (x: Int, y: Int) -> Int) : Int {
    return op(x,y)
}

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

    // HIGHER ORDER FUNCTION application - the function is passed as third argument
    //val result = calculate(2, 3, { a, b -> a * b })
    val result = calculate(2, 3) { a, b -> a * b }
    println("Result: $result")
}
