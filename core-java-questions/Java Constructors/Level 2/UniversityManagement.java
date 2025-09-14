class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", Specialization: " + specialization + ", CGPA: " + getCGPA());
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aman", 8.5);
        System.out.println("Roll No: " + s1.rollNumber + ", Name: " + s1.name + ", CGPA: " + s1.getCGPA());
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Riya", 9.2, "AI");
        pg1.display();
    }
}
