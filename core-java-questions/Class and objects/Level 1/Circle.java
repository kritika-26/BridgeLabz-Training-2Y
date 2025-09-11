import java.util.Scanner;

class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    double circumference() {
        return 2 * 3.14 * radius;
    }

    void display() {
        System.out.println("Radius of Circle: " + radius);
        System.out.println("Area of Circle: " + area());
        System.out.println("Circumference of Circle: " + circumference());
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        Circle c1 = new Circle(r);
        c1.display();

        sc.close();
    }
}
