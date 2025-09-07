import java.util.Scanner;

public class CharFrequency {

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)];
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] < 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(-freq[c]);
                freq[c] = 0;
                index++;
            }
        }

        return result;
    }

    public static void displayResult(String[][] result) {
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-9s | %s\n", result[i][0], result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);
        displayResult(result);

        sc.close();
    }
}
