public class ParkingSlot {

    private int slotNumber;
    private boolean available;
    private Vehicle vehicle;

    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.available = true;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        available = false;
    }

    public void removeVehicle() {
        vehicle = null;
        available = true;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
