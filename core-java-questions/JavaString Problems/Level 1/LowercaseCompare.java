import java.util.Scanner;

public class LowercaseCompare {
    // convert to lowercase using charAt()
    public static String toLowerCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') ch += 32; // convert uppercase to lowercase
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String userLower = toLowerCharAt(text);
        String builtInLower = text.toLowerCase();

        System.out.println("Using charAt(): " + userLower);
        System.out.println("Using toLowerCase(): " + builtInLower);
        System.out.println("Both are equal: " + userLower.equals(builtInLower));

        sc.close();
    }
}
