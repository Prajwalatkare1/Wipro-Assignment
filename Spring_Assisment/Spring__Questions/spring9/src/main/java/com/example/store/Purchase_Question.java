package com.example.store;

public class Purchase_Question {
    private int purchaseId;
    private String purchaseDate;
    private Product_Question____ product;

    // Constructor-based injection
    public Purchase_Question(int purchaseId, String purchaseDate, Product_Question____ product) {
        this.purchaseId = purchaseId;
        this.purchaseDate = purchaseDate;
        this.product = product;
    }

    public void displayPurchase() {
        System.out.println("Purchase ID: " + purchaseId);
        System.out.println("Date: " + purchaseDate);
        System.out.println("Product Details:");
        product.displayProduct();
    }
}
