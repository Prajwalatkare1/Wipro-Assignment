package springJDBC.spring6.model;

public class Personal {
    private int id;
    private int age;
    private String firstName;
    private String lastName;

 
    
    // Constructors
    public Personal() {}
    public Personal(int id, int age, String firstName, String lastName) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters & Setters
    // toString()
    @Override
    public String toString() {
        return "Person{id=" + id + ", age=" + age + ", firstName='" + firstName + "', lastName='" + lastName + "'}";
    }

//    
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.println("==================================");
//    System.out.println("    AUTOWIRED ANNOTATION DEMO    ");
//    System.out.println("==================================");
//    System.out.println("Options:");
//    System.out.println("1. Attired");
//    System.out.println("2. Attired with Qualifier");
//    System.out.print("Select option: ");
//    Dint option = scanner.nextInt();
//    
    
    
    
    
    // getters and setters here...
}

