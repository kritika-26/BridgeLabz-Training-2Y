class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + name);
        }
    }

    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student student1 = new Student("Kritika Saxena", 101, "A");
        Student student2 = new Student("Rahul Verma", 102, "B");

        student1.displayStudentDetails();
        System.out.println("-----------------");
        student2.displayStudentDetails();

        student2.updateGrade("A");
        System.out.println("-----------------");
        student2.displayStudentDetails();

        Student.displayTotalStudents();
    }
}
