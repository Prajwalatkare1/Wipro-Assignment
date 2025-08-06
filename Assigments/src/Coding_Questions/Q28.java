package Coding_Questions;



public class Q28 {

  
    interface PerformOperation {
        boolean check(int num);
    }

  
    public static PerformOperation isOdd() {
        return num -> num % 2 != 0;
    }

  
    public static PerformOperation isPrime() {
        return num -> {
            if (num <= 1) return false;
            if (num == 2) return true;
            if (num % 2 == 0) return false;
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) return false;
            }
            return true;
        };
    }

   
    public static PerformOperation isPalindrome() {
        return num -> {
            String s = String.valueOf(num);
            int left = 0, right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) return false;
                left++;
                right--;
            }
            return true;
        };
    }

    public static void main(String[] args) {
        PerformOperation oddCheck = isOdd();
        PerformOperation primeCheck = isPrime();
        PerformOperation palindromeCheck = isPalindrome();

        int[] testNumbers = { 121, 17, 20, 7, 8, 11, 22 };

        for (int num : testNumbers) {
            System.out.println("Number: " + num);
            System.out.println("Is Odd? " + oddCheck.check(num));
            System.out.println("Is Prime? " + primeCheck.check(num));
            System.out.println("Is Palindrome? " + palindromeCheck.check(num));
            System.out.println();
        }
    }
}
