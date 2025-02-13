package hello.java.s02_oop;

import hello.java.s02_oop.model.Student;

public class AbstractionDemo {
    public static void main(String[] args) {
        var student = new Student() { // anonymous subclass
            @Override
            public void introduce() {
                System.out.println("I don't want to introduce myself");
            }
        };
    }
}
