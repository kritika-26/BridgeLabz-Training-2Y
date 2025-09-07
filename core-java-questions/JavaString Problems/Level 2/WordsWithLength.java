import java.util.Scanner;

public class WordsWithLength {
    // split text into words using charAt()
    public static String[] splitCharAt(String text) {
        int spaces = 0;
        for (int i = 0; i < text.length(); i++) if (text.charAt(i) == ' ') spaces++;
        String[] words = new String[spaces + 1];
        int start = 0, idx = 0;
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    // find length without using length()
    public static int getLength(String str) {
        int count = 0;
        try { while (true) { str.charAt(count); count++; } } 
        catch (IndexOutOfBoundsException e) {}
        return count;
    }

    // create 2D array of word and length
    public static String[][] wordsWithLength(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(getLength(words[i]));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitCharAt(text);
        String[][] result = wordsWithLength(words);

        System.out.println("Word\tLength");
        for (String[] r : result)
            System.out.println(r[0] + "\t" + Integer.parseInt(r[1]));

        sc.close();
    }
}
