package model;

import exceptions.BadPattern;
import exceptions.InvalidName;
import exceptions.WrongValue;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {
    private int salary;
    private List<Company> companies = new ArrayList<>();

    public Employee(String name, String surname, int salary) throws InvalidName, WrongValue, BadPattern {
        super(name, surname);
        validateSalary(salary);
        this.salary = salary;
    }

    public void employment(Company company) {
        companies.add(company);
        company.addEmployee(this);
    }

    public void validateSalary(int salary) throws WrongValue {
        if (salary < 0){
            throw new WrongValue("Salary can't be lower than 0!");
        }
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
