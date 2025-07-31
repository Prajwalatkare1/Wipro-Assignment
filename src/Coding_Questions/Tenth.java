package Coding_Questions;

public class Tenth {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter the number of eggs as a command line argument.");
            return;
        }

        int totalEggs = Integer.parseInt(args[0]);

        int gross = totalEggs / 144;
        int remainingAfterGross = totalEggs % 144;

        int dozen = remainingAfterGross / 12;
        int leftover = remainingAfterGross % 12;

        System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + leftover);
    }
}
