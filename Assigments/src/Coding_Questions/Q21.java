package Coding_Questions;

abstract class Person {
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {

    void eat() {
        System.out.println("Athlete eats a balanced, high-protein diet.");
    }


    void exercise() {
        System.out.println("Athlete exercises daily with intense workouts.");
    }
}

class LazyPerson extends Person {
  
    void eat() {
        System.out.println("Lazy person eats junk food and snacks often.");
    }

   
    void exercise() {
        System.out.println("Lazy person avoids exercise and prefers resting.");
    }
}

public class Q21 {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazy = new LazyPerson();

        athlete.eat();
        athlete.exercise();

        lazy.eat();
        lazy.exercise();
    }
}
