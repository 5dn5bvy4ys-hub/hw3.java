public class ElectricCar extends Vehicle {

    public ElectricCar(String plateNumber, String ownerName) {
        super(plateNumber, ownerName);
    }

    @Override
    public double calculateFee(int hours) {
        return hours * 3.0;
    }
}
