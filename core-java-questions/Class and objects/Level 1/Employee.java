import java.util.Scanner;

class Employee {
    // attributes
    String name;
    int id;
    double salary;

    // method to display details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating object of Employee
        Employee emp1 = new Employee();

        // taking input from user
        System.out.print("Enter employee name: ");
        emp1.name = sc.nextLine();

        System.out.print("Enter employee id: ");
        emp1.id = sc.nextInt();

        System.out.print("Enter employee salary: ");
        emp1.salary = sc.nextDouble();

        // displaying details
        System.out.println("\n--- Employee Details ---");
        emp1.displayDetails();

        sc.close();
    }
}
