package Coding_Questions;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Q29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Register Number: ");
            String regNo = sc.nextLine();

            System.out.print("Enter Mobile Number: ");
            String mobileNo = sc.nextLine();

            if (regNo.length() != 9) {
                throw new IllegalArgumentException("Register Number must be exactly 9 characters");
            }

            if (mobileNo.length() != 10) {
                throw new IllegalArgumentException("Mobile Number must be exactly 10 characters");
            }

            if (!mobileNo.matches("\\d+")) {
                throw new IllegalArgumentException("Mobile Number must contain only digits");
            }

            if (!regNo.matches("[a-zA-Z0-9]+")) {
                throw new NoSuchElementException("Register Number must contain only alphabets and digits");
            }

            System.out.println("valid");

        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("invalid");
        } finally {
            sc.close();
        }
    }
}
