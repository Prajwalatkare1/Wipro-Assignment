package Coding_Questions;

public class Q32 {

    public static void main(String[] args) {

        try {
            System.out.println("Demonstrating NegativeArraySizeException:");
            int[] arr = new int[-5];
        } catch (NegativeArraySizeException e) {
            e.printStackTrace(System.out);
        }

        try {
            System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException (from array):");
            int[] arr2 = {1, 2, 3};
            int x = arr2[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(System.out);
        }

        try {
            System.out.println("\nDemonstrating StringIndexOutOfBoundsException:");
            String str = "Hi";
            char ch = str.charAt(5);
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace(System.out);
        }

        try {
            System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException (from List):");
            java.util.List<String> list = java.util.Arrays.asList("a", "b");
            String s = list.get(5);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(System.out);
        }

        try {
            System.out.println("\nDemonstrating NullPointerException:");
            String str = null;
            int len = str.length();
        } catch (NullPointerException e) {
            e.printStackTrace(System.out);
        }

        try {
            System.out.println("\nDemonstrating ArithmeticException:");
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace(System.out);
        }
    }
}
