package com.annotation.spring5;

import java.util.Scanner;

import org.springframework.stereotype.Component;





//Scanner scanner = new Scanner(System.in);
//
//System.out.println("==================================");
//System.out.println("    AUTOWIRED ANNOTATION DEMO    ");
//System.out.println("==================================");
//System.out.println("Options:");
//System.out.println("1. Attired");
//System.out.println("2. Attired with Qualifier");
//System.out.print("Select option: ");
//int option = scanner.nextInt();




@Component
public class Questions_Category {
    private int categoryId = 1;
    private String categoryName = "Default Category";

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

