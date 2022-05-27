package de.holhar.getting2knowkotlin.nulls

data class Movie(
    val id : Int?,
    val name : String
)

fun main() {

    // Make var nullable by adding a question mark
    var nameNullable : String? = null
    println("Value is : $nameNullable")

    nameNullable = "Holger"
    println("Value is : $nameNullable")

    // Won't compile as name is a non-nullable variable
    //var name : String = null
    var name : String = "Holger"

    // Use case where a nullable type is necessary: objects that are going to be persisted and get an id afterwards
    val movie = Movie(null, "Avengers")
    val savedMovie = saveMovie(movie)
    println("Saved movie: $savedMovie")
}

fun saveMovie(movie: Movie) : Movie {
    return movie.copy(id = 1)
}
