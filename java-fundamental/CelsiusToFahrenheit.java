import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the temperture in celsius here:");
        int temperature = sc.nextInt();

        int Fahrenheit;
        Fahrenheit = (temperature * 9/5) + 32;
        System.out.println("Conversion is : "+ Fahrenheit);

        sc.close();
    }
}
