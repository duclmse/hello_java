package hello.java.s04_collections;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        // Creating a List of Strings using ArrayList
        List<String> li = new ArrayList<>();

        // Adding elements in List
        li.add("Java");
        li.add("Python");
        li.add("Python");
        li.add("DSA");
        li.add("C++");
        // li.add(null);

        System.out.println("Elements of List are:");

        // Iterating through the list
        // Iterator
        for (String s : li) { // enhanced for loop -> for classes implement Iterator interface
            System.out.println(s);
        }
        // for (var i = 0; i < li.size(); i++) {
        //     System.out.println(li.get(i));
        // }
        // li.forEach(e -> System.out.println(e));
        // li.forEach(System.out::println);

        // Accessing elements
        System.out.println("Element at Index 1: "+ li.get(1));

        // Updating elements
        li.set(1, "JavaScript");
        System.out.println("Updated List: " + li);

        // Removing elements
        li.removeIf(e -> e.length() > 3);
        System.out.println("List After Removing Element: " + li);
    }
}
