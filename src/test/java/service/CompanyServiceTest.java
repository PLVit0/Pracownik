package service;

import exceptions.BadPattern;
import exceptions.InvalidName;
import exceptions.WrongValue;
import org.junit.Before;
import org.junit.Test;
import model.Company;
import model.CompanyE;
import model.Employee;

import static org.junit.Assert.*;

public class CompanyServiceTest {
    private CompanyE companyName;
    private Company company;
    private Employee employee1;
    private Employee employee2;
    private CompanyService companyService;

    @Before
    public void init() throws InvalidName, WrongValue, BadPattern {
        companyName = CompanyE.BMW;
        company = new Company(CompanyE.AUDI);
         employee1 = new Employee("Kamil", "Zako", 50000);
         employee2 = new Employee("Wit", "Old", 30000);
         companyService = new CompanyService();
    }

    @Test
    public void isValidatingRightCompanyName() {
        assertTrue(company.isValidCompanyName(companyName));
    }

    @Test
    public void isValidatingWrongCompanyName() {
        companyName = CompanyE.KOENIGSEGG;
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

        assertEquals(80000, companyService.getTotalSalaries(company));
    }
}