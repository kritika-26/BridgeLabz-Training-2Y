import java.util.Scanner;

public class UppercaseCompare {
    // convert to uppercase using charAt()
    public static String toUpperCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') ch -= 32; // convert lowercase to uppercase
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String userUpper = toUpperCharAt(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("Using charAt(): " + userUpper);
        System.out.println("Using toUpperCase(): " + builtInUpper);
        System.out.println("Both are equal: " + userUpper.equals(builtInUpper));

        sc.close();
    }
}
