import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius here:");
        int radius= sc.nextInt();

        System.out.println("Enter the height here:");
        int height= sc.nextInt();

        double pi=3.14;
        double Volume=pi * Math.pow(radius,2)*height;

        System.out.println("Volume of a Cylinder is: "+ Volume);

        sc.close();
    }
}
