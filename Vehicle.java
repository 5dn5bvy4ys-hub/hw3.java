public abstract class Vehicle {

    private String plateNumber;
    private String ownerName;

    public Vehicle(String plateNumber, String ownerName) {
        this.plateNumber = plateNumber;
        this.ownerName = ownerName;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public abstract double calculateFee(int hours);

    public void displayInfo() {
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Owner Name: " + ownerName);
    }
}
