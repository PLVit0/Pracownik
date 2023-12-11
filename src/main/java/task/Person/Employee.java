package task.Person;

import exceptions.BadPattern;
import exceptions.InvalidName;
import exceptions.WrongValue;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {
    private int salary;
    private List<Company> companies = new ArrayList<>();

    public Employee(String name, String surname, int salary) throws InvalidName, WrongValue, BadPattern {
        super(name, surname);
        EmployeeService.validateSalary(salary);
        this.salary = salary;
    }

    public void employment(Company company) {
        companies.add(company);
        company.addEmployee(this);
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
