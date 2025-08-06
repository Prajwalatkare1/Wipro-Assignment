package Coding_Questions;


class Vehicle {
    String color;
    int wheels;
    String model;

    Vehicle(String color, int wheels, String model) {
        this.color = color;
        this.wheels = wheels;
        this.model = model;
    }
 void displayInfo() {
        System.out.println("Model: " + model + ", Color: " + color + ", Wheels: " + wheels);
    }
}
class Truck extends Vehicle {
    Truck(String color, int wheels, String model) {
        super(color, wheels, model);
    }
    void loadGoods() {
        System.out.println("Truck is loading goods.");
    }
}
class Car extends Vehicle {
    Car(String color, int wheels, String model) {
        super(color, wheels, model);
    }

    void playMusic() {
        System.out.println("Car is playing music.");
    }
}


class Bus extends Vehicle {
    Bus(String color, int wheels, String model) {
        super(color, wheels, model);
    }

    void pickPassengers() {
        System.out.println("Bus is picking up passengers.");
    }
}
public class Seventeen {
    public static void main(String[] args) {
        Truck truck = new Truck("Red", 6, "Tata 1412");
        Car car = new Car("Black", 4, "Honda City");
        Bus bus = new Bus("Yellow", 6, "Volvo 9700");

        System.out.println("Truck Info:");
        truck.displayInfo();
        truck.loadGoods();

        System.out.println("\nCar Info:");
        car.displayInfo();
        car.playMusic();

        System.out.println("\nBus Info:");
        bus.displayInfo();
        bus.pickPassengers();
    }
}
