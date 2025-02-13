package hello.java.s02_oop.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Student { //abstract class

    private int id;
    protected String name;
    public int age;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void introduce();

    // overload => compile-time polymorphism
    public void introduce(String other) {
        System.out.println("Hello " + other + ". I am a student");
    }

    public String toString() {
        return "name=" + this.name;
    }
}
