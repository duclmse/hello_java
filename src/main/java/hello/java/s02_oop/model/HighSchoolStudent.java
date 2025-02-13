package hello.java.s02_oop.model;

public class HighSchoolStudent extends Student {

     public HighSchoolStudent(int id, String name) {
        super(id, name);
    }

    @Override // runtime polymorphism
    public void introduce() {
        System.out.println("My name is " + name + ". I am high school Student");
    }
}
