package Coding_Questions;

abstract class MyVehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

class MyCar extends MyVehicle {
 
    void startEngine() {
        System.out.println("MyCar engine started.");
    }


    void stopEngine() {
        System.out.println("MyCar engine stopped.");
    }
}

class Motorcycle extends MyVehicle {

    void startEngine() {
        System.out.println("Motorcycle engine started.");
    }


    void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

public class Q20 {
    public static void main(String[] args) {
        MyVehicle car = new MyCar();
        MyVehicle bike = new Motorcycle();

        car.startEngine();
        car.stopEngine();

        bike.startEngine();
        bike.stopEngine();
    }
}
