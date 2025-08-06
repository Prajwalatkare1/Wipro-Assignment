package Coding_Questions;

import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter number of classes held: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter number of classes attended: ");
        int attendedClasses = sc.nextInt();

        
        double percentage = (attendedClasses * 100.0) / totalClasses;
        System.out.println("Attendance Percentage: " + percentage + "%");

      
        System.out.print("Do you have a medical cause? (Y/N): ");
        char medical = sc.next().charAt(0);

      
        if (percentage >= 70 || (medical == 'Y' || medical == 'y')) {
            System.out.println("Allowed to sit in exam.");
        } else {
            System.out.println("Not allowed to sit in exam.");
        }

        sc.close();
    }
}
