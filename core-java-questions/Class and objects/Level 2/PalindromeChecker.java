import java.util.Scanner;

class PalindromeChecker {
    String text;

    PalindromeChecker(String t) {
        text = t;
    }

    boolean isPalindrome() {
        String rev = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(rev);
    }

    void display() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome.");
        else
            System.out.println(text + " is not a Palindrome.");
    }
}

public class PalindromeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeChecker pc = new PalindromeChecker(input);
        pc.display();

        sc.close();
    }
}
