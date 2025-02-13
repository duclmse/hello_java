package hello.java.s04_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemo {

    public static void main(String[] args) {
        // lambdaExpressionDemo();
        System.out.println("--------------------");
        streamApiDemo();
    }

    private static void lambdaExpressionDemo() {
        System.out.println("anonymous class/object");
        testOperation(new Operation() {
            @Override
            public int operate(int a) {
                return a * 10;
            }
        });

        System.out.println("full-version of lambda expression");
        testOperation((/* int // can omit */ e) -> {
            return e * 10;
        });

        System.out.println("short-version lambda expression");
        testOperation(e -> e * 10);

        System.out.println("method reference");
        testOperation(StreamApiDemo::times10);
    }

    private static void streamApiDemo() {
        // JS
        // [1, 2, 3, 4]
        //   .map(e => e * 2) // => [2, 4, 6, 8]
        //   .filter (e => e > 5) // => [6, 8]

        var list = new ArrayList<>(List.of(1, 2, 3, 4));
        var stream = list.stream().parallel() //
                .map(e -> { // Intermediate stream operation -> returns stream
                    System.out.print("map: " + e + " * 2 = " + (e * 2) + "; ");
                    return e * 2;
                }) //
                .filter(e -> { // Intermediate stream operation -> returns stream
                    System.out.println("filter: " + e + " > 5 -> " + (e > 5));
                    return e > 5;
                });
        list.add(5);

        var list1 = stream.toList(); // Terminal operation -> returns List; stream cannot be re-used
        // stream.map(e -> e * 2); // invalid

        System.out.println("list1: " + list1);
    }

    private static void testOperation(Operation operation) {
        Stream.of(1, 2, 3, 4) //
                .map(operation::operate) // method reference
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    private static int times10(int n) {
        return n * 10;
    }

    @FunctionalInterface
    interface Operation {
        int operate(int a);

        default int operate2(int a) {
            return a * 10;
        }
    }
}
