package Coding_Questions;

import java.util.Scanner;
import java.util.function.BiFunction;

interface MinFinder {
    float minimum3(float a, float b, float c);
}

public class Q30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        System.out.print("Enter third number: ");
        float num3 = sc.nextFloat();

       
        BiFunction<Float, Float, Float> min2 = Math::min;

    
        MinFinder finder = (a, b, c) -> min2.apply(min2.apply(a, b), c);

        float result = finder.minimum3(num1, num2, num3);
        System.out.println("Smallest number is: " + result);

        sc.close();
    }
}
