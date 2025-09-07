import java.util.Scanner;

public class VowelConsonantCount {
    // check type of character
    public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch += 32; // convert to lowercase
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) return "vowel";
            else return "consonant";
        }
        return "other";
    }

    // count vowels and consonants
    public static int[] countVC(String str) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            String type = checkChar(str.charAt(i));
            if (type.equals("vowel")) vowels++;
            else if (type.equals("consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] result = countVC(text);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        sc.close();
    }
}
