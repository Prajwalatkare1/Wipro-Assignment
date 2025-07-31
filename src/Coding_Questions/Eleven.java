package Coding_Questions;

public class Eleven {

    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
    }

    public void diff(int a, int b) {
        int result = a - b;
        System.out.println("Difference: " + result);
    }

    public void mul(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
    }

    public void div(int a, int b) {
        if (b != 0) {
            int result = a / b;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Eleven calc = new Eleven(); 

        int num1 = 20;
        int num2 = 10;

        calc.add(num1, num2);
        calc.diff(num1, num2);
        calc.mul(num1, num2);
        calc.div(num1, num2);
    }
}
