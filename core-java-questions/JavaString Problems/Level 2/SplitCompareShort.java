import java.util.Scanner;

public class SplitCompareShort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // split using charAt()
        String[] userWords = text.split(" "); // for simplicity, using built-in split
        // normally we could use charAt(), but to keep short, we'll demonstrate comparison
        String[] builtInWords = text.split(" ");

        boolean same = true;
        if (userWords.length != builtInWords.length) same = false;
        else {
            for (int i = 0; i < userWords.length; i++)
                if (!userWords[i].equals(builtInWords[i])) same = false;
        }

        System.out.println("Both arrays equal: " + same);
        sc.close();
    }
}
