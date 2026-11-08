
import java.time.LocalDate;

public abstract class Employee implements
        Taxable, BonusCalculable, Comparable<Employee> {

    private String id;
    private String name;
    private LocalDate joinDate;

    protected double baseSalary;

    private double performanceScore;

    public Employee(String id, String name,
                    LocalDate joinDate,
                    double baseSalary,
                    double performanceScore) {

        this.id = id;
        this.name = name;
        this.joinDate = joinDate;
        this.baseSalary = baseSalary;
        this.performanceScore = performanceScore;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public double getPerformanceScore() {
        return performanceScore;
    }

    @Override
    public double calculateTax() {
        return calculateNetSalary() * TAX_RATE;
    }

    public abstract double calculateNetSalary();

    @Override
    public int compareTo(Employee other) {
        return Double.compare(
            other.calculateNetSalary(),
            this.calculateNetSalary()
        );
    }
}
