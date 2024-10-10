import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class EmployeeTest {

    @Test
    public void testSalariedEmployee() {
        SalariedEmployee employee1 = new SalariedEmployee("ID123", "Petro", "SSN123");
        employee1.setFixedMonthlyPayment(2500);

        assertEquals(employee1.getName(), "Petro", "The name is wrong for " + employee1);

        assertEquals(employee1.getSocialSecurityNumber(), "SSN123",
                "The social security number is wrong for " + employee1);

        assertEquals(employee1.getFixedMonthlyPayment(), 2500.0d,
                "The fixed monthly payment name is wrong for " + employee1);

        employee1.calculatePay();

        assertEquals(employee1.getAverageMonthlySalary(), 2500.0d,
                "The average monthly salary is wrong for " + employee1);

        assertTrue(employee1.toString().contains("Petro"),
                "toString method does not contains employee's name: " + employee1);

        assertTrue(employee1.toString().contains("2500.00"),
                "toString method does not contains employee's average monthly salary of 2500.00: "
                        + employee1);
    }

    @Test
    public void testContractedEmployee() {
        ContractedEmployee employee1 = new ContractedEmployee("ID456", "Volodymyr", "TAX123");
        employee1.setHourlyRate(25.33);
        employee1.setNumberOfHoursWorked(1.5);

        assertEquals(employee1.getName(), "Volodymyr", "The name is wrong for " + employee1);

        assertEquals(employee1.getFederalTaxId(), "TAX123",
                "The federal tax ID  security number is wrong for " + employee1);

        assertEquals(employee1.getNumberOfHoursWorked(), 1.5d,
                "The fixed monthly payment name is wrong for " + employee1);

        employee1.calculatePay();

        assertEquals(employee1.getAverageMonthlySalary(), 37.995d,
                "The average monthly salary is wrong for " + employee1);

        assertTrue(employee1.toString().contains("Volodymyr"),
                "toString method does not contains employee's name: " + employee1);

        assertTrue(employee1.toString().contains("38.00"),
                "toString method does not contains employee's average monthly salary of 38.00: "
                        + employee1);
    }

    @Test
    public void testEmployee() {
        SalariedEmployee employee1 = new SalariedEmployee("E1", "Petro", "SS1");
        employee1.setFixedMonthlyPayment(5000);

        ContractedEmployee employee2 = new ContractedEmployee("E2", "Volodymyr", "FTI1");
        employee2.setHourlyRate(50);
        employee2.setNumberOfHoursWorked(100);

        Employee[] employees = {employee1, employee2};
        for (Employee emp : employees) {
            emp.calculatePay();

            assertEquals(emp.getAverageMonthlySalary(), 5000.0d, "Income is not correct for " + emp);
        }
    }
}