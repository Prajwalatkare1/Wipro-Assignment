package Coding_Questions;

import java.util.Optional;

class MissingFieldException extends Exception {
    public MissingFieldException(String message) {
        super(message);
    }
}

class EmployeeRecordsrd {
    private int id;
    private String name;
    private Optional<String> email;
    private Optional<String> department;

    public EmployeeRecordsrd(Integer id, String name, String email, String department) throws MissingFieldException {
        if (id == null) throw new MissingFieldException("Employee id is required");
        if (name == null || name.isEmpty()) throw new MissingFieldException("Employee name is required");

        this.id = id;
        this.name = name;
        this.email = Optional.ofNullable(email);
        this.department = Optional.ofNullable(department);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email.orElse("Email not provided");
    }

    public String getDepartment() {
        return department.orElse("Department not assigned");
    }
}

public class Q49 {
    public static void main(String[] args) {
        try {
            EmployeeRecordsrd emp1 = new EmployeeRecordsrd(1, "Alice", "alice@example.com", null);
            EmployeeRecordsrd emp2 = new EmployeeRecordsrd(2, "Bob", null, "Sales");
            EmployeeRecordsrd emp3 = new EmployeeRecordsrd(3, "Charlie", null, null);

            System.out.println(emp1.getName() + ", Email: " + emp1.getEmail() + ", Dept: " + emp1.getDepartment());
            System.out.println(emp2.getName() + ", Email: " + emp2.getEmail() + ", Dept: " + emp2.getDepartment());
            System.out.println(emp3.getName() + ", Email: " + emp3.getEmail() + ", Dept: " + emp3.getDepartment());

        } catch (MissingFieldException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
