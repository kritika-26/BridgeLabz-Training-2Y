import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int i = 0, j = str.length() - 1;
        boolean isPalindrome = true;

        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if(isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
