package task.Person;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private CompanyE company;
    private List<Person> employees = new ArrayList<>();

    public Company(CompanyE company) {
        this.company = company;
    }

    public void addEmployee(Person person) {
        employees.add(person);
    }

    public CompanyE getCompany() {
        return company;
    }

    public void setCompany(CompanyE company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "company{" +
                "company=" + company +
                '}';
    }
}
