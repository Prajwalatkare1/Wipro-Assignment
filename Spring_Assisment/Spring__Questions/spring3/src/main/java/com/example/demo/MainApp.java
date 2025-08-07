package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("    AUTOWIRED ANNOTATION DEMO    ");
        System.out.println("==================================");
        System.out.println("Options:");
        System.out.println("1. Autowired");
        System.out.println("2. Autowired with Qualifier");
        System.out.print("Select option: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
//        
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("==================================");
//        System.out.println("    AUTOWIRED ANNOTATION DEMO    ");
//        System.out.println("==================================");
//        System.out.println("Options:");
//        System.out.println("1.");
//        System.out.println("2.  with Qualifier");
//        System.out.print("Select option: ");
//        option = scanner.nextInt();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Dorm_Rooms___ selectedRoom = null;

        if (option == 1) {
            selectedRoom = context.getBean("room1", Dorm_Rooms___.class); // default
        } else if (option == 2) {
            selectedRoom = context.getBean("room2", Dorm_Rooms___.class); // qualified
        } else {
            System.out.println("Invalid option.");
            context.close();
            return;
        }

        Fres_Questions freshman = context.getBean(Fres_Questions.class);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        freshman.setName(name);

        // Manual injection override
        System.out.println("\n--- Student Info ---");
        System.out.println("Name: " + freshman.getName());
        System.out.println("Dorm Location: " + selectedRoom.getLocation());

        context.close();
        scanner.close();
    }
}
