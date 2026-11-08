public class Car extends Vehicle {

    public Car(String plateNumber, String ownerName) {
        super(plateNumber, ownerName);
    }

    @Override
    public double calculateFee(int hours) {
        return hours * 5.0;
    }
}
