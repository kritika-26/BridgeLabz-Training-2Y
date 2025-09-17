class Vehicle {
    static double registrationFee = 5000.0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Kritika Saxena", "Car", "REG101");
        Vehicle v2 = new Vehicle("Rahul Verma", "Bike", "REG102");

        v1.displayRegistrationDetails();
        System.out.println("-----------------");
        v2.displayRegistrationDetails();

        Vehicle.updateRegistrationFee(6000.0);
        System.out.println("After updating registration fee:");
        v1.displayRegistrationDetails();
    }
}
