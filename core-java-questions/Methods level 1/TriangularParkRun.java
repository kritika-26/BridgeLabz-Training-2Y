import java.util.Scanner;

public class TriangularParkRun {

    public static double calculateRounds(double a, double b, double c, double distance) {
        double perimeter = a + b + c; // perimeter of triangle
        return distance / perimeter;  // number of rounds
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 3 sides of triangle
        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();

        // Total distance to run (5 km = 5000 meters)
        double distance = 5000;

        // Calculate rounds
        double rounds = calculateRounds(side1, side2, side3, distance);

        // Display result (rounded up since athlete must complete full rounds)
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to finish 5 km run.");

        sc.close();
    }
}
