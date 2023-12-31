package service;

import exceptions.BadPattern;
import exceptions.InvalidName;
import exceptions.WrongValue;
import model.Companies;
import model.EmployeePosition;
import org.junit.Before;
import org.junit.Test;
import model.Company;

import model.Employee;

import static org.junit.Assert.*;

public class CompanyServiceTest {
    private Companies companyName;
    private Company company;
    private Employee employee1;
    private Employee employee2;
    private CompanyService companyService;

    @Before
    public void init() throws InvalidName, WrongValue, BadPattern {
        companyName = Companies.BMW;
        company = new Company(Companies.AUDI);
         employee1 = new Employee("Kamil", "Zako", EmployeePosition.RECEPTIONIST);
         employee2 = new Employee("Wit", "Old", EmployeePosition.DIRECTOR);
         companyService = new CompanyService();
    }

    @Test
    public void isValidatingRightCompanyName() {
        assertTrue(company.isValidCompanyName(companyName));
    }

    @Test
    public void isValidatingWrongCompanyName() {
        companyName = Companies.KOENIGSEGG;
        assertFalse(company.isValidCompanyName(companyName));
    }

    @Test
    public void SumSalariesWithNoEmployees() {
        assertEquals(0, companyService.getTotalSalaries(company));
    }

    @Test
    public void tSumSalariesWithEmployees() {

        company.addEmployee(employee1);
        company.addEmployee(employee2);

        assertEquals(25000, companyService.getTotalSalaries(company));
    }
}