package task.Person;

import service.CompanyService;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private CompanyE company;
    private List<Employee> employees = new ArrayList<>();

    public Company(CompanyE company) {
        CompanyService.isValidCompanyName(company);
        this.company = company;

    }

    public void addEmployee(Employee employee) {
        if (!(employee == null)) {
            employees.add(employee);
        }

    }

    public CompanyE getCompany() {
        return company;
    }

    public void setCompany(CompanyE company) {
        this.company = company;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "company{" +
                "company=" + company +
                '}';
    }
}
