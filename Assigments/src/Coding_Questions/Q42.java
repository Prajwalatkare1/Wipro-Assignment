package Coding_Questions;

public class Q42 {

   
    public static void someMethod2() throws Exception {
        throw new Exception("Exception thrown in someMethod2");
    }

    
    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("Caught in someMethod, rethrowing...");
            throw e; 
        }
    }

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("Caught in main:");
            e.printStackTrace();
        }
    }
}
