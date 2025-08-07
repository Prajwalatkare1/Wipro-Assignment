package com.example.store;

public class Product_Question____ {
    private int productId;
    private String productName;
    private double price;

    public Product_Question____() {}

    public Product_Question____(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Price: $" + price);
    }
}
