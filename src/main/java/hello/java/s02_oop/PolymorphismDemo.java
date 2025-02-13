package hello.java.s02_oop;

import hello.java.s02_oop.model.CSStudent;
import hello.java.s02_oop.model.HighSchoolStudent;

public class PolymorphismDemo {

    public static void main(String[] args) {
        var csStudent = new CSStudent(1, "a");
        var highSchoolStudent = new HighSchoolStudent(2, "b");

        // both csStudent and highSchoolStudent has its own implementation of inherited introduce method
        // so each method has different behavior, hence the name Polymorphism
        csStudent.introduce("my friend");
        highSchoolStudent.introduce("my friend");

    }
}
