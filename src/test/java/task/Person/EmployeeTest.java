package task.Person;

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


    @Before
    public void init() throws InvalidName, WrongValue, BadPattern {
        employees = new ArrayList<>();
        companies = new ArrayList<>();
        Employee employee = new Employee("Kamil", "Zako", 50000);
        Company company = new Company(CompanyE.Bmw);
        employees.add(employee);
        companies.add(company);
    }

    @Test
    public void initialCompanyState(){
        assertEquals(0, employees.get(0).getCompanies().size());
    }

    @Test
    public void initialEmployeeState(){
        assertEquals(0, companies.get(0).getEmployees().size());
    }

    @Test
    public void testEmploymentAddsEmployeeToCompany() {
        employees.get(0).employment(companies.get(0));

        assertEquals(1, companies.get(0).getEmployees().size());
        assertEquals(employees.get(0), companies.get(0).getEmployees().get(0));
    }


}