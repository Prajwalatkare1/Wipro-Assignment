package Coding_Questions;
import java.util.Scanner;


class InvalidEmployeeCode extends Exception {
    public InvalidEmployeeCode(String message) {
        super(message);
    }
}


class Employee {
    private String employeeCode;
    private String name;
    private int age;

    public Employee(String employeeCode, String name, int age) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Employee Details:");
        System.out.println("Code: " + employeeCode);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Q35 {

   
    public static void validateEmployeeCode(String code) throws InvalidEmployeeCode {
      
        if (!code.matches("\\d{2}-[A-Z]-\\d{3}")) {
            throw new InvalidEmployeeCode("Invalid Employee Code: " + code);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter employee code (format yy-D-nnn): ");
            String code = sc.nextLine();

          
            validateEmployeeCode(code);

            System.out.print("Enter employee name: ");
            String name = sc.nextLine();

            System.out.print("Enter employee age: ");
            int age = sc.nextInt();

            Employee emp = new Employee(code, name, age);

            emp.display();

        } catch (InvalidEmployeeCode e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        } finally {
            sc.close();
        }
    }
}
