
package Coding_Questions;

public class First {

    
    public static void solveBothWays(int number) {
        
        int normal = number;
        normal = normal + 8;
        normal = normal / 3;
        normal = normal % 5;
        normal = normal * 5;
        System.out.println("Result using normal operators: " + normal);

      
        int assignment = number;
        assignment += 8;
        assignment /= 3;
        assignment %= 5;
        assignment *= 5;
        System.out.println("Result using assignment operators: " + assignment);
    }

    public static void main(String[] args) {
        solveBothWays(2345);
    }

}
