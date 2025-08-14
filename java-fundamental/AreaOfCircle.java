import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius here:");
        int radius = sc.nextInt();

        double pi=3.14;
        double Area = pi * Math.pow(radius,2);

        System.out.println("Area of circle: "+Area);

        sc.close();
    }
}
