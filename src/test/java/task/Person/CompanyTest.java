package task.Person;

import exceptions.BadPattern;
import exceptions.InvalidName;
import exceptions.WrongValue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyTest {

    private Company company;
    private Employee employee;
    @Before
    public void init() throws InvalidName, WrongValue, BadPattern {
        company = new Company(CompanyE.Bmw);
        employee = new Employee("Wit", "Old", 30000);
    }

    @Test
    public void didEmployeeAddedCorrectly() {
        company.addEmployee(employee);

        assertEquals(1, company.getEmployees().size());
        assertEquals(employee, company.getEmployees().get(0));
    }

    @Test
    public void didEmployeeAddedIfNull() {
        company.addEmployee(null);

        assertEquals(0, company.getEmployees().size());
        assertTrue(company.getEmployees().isEmpty());
    }


    // GETTEROW I SETTEROW NIE TESTUJE
}