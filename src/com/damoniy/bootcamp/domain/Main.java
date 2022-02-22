package com.damoniy.bootcamp.domain;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Course kotlinCourse = new Course("Kotlin", "Alura Course of Kotlin.", EnumCategory.IT, 50);
        Course javaCourse = new Course("Java Course", "DIO GFT Java Course", EnumCategory.IT, 30);
        Course angular = new Course("AngularJS", "Alura Course of Angular.", EnumCategory.IT, 50);
        Mentorship oopMentoring = new Mentorship("Object Oriented Programming Mentorship", "OOP Mentoring by experts.");
        User damoniy = new User("Damoniy");

        Bootcamp bootcampJava = new Bootcamp("Bootcamp GFT QA", "Bootcamp de Quality Assurance da GFT");
        bootcampJava.addContent(javaCourse);
        bootcampJava.addContent(oopMentoring);
        bootcampJava.subscribeUser(damoniy);

        damoniy.goBeyond();
        System.out.println(damoniy.getUserProfileExp());
    }
}
