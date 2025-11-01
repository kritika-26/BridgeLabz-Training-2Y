import java.util.*;

public class l1q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Factorial is not defined for neg. no.");
        }
        else{
            int fact=1;
            for (int i=1;i<=num;i++){
                fact*=i;
            }
            System.out.println("Factorial of "+num+" is: "+fact);
        }
    }
}
