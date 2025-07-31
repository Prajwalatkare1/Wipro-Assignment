package Coding_Questions;

class LowSalException extends Exception {
    public LowSalException(String message) {
        super(message);
    }
}

public class Q33 {
    private int empId;
    private String empName;
    private String designation;
    private double basic;
    private final double hra; 

    public Q33(int empId, String empName, String designation, double basic) throws LowSalException {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        if (basic < 50000) {
            throw new LowSalException("Basic salary cannot be less than 50000.");
        }
        this.basic = basic;
        this.hra = calculateHRA();
    }  // <-- Added this closing brace

    private double calculateHRA() {
        switch (designation) {
            case "Manager":
                return basic * 0.10;
            case "TeamLeader":
                return basic * 0.12;
            case "HR":
                return basic * 0.05;
            default:
                return 0.0;
        }
    }

    public void printDET() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: ₹" + basic);
        System.out.println("HRA: ₹" + hra);
    }

    public static void main(String[] args) {
        try {
            Q33 e1 = new Q33(101, "Prajwal", "Manager", 60000);
            e1.printDET();
            System.out.println();

            Q33 e2 = new Q33(102, "Sneha", "HR", 48000);  // This will throw exception
            e2.printDET();
        } catch (LowSalException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
