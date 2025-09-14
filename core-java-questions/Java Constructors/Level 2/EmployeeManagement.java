class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int id, String dept, double sal) {
        employeeID = id;
        department = dept;
        salary = sal;
    }

    public void setSalary(double sal) {
        salary = sal;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }

    void show() {
        System.out.println(employeeID + " " + department + " " + getSalary());
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e = new Employee(1, "HR", 20000);
        System.out.println(e.getSalary());
        e.setSalary(25000);
        System.out.println(e.getSalary());

        Manager m = new Manager(2, "IT", 40000);
        m.show();
    }
}
