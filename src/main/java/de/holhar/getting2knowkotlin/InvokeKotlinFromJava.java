package de.holhar.getting2knowkotlin;

import de.holhar.getting2knowkotlin.classes.Course;
import de.holhar.getting2knowkotlin.classes.CourseCategory;

public class InvokeKotlinFromJava {

  public static void main(String[] args) {
    var course = new Course(1,
        "Reactive programming in modern Java using project Reactor",
        "Dilip",
        CourseCategory.DEVELOPMENT);
    System.out.println("course: " + course);
  }
}
