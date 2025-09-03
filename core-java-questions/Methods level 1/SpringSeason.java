import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpring(int m, int d) {
        return (m == 3 && d >= 20 && d <= 31) ||
               (m == 4 && d >= 1 && d <= 30) ||
               (m == 5 && d >= 1 && d <= 31) ||
               (m == 6 && d >= 1 && d <= 20);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        sc.close();

        System.out.println(isSpring(month, day) ? "Its a Spring Season" : "Not a Spring Season");
    }
}
