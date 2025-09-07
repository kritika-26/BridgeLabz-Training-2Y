import java.util.Scanner;

public class NumberFormatDemo {
    // method to generate exception
    public static void generateException(String str) {
        int num = Integer.parseInt(str); // throws exception if not a number
        System.out.println(num);
    }

    // method to handle exception
    public static void handleException(String str) {
        try {
            int num = Integer.parseInt(str); // may throw exception
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.next();

        // generateException(input); // will crash if uncommented
        handleException(input); // safely handled

        sc.close();
    }
}
