import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and Status
    public static String[][] calculateBMI(double[][] data) {
        int n = data.length;
        String[][] result = new String[n][4]; // Height, Weight, BMI, Status

        for (int i = 0; i < n; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0; // convert cm to meters

            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0; // round to 2 decimal places

            String status;
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";

            // Store values in String array
            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to display BMI Table
    public static void displayTable(String[][] result) {
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n",
                    result[i][0], result[i][1], result[i][2], result[i][3]);
        }
        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10; // team of 10 members
        double[][] data = new double[n][2]; // weight, height

        // Take input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Person " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        // Step 1: Calculate BMI + Status
        String[][] result = calculateBMI(data);

        // Step 2: Display Table
        displayTable(result);

        sc.close();
    }
}
