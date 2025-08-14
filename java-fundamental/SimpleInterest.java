import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal here:");
        double principal= sc.nextDouble();

        System.out.println("Enter the rate here:");
        double rate= sc.nextDouble();

        System.out.println("Enter the time here:");
        double time= sc.nextDouble();

        double simpleInterest=(principal*rate*time)/100;

        System.out.println("Simple Interest is: "+ simpleInterest);

        sc.close();
    }
}