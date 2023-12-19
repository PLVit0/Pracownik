package model;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private Companies company;
    private List<Employee> employees = new ArrayList<>();

    public Company(Companies company) {
        isValidCompanyName(company);
        this.company = company;

    }

    public boolean isValidCompanyName(Companies company) {
        String companyName = company.name();
        return companyName.length() >= 3 && companyName.length() <= 9;
    }

    public void addEmployee(Employee employee) {
        if (!(employee == null)) {
            employees.add(employee);
        }

    }
    public void removeEmployee(Employee employee) {
        if (!(employee == null)) {
            employees.remove(employee);
        }

    }

    public Companies getCompany() {
        return company;
    }

    public void setCompany(Companies company) {
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
