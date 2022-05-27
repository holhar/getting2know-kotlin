package de.holhar.getting2knowkotlin.nulls

data class Movie(
    val id : Int?,
    val name : String
)

fun main() {
    // Make var nullable by adding a question mark
    var nameNullable : String? = null
    println("Value is : ${nameNullable?.length}") // '?' SAFE OPERATOR

    //nameNullable = "Holger"
    val length = nameNullable?.length ?: 0 // '?:' ELVIS OPERATOR (provide fallback in case of null)
    println("length: $length")

    // Won't compile as name is a non-nullable variable
    //var name : String = null
    var name : String = "Holger"

    // Use case where a nullable type is necessary: id is null when movie is initialized; objects that are going to be persisted and get an id afterwards
    val movie = Movie(null, "Avengers")
    val savedMovie = saveMovie(movie)
    println(savedMovie.id!!) // '!!' NON-NULL ASSERTION
    println("Saved movie: $savedMovie")
}

fun saveMovie(movie: Movie) : Movie {
    return movie.copy(id = 1)
}
