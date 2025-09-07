import java.util.Scanner;

public class CharTypeTable {
    // check character type
    public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch += 32; // convert uppercase to lowercase
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    // create 2D array of character and type
    public static String[][] charTypes(String str) {
        String[][] arr = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            arr[i][0] = String.valueOf(str.charAt(i));
            arr[i][1] = checkChar(str.charAt(i));
        }
        return arr;
    }

    // display 2D array
    public static void displayTable(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] r : arr) System.out.println(r[0] + "\t" + r[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = charTypes(text);
        displayTable(result);

        sc.close();
    }
}
