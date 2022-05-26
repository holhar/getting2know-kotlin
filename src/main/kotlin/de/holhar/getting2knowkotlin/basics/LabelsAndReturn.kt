package de.holhar.getting2knowkotlin.basics

fun main() {

    // Using break
    for (i in 1..5) {
        println("i in break $i")
        if (i == 3) break
    }

    // Labels
    label()

    // Return
    for (i in 1..5) {
        println("i in return $i")
        if (i == 3) return
    }

    println("End of the program!")
}

fun label() {

    loop@ for (i in 1..5) {
        println("i in label $i")
        //if (i == 3) break@loop
        innerLoop@ for (j in 1..5) {
            println("j in label $j")
            //if (j == 2) break@innerLoop
            if (j == 2) continue@loop
        }
    }
}
