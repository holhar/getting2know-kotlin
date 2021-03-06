package de.holhar.getting2knowkotlin.collections

import de.holhar.getting2knowkotlin.dataset.Course
import de.holhar.getting2knowkotlin.dataset.CourseCategory
import de.holhar.getting2knowkotlin.dataset.KAFKA
import de.holhar.getting2knowkotlin.dataset.courseList

fun main() {
    val courseList = courseList()

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPMENT }
    val designPredicate = { c: Course -> c.category == CourseCategory.DESIGN }

    exploreFilter(courseList, devPredicate)

    exploreMap(courseList, designPredicate)

    exploreFlatMap(courseList, KAFKA)

    exploreHashMap()

    collectionsNullability()
}

fun exploreFilter(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {
    // 'it' is a dedicated keyword representing the iterated element for each loop
    courseList
        .filter { predicate.invoke(it) }
        .forEach { println("course: $it") }
}

fun exploreMap(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {
    courseList
        .filter { predicate.invoke(it) }
        .map { "${it.name} - ${it.category}" }
        .forEach { println(it) }
}

private fun exploreFlatMap(courseList: MutableList<Course>, kafka: String) {
    val listOfList = listOf(listOf(1, 2, 3), listOf(4, 5, 6))

    val mapResult = listOfList.map { outerList ->
        outerList.map {
            it.toDouble()
        }
    }
    println("mapResult: $mapResult")

    val flatMapResult = listOfList.flatMap { outerList ->
        outerList.map {
            it.toDouble()
        }
    }
    println("flatMapResult: $flatMapResult")

    val kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter {
            it == kafka
        }.map {
            courseName
        }
    }
    println("Kafka courses: $kafkaCourses")
}

fun exploreHashMap() {

    val nameAgeMutableMap = mutableMapOf("Holger" to 36, "Scooby" to 5, "Tom" to 50)
    nameAgeMutableMap.forEach { (k, v) ->
        println("Key: $k, value: $v")
    }

    //val value = nameAgeMutableMap.get("Holger")
    //val value = nameAgeMutableMap["Holger"]
    val value = nameAgeMutableMap.getOrElse("Holger1") { "abc" }
    println("Value is $value")

    val result = nameAgeMutableMap.containsKey("abc")
    println("Result is $result")

    val filteredMap = nameAgeMutableMap
        .filterKeys { it.length > 5 }
        .map { it.key.uppercase() }
    println("filteredMap is $filteredMap")

    val maxAge = nameAgeMutableMap
        .maxByOrNull { it.value }
    println("Max age has $maxAge")
}

fun collectionsNullability() {

    // Specify a nullable list
    var list1 : MutableList<String>? = null

    list1 = mutableListOf()
    list1.add("Holger")
    list1.forEach {
        println("Value is $it")
    }

    // Specify nullable elements
    val list2 : List<String?> = listOf("Adam", null, "Alex")
    list2.forEach {
        // Add safe operator
        println("Value is ${it?.length}")
    }
}
