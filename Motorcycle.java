public class Motorcycle extends Vehicle {

    public Motorcycle(String plateNumber, String ownerName) {
        super(plateNumber, ownerName);
    }

    @Override
    public double calculateFee(int hours) {
        return hours * 2.0;
    }
}
