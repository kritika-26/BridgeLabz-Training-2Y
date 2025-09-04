import java.util.Scanner;

public class Division {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        int[] arr = {remainder, quotient};
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num = sc.nextInt();

        System.out.println("Enter second number:");
        int div = sc.nextInt();

        int[] result = findRemainderAndQuotient(num, div);

        System.out.println("Remainder = " + result[0]);
        System.out.println("Quotient = " + result[1]);

        sc.close();
    }
}
