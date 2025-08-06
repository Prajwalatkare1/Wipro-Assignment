package Coding_Questions;


class Worker {
    String name;
    double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double pay(int hours) {
        return 0.0;
    }

    public void showPay(int hours) {
        System.out.println("Name: " + name + ", Weekly Pay: ₹" + pay(hours));
    }
}


class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

   
    public double pay(int hours) {
        int daysWorked = hours / 8;
        return daysWorked * salaryRate;
    }
}

// SalariedWorker class
class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

 
    public double pay(int hours) {
        return 40 * salaryRate;
    }
}


public class Thirteen {
    public static void main(String[] args) {
        DailyWorker dWorker = new DailyWorker("Ravi", 500);
        SalariedWorker sWorker = new SalariedWorker("Anita", 600);

        dWorker.showPay(48); 
        sWorker.showPay(30);  
    }
}
