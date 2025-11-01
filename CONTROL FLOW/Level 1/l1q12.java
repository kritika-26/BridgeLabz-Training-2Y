import java.util.*;

public class l1q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum_formula = 0;
        int sum_loop = 0;
        if (num>0){
            int i=1;
            while(i<=num){
                sum_loop+=i;
                i++;
            }
            sum_formula = num*(num+1)/2;
        }
        if (sum_loop == sum_formula){
            System.out.println("Both computations are correct.");
        }


        
    }
}
