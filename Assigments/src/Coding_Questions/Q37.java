package Coding_Questions;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Q37 {

    public static void main(String[] args) {
        String fileName = "batch_mates.txt";

        List<String> batchMates = Arrays.asList(
            "Alice",
            "Bob",
            "Charlie",
            "David",
            "Eva"
        ); 

       
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String name : batchMates) {
                writer.write(name);
                writer.newLine();
            }
            System.out.println("Batch mates' names written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

  
        System.out.println("\nBatch mates' names from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
