package model;

import exceptions.BadPattern;
import exceptions.InvalidName;
import exceptions.WrongValue;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {
    private double salary;
    private EmployeePosition position;
    private List<Company> companies = new ArrayList<>();

    public Employee(String name, String surname) throws InvalidName, BadPattern {
        super(name, surname);
    }

    public Employee(String name, String surname, EmployeePosition position) throws InvalidName, WrongValue, BadPattern {
        super(name, surname);
        validateSalary(salary);
        this.salary = position.getSalary();
        this.position = position;

    }

    public void employment(Company company) {
        companies.add(company);
        company.addEmployee(this);
    }

    public void validateSalary(double salary) throws WrongValue {
        if (salary < 0) {
            throw new WrongValue("Salary can't be lower than 0!");
        }
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws WrongValue {
        validateSalary(salary);
        this.salary = salary;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }
}
