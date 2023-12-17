package model;

import exceptions.BadPattern;
import exceptions.InvalidName;
import exceptions.WrongValue;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EmployeeTest {

    private List<Employee> employees;
    private List<Company> companies;
    private Employee employee;
    private Employee employee1;
    private Employee employee2;
    private Company company1;
    private Company company2;



    @Before
    public void init() throws InvalidName, WrongValue, BadPattern {
        employees = new ArrayList<>();
        companies = new ArrayList<>();
//        employee = new Employee("Kamil", "Zako", 50000);
        employee1 = new Employee("Wit", "Old", 30000);
        employee2 = new Employee("Kamil", "Zako", 50000);
        company1 = new Company(CompanyE.BMW);
        company2 = new Company(CompanyE.AUDI);

        employees.add(employee1);
        employees.add(employee2);
        companies.add(company1);
        companies.add(company2);
    }

    @Test
    public void isValidateingSalaryCorrectly() throws WrongValue {
        employee1.validateSalary(2000);
    }

    @Test(expected = WrongValue.class)
    public void isValidateingWrongSalaryCorrectly() throws WrongValue {
        employee1.validateSalary(-1000);
    }
    @Test
    public void initialCompanyStateShouldBeZero(){
        assertEquals(0, employees.get(0).getCompanies().size());
    }
    @Test
    public void shouldReturnIncorrectInitialCompanyState(){
        assertNotEquals(1, employees.get(0).getCompanies().size());
    }

    @Test
    public void shouldReturnIncorrectInitialEmployeeState(){
        assertNotEquals(1, companies.get(0).getEmployees().size());
    }
    @Test
    public void initialEmployeeStateShouldBeZero(){
        assertEquals(0, companies.get(0).getEmployees().size());
    }

    @Test
    public void shouldEmploymentMethodAddsEmployeeToCompany() {
        employees.get(0).employment(companies.get(0));
        employees.get(1).employment(companies.get(0));

        assertEquals(2, companies.get(0).getEmployees().size());
        assertEquals(employees.get(0), companies.get(0).getEmployees().get(0));
    }

    @Test
    public void shouldReturnIncorrectInTestEmploymentAddsEmployeeToCompany() {
        employees.get(0).employment(companies.get(0));

        assertNotEquals(2, companies.get(0).getEmployees().size());
        assertEquals(employees.get(0), companies.get(0).getEmployees().get(0));
    }

    @Test
    public void didCorrectlySumEmployeeAssociations() {
        employee1.employment(company1);
        employee1.employment(company2);

        assertEquals(2, employee1.getCompanies().size());
    }
    @Test
    public void didCorrectlySumCompanyAssociations() {
        company1.addEmployee(employee1);
        company2.addEmployee(employee2);
        company2.addEmployee(employee1);

        assertEquals(1, company1.getEmployees().size());
        assertEquals(2, company2.getEmployees().size());
    }
    @Test
    public void didCorrectlyCountAndCompareAssociation() {
        employee1.employment(company1);
        assertEquals(employee1.getCompanies().size(), company1.getEmployees().size());
    }

    @Test
    public void didSumAssociationsWithNoEmployee() {
        assertNotSame(null, company1.getEmployees().size());
    }

    @Test
    public void didSumAssociationsWithNoCompany() {
        // DO NAPISANIA
    }

}