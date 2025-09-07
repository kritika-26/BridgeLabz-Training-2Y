import java.util.Scanner;

public class TemperatureConverter {
    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9.0;
    }
    public static double toFahrenheit(double c) {
        return (c * 9 / 5.0) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        char ch = sc.next().charAt(0);

        if (ch == 'C' || ch == 'c')
            System.out.println("In Celsius: " + toCelsius(temp));
        else if (ch == 'F' || ch == 'f')
            System.out.println("In Fahrenheit: " + toFahrenheit(temp));
        else
            System.out.println("Invalid choice");

        sc.close();
    }
}
