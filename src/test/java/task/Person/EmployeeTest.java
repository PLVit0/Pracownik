package task.Person;

import exceptions.BadPattern;
import exceptions.InvalidName;
import exceptions.WrongValue;
import org.junit.Before;
import org.junit.Test;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EmployeeTest {

    private List<Employee> employees;
    private List<Company> companies;
    private Employee employee;
    private Company company;


    @Before
    public void init() throws InvalidName, WrongValue, BadPattern {
        employees = new ArrayList<>();
        companies = new ArrayList<>();
        employee = new Employee("Kamil", "Zako", 50000);
        company = new Company(CompanyE.Bmw);
        employees.add(employee);
        companies.add(company);
    }

    @Test
    public void isValidateingSalaryCorrectly() throws WrongValue {
        employee.validateSalary(2000);
    }

    @Test(expected = WrongValue.class)
    public void isValidateingWrongSalaryCorrectly() throws WrongValue {
        employee.validateSalary(-1000);
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

        assertEquals(1, companies.get(0).getEmployees().size());
        assertEquals(employees.get(0), companies.get(0).getEmployees().get(0));
    }

    @Test
    public void shouldReturnIncorrectInTestEmploymentAddsEmployeeToCompany() {
        employees.get(0).employment(companies.get(0));

        assertNotEquals(2, companies.get(0).getEmployees().size());
        assertEquals(employees.get(0), companies.get(0).getEmployees().get(0));
    }




}