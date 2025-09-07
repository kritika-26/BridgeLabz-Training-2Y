import java.util.Scanner;

public class SubstringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // substring using charAt()
        String sub1 = "";
        for (int i = start; i < end; i++) sub1 += text.charAt(i);

        // substring using built-in method
        String sub2 = text.substring(start, end);

        System.out.println("Using charAt(): " + sub1);
        System.out.println("Using substring(): " + sub2);
        System.out.println("Both are equal: " + sub1.equals(sub2));

        sc.close();
    }
}
