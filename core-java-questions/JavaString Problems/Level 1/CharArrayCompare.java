import java.util.Scanner;

public class CharArrayCompare {
    // user-defined method to get chars
    public static char[] getChars(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) arr[i] = str.charAt(i);
        return arr;
    }

    // compare two char arrays
    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] userArray = getChars(text);
        char[] builtInArray = text.toCharArray();
        boolean same = compareArrays(userArray, builtInArray);

        System.out.println("User-defined array: " + new String(userArray));
        System.out.println("Built-in array: " + new String(builtInArray));
        System.out.println("Arrays are equal: " + same);

        sc.close();
    }
}
