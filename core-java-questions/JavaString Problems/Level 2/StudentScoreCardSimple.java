import java.util.Random;
import java.util.Scanner;

public class StudentScoreCardSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Loop for each student
        for (int i = 1; i <= n; i++) {
            // Random marks between 10 and 99
            int physics = rand.nextInt(90) + 10;
            int chemistry = rand.nextInt(90) + 10;
            int maths = rand.nextInt(90) + 10;

            int total = physics + chemistry + maths;
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round off
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            // Grade
            String grade;
            if (percentage >= 90) grade = "A+";
            else if (percentage >= 80) grade = "A";
            else if (percentage >= 70) grade = "B+";
            else if (percentage >= 60) grade = "B";
            else if (percentage >= 50) grade = "C";
            else if (percentage >= 40) grade = "D";
            else grade = "F";

            // Display scorecard for each student
            System.out.println("\nStudent " + i + " Scorecard:");
            System.out.println("Physics   : " + physics);
            System.out.println("Chemistry : " + chemistry);
            System.out.println("Maths     : " + maths);
            System.out.println("Total     : " + total);
            System.out.println("Average   : " + average);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade     : " + grade);
        }

        sc.close();
    }
}
