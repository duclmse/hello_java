package hello.java.s02_oop.model;

public class AccessModifierDemo {

    public static void main(String[] args) {
        var student = new HighSchoolStudent(1, "A");
        System.out.println(student.name);  // Can access to (protected) name in this package
        student.name = "Minh"; // both getting and setting value
        System.out.println(student.name);
    }
}
