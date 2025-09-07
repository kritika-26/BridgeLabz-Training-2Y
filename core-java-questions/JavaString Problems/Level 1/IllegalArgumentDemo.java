import java.util.Scanner;

public class IllegalArgumentDemo {
    // method to generate exception
    public static void generateException(String str) {
        System.out.println(str.substring(5, 2)); // start > end, throws exception
    }

    // method to handle exception
    public static void handleException(String str) {
        try {
            System.out.println(str.substring(5, 2)); // invalid indices
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // generateException(text); // will crash if uncommented
        handleException(text); // safely handled

        sc.close();
    }
}
