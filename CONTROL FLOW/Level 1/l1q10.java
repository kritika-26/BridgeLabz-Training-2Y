import java.util.*;

public class l1q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0 ;
        double input;
        input = sc.nextDouble();
        while (input != 0){
            total+=input;
            input = sc.nextDouble();

        }
        System.out.println("Total sum: "+total);


        
    }
}
