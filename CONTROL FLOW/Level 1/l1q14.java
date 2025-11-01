import java.util.*;

public class l1q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Factorial is not defined for neg. no.");
        }
        else{
            int fact=1;
            int i=1;
            while(i<=num){
                fact*=i;
                i++;
            }
            System.out.println("Factorial of "+num+" is: "+fact);
        }
    }
}
