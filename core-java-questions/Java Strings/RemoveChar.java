import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Enter the character to remove:");
        char ch = sc.next().charAt(0);

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ch) {
                result = result + str.charAt(i);
            }
        }

        System.out.println("String after removing '" + ch + "': " + result);

        sc.close();
    }
}
