import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Display Employee details
    public String toString() {
        return name + " | Age: " + age + " | Salary: " + salary;
    }
}

public class c {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 55000));
        employees.add(new Employee("Bob", 25, 60000));
        employees.add(new Employee("Charlie", 28, 52000));

        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));

        System.out.println("Sorted Employees by Salary:");
        employees.forEach(System.out::println);
    }
}
