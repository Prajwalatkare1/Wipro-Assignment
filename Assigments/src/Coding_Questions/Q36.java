package Coding_Questions;

class Tank {
    private boolean isFilled;
    private boolean isReleased;

    public Tank() {
        isFilled = false;
        isReleased = false;
        System.out.println("Tank created.");
    }

    public void fill() {
        if (!isReleased) {
            isFilled = true;
            System.out.println("Tank is filled.");
        } else {
            System.out.println("Cannot fill. Tank already released.");
        }
    }

    public void empty() {
        if (isFilled) {
            isFilled = false;
            System.out.println("Tank is emptied.");
        } else {
            System.out.println("Tank is already empty.");
        }
    }

    public void releaseTank() {
        if (!isReleased) {
            isReleased = true;
            isFilled = false;
            System.out.println("Tank is released.");
        } else {
            System.out.println("Tank already released.");
        }
    }

  
    protected void finalize() throws Throwable {
        try {
            if (!isReleased) {
                System.out.println("Warning: Tank was not released before garbage collection!");
            } else {
                System.out.println("Tank finalized properly.");
            }
        } finally {
            super.finalize();
        }
    }
}

public class Q36 {

    public static void main(String[] args) {
        System.out.println("Scenario 1: Proper usage");
        Tank t1 = new Tank();
        t1.fill();
        t1.empty();
        t1.releaseTank();

        System.out.println("\nScenario 2: Missing release");
        Tank t2 = new Tank();
        t2.fill();
     

        System.out.println("\nScenario 3: Release without fill");
        Tank t3 = new Tank();
        t3.releaseTank();

       
        t1 = null;
        t2 = null;
        t3 = null;

        System.gc();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
           
        }

        System.out.println("End of main.");
    }
}
