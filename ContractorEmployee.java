
import java.time.LocalDate;

public class ContractorEmployee extends Employee {

    private double hourlyRate;
    private double hoursWorked;

    public ContractorEmployee(String id, String name,
            LocalDate joinDate, double hourlyRate,
            double hoursWorked, double score) {

        super(id, name, joinDate, 0, score);

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateNetSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public double calculateBonus(double score) {
        if (score > 4.0) {
            return 500;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Contractor Employee: " + getName()
                + " | Salary: " + calculateNetSalary();
    }
}
