
class Course {
    String courseName;
    int duration; 

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}


class OnlineCourse extends Course {
    String platform; 
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; 

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalPrice() {
        return fee * (1 - (discount / 100));
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: $" + String.format("%.2f", fee));
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + String.format("%.2f", getFinalPrice()));
    }
}

public class EducationalHierarchy {
    public static void main(String[] args) {
        Course genericCourse = new Course("Introduction to World History", 50);

        OnlineCourse freeOnlineCourse = new OnlineCourse("Beginner's Python", 30, "YouTube", true);

        PaidOnlineCourse advancedPaidCourse = new PaidOnlineCourse("Advanced Data Science", 75, "Coursera", true, 299.99, 10);

        System.out.println("--- Generic Course Details ---");
        genericCourse.displayDetails();

        System.out.println("\n--- Free Online Course Details ---");
        freeOnlineCourse.displayDetails();

        System.out.println("\n--- Advanced Paid Online Course Details ---");
        advancedPaidCourse.displayDetails();
    }
}