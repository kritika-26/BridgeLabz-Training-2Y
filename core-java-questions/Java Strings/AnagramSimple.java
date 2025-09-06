import java.util.Scanner;

public class AnagramSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if(s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int[] count = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++) {
            if(count[i] != 0) {
                System.out.println("Not Anagrams");
                return;
            }
        }

        System.out.println("The strings are Anagrams");

        sc.close();
    }
}
