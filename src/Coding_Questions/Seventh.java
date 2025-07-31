package Coding_Questions;

import java.util.Scanner;

public class Seventh{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of classes held: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter number of classes attended: ");
        int attendedClasses = sc.nextInt();

        
        double percentage = (attendedClasses * 100.0) / totalClasses;

        System.out.println("Attendance Percentage: " + percentage + "%");

      
        if (percentage >= 70) {
            System.out.println("Allowed to sit in exam.");
        } else {
            System.out.println("Not allowed to sit in exam.");
        }

        sc.close();
    }
}
