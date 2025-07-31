package Coding_Questions;

import java.io.*;
import java.util.Scanner;

class MY_Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private int emp_id;
    private String emp_name;
    private transient double emp_sal; // Excluded from serialization

    public MY_Employee(int emp_id, String emp_name, double emp_sal) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_sal = emp_sal;
    }

    public void display() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Salary: " + emp_sal); // Will show 0.0 after deserialization
    }
}

public class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        MY_Employee emp = new MY_Employee(id, name, salary);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            out.writeObject(emp);
            System.out.println("\nEmployee object serialized.");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            MY_Employee deserializedEmp = (MY_Employee) in.readObject();
            System.out.println("\nDeserialized Employee details:");
            deserializedEmp.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }

        sc.close();
    }
}
