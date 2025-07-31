package Coding_Questions;

import java.util.Scanner;

public class Q24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] speeds = new double[5];
        double sum = 0;

        System.out.println("Enter speed of 5 bikers:");

    
        for (int i = 0; i < 5; i++) {
            System.out.print("Speed of biker " + (i + 1) + ": ");
            speeds[i] = sc.nextDouble();
            sum += speeds[i];
        }

        double average = sum / 5;
        System.out.printf("Average speed: %.2f\n", average);

        System.out.println("Speeds greater than average speed:");

  
        boolean found = false;
        for (double speed : speeds) {
            if (speed > average) {
                System.out.println(speed);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No biker has speed greater than average.");
        }

        sc.close();
    }
}
