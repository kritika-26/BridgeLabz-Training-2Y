import java.util.Scanner;

public class BasicCalculator {
    public static int add(int a, int b) { return a + b; }
    public static int sub(int a, int b) { return a - b; }
    public static int mul(int a, int b) { return a * b; }
    public static double div(int a, int b) { return (double)a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result: " + add(x, y)); break;
            case '-': System.out.println("Result: " + sub(x, y)); break;
            case '*': System.out.println("Result: " + mul(x, y)); break;
            case '/': 
                if (y != 0) System.out.println("Result: " + div(x, y));
                else System.out.println("Division by zero not allowed");
                break;
            default: System.out.println("Invalid operation");
        }
        sc.close();
    }
}
