import java.util.Scanner;

public class StringIndexExceptionDemo {
    // method to generate exception
    public static void generateException(String str) {
        System.out.println(str.charAt(str.length())); // invalid index
    }

    // method to handle exception
    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length())); // invalid index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
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
