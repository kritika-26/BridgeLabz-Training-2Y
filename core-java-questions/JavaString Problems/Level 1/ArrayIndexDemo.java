import java.util.Scanner;

public class ArrayIndexDemo {
    // method to generate exception
    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); // invalid index
    }

    // method to handle exception
    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = sc.next();
        }

        // generateException(names); // will crash if uncommented
        handleException(names); // safely handled

        sc.close();
    }
}
