import java.util.Scanner;

public class ShortLongWordsShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String[] words = sc.nextLine().split(" ");

        int min = words[0].length(), max = min;
        for (String w : words) {
            int len = w.length();
            if (len < min) min = len;
            if (len > max) max = len;
        }

        System.out.println("Shortest length: " + min);
        System.out.println("Longest length: " + max);

        sc.close();
    }
}
