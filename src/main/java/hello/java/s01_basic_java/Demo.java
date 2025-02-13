package hello.java.s01_basic_java;

public class Demo {

    public static void main(String[] args) {
        System.out.println(StaticDemo.CONSTANT);
        System.out.println(StaticDemo.getCONSTANT());

        var test1 = new StaticDemo();
        System.out.println(StaticDemo.getCounter());
        var test2 = new StaticDemo();
        System.out.println(StaticDemo.getCounter());
        var test3 = new StaticDemo();
        System.out.println(StaticDemo.getCounter());
    }
}
