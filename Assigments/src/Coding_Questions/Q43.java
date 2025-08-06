package Coding_Questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q43 {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Please provide the file path as a command-line argument.");
            System.exit(1);
        }

        String filePath = args[0];  // Get file path from command line

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
