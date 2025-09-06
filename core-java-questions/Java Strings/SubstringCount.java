import java.util.Scanner;

public class SubstringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String str = sc.nextLine();

        System.out.println("Enter the substring to search:");
        String sub = sc.nextLine();

        int count = 0;
        int index = 0;

        while((index = str.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length();
        }

        System.out.println("Substring occurs " + count + " times.");

        sc.close();
    }
}
