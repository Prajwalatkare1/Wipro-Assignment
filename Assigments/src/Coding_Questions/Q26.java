package Coding_Questions;

import java.util.Scanner;

public class Q26 {

    public static class MyTriangle {
        public static double area(double a, double b, double c) {
            double s = (a + b + c) / 2.0;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        public static double perimeter(double a, double b, double c) {
            return a + b + c;
        }

        public static boolean isValid(double a, double b, double c) {
            return (a + b > c) && (a + c > b) && (b + c > a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter side a (-1 to exit): ");
            double a = sc.nextDouble();

            if (a == -1) {
                System.out.println("Bye~");
                break;
            }

            System.out.print("Enter side b: ");
            double b = sc.nextDouble();

            System.out.print("Enter side c: ");
            double c = sc.nextDouble();

            if (MyTriangle.isValid(a, b, c)) {
                double area = MyTriangle.area(a, b, c);
                double perimeter = MyTriangle.perimeter(a, b, c);
                System.out.printf("Area: %.2f\n", area);
                System.out.printf("Perimeter: %.2f\n", perimeter);
            } else {
                System.out.println("The input is invalid.");
            }
        }
        sc.close();
    }
}
