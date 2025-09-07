import java.util.Scanner;

public class VotingEligibility {
    // generate ages of n students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i+1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    // create 2D array of age and canVote status
    public static String[][] checkVote(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            res[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return res;
    }

    // display 2D array
    public static void displayTable(String[][] arr) {
        System.out.println("Age\tCan Vote");
        for (String[] r : arr) System.out.println(r[0] + "\t" + r[1]);
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] result = checkVote(ages);
        displayTable(result);
    }
}
