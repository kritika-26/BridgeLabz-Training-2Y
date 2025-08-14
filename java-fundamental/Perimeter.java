import java.util.Scanner;
public class Perimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lenght here:");
        double lenght= sc.nextDouble();

        System.out.println("Enter the width here:");
        double width= sc.nextDouble();

        double perimeter=2 * (lenght + width);

        System.out.println("Perimeter is: "+ perimeter);

        sc.close();
    }
}
