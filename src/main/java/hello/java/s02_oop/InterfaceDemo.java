package hello.java.s02_oop;

public class InterfaceDemo {
    public static void main(String[] args) {
        Flyable flyable = new Bird();
        flyable.fly();
        // ((Movable) flyable).move(); // bird doesn't implement Movable interface
        // Flyable.flyWithoutWings();
        flyable.doSomething();
    }
}

interface Flyable {
    void fly();

    static void flyWithoutWings() {
        System.out.println("I drop");
    }

    default // indicates that we wll provide default behavior for this method
    void drop() // method signature
    {
        System.out.println("I drop");
    }

    default void live() {
        System.out.println("I can live with flyable ability");
    }

    default void doSomething() {
        System.out.println("I can do something with flyable ability");
    }
}

interface Speakable {
    void speak();

    default void live() {
        System.out.println("I can live with speakable ability");
    }

    default void doSomething() {
        System.out.println("I can do something with speakable ability");
    }
}

interface Movable {
    void move();
}

class Bird implements Flyable, Speakable {
    public void fly() {
        System.out.println("Bird fly");
    }

    @Override
    public void live() {
        System.out.println("I can live with flyable and speakable ability");
    }

    // @Override
    public void doSomething() {
        System.out.println("I can do something with flyable and speakable ability");
        // Flyable.super.doSomething();
        // Speakable.super.doSomething();
    }

    @Override
    public void speak() {
        System.out.println("Bird speak");
    }
}