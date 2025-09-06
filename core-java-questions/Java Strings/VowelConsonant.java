import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any string:");
        String str = sc.nextLine();

        // making all letters small so that checking is easy
        str = str.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            // check if it is an alphabet
            if(ch >= 'a' && ch <= 'z') {
                // check for vowels
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);

        sc.close();
    }
}
