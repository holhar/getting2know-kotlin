package de.holhar.getting2knowkotlin;

import de.holhar.getting2knowkotlin.classes.Authenticate;
import de.holhar.getting2knowkotlin.classes.Course;
import de.holhar.getting2knowkotlin.classes.CourseCategory;
import de.holhar.getting2knowkotlin.classes.CourseUtils;

public class InvokeKotlinFromJava {

  public static void main(String[] args) {
    var course = new Course(1,
        "Reactive programming in modern Java using project Reactor",
        "Dilip"
        //CourseCategory.DEVELOPMENT
    );
    System.out.println("course: " + course);

    course.noOfCourses = 11;
    System.out.println("noOfCourses: " + course.noOfCourses);

    CourseUtils.printNameWithFallback();
    CourseUtils.printNameWithFallback("abc");

    Course.Companion.printName("abc");
    Course.printName("abc");

    Authenticate.INSTANCE.authenticate("Holger", "123456");
    Authenticate.authenticate("Holger", "123456");
  }
}
