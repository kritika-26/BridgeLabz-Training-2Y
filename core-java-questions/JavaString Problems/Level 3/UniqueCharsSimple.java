import java.util.Scanner;

public class UniqueCharsSimple {

    // Find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // stop when index out of range
        }
        return count;
    }

    // Find unique characters
    public static void findUnique(String text) {
        int n = findLength(text);

        System.out.print("Unique characters: ");
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean unique = true;

            // check if appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                System.out.print(c + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        findUnique(text);

        sc.close();
    }
}
