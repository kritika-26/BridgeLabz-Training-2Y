import java.util.Scanner;

public class CharFrequencyNested {

    // Method to find frequency of characters using nested loops
    public static String[] findFrequencies(String text) {
        char[] chars = text.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            freq[i] = 1;  // initialize frequency

            if (chars[i] == '0') continue;  // already counted

            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';  // mark duplicate
                }
            }
        }

        // Count how many unique characters
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') count++;
        }

        // Store result in 1D String array
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " = " + freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] result = findFrequencies(text);

        System.out.println("Character frequencies:");
        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}
