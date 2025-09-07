import java.util.Scanner;

public class CharFrequencyWithUnique {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        int n = text.length();
        char[] unique = new char[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[count] = c;
                count++;
            }
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    // Method to find frequencies of unique characters
    public static String[][] findFrequencies(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    // Method to display result
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

        String[][] result = findFrequencies(text);
        displayResult(result);

        sc.close();
    }
}
