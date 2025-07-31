package Coding_Questions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();  
            System.out.println("You entered: " + number);

            sc.nextLine(); 
            
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            System.out.print("Enter index to access character: ");
            int index = sc.nextInt();

            char ch = str.charAt(index); 
            System.out.println("Character at index " + index + ": " + ch);
        } 
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred: Please enter the correct type of input.");
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred: Index is out of range.");
        }

        sc.close();
    }
}
