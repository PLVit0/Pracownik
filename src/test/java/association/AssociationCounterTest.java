package association;

import exceptions.BadPattern;
import exceptions.InvalidName;
import exceptions.WrongValue;
import org.junit.Before;
import org.junit.Test;
import task.Person.Company;
import task.Person.CompanyE;
import task.Person.Employee;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AssociationCounterTest {
    private Employee employee1;
    private Employee employee2;
    private Company company1;
    private Company company2;
    private List<Employee> employees;
    private List<Company> companies;

    @Before
    public void init() throws InvalidName, WrongValue, BadPattern {  // Czy w init powinna byc obsluga exceptions - throws?
        employee1 = new Employee("Wit", "Old", 30000);
        employee2 = new Employee("Kamil", "Zako", 50000);
        company1 = new Company(CompanyE.Bmw);
        company2 = new Company(CompanyE.Mercedes);
        employees = Arrays.asList(employee1,employee2);
        companies = Arrays.asList(company1,company2);
    }

    @Test
    public void didCorrectlySumEmployeeAssociations() {
        employee1.employment(company1);
        employee1.employment(company2);

        assertEquals(2, AssociationCounter.countEmployeeAssociations(employee1));
    }

    @Test
    public void didCorrectlySumCompanyAssociations() {
        company1.addEmployee(employee1);
        company2.addEmployee(employee2);
        company2.addEmployee(employee1);

        assertEquals(1, AssociationCounter.countCompanyAssociations(company1));
        assertEquals(2, AssociationCounter.countCompanyAssociations(company2));
    }

    @Test
    public void didCorrectlyCountAndCompareAssociation() {
        employee1.employment(company1);
        assertTrue(AssociationCounter.checkAssociations(employee1, company1));
    }

    @Test
    public void didCorrectlySumExtensions() {
        company1.addEmployee(employee1);
        company2.addEmployee(employee2);

        assertTrue(AssociationCounter.checkExtension(companies, employees));
    }

    @Test
    public void didSumAssociationsWithNoEmployee() {
        assertFalse(AssociationCounter.checkAssociations(null, company1));
    }

    @Test
    public void didSumAssociationsWithNoCompany() {
        assertFalse(AssociationCounter.checkAssociations(employee1, null));
    }
}