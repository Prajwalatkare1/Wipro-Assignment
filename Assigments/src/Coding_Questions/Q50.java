
package Coding_Questions;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class dd {
    int id;
    String name;
    String department;
    double salary;

    public dd(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + department + ", " + salary + ")";
    }
}

public class Q50 {

    public static void main(String[] args) {
        List<dd> employees = Arrays.asList(
            new dd(101, "Ravi", "HR", 50000),
            new dd(102, "Priya", "IT", 60000),
            new dd(103, "Arun", "HR", 55000),
            new dd(104, "Kavya", "IT", 70000),
            new dd(105, "Divya", "Sales", 45000)
        );

        // Q1: Print all employee names
        System.out.println("Q1: Employee Names:");
        employees.stream()
                .map(dd::getName)
                .forEach(System.out::println);

        // Q2: Filter employees with salary > 55000
        System.out.println("\nQ2: Employees with salary > 55000:");
        employees.stream()
                .filter(e -> e.getSalary() > 55000)
                .forEach(System.out::println);

        // Q3: Count employees in HR department
        long hrCount = employees.stream()
                .filter(e -> "HR".equalsIgnoreCase(e.getDepartment()))
                .count();
        System.out.println("\nQ3: Number of employees in HR: " + hrCount);

        // Q4: Sort employees by salary descending
        System.out.println("\nQ4: Employees sorted by salary descending:");
        employees.stream()
                .sorted(Comparator.comparingDouble(dd::getSalary).reversed())
                .forEach(System.out::println);

        // Q5: Highest paid employee (max)
        employees.stream()
                .max(Comparator.comparingDouble(dd::getSalary))
                .ifPresent(e -> System.out.println("\nQ5: Highest paid employee: " + e));

        // Q6: Average salary of all employees
        double avgSalary = employees.stream()
                .mapToDouble(dd::getSalary)
                .average()
                .orElse(0);
        System.out.println("\nQ6: Average salary: " + avgSalary);

        // Q7: Collect all names into a List
        List<String> allNames = employees.stream()
                .map(dd::getName)
                .collect(toList());
        System.out.println("\nQ7: All employee names: " + allNames);

        // Q8: Group employees by department
        Map<String, List<dd>> groupedByDept = employees.stream()
                .collect(groupingBy(dd::getDepartment));
        System.out.println("\nQ8: Employees grouped by department:");
        groupedByDept.forEach((dept, emps) -> System.out.println(dept + ": " + emps));

        // Q9: Total salary per department
        Map<String, Double> totalSalaryPerDept = employees.stream()
                .collect(groupingBy(dd::getDepartment, summingDouble(dd::getSalary)));
        System.out.println("\nQ9: Total salary per department: " + totalSalaryPerDept);

        // Q10: Names of employees in IT sorted by salary
        List<String> itSortedNames = employees.stream()
                .filter(e -> "IT".equalsIgnoreCase(e.getDepartment()))
                .sorted(Comparator.comparingDouble(dd::getSalary))
                .map(dd::getName)
                .collect(toList());
        System.out.println("\nQ10: IT employees sorted by salary: " + itSortedNames);

        // Q11: Check if any employee earns less than 40000
        boolean anyLessThan40k = employees.stream()
                .anyMatch(e -> e.getSalary() < 40000);
        System.out.println("\nQ11: Any employee earns less than 40000? " + anyLessThan40k);

        // Q12: Comma-separated string of all employee names
        String commaSeparatedNames = employees.stream()
                .map(dd::getName)
                .collect(joining(", "));
        System.out.println("\nQ12: Comma-separated names: " + commaSeparatedNames);

        // Q13: List top 2 highest earning employees
        List<dd> top2Earners = employees.stream()
                .sorted(Comparator.comparingDouble(dd::getSalary).reversed())
                .limit(2)
                .collect(toList());
        System.out.println("\nQ13: Top 2 highest earning employees: " + top2Earners);

        // Q14: Skip first 2 employees and print the rest
        System.out.println("\nQ14: Skip first 2 employees:");
        employees.stream()
                .skip(2)
                .forEach(System.out::println);

        // Q15: Limit to first 3 employees and print their names
        System.out.println("\nQ15: First 3 employee names:");
        employees.stream()
                .limit(3)
                .map(dd::getName)
                .forEach(System.out::println);

        // Q16: Employee with minimum salary in HR
        employees.stream()
                .filter(e -> "HR".equalsIgnoreCase(e.getDepartment()))
                .min(Comparator.comparingDouble(dd::getSalary))
                .ifPresent(e -> System.out.println("\nQ16: Min salary in HR: " + e));

        // Q17: Partition employees into salary > 55000 and <= 55000
        Map<Boolean, List<dd>> partitioned = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 55000));
        System.out.println("\nQ17: Partition by salary > 55000:");
        partitioned.forEach((k,v) -> System.out.println(k + ": " + v));

        // Q18: Map<Department, AverageSalary>
        Map<String, Double> avgSalaryPerDept = employees.stream()
                .collect(groupingBy(dd::getDepartment, averagingDouble(dd::getSalary)));
        System.out.println("\nQ18: Average salary per department: " + avgSalaryPerDept);

        // Q19: Sort employees by name then salary
        System.out.println("\nQ19: Employees sorted by name then salary:");
        employees.stream()
                .sorted(Comparator.comparing(dd::getName).thenComparing(dd::getSalary))
                .forEach(System.out::println);

        // Q20: Convert List<dd> to Map<Id, Name>
        Map<Integer, String> idNameMap = employees.stream()
                .collect(toMap(dd::getId, dd::getName));
        System.out.println("\nQ20: Map<Id, Name>: " + idNameMap);

        // Challenge 1: Employees whose name starts with "D" and ends with "a"
        List<dd> challenge1 = employees.stream()
                .filter(e -> e.getName().startsWith("D") && e.getName().endsWith("a"))
                .collect(toList());
        System.out.println("\nChallenge 1: Names start with D and end with a: " + challenge1);

        // Challenge 2: Departments with more than 1 employee
        List<String> challenge2 = employees.stream()
                .collect(groupingBy(dd::getDepartment, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(toList());
        System.out.println("\nChallenge 2: Departments with more than 1 employee: " + challenge2);

        // Challenge 3: Second highest salary using streams
        employees.stream()
                .map(dd::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(s -> System.out.println("\nChallenge 3: Second highest salary: " + s));
    }
}
