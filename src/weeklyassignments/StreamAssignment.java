package weeklyassignments;

import java.util.*;

class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + department + " - " + salary;
    }
}

public class StreamAssignment {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", "IT", 60000),
                new Employee("Priya", "HR", 45000),
                new Employee("Amit", "IT", 75000),
                new Employee("Neha", "Finance", 55000),
                new Employee("Karan", "IT", 60000),
                new Employee("Simran", "HR", 50000),
                new Employee("Rohit", "Finance", 75000),
                new Employee("Ankit", "IT", 40000)
        );

        System.out.println("\n--- All employees whose salary is greater than 50,000 ---");
        employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .forEach(e -> System.out.println(e.getName()));

        System.out.println("\n--- All employees working in the IT department ---");
        employees.stream()
                .filter(e -> "IT".equals(e.getDepartment()))
                .map(Employee::getName)
                .forEach(System.out::println);

        System.out.println("\n--- All employees by salary in ascending order ---");
        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));

        
        System.out.println("\n--- All employee salaries, Unique salaries ---");
        employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\n--- Employees whose salary is greater than or equal to 50,000 in alphabetical order ---");
        employees.stream()
                .filter(e -> e.getSalary() >= 50000)
                .map(Employee::getDepartment)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}