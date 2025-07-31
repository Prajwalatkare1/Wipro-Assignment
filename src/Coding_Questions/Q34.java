package Coding_Questions;

public class Q34 {
    private String employeeID; 
    private String name;
    private int yearOfBirth;

    public Q34(String employeeID, String name, int yearOfBirth) throws IllegalArgumentException {
        if (!isValidEmployeeID(employeeID)) {
            throw new IllegalArgumentException("Invalid Employee ID format. Required format: yy-D-nnn (e.g., 81-F-112)");
        }
        this.employeeID = employeeID;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    private boolean isValidEmployeeID(String id) {
        return id.matches("\\d{2}-[FS]-\\d{3}");
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void printDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Year of Birth: " + yearOfBirth);
    }

    public static void main(String[] args) {
        try {
            Q34 e1 = new Q34("81-F-112", "Alice", 1981);
            e1.printDetails();
            System.out.println();

            Q34 e2 = new Q34("79-S-254", "Bob", 1979);
            e2.printDetails();
            System.out.println();

         
            Q34 e3 = new Q34("1981-F-254", "Charlie", 1981);
            e3.printDetails();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
