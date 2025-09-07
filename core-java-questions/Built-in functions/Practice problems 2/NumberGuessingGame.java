import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int low = 1, high = 100;
        System.out.println("Think of a number between 1 and 100.");

        while (low <= high) {
            int guess = rand.nextInt(high - low + 1) + low;
            System.out.print("Is " + guess + " correct, high or low? ");
            String feedback = sc.nextLine().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("I guessed it!");
                break;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else {
                System.out.println("Please enter high, low or correct.");
            }
        }
        sc.close();
    }
}
