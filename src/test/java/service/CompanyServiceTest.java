package service;

import exceptions.BadPattern;
import exceptions.InvalidName;
import exceptions.WrongValue;
import org.junit.Before;
import org.junit.Test;
import task.Person.Company;
import task.Person.CompanyE;
import task.Person.Employee;

import static org.junit.Assert.*;

public class CompanyServiceTest {

    private CompanyE rightCompany;
    private CompanyE wrongCompany;
    private Company company;
    private Employee employee1;
    private Employee employee2;

    @Before
    public void init() throws InvalidName, WrongValue, BadPattern {
        rightCompany = CompanyE.Bmw;
        wrongCompany = CompanyE.Koenigsegg;
        company = new Company(CompanyE.Audi);
         employee1 = new Employee("Kamil", "Zako", 50000);
         employee2 = new Employee("Wit", "Old", 30000);
    }

    @Test
    public void isValidatingRightCompanyName() {
        assertTrue(CompanyService.isValidCompanyName(rightCompany));
    }

    @Test
    public void isValidatingWrongCompanyName() {
        assertFalse(CompanyService.isValidCompanyName(wrongCompany));
    }

    @Test
    public void SumSalariesWithNoEmployees() {
        assertEquals(0, CompanyService.getTotalSalaries(company));
    }

    @Test
    public void tSumSalariesWithEmployees() {

        company.addEmployee(employee1);
        company.addEmployee(employee2);

        assertEquals(80000, CompanyService.getTotalSalaries(company));
    }
}