
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.time.LocalDate;

public class PayrollSystem {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        // Create employees

        employees.add(new FullTimeEmployee(
            "E01", "Ahmed",
            LocalDate.of(2020, 5, 10),
            3000, 500, 4.0
        ));

        employees.add(new ContractorEmployee(
            "E02", "Sara",
            LocalDate.of(2022, 3, 15),
            50, 40, 4.5
        ));

        employees.add(new FullTimeEmployee(
            "E03", "Ali",
            LocalDate.of(2019, 1, 20),
            4000, 700, 5.0
        ));

        employees.add(new ContractorEmployee(
            "E04", "Mona",
            LocalDate.of(2021, 8, 12),
            40, 30, 3.5
        ));

        // Sort by salary (Descending)

        Collections.sort(employees);

        System.out.println("Employees Sorted By Salary:");

        for (Employee e : employees) {
            System.out.println(e);
        }

        // Sort by joining date (Oldest First)

        Collections.sort(employees,
            Comparator.comparing(Employee::getJoinDate));

        System.out.println("\nEmployees Sorted By Join Date:");

        for (Employee e : employees) {
            System.out.println(e.getName() + " - "
                    + e.getJoinDate());
        }

        // Calculate total taxes and bonuses

        double totalTax = 0;
        double totalBonus = 0;

        for (Employee e : employees) {

            totalTax += e.calculateTax();

            totalBonus += e.calculateBonus(
                e.getPerformanceScore()
            );
        }

        System.out.println("\nTotal Taxes: " + totalTax);

        System.out.println("Total Bonuses: " + totalBonus);
    }
}
