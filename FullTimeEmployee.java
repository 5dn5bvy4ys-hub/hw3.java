
import java.time.LocalDate;

public class FullTimeEmployee extends Employee {

    private double allowance;

    public FullTimeEmployee(String id, String name,
            LocalDate joinDate, double baseSalary,
            double allowance, double score) {

        super(id, name, joinDate, baseSalary, score);

        this.allowance = allowance;
    }

    @Override
    public double calculateNetSalary() {
        return baseSalary + allowance;
    }

    @Override
    public double calculateBonus(double score) {
        return baseSalary * 0.10 * score;
    }

    @Override
    public String toString() {
        return "Full Time Employee: " + getName()
                + " | Salary: " + calculateNetSalary();
    }
}
