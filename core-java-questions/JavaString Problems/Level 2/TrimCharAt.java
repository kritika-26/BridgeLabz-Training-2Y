import java.util.Scanner;

public class TrimCharAt {
    // find start and end after trimming
    public static int[] getTrimIndices(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    // get substring using charAt()
    public static String subStringCharAt(String str, int start, int end) {
        String res = "";
        for (int i = start; i <= end; i++) res += str.charAt(i);
        return res;
    }

    // compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] indices = getTrimIndices(text);
        String userTrim = subStringCharAt(text, indices[0], indices[1]);
        String builtInTrim = text.trim();

        System.out.println("After charAt trim: " + userTrim);
        System.out.println("After built-in trim: " + builtInTrim);
        System.out.println("Both equal: " + compareStrings(userTrim, builtInTrim));

        sc.close();
    }
}
