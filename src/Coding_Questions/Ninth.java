package Coding_Questions;

import java.util.Scanner;

public class Ninth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        char choice = 'Y'; 

        do {
            System.out.print("Enter product number (1, 2, or 3): ");
            int product = sc.nextInt();

            System.out.print("Enter quantity sold: ");
            int quantity = sc.nextInt();

            double price = 0.0;

          
            switch (product) {
                case 1:
                    price = 22.50;
                    break;
                case 2:
                    price = 44.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                default:
                    System.out.println("Invalid product number.");
                    continue;
            }

            double itemTotal = price * quantity;
            total += itemTotal;

            System.out.print("Do you want to enter another product? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Total retail value of all products sold: ₹" + total);

        sc.close();
    }
}
