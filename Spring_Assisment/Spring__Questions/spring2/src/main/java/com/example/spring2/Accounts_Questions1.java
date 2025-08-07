package com.example.spring2;

public class Accounts_Questions1 {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private BankQuestion2 bank;
    

//  }
//
//  public  getBankId() {
//      return bankId;
//  }
//
//  public String getBankName() {
//      return bankName;
//  }
//}
//
//

    public Accounts_Questions1(int accountNumber, String accountHolderName, double balance, BankQuestion2 bank) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.bank = bank;
    }

    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Bank ID: " + bank.getBankId());
        System.out.println("Bank Name: " + bank.getBankName());
    }
}
