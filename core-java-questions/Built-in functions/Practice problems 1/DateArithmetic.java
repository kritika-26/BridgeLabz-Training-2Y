import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking date input in yyyy-mm-dd format
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);

        // add 7 days, 1 month, 2 years
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // subtract 3 weeks
        LocalDate finalDate = newDate.minusWeeks(3);

        System.out.println("Final Date: " + finalDate);

        sc.close();
    }
}
