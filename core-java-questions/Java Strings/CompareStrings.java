import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        int i = 0;
        while(i < s1.length() && i < s2.length()) {
            if(s1.charAt(i) != s2.charAt(i)) {
                if(s1.charAt(i) < s2.charAt(i))
                    System.out.println("First string comes before second.");
                else
                    System.out.println("First string comes after second.");
                return;
            }
            i++;
        }

        if(s1.length() == s2.length())
            System.out.println("Both strings are equal.");
        else if(s1.length() < s2.length())
            System.out.println("First string comes before second.");
        else
            System.out.println("First string comes after second.");

        sc.close();
    }
}
