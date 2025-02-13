package hello.java.s04_collections;

import lombok.*;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("a");
        set.add("d");
        // set.add(null);
        System.out.println("set = " + set.size());
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("--------");
        set.retainAll(List.of("a", "b", "c"));
        set.forEach(System.out::println);

        System.out.println("--------");
        var student1 = new Student(1, "ABC");
        var student3 = new Student(2, "DEF");
        var student2 = new Student(3, "GHI");
        var student4 = new Student(2, "HI");
        var studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        System.out.println("studentSet = " + studentSet.size());
        studentSet.forEach(System.out::println);
        System.out.println("--------");
        var removed = studentSet.remove(student4);
        System.out.println(removed);
        studentSet.forEach(System.out::println);

    }
}

@Getter
@Setter
@ToString
@AllArgsConstructor
class Student {
    private int id;
    private String name;

    public int hashCode() {
        return id + name.length();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }
        Student s = (Student) obj;
        return id + name.length() == s.id +name.length();
    }
}
