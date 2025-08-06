package Coding_Questions;


abstract class Bank {
 String accNo;
 String custName;
 int custGender; 
 String custJob;
 double curBal;

 public Bank(String accNo, String custName, int custGender, String custJob, double curBal) {
     this.accNo = accNo;
     this.custName = custName;
     this.custGender = custGender;
     this.custJob = custJob;
     this.curBal = curBal;
 }

 public String toString() {
     return "Account No: " + accNo + "\n" +
            "Name: " + custName + "\n" +
            "Gender: " + (custGender == 1 ? "Male" : "Female") + "\n" +
            "Job: " + custJob + "\n" +
            "Current Balance: " + curBal + "\n";
 }

 public abstract double calcBalance();
}


class Saving extends Bank {
 double savRate;

 public Saving(String accNo, String custName, int custGender, String custJob, double curBal, double savRate) {
     super(accNo, custName, custGender, custJob, curBal);
     this.savRate = savRate;
 }


 public double calcBalance() {
     return curBal + (savRate * curBal);
 }
}


class Current extends Bank {
 boolean fixedDep;
 double curRate;

 public Current(String accNo, String custName, int custGender, String custJob, double curBal, double curRate, boolean fixedDep) {
     super(accNo, custName, custGender, custJob, curBal);
     this.curRate = curRate;
     this.fixedDep = fixedDep;
 }

 @Override
 public double calcBalance() {
     double balance = curBal + (curRate * curBal);
     if (fixedDep) {
         balance -= 150; // service fee if fixed deposit is true
     }
     return balance;
 }
}


public class Q19 {

 public static void main(String[] args) {

     Bank[] customers = new Bank[5];
     customers[0] = new Saving("S001", "Amit", 1, "Engineer", 5000, 0.05);
     customers[1] = new Current("C001", "Sita", 2, "Manager", 8000, 0.04, true);
     customers[2] = new Current("C002", "John", 1, "Doctor", 10000, 0.03, false);
     customers[3] = new Saving("S002", "Priya", 2, "Teacher", 6000, 0.04);
     customers[4] = new Current("C003", "Raj", 1, "Lawyer", 7000, 0.035, true);

    
     System.out.println("=== Final Balances of All Customers ===");
     for (Bank b : customers) {
         System.out.println(b.toString());
         System.out.println("Final Balance after Interest/Charges: " + b.calcBalance());
         System.out.println("----------------------------------------");
     }

    
     String searchAccNo = "C002"; 
     boolean found = false;
     for (Bank b : customers) {
         if (b.accNo.equalsIgnoreCase(searchAccNo)) {
             System.out.println("=== Customer Found ===");
             System.out.println(b.toString());
             System.out.println("Final Balance: " + b.calcBalance());
             found = true;
             break;
         }
     }
     if (!found) {
         System.out.println("Account number " + searchAccNo + " not found.");
     }

   
     int currentCount = 0;
     double totalCurrentBalance = 0;
     for (Bank b : customers) {
         if (b instanceof Current) {
             currentCount++;
             totalCurrentBalance += b.calcBalance();
         }
     }

     System.out.println("\nTotal Current Account Holders: " + currentCount);
     System.out.println("Total Balance in Current Accounts: " + totalCurrentBalance);
 }
}