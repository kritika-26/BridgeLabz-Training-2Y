class Device {
    String deviceId;
    String status; 

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
    double temperatureSetting; 

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        System.out.print("Thermostat -> ");
        super.displayStatus(); 
        System.out.println("  Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {

        Device smartLight = new Device("LGT-001", "On");
        
        Thermostat thermostat = new Thermostat("THR-101", "On", 21.5);

        System.out.println("Smart Home Device Status:");
        
        smartLight.displayStatus();
        
        thermostat.displayStatus();
    }
}