package hello.java.s02_oop;

import hello.java.s02_oop.model.*;

public class EncapsulationDemo {

    public static void main(String[] args) {

        System.out.println("--- Student 1 ---");
        final var student1 = new CSStudent();
        System.out.println(student1);
        student1.introduce();

        System.out.println("--- Student 2 ---");
        var student2 = new HighSchoolStudent();
        student2.introduce();
    }
}
