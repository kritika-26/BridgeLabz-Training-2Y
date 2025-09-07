import java.util.Scanner;

public class StringLengthDemo {
    // method to find length without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // reached end of string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        int userLen = getLength(text);
        int builtInLen = text.length();

        System.out.println("Length using charAt(): " + userLen);
        System.out.println("Length using length(): " + builtInLen);

        sc.close();
    }
}
