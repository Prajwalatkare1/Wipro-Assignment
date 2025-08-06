package Coding_Questions;

import static java.lang.System.out;

class Hall {
    void showMessage() {
        out.println("This is the first room while entering the house");
    }
}

class Kitchen {
    void showAppliances() {
        String[] appliances = { "Fridge", "Microwave", "Oven", "Blender" };

        out.println("Original appliances:");
        for (String item : appliances) {
            out.println(item);
        }


        String[] copy = new String[appliances.length];
        System.arraycopy(appliances, 0, copy, 0, appliances.length);

        out.println("Copied appliances:");
        for (String item : copy) {
            out.println(item);
        }
    }
}

public class Q23 {

    public static void main(String[] args) {
        Hall hall = new Hall();
        hall.showMessage();

        out.println();

        Kitchen kitchen = new Kitchen();
        kitchen.showAppliances();
    }
}
