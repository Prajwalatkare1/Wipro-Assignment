package Coding_Questions;

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

class EmployeeRecord {  // Changed class name here
    private int id;
    private String name;
    private double salary;

    public EmployeeRecord(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

class EmployeeService {
    public void validateSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative.");
        }
    }

    public void processSalary(EmployeeRecord emp) throws InvalidSalaryException {
        validateSalary(emp.getSalary());
        System.out.println("Processing salary for: " + emp.getName());
    }

    public void startProcess(EmployeeRecord emp) throws InvalidSalaryException {
        processSalary(emp);
    }
}

public class Q47 {
    public static void main(String[] args) {
        EmployeeRecord emp = new EmployeeRecord(1, "Vishwas", -50000);
        EmployeeService service = new EmployeeService();

        try {
            service.startProcess(emp);
        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }

        EmployeeRecord emp2 = new EmployeeRecord(2, "Neha", 75000);
        try {
            service.startProcess(emp2);
        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
