package hello.java.s02_oop.model;

public class CSStudent extends Student {

    public CSStudent(int id, String name) {
        super(id, name);
    } //concrete class

    @Override // runtime polymorphism
    public void introduce() {
        System.out.println("I am CS Student");
    }
}
