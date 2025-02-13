package hello.java.s01_basic_java;

import lombok.Getter;

public class StaticDemo {

    @Getter
    public static String CONSTANT = "Hello World!";
    @Getter
    private static int counter = 0;

    private final String name;

    static {
        System.out.println("static block");
    }

    public StaticDemo() {
        this.name = "Anonymous";
        counter++;
    }

    public StaticDemo(String name) {
        this.name = name;
        counter++;
    }

    @Override
    public String toString() {
        return "My name is " + name + ", my instance id is " + counter;
    }
}
