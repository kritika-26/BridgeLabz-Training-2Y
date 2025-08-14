import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base here:");
        double base= sc.nextDouble();

        System.out.println("Enter the exponent here:");
        int exponent= sc.nextInt();

        double power=Math.pow(base,exponent);

        System.out.println("Power is: "+ power);

        sc.close();
    }
}
