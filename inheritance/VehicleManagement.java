class Vehicle {
    int maxSpeed;
    String model;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel(); 
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println(model + " is now charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is now refueling with petrol.");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {

        ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 250);
        
        
        PetrolVehicle honda = new PetrolVehicle("Honda Civic", 200);

        System.out.println("--- Vehicle Details and Actions ---");

        tesla.displayInfo();
        tesla.charge();
        System.out.println();

        honda.displayInfo();
        honda.refuel();
    }
}