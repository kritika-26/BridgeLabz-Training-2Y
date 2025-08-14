import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num1 here:");
        double num1= sc.nextDouble();

        System.out.println("Enter the num2 here:");
        double num2= sc.nextDouble();

        System.out.println("Enter the num3 here:");
        double num3= sc.nextDouble();

        double average=(num1+num2+num3)/3;

        System.out.println("The average is: "+ average);

        sc.close();
    }
}
