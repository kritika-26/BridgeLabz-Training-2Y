class Employee {
    static String companyName = "Tech Solutions";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kritika Saxena", 201, "Software Engineer");
        Employee e2 = new Employee("Rahul Verma", 202, "Data Analyst");

        e1.displayDetails();
        System.out.println("-----------------");
        e2.displayDetails();

        Employee.displayTotalEmployees();
    }
}
