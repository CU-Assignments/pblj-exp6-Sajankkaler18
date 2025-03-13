import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " | Marks: " + marks;
    }
}

public class a {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 85),
            new Student("Bob", 60),
            new Student("Charlie", 92),
            new Student("David", 70)
        );

        students.stream()
                .filter(s -> s.marks > 75)          
                .sorted((s1, s2) -> s2.marks - s1.marks)  
                .forEach(System.out::println);    
    }
}
