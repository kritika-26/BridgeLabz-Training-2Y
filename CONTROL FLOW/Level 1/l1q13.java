import java.util.*;

public class l1q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumloop=0;
        int sumformula=0;
        if(n>0){
            for(int i=1;i<=n;i++){
                sumloop+=i;
            }
            sumformula=n*(n+1)/2;
        }
        if(sumloop == sumformula){
            System.out.println("Both computations are correct.");
        }


        
    }
}
