import java.time.LocalDateTime;

public class ParkingTicket {

    private Vehicle vehicle;
    private int slotNumber;
    private LocalDateTime entryTime;

    public ParkingTicket(Vehicle vehicle, int slotNumber) {
        this.vehicle = vehicle;
        this.slotNumber = slotNumber;
        this.entryTime = LocalDateTime.now();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void displayTicket() {
        System.out.println("\n===== PARKING TICKET =====");
        vehicle.displayInfo();
        System.out.println("Slot Number: " + slotNumber);
        System.out.println("Entry Time: " + entryTime);
        System.out.println("==========================");
    }
}
